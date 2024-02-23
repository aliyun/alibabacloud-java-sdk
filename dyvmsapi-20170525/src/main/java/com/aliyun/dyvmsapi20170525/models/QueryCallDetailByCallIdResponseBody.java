// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByCallIdResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * <br>
     * <p>*   The value OK indicates that the request was successful.</p>
     * <p>*   For more information about other response codes, see [API error codes](~~112502~~).</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the call, in the JSON format.</p>
     * <br>
     * <p>*   **caller**: the calling number.</p>
     * <p>*   **startDate**: the time when the call was started.</p>
     * <p>*   **stateDesc**: the description of the call state.</p>
     * <p>*   **duration**: the call duration. Unit: seconds. The value **0** indicates that the user was not connected.</p>
     * <p>*   **callerShowNumber**: the calling number displayed to the called party.</p>
     * <p>*   **gmtCreate**: the time when the call request was received.</p>
     * <p>*   **state**: the call state. The call state is returned by the Internet service provider (ISP) in real time. For more information about call states, see [ISP-returned error codes](~~55085~~).</p>
     * <p>*   **endDate**: the time when the call was ended.</p>
     * <p>*   **calleeShowNumber**: the number displayed to the called party.</p>
     * <p>*   **callee**: the called number.</p>
     * <p>*   **aRingTime**: the time when Line A started to ring, in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>*   **aEndTime**: the time when ringing on Line A ended, in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>*   **bRingTime**: the time when Line B started to ring, in the yyyy-MM-dd HH:mm:ss format.</p>
     * <p>*   **bEndTime**: the time when ringing on Line B ended, in the yyyy-MM-dd HH:mm:ss format.</p>
     */
    @NameInMap("Data")
    public String data;

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

    public static QueryCallDetailByCallIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCallDetailByCallIdResponseBody self = new QueryCallDetailByCallIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCallDetailByCallIdResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryCallDetailByCallIdResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryCallDetailByCallIdResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryCallDetailByCallIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
