// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateAliyunAccountResponseBody extends TeaModel {
    @NameInMap("AliyunId")
    public String aliyunId;

    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAliyunAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunAccountResponseBody self = new CreateAliyunAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAliyunAccountResponseBody setAliyunId(String aliyunId) {
        this.aliyunId = aliyunId;
        return this;
    }
    public String getAliyunId() {
        return this.aliyunId;
    }

    public CreateAliyunAccountResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public CreateAliyunAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
