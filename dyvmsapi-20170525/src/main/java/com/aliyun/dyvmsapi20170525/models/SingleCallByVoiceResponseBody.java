// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class SingleCallByVoiceResponseBody extends TeaModel {
    /**
     * <p>The unique receipt ID for the call.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/393529.html">QueryCallDetailByCallId</a> operation to query the details of the call.</p>
     * 
     * <strong>example:</strong>
     * <p>116004767703^102806****</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The response code.</p>
     * <ul>
     * <li>The value OK indicates that the request was successful.****</li>
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
     * <p>E50FFA85-0B79-4421-A7BD-00B0A271966F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SingleCallByVoiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SingleCallByVoiceResponseBody self = new SingleCallByVoiceResponseBody();
        return TeaModel.build(map, self);
    }

    public SingleCallByVoiceResponseBody setCallId(String callId) {
        this.callId = callId;
        return this;
    }
    public String getCallId() {
        return this.callId;
    }

    public SingleCallByVoiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SingleCallByVoiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SingleCallByVoiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
