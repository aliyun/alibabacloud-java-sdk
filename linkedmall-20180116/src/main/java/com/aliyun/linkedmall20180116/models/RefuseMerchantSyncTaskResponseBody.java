// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefuseMerchantSyncTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static RefuseMerchantSyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RefuseMerchantSyncTaskResponseBody self = new RefuseMerchantSyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public RefuseMerchantSyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefuseMerchantSyncTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RefuseMerchantSyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
