// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteNacosServiceResponseBody extends TeaModel {
    // http状态码
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 响应信息
    @NameInMap("Message")
    public String message;

    // 响应码
    @NameInMap("Code")
    public Integer code;

    // 成功标志
    @NameInMap("Success")
    public Boolean success;

    // 删除服务的结果
    @NameInMap("Data")
    public String data;

    public static DeleteNacosServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteNacosServiceResponseBody self = new DeleteNacosServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteNacosServiceResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteNacosServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteNacosServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteNacosServiceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DeleteNacosServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DeleteNacosServiceResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
