// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class ConfigNetStatusResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <br>
     * <p>*   **200**: The request was successful.</p>
     * <p>*   Other codes: The request failed.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ConfigNetStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConfigNetStatusResponseBody self = new ConfigNetStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ConfigNetStatusResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ConfigNetStatusResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ConfigNetStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
