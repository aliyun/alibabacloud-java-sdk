// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.et_industry_openapi20210105.models;

import com.aliyun.tea.*;

public class OpenApiInvokeResponseBody extends TeaModel {
    // 是否成功
    @NameInMap("success")
    public Boolean success;

    // 返回码
    @NameInMap("code")
    public String code;

    // 消息
    @NameInMap("message")
    public String message;

    // 结果
    @NameInMap("data")
    public String data;

    @NameInMap("rid")
    public String rid;

    // 内部, 统一错误码
    @NameInMap("innerCode")
    public String innerCode;

    public static OpenApiInvokeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenApiInvokeResponseBody self = new OpenApiInvokeResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenApiInvokeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public OpenApiInvokeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenApiInvokeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenApiInvokeResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public OpenApiInvokeResponseBody setRid(String rid) {
        this.rid = rid;
        return this;
    }
    public String getRid() {
        return this.rid;
    }

    public OpenApiInvokeResponseBody setInnerCode(String innerCode) {
        this.innerCode = innerCode;
        return this;
    }
    public String getInnerCode() {
        return this.innerCode;
    }

}
