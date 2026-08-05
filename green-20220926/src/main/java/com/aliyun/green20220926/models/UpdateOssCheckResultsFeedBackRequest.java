// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class UpdateOssCheckResultsFeedBackRequest extends TeaModel {
    /**
     * <p>The feedback.</p>
     * 
     * <strong>example:</strong>
     * <p>misreport</p>
     */
    @NameInMap("Feedback")
    public String feedback;

    /**
     * <p>The request ID of the query.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
     */
    @NameInMap("QueryRequestId")
    public String queryRequestId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The service code.</p>
     * 
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>P_7SCUK8</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateOssCheckResultsFeedBackRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssCheckResultsFeedBackRequest self = new UpdateOssCheckResultsFeedBackRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssCheckResultsFeedBackRequest setFeedback(String feedback) {
        this.feedback = feedback;
        return this;
    }
    public String getFeedback() {
        return this.feedback;
    }

    public UpdateOssCheckResultsFeedBackRequest setQueryRequestId(String queryRequestId) {
        this.queryRequestId = queryRequestId;
        return this;
    }
    public String getQueryRequestId() {
        return this.queryRequestId;
    }

    public UpdateOssCheckResultsFeedBackRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateOssCheckResultsFeedBackRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public UpdateOssCheckResultsFeedBackRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
