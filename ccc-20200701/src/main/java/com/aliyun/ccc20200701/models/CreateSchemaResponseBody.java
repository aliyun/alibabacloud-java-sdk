// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class CreateSchemaResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public String data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSchemaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSchemaResponseBody self = new CreateSchemaResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSchemaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSchemaResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateSchemaResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CreateSchemaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSchemaResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public CreateSchemaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
