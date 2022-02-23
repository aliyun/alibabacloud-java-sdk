// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class CreateAliyunAccountWithBindHidResponseBody extends TeaModel {
    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateAliyunAccountWithBindHidResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAliyunAccountWithBindHidResponseBody self = new CreateAliyunAccountWithBindHidResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAliyunAccountWithBindHidResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public CreateAliyunAccountWithBindHidResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
