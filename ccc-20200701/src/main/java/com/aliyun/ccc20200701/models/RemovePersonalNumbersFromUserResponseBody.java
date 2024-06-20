// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RemovePersonalNumbersFromUserResponseBody extends TeaModel {
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

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>BA03159C-E808-4FF1-B27E-A61B6E888D7F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static RemovePersonalNumbersFromUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RemovePersonalNumbersFromUserResponseBody self = new RemovePersonalNumbersFromUserResponseBody();
        return TeaModel.build(map, self);
    }

    public RemovePersonalNumbersFromUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public RemovePersonalNumbersFromUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public RemovePersonalNumbersFromUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public RemovePersonalNumbersFromUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
