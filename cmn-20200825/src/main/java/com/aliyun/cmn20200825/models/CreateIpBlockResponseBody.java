// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cmn20200825.models;

import com.aliyun.tea.*;

public class CreateIpBlockResponseBody extends TeaModel {
    // 资源实例ID，如ECS实例的创建接口CreateInstance应返回InstanceId。
    @NameInMap("IpBlockId")
    public String ipBlockId;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateIpBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIpBlockResponseBody self = new CreateIpBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIpBlockResponseBody setIpBlockId(String ipBlockId) {
        this.ipBlockId = ipBlockId;
        return this;
    }
    public String getIpBlockId() {
        return this.ipBlockId;
    }

    public CreateIpBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
