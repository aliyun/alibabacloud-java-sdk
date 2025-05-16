// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OralEvaluationStatisticsCallsCountRequest extends TeaModel {
    @NameInMap("applicationAccessId")
    public String applicationAccessId;

    @NameInMap("endTime")
    public String endTime;

    @NameInMap("granularity")
    public String granularity;

    @NameInMap("projectId")
    public String projectId;

    @NameInMap("startTime")
    public String startTime;

    public static OralEvaluationStatisticsCallsCountRequest build(java.util.Map<String, ?> map) throws Exception {
        OralEvaluationStatisticsCallsCountRequest self = new OralEvaluationStatisticsCallsCountRequest();
        return TeaModel.build(map, self);
    }

    public OralEvaluationStatisticsCallsCountRequest setApplicationAccessId(String applicationAccessId) {
        this.applicationAccessId = applicationAccessId;
        return this;
    }
    public String getApplicationAccessId() {
        return this.applicationAccessId;
    }

    public OralEvaluationStatisticsCallsCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public OralEvaluationStatisticsCallsCountRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public OralEvaluationStatisticsCallsCountRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public OralEvaluationStatisticsCallsCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
