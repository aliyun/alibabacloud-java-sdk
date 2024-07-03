// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyplsapi20170525.models;

import com.aliyun.tea.*;

public class UnbindSubscriptionResponseBody extends TeaModel {
    /**
     * <p>A deprecated parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ChargeId")
    public String chargeId;

    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>Other values indicate that the request failed. For more information, see <a href="https://help.aliyun.com/document_detail/109196.html">Error codes</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>986BCB6D-C9BF-42F9-91CE-3A9901233D36</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UnbindSubscriptionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UnbindSubscriptionResponseBody self = new UnbindSubscriptionResponseBody();
        return TeaModel.build(map, self);
    }

    public UnbindSubscriptionResponseBody setChargeId(String chargeId) {
        this.chargeId = chargeId;
        return this;
    }
    public String getChargeId() {
        return this.chargeId;
    }

    public UnbindSubscriptionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UnbindSubscriptionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UnbindSubscriptionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
