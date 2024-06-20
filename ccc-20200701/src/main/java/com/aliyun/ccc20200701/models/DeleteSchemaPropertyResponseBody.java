// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteSchemaPropertyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>User 244715989906081477 does not exist in instance worldfirst01.</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>7BEEA660-A45A-45E3-98CC-AFC65E715C23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteSchemaPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteSchemaPropertyResponseBody self = new DeleteSchemaPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteSchemaPropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteSchemaPropertyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteSchemaPropertyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteSchemaPropertyResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public DeleteSchemaPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
