// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OralEvaluationStatisticsConcurrentCountRequest extends TeaModel {
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
     * <p>2024-09-29 14:22:48</p>
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
     * <p>2024-09-29 05:00:01</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static OralEvaluationStatisticsConcurrentCountRequest build(java.util.Map<String, ?> map) throws Exception {
        OralEvaluationStatisticsConcurrentCountRequest self = new OralEvaluationStatisticsConcurrentCountRequest();
        return TeaModel.build(map, self);
    }

    public OralEvaluationStatisticsConcurrentCountRequest setApplicationAccessId(String applicationAccessId) {
        this.applicationAccessId = applicationAccessId;
        return this;
    }
    public String getApplicationAccessId() {
        return this.applicationAccessId;
    }

    public OralEvaluationStatisticsConcurrentCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public OralEvaluationStatisticsConcurrentCountRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public OralEvaluationStatisticsConcurrentCountRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public OralEvaluationStatisticsConcurrentCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
