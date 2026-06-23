// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogAnalysisResultRequest extends TeaModel {
    /**
     * <p>Whether to sort in ascending order. Default is true, which sorts by session creation time in ascending order. If false, sorts in descending order.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("asc")
    public Boolean asc;

    /**
     * <p>The end time, which must be in yyyy-MM-dd HH:mm:ss format. If sessionIds are provided, the system queries session analysis results based on these IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-23 09:20:02</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <p>Session ID list. When useUrl is true, the response includes OSS URLs. You can specify up to 1000 sessions. If you specify more than 1000, only the first 1000 are processed. When useUrl is false, the response includes full analysis results. You can specify up to 10 sessions. If you specify more than 10, only the first 10 are processed. This parameter is optional. If sessionIds is empty, the API retrieves results for sessions created between startTime and endTime. If sessionIds is not empty, the API retrieves results for the specified sessions. You cannot leave both sessionIds and the time range empty.</p>
     */
    @NameInMap("sessionIds")
    public java.util.List<String> sessionIds;

    /**
     * <p>Start time in yyyy-MM-dd HH:mm:ss format. If sessionIds is not empty, you can query the session analysis results using the specified session IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-09-14 09:11:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
     * <p>Whether to return an OSS URL instead of full analysis results. If true, the response includes an OSS URL that expires in one hour. Default is true. Supports up to 1000 sessions. If you specify more than 1000, only the first 1000 are processed. If false, the response includes full analysis results. Supports up to 10 sessions. If you specify more than 10, only the first 10 are processed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("useUrl")
    public Boolean useUrl;

    public static GetDialogAnalysisResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDialogAnalysisResultRequest self = new GetDialogAnalysisResultRequest();
        return TeaModel.build(map, self);
    }

    public GetDialogAnalysisResultRequest setAsc(Boolean asc) {
        this.asc = asc;
        return this;
    }
    public Boolean getAsc() {
        return this.asc;
    }

    public GetDialogAnalysisResultRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetDialogAnalysisResultRequest setSessionIds(java.util.List<String> sessionIds) {
        this.sessionIds = sessionIds;
        return this;
    }
    public java.util.List<String> getSessionIds() {
        return this.sessionIds;
    }

    public GetDialogAnalysisResultRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetDialogAnalysisResultRequest setUseUrl(Boolean useUrl) {
        this.useUrl = useUrl;
        return this;
    }
    public Boolean getUseUrl() {
        return this.useUrl;
    }

}
