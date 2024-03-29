// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class NotifyPayOrderStatusRequest extends TeaModel {
    @NameInMap("Amount")
    public Long amount;

    @NameInMap("ChannelId")
    public String channelId;

    @NameInMap("OperationDate")
    public String operationDate;

    @NameInMap("PayTypes")
    public String payTypes;

    @NameInMap("RequestId")
    public String requestId;

    public static NotifyPayOrderStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyPayOrderStatusRequest self = new NotifyPayOrderStatusRequest();
        return TeaModel.build(map, self);
    }

    public NotifyPayOrderStatusRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public NotifyPayOrderStatusRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public NotifyPayOrderStatusRequest setOperationDate(String operationDate) {
        this.operationDate = operationDate;
        return this;
    }
    public String getOperationDate() {
        return this.operationDate;
    }

    public NotifyPayOrderStatusRequest setPayTypes(String payTypes) {
        this.payTypes = payTypes;
        return this;
    }
    public String getPayTypes() {
        return this.payTypes;
    }

    public NotifyPayOrderStatusRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
