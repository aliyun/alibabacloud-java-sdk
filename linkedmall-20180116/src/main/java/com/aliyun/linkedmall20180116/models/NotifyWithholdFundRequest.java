// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20180116.models;

import com.aliyun.tea.*;

public class NotifyWithholdFundRequest extends TeaModel {
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

    @NameInMap("TenantOrderId")
    public String tenantOrderId;

    public static NotifyWithholdFundRequest build(java.util.Map<String, ?> map) throws Exception {
        NotifyWithholdFundRequest self = new NotifyWithholdFundRequest();
        return TeaModel.build(map, self);
    }

    public NotifyWithholdFundRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public NotifyWithholdFundRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public NotifyWithholdFundRequest setOperationDate(String operationDate) {
        this.operationDate = operationDate;
        return this;
    }
    public String getOperationDate() {
        return this.operationDate;
    }

    public NotifyWithholdFundRequest setPayTypes(String payTypes) {
        this.payTypes = payTypes;
        return this;
    }
    public String getPayTypes() {
        return this.payTypes;
    }

    public NotifyWithholdFundRequest setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public NotifyWithholdFundRequest setTenantOrderId(String tenantOrderId) {
        this.tenantOrderId = tenantOrderId;
        return this;
    }
    public String getTenantOrderId() {
        return this.tenantOrderId;
    }

}
