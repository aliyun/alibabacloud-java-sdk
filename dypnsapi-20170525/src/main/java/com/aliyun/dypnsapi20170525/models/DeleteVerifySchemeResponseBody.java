// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteVerifySchemeResponseBody extends TeaModel {
    /**
     * <p>The request is successful. For more information about other error codes, see [API response codes](~~85198~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the operation. Valid values:</p>
     * <br>
     * <p>*   **true**: The verification service is deleted.</p>
     * <p>*   **false**: The verification service failed to be deleted.</p>
     */
    @NameInMap("Result")
    public Boolean result;

    public static DeleteVerifySchemeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteVerifySchemeResponseBody self = new DeleteVerifySchemeResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteVerifySchemeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteVerifySchemeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteVerifySchemeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteVerifySchemeResponseBody setResult(Boolean result) {
        this.result = result;
        return this;
    }
    public Boolean getResult() {
        return this.result;
    }

}
