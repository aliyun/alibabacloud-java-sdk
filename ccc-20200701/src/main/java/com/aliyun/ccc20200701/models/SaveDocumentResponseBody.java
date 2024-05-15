// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class SaveDocumentResponseBody extends TeaModel {
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

    public static SaveDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveDocumentResponseBody self = new SaveDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveDocumentResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public SaveDocumentResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveDocumentResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public SaveDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
