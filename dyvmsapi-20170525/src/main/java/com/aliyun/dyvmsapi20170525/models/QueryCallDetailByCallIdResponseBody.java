// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dyvmsapi20170525.models;

import com.aliyun.tea.*;

public class QueryCallDetailByCallIdResponseBody extends TeaModel {
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
     * <p>The details of the call, in the JSON format.</p>
     * <ul>
     * <li><strong>caller</strong>: the calling number.</li>
     * <li><strong>startDate</strong>: the time when the call was started.</li>
     * <li><strong>stateDesc</strong>: the description of the call state.</li>
     * <li><strong>duration</strong>: the call duration. Unit: seconds. The value <strong>0</strong> indicates that the user was not connected.</li>
     * <li><strong>callerShowNumber</strong>: the calling number displayed to the called party.</li>
     * <li><strong>gmtCreate</strong>: the time when the call request was received.</li>
     * <li><strong>state</strong>: the call state. The call state is returned by the Internet service provider (ISP) in real time. For more information about call states, see <a href="https://help.aliyun.com/document_detail/55085.html">ISP-returned error codes</a>.</li>
     * <li><strong>endDate</strong>: the time when the call was ended.</li>
     * <li><strong>calleeShowNumber</strong>: the number displayed to the called party.</li>
     * <li><strong>callee</strong>: the called number.</li>
     * <li><strong>aRingTime</strong>: the time when Line A started to ring, in the yyyy-MM-dd HH:mm:ss format.</li>
     * <li><strong>aEndTime</strong>: the time when ringing on Line A ended, in the yyyy-MM-dd HH:mm:ss format.</li>
     * <li><strong>bRingTime</strong>: the time when Line B started to ring, in the yyyy-MM-dd HH:mm:ss format.</li>
     * <li><strong>bEndTime</strong>: the time when ringing on Line B ended, in the yyyy-MM-dd HH:mm:ss format.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;caller&quot;:&quot;18767****&quot;,&quot;startDate&quot;:&quot;&quot;,&quot;stateDesc&quot;:&quot;502&quot;,&quot;duration&quot;:0,&quot;callerShowNumber&quot;:&quot;05344****&quot;,&quot;gmtCreate&quot;:&quot;2017-11-27 20:09:06&quot;,&quot;state&quot;:&quot;502&quot;,&quot;endDate&quot;:&quot;&quot;,&quot;calleeShowNumber&quot;:&quot;053447****&quot;,&quot;bRingTime&quot;:&quot;2022-01-01 12:02:00&quot;，&quot;bEndTime&quot;:&quot;2022-01-01 12:02:28&quot;，&quot;callee&quot;:&quot;1373546****&quot;}</p>
     */
    @NameInMap("Data")
    public String data;

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
     * <p>A90E4451-FED7-49D2-87C8-00700A8C4D0D</p>
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
