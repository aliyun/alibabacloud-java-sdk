// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OralEvaluationStatisticsCallsCountRequest extends TeaModel {
    /**
     * <p>appId,appkey</p>
     * 
     * <strong>example:</strong>
     * <p>a0007g7</p>
     */
    @NameInMap("applicationAccessId")
    public String applicationAccessId;

    /**
     * <strong>example:</strong>
     * <p>2024-10-15 07:40:01</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>DAY</p>
     */
    @NameInMap("granularity")
    public String granularity;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <strong>example:</strong>
     * <p>2024-10-14 07:40:01</p>
     */
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
