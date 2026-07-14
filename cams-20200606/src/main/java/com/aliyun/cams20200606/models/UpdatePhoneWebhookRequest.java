// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneWebhookRequest extends TeaModel {
    /**
     * <p>The SpaceId of the ISV sub-customer.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493****</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>Specifies whether to use HTTP to receive receipts. Valid values:</p>
     * <ul>
     * <li><p>Y: Yes.</p>
     * </li>
     * <li><p>N: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("HttpFlag")
    public String httpFlag;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861380000****</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>Specifies whether to use a queue to receive receipts. Valid values:</p>
     * <ul>
     * <li><p>Y: Yes.</p>
     * </li>
     * <li><p>N: No.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>N</p>
     */
    @NameInMap("QueueFlag")
    public String queueFlag;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The callback URL for the HTTP-based status report.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
     */
    @NameInMap("StatusCallbackUrl")
    public String statusCallbackUrl;

    /**
     * <p>The callback URL for the HTTP-based upstream message.</p>
     * 
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

    public UpdatePhoneWebhookRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public UpdatePhoneWebhookRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdatePhoneWebhookRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
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
