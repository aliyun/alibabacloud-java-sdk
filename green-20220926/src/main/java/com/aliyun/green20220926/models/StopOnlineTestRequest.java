// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class StopOnlineTestRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>image</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <strong>example:</strong>
     * <p>VideoModeration</p>
     */
    @NameInMap("ServiceCode")
    public String serviceCode;

    /**
     * <strong>example:</strong>
     * <p>xxxxx-xxxxx</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static StopOnlineTestRequest build(java.util.Map<String, ?> map) throws Exception {
        StopOnlineTestRequest self = new StopOnlineTestRequest();
        return TeaModel.build(map, self);
    }

    public StopOnlineTestRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public StopOnlineTestRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
    }

    public StopOnlineTestRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
