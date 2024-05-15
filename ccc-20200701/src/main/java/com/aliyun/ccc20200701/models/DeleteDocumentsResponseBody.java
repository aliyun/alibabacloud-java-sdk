// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteDocumentsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    @NameInMap("RequestId")
    public String requestId;

    public static DeleteDocumentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteDocumentsResponseBody self = new DeleteDocumentsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteDocumentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteDocumentsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteDocumentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteDocumentsResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public DeleteDocumentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
