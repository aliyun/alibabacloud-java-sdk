// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dytnsapi20200217.models;

import com.aliyun.tea.*;

public class VirtualThreeElementsVerificationRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("AuthCode")
    public String authCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("CertCode")
    public String certCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("CertName")
    public String certName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("InputNumber")
    public String inputNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Mask")
    public String mask;

    public static VirtualThreeElementsVerificationRequest build(java.util.Map<String, ?> map) throws Exception {
        VirtualThreeElementsVerificationRequest self = new VirtualThreeElementsVerificationRequest();
        return TeaModel.build(map, self);
    }

    public VirtualThreeElementsVerificationRequest setAuthCode(String authCode) {
        this.authCode = authCode;
        return this;
    }
    public String getAuthCode() {
        return this.authCode;
    }

    public VirtualThreeElementsVerificationRequest setCertCode(String certCode) {
        this.certCode = certCode;
        return this;
    }
    public String getCertCode() {
        return this.certCode;
    }

    public VirtualThreeElementsVerificationRequest setCertName(String certName) {
        this.certName = certName;
        return this;
    }
    public String getCertName() {
        return this.certName;
    }

    public VirtualThreeElementsVerificationRequest setInputNumber(String inputNumber) {
        this.inputNumber = inputNumber;
        return this;
    }
    public String getInputNumber() {
        return this.inputNumber;
    }

    public VirtualThreeElementsVerificationRequest setMask(String mask) {
        this.mask = mask;
        return this;
    }
    public String getMask() {
        return this.mask;
    }

}
