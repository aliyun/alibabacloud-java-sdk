// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class CreatePhoneMessageQrdlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>838833</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PNG</p>
     */
    @NameInMap("GenerateQrImage")
    public String generateQrImage;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>861380000</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Hello</p>
     */
    @NameInMap("PrefilledMessage")
    public String prefilledMessage;

    public static CreatePhoneMessageQrdlRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePhoneMessageQrdlRequest self = new CreatePhoneMessageQrdlRequest();
        return TeaModel.build(map, self);
    }

    public CreatePhoneMessageQrdlRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public CreatePhoneMessageQrdlRequest setGenerateQrImage(String generateQrImage) {
        this.generateQrImage = generateQrImage;
        return this;
    }
    public String getGenerateQrImage() {
        return this.generateQrImage;
    }

    public CreatePhoneMessageQrdlRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public CreatePhoneMessageQrdlRequest setPrefilledMessage(String prefilledMessage) {
        this.prefilledMessage = prefilledMessage;
        return this;
    }
    public String getPrefilledMessage() {
        return this.prefilledMessage;
    }

}
