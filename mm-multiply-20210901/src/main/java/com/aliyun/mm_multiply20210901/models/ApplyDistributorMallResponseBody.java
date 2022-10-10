// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class ApplyDistributorMallResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("MallId")
    public String mallId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ApplyDistributorMallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyDistributorMallResponseBody self = new ApplyDistributorMallResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyDistributorMallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ApplyDistributorMallResponseBody setMallId(String mallId) {
        this.mallId = mallId;
        return this;
    }
    public String getMallId() {
        return this.mallId;
    }

    public ApplyDistributorMallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ApplyDistributorMallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyDistributorMallResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
