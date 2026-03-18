// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class OralEvaluationStatisticsErrorCountRequest extends TeaModel {
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
     * <p>2024-08-22 06:24:53</p>
     */
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("errorCode")
    public java.util.List<String> errorCode;

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
     * <p>2024-09-27 09:32:00</p>
     */
    @NameInMap("startTime")
    public String startTime;

    public static OralEvaluationStatisticsErrorCountRequest build(java.util.Map<String, ?> map) throws Exception {
        OralEvaluationStatisticsErrorCountRequest self = new OralEvaluationStatisticsErrorCountRequest();
        return TeaModel.build(map, self);
    }

    public OralEvaluationStatisticsErrorCountRequest setApplicationAccessId(String applicationAccessId) {
        this.applicationAccessId = applicationAccessId;
        return this;
    }
    public String getApplicationAccessId() {
        return this.applicationAccessId;
    }

    public OralEvaluationStatisticsErrorCountRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public OralEvaluationStatisticsErrorCountRequest setErrorCode(java.util.List<String> errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public java.util.List<String> getErrorCode() {
        return this.errorCode;
    }

    public OralEvaluationStatisticsErrorCountRequest setGranularity(String granularity) {
        this.granularity = granularity;
        return this;
    }
    public String getGranularity() {
        return this.granularity;
    }

    public OralEvaluationStatisticsErrorCountRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public OralEvaluationStatisticsErrorCountRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
