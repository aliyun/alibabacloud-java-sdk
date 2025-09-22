// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class FraudResultCallBackResponseBody extends TeaModel {
    /**
     * <p>Return code</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the call was successful.</p>
     * <ul>
     * <li><strong>true</strong>: Call succeeded.</li>
     * <li><strong>false</strong>: Call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static FraudResultCallBackResponseBody build(java.util.Map<String, ?> map) throws Exception {
        FraudResultCallBackResponseBody self = new FraudResultCallBackResponseBody();
        return TeaModel.build(map, self);
    }

    public FraudResultCallBackResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public FraudResultCallBackResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public FraudResultCallBackResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public FraudResultCallBackResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
