// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubYikeUserCreditResponseBody extends TeaModel {
    /**
     * <p>The error code returned if the operation fails. A possible value is:</p>
     * <ul>
     * <li><code>NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA</code>: The sub-account\&quot;s credit balance is insufficient.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NOT_ENOUGH_ALLOCATE_CREDIT_QUOTA</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the operation succeeded.</p>
     * <ul>
     * <li><p><code>true</code>: The operation succeeded.</p>
     * </li>
     * <li><p><code>false</code>: The operation failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static SubYikeUserCreditResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubYikeUserCreditResponseBody self = new SubYikeUserCreditResponseBody();
        return TeaModel.build(map, self);
    }

    public SubYikeUserCreditResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SubYikeUserCreditResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubYikeUserCreditResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
