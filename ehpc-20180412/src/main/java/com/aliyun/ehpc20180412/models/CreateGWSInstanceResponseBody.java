// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class CreateGWSInstanceResponseBody extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateGWSInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGWSInstanceResponseBody self = new CreateGWSInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGWSInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateGWSInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
