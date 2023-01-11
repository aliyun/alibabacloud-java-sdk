// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateAccountWebhookRequest extends TeaModel {
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("HttpFlag")
    public String httpFlag;

    @NameInMap("QueueFlag")
    public String queueFlag;

    @NameInMap("StatusCallbackUrl")
    public String statusCallbackUrl;

    public static UpdateAccountWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountWebhookRequest self = new UpdateAccountWebhookRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountWebhookRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdateAccountWebhookRequest setHttpFlag(String httpFlag) {
        this.httpFlag = httpFlag;
        return this;
    }
    public String getHttpFlag() {
        return this.httpFlag;
    }

    public UpdateAccountWebhookRequest setQueueFlag(String queueFlag) {
        this.queueFlag = queueFlag;
        return this;
    }
    public String getQueueFlag() {
        return this.queueFlag;
    }

    public UpdateAccountWebhookRequest setStatusCallbackUrl(String statusCallbackUrl) {
        this.statusCallbackUrl = statusCallbackUrl;
        return this;
    }
    public String getStatusCallbackUrl() {
        return this.statusCallbackUrl;
    }

}
