// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneMessageQrdlRequest extends TeaModel {
    /**
     * <p>SpaceId/instance ID of ISV sub customer.</p>
     * 
     * <strong>example:</strong>
     * <p>9383884</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>Produce QR code image format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PNG</p>
     */
    @NameInMap("GenerateQrImage")
    public String generateQrImage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Number, enter the country/region code+number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861380000</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>Message content.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello</p>
     */
    @NameInMap("PrefilledMessage")
    public String prefilledMessage;

    /**
     * <p>QR code encoding.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29338838</p>
     */
    @NameInMap("QrdlCode")
    public String qrdlCode;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdatePhoneMessageQrdlRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdatePhoneMessageQrdlRequest self = new UpdatePhoneMessageQrdlRequest();
        return TeaModel.build(map, self);
    }

    public UpdatePhoneMessageQrdlRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdatePhoneMessageQrdlRequest setGenerateQrImage(String generateQrImage) {
        this.generateQrImage = generateQrImage;
        return this;
    }
    public String getGenerateQrImage() {
        return this.generateQrImage;
    }

    public UpdatePhoneMessageQrdlRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdatePhoneMessageQrdlRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdatePhoneMessageQrdlRequest setPrefilledMessage(String prefilledMessage) {
        this.prefilledMessage = prefilledMessage;
        return this;
    }
    public String getPrefilledMessage() {
        return this.prefilledMessage;
    }

    public UpdatePhoneMessageQrdlRequest setQrdlCode(String qrdlCode) {
        this.qrdlCode = qrdlCode;
        return this;
    }
    public String getQrdlCode() {
        return this.qrdlCode;
    }

    public UpdatePhoneMessageQrdlRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdatePhoneMessageQrdlRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
