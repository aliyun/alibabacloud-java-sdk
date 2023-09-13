// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class SetDefaultDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static SetDefaultDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SetDefaultDomainResponseBody self = new SetDefaultDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public SetDefaultDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
