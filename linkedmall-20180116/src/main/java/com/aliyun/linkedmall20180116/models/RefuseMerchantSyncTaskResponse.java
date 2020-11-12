// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class RefuseMerchantSyncTaskResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    public static RefuseMerchantSyncTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RefuseMerchantSyncTaskResponse self = new RefuseMerchantSyncTaskResponse();
        return TeaModel.build(map, self);
    }

    public RefuseMerchantSyncTaskResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RefuseMerchantSyncTaskResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RefuseMerchantSyncTaskResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
