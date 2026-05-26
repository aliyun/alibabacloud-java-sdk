// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class HistoryThreeElementsVerificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <strong>example:</strong>
     * <p>CMCC</p>
     */
    @NameInMap("Carrier")
    public String carrier;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CertCode")
    public String certCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Mask")
    public String mask;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("VerificationTime")
    public String verificationTime;

    public static HistoryThreeElementsVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        HistoryThreeElementsVerificationRequest self = new HistoryThreeElementsVerificationRequest();
        return TeaModel.build(map, self);
    }

    public HistoryThreeElementsVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public HistoryThreeElementsVerificationRequest setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
    }
    public String getCarrier() {
        return this.carrier;
    }

    public HistoryThreeElementsVerificationRequest setCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }
    public String getCertCode() {
        return this.certCode;
    }

    public HistoryThreeElementsVerificationRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public HistoryThreeElementsVerificationRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

    public HistoryThreeElementsVerificationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public HistoryThreeElementsVerificationRequest setVerificationTime(String verificationTime) {
        this.verificationTime = verificationTime;
        return this;
    }
    public String getVerificationTime() {
        return this.verificationTime;
    }

}
