// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdatePhoneMessageQrdlRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>9383884</p>
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

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>29338838</p>
     */
    @NameInMap("QrdlCode")
    public String qrdlCode;

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

}
