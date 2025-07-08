// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class CreateSmsSaasTaskNewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    public static CreateSmsSaasTaskNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSmsSaasTaskNewResponseBody self = new CreateSmsSaasTaskNewResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSmsSaasTaskNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
