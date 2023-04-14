// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneWebhookRequest extends TeaModel {
    /**
     * <p>The space ID of the user under the ISV account.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>Specifies whether to use HTTP callbacks to receive message receipts. Valid values:</p>
     * <br>
     * <p>*   Y: indicates that HTTP callbacks are used to receive message receipts.</p>
     * <p>*   N: indicates that HTTP callbacks are not used to receive message receipts.</p>
     */
    @NameInMap("HttpFlag")
    public String httpFlag;

    /**
     * <p>The phone number.</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

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

    /**
     * <p>The callback URL to which mobile originated (MO) messages are sent by using HTTP callbacks.</p>
     */
    @NameInMap("UpCallbackUrl")
    public String upCallbackUrl;

    public static UpdatePhoneWebhookRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneWebhookRequest self = new UpdatePhoneWebhookRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneWebhookRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdatePhoneWebhookRequest setHttpFlag(String httpFlag) {
        this.httpFlag = httpFlag;
        return this;
    }
    public String getHttpFlag() {
        return this.httpFlag;
    }

    public UpdatePhoneWebhookRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdatePhoneWebhookRequest setQueueFlag(String queueFlag) {
        this.queueFlag = queueFlag;
        return this;
    }
    public String getQueueFlag() {
        return this.queueFlag;
    }

    public UpdatePhoneWebhookRequest setStatusCallbackUrl(String statusCallbackUrl) {
        this.statusCallbackUrl = statusCallbackUrl;
        return this;
    }
    public String getStatusCallbackUrl() {
        return this.statusCallbackUrl;
    }

    public UpdatePhoneWebhookRequest setUpCallbackUrl(String upCallbackUrl) {
        this.upCallbackUrl = upCallbackUrl;
        return this;
    }
    public String getUpCallbackUrl() {
        return this.upCallbackUrl;
    }

}
