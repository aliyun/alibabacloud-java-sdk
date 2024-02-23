// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class IvrCallResponseBody extends TeaModel {
    /**
     * <p>The unique receipt ID of the call.</p>
     * <br>
     * <p>You can call the [QueryCallDetailByCallId](~~393529~~) operation to query the details of the call based on the receipt ID.</p>
     */
    @NameInMap("CallId")
    public String callId;

    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
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
