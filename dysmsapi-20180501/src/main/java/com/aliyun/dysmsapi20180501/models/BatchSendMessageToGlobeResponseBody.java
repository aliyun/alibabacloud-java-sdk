// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class BatchSendMessageToGlobeResponseBody extends TeaModel {
    /**
     * <p>The list of mobile phone numbers that failed to receive the message.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;931520581****&quot;,&quot;931530581****&quot;]</p>
     */
    @NameInMap("FailedList")
    public String failedList;

    /**
     * <p>The sender ID returned.</p>
     * 
     * <strong>example:</strong>
     * <p>Alicloud321</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ID of the message.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;123****&quot;,&quot;124****&quot;]</p>
     */
    @NameInMap("MessageIdList")
    public String messageIdList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F655A8D5-B967-440B-8683-DAD6FF8D28D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status code. If OK is returned, the request is successful. For more information, see <a href="https://www.alibabacloud.com/help/en/short-message-service/latest/error-codes">Error codes</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResponseCode")
    public String responseCode;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>The SMS Send Request was accepted</p>
     */
    @NameInMap("ResponseDescription")
    public String responseDescription;

    /**
     * <p>The number of mobile phone numbers that received the message.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("SuccessCount")
    public String successCount;

    public static BatchSendMessageToGlobeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMessageToGlobeResponseBody self = new BatchSendMessageToGlobeResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchSendMessageToGlobeResponseBody setFailedList(String failedList) {
        this.failedList = failedList;
        return this;
    }
    public String getFailedList() {
        return this.failedList;
    }

    public BatchSendMessageToGlobeResponseBody setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public BatchSendMessageToGlobeResponseBody setMessageIdList(String messageIdList) {
        this.messageIdList = messageIdList;
        return this;
    }
    public String getMessageIdList() {
        return this.messageIdList;
    }

    public BatchSendMessageToGlobeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchSendMessageToGlobeResponseBody setResponseCode(String responseCode) {
        this.responseCode = responseCode;
        return this;
    }
    public String getResponseCode() {
        return this.responseCode;
    }

    public BatchSendMessageToGlobeResponseBody setResponseDescription(String responseDescription) {
        this.responseDescription = responseDescription;
        return this;
    }
    public String getResponseDescription() {
        return this.responseDescription;
    }

    public BatchSendMessageToGlobeResponseBody setSuccessCount(String successCount) {
        this.successCount = successCount;
        return this;
    }
    public String getSuccessCount() {
        return this.successCount;
    }

}
