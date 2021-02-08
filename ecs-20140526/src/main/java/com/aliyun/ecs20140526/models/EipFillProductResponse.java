// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipFillProductResponse extends TeaModel {
    @NameInMap("requestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("data")
    @Validation(required = true)
    public String data;

    @NameInMap("code")
    @Validation(required = true)
    public String code;

    @NameInMap("success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("message")
    @Validation(required = true)
    public String message;

    public static EipFillProductResponse build(java.util.Map<String, ?> map) throws Exception {
        EipFillProductResponse self = new EipFillProductResponse();
        return TeaModel.build(map, self);
    }

    public EipFillProductResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EipFillProductResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EipFillProductResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EipFillProductResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EipFillProductResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
