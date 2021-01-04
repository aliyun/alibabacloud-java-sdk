// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class CreateDomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDomainResponseBody self = new CreateDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
