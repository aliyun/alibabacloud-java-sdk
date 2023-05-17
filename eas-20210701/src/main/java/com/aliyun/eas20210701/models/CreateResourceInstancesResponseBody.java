// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eas20210701.models;

import com.aliyun.tea.*;

public class CreateResourceInstancesResponseBody extends TeaModel {
    @NameInMap("InstanceIds")
    public java.util.List<String> instanceIds;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateResourceInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateResourceInstancesResponseBody self = new CreateResourceInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateResourceInstancesResponseBody setInstanceIds(java.util.List<String> instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    public CreateResourceInstancesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateResourceInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
