// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class DeleteVerifySchemeResponseBody extends TeaModel {
    /**
     * <p>The request is successful. For more information about other error codes, see <a href="https://help.aliyun.com/document_detail/85198.html">API response codes</a>.</p>
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
     * <p>E3754956-D0B1-5947-962A-AE767D354F01</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result of the operation. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The verification service is deleted.</li>
     * <li><strong>false</strong>: The verification service failed to be deleted.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
