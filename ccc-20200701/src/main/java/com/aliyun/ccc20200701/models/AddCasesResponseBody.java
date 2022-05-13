// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class AddCasesResponseBody extends TeaModel {
    // code
    @NameInMap("Code")
    public String code;

    // httpStatusCode
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    // message
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static AddCasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddCasesResponseBody self = new AddCasesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddCasesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddCasesResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddCasesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddCasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
