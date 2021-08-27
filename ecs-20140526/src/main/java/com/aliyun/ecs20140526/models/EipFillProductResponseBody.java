// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EipFillProductResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("message")
    public String message;

    @NameInMap("data")
    public String data;

    @NameInMap("requestId")
    public String requestId;

    public static EipFillProductResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EipFillProductResponseBody self = new EipFillProductResponseBody();
        return TeaModel.build(map, self);
    }

    public EipFillProductResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EipFillProductResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EipFillProductResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EipFillProductResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public EipFillProductResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
