// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class SendBatchSmsResponseBody extends TeaModel {
    /**
     * <p>The ID of the delivery receipt. You can use one of the following methods to query the delivery status of a message based on the ID.</p>
     * <ul>
     * <li>Call the <a href="https://help.aliyun.com/document_detail/102352.html">QuerySendDetails</a> operation.</li>
     * <li>Log on to the <a href="https://dysms.console.aliyun.com/dysms.htm#/overview">Alibaba Cloud SMS console</a>. In the left-side navigation pane, choose <strong>Analytics</strong> &gt; <strong>Delivery Report</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>9006197469364984400</p>
     */
    @NameInMap("BizId")
    public String bizId;

    /**
     * <p>The response code.</p>
     * <ul>
     * <li>If OK is returned, the request is successful.</li>
     * <li>Other values indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/101346.html">Error codes</a>.</li>
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
