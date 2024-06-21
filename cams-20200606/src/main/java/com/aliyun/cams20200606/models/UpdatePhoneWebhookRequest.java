// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneWebhookRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("HttpFlag")
    public String httpFlag;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800001234</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("QueueFlag")
    public String queueFlag;

    /**
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("StatusCallbackUrl")
    public String statusCallbackUrl;

    /**
     * <strong>example:</strong>
     * <p><a href="http://aliyun.com">http://aliyun.com</a></p>
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
