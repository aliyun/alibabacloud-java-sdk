// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class SyncPaymentConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public String params;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("SyncSuccess")
    public Boolean syncSuccess;

    public static SyncPaymentConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SyncPaymentConfigResponseBody self = new SyncPaymentConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public SyncPaymentConfigResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SyncPaymentConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SyncPaymentConfigResponseBody setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

    public SyncPaymentConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SyncPaymentConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SyncPaymentConfigResponseBody setSyncSuccess(Boolean syncSuccess) {
        this.syncSuccess = syncSuccess;
        return this;
    }
    public Boolean getSyncSuccess() {
        return this.syncSuccess;
    }

}
