// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class DescribeManualTaskInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-b933c5aac7f7***</p>
     */
    @NameInMap("EmrClusterId")
    public String emrClusterId;

    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>application_123_***</p>
     */
    @NameInMap("ExternalAppId")
    public String externalAppId;

    /**
     * <strong>example:</strong>
     * <p>mti-0k5vype05xm****</p>
     */
    @NameInMap("ManualTaskInstanceId")
    public String manualTaskInstanceId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ManualTaskInstanceName")
    public String manualTaskInstanceName;

    /**
     * <strong>example:</strong>
     * <p>wg-123abc***</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>2024-03-27 00:00:00</p>
     */
    @NameInMap("SubmitTime")
    public String submitTime;

    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;yarnUser&quot;: &quot;&quot;,
     *     &quot;conditionResult&quot;: &quot;null&quot;,
     *     &quot;rawScript&quot;: &quot;sleep 300&quot;,
     *     &quot;submitOnYarnFlag&quot;: false,
     *     &quot;emrClusterId&quot;: &quot;&quot;,
     *     &quot;yarnPriority&quot;: &quot;&quot;,
     *     &quot;dependence&quot;: &quot;null&quot;,
     *     &quot;yarnMemory&quot;: &quot;&quot;,
     *     &quot;localParams&quot;: [],
     *     &quot;switchResult&quot;: &quot;null&quot;,
     *     &quot;resourceList&quot;: [],
     *     &quot;yarnQueue&quot;: &quot;&quot;,
     *     &quot;yarnVCores&quot;: &quot;&quot;,
     *     &quot;associateManualTaskFlag&quot;: false
     * }</p>
     */
    @NameInMap("TaskParams")
    public String taskParams;

    /**
     * <strong>example:</strong>
     * <p>SHELL</p>
     */
    @NameInMap("TaskType")
    public String taskType;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static DescribeManualTaskInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeManualTaskInstanceResponseBody self = new DescribeManualTaskInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeManualTaskInstanceResponseBody setEmrClusterId(String emrClusterId) {
        this.emrClusterId = emrClusterId;
        return this;
    }
    public String getEmrClusterId() {
        return this.emrClusterId;
    }

    public DescribeManualTaskInstanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeManualTaskInstanceResponseBody setExternalAppId(String externalAppId) {
        this.externalAppId = externalAppId;
        return this;
    }
    public String getExternalAppId() {
        return this.externalAppId;
    }

    public DescribeManualTaskInstanceResponseBody setManualTaskInstanceId(String manualTaskInstanceId) {
        this.manualTaskInstanceId = manualTaskInstanceId;
        return this;
    }
    public String getManualTaskInstanceId() {
        return this.manualTaskInstanceId;
    }

    public DescribeManualTaskInstanceResponseBody setManualTaskInstanceName(String manualTaskInstanceName) {
        this.manualTaskInstanceName = manualTaskInstanceName;
        return this;
    }
    public String getManualTaskInstanceName() {
        return this.manualTaskInstanceName;
    }

    public DescribeManualTaskInstanceResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeManualTaskInstanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeManualTaskInstanceResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeManualTaskInstanceResponseBody setSubmitTime(String submitTime) {
        this.submitTime = submitTime;
        return this;
    }
    public String getSubmitTime() {
        return this.submitTime;
    }

    public DescribeManualTaskInstanceResponseBody setTaskParams(String taskParams) {
        this.taskParams = taskParams;
        return this;
    }
    public String getTaskParams() {
        return this.taskParams;
    }

    public DescribeManualTaskInstanceResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeManualTaskInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
