// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class ModifyDomainCustomLogConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDomainCustomLogConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainCustomLogConfigResponseBody self = new ModifyDomainCustomLogConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDomainCustomLogConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
