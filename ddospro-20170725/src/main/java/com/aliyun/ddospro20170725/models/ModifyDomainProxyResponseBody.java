// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyDomainProxyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDomainProxyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainProxyResponseBody self = new ModifyDomainProxyResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDomainProxyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
