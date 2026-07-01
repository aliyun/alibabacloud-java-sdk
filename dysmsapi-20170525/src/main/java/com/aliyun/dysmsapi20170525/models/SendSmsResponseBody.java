// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendSmsResponseBody extends TeaModel {
    /**
     * <p>The delivery receipt ID.</p>
     * <p>Use this ID to query the delivery status by calling the <a href="~~QuerySendDetails~~">QuerySendDetails</a> API.</p>
     * 
     * <strong>example:</strong>
     * <p>9006197469364984****</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>A value of <code>OK</code> indicates that the request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">API error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8DE990</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendSmsResponseBody self = new SendSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendSmsResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SendSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendSmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
