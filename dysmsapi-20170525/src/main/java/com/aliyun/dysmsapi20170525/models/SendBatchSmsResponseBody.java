// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchSmsResponseBody extends TeaModel {
    /**
     * <p>The delivery receipt ID.</p>
     * <ul>
     * <li><p>You can use this ID to query the delivery status by calling the <a href="https://help.aliyun.com/document_detail/102352.html">QuerySendDetails</a> operation.</p>
     * </li>
     * <li><p>Log on to the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Short Message Service console</a> and go to <strong>Statistics</strong> &gt; <strong>Delivery Logs</strong> to view delivery details.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9006197469364984400</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The request status code.</p>
     * <ul>
     * <li><p>A value of <code>OK</code> indicates a successful request.</p>
     * </li>
     * <li><p>For a list of other error codes, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The description of the request status.</p>
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
     * <p>F655A8D5-B967-440B-8683-DAD6FF8D230E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SendBatchSmsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SendBatchSmsResponseBody self = new SendBatchSmsResponseBody();
        return TeaModel.build(map, self);
    }

    public SendBatchSmsResponseBody setBizId(String bizId) {
        this.bizId = bizId;
        return this;
    }
    public String getBizId() {
        return this.bizId;
    }

    public SendBatchSmsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SendBatchSmsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SendBatchSmsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
