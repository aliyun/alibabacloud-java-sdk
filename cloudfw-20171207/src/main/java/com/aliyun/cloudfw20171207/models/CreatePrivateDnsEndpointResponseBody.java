// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreatePrivateDnsEndpointResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>pd-12345</p>
     */
    @NameInMap("AccessInstanceId")
    public String accessInstanceId;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6************00090125EEB1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>132</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static CreatePrivateDnsEndpointResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrivateDnsEndpointResponseBody self = new CreatePrivateDnsEndpointResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrivateDnsEndpointResponseBody setAccessInstanceId(String accessInstanceId) {
        this.accessInstanceId = accessInstanceId;
        return this;
    }
    public String getAccessInstanceId() {
        return this.accessInstanceId;
    }

    public CreatePrivateDnsEndpointResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePrivateDnsEndpointResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
