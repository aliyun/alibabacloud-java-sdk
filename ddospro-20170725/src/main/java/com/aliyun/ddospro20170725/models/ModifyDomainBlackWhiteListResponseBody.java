// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class ModifyDomainBlackWhiteListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static ModifyDomainBlackWhiteListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifyDomainBlackWhiteListResponseBody self = new ModifyDomainBlackWhiteListResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifyDomainBlackWhiteListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
