// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DisableSchemaPropertyResponseBody extends TeaModel {
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
     * <p>9FBA26B0-462B-4D77-B78F-AF35560DBC71</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DisableSchemaPropertyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DisableSchemaPropertyResponseBody self = new DisableSchemaPropertyResponseBody();
        return TeaModel.build(map, self);
    }

    public DisableSchemaPropertyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DisableSchemaPropertyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DisableSchemaPropertyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DisableSchemaPropertyResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public DisableSchemaPropertyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
