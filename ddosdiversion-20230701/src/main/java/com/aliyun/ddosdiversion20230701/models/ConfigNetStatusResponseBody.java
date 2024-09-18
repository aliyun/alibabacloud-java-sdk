// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosdiversion20230701.models;

import com.aliyun.tea.*;

public class ConfigNetStatusResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * <ul>
     * <li><strong>200</strong>: The request was successful.</li>
     * <li>Other codes: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The response parameters.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>B0949F09-B9C1-1D5E-8F27-0A5BF3CD5D95</p>
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
