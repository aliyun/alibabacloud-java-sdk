// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveDomainSchdmByPropertyResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static ModifyLiveDomainSchdmByPropertyResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveDomainSchdmByPropertyResponse self = new ModifyLiveDomainSchdmByPropertyResponse();
        return TeaModel.build(map, self);
    }

    public ModifyLiveDomainSchdmByPropertyResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
