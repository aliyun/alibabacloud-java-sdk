// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class GetDialogAnalysisResultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("asc")
    public Boolean asc;

    /**
     * <strong>example:</strong>
     * <p>2024-09-23 09:20:02</p>
     */
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("sessionIds")
    public java.util.List<String> sessionIds;

    /**
     * <strong>example:</strong>
     * <p>2024-09-14 09:11:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    /**
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
