// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("maxResults")
    public Long maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest build(java.util.Map<String, ?> map) throws Exception {
        ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest self = new ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest();
        return TeaModel.build(map, self);
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest setMaxResults(Long maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Long getMaxResults() {
        return this.maxResults;
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ExportInsightWorkitemStatusJoinWorkitemDefectExtraRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
