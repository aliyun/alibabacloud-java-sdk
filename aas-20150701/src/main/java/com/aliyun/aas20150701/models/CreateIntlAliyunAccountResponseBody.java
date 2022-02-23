// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateIntlAliyunAccountResponseBody extends TeaModel {
    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateIntlAliyunAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateIntlAliyunAccountResponseBody self = new CreateIntlAliyunAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateIntlAliyunAccountResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public CreateIntlAliyunAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
