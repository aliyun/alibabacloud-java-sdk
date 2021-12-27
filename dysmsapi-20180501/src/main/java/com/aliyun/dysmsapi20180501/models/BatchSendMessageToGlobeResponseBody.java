// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20180501.models;

import com.aliyun.tea.*;

public class BatchSendMessageToGlobeResponseBody extends TeaModel {
    @NameInMap("FailedList")
    public String failedList;

    @NameInMap("From")
    public String from;

    @NameInMap("MessageIdList")
    public String messageIdList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseCode")
    public String responseCode;

    @NameInMap("ResponseDescription")
    public String responseDescription;

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
