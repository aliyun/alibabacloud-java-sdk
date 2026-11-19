// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DescribeOnlineTestResultRequest extends TeaModel {
    /**
     * <p>The resource type. Valid value: video. If you specify image, audio, or document, the request is rejected and a 400 error is returned with the message &quot;resourceType should be in specific values annotated on @IsIn&quot;. Note: This parameter is actually required. If it is not provided, the API returns a 400 error with the message &quot;resourceType may not be empty&quot;, but the required field remains false.</p>
     * 
     * <strong>example:</strong>
     * <p>video</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The service code.</p>
     * 
     * <strong>example:</strong>
     * <p>videoDetection</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <p>The ID of the detection task.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx-xxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static DescribeOnlineTestResultRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOnlineTestResultRequest self = new DescribeOnlineTestResultRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOnlineTestResultRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public DescribeOnlineTestResultRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public DescribeOnlineTestResultRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
