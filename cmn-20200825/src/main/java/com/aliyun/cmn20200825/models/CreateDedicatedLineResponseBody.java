// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateDedicatedLineResponseBody extends TeaModel {
    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("DedicatedLineId")
    public String dedicatedLineId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDedicatedLineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDedicatedLineResponseBody self = new CreateDedicatedLineResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDedicatedLineResponseBody setDedicatedLineId(String dedicatedLineId) {
        this.dedicatedLineId = dedicatedLineId;
        return this;
    }
    public String getDedicatedLineId() {
        return this.dedicatedLineId;
    }

    public CreateDedicatedLineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
