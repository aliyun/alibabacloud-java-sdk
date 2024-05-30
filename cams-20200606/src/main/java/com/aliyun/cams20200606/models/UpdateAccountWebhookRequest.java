// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateAccountWebhookRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the ISV account.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>Specifies whether to use HTTP callbacks to receive message receipts. Valid values:</p>
     * <br>
     * <p>*   Y: indicates that HTTP callbacks are used to receive receipts.</p>
     * <p>*   N: indicates that HTTP callbacks are not used to receive receipts.</p>
     */
    @NameInMap("HttpFlag")
    public String httpFlag;

    /**
     * <p>Specifies whether to use Message Service (MNS) queues to receive receipts. Valid values:</p>
     * <br>
     * <p>*   Y: indicates that MNS queues are used to receive receipts.</p>
     * <p>*   N: indicates that MNS queues are not used to receive receipts.</p>
     */
    @NameInMap("QueueFlag")
    public String queueFlag;

    /**
     * <p>The callback URL to which status reports are sent by using HTTP callbacks.</p>
     */
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
