// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aas20150701.models;

import com.aliyun.tea.*;

public class DeleteAccessKeyForAccountResponseBody extends TeaModel {
    @NameInMap("PK")
    public String PK;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public String result;

    public static DeleteAccessKeyForAccountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessKeyForAccountResponseBody self = new DeleteAccessKeyForAccountResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAccessKeyForAccountResponseBody setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public DeleteAccessKeyForAccountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteAccessKeyForAccountResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
