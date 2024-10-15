// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class IvrCallResponseBody extends TeaModel {
    /**
     * <p>The unique receipt ID of the call.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/393529.html">QueryCallDetailByCallId</a> operation to query the details of the call based on the receipt ID.</p>
     * 
     * <strong>example:</strong>
     * <p>116012354148^10281378****</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.</li>
     * <li>For more information about other response codes, see <a href="https://help.aliyun.com/document_detail/112502.html">API error codes</a>.</li>
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
     * <p>D9CB3933-9FE3-4870-BA8E-2BEE91B69D23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static IvrCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IvrCallResponseBody self = new IvrCallResponseBody();
        return TeaModel.build(map, self);
    }

    public IvrCallResponseBody setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public IvrCallResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IvrCallResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IvrCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
