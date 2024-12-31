// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bss20140714.models;

import com.aliyun.tea.*;

public class VnoBatchRefundOrderResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static VnoBatchRefundOrderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VnoBatchRefundOrderResponseBody self = new VnoBatchRefundOrderResponseBody();
        return TeaModel.build(map, self);
    }

    public VnoBatchRefundOrderResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VnoBatchRefundOrderResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public VnoBatchRefundOrderResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VnoBatchRefundOrderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VnoBatchRefundOrderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
