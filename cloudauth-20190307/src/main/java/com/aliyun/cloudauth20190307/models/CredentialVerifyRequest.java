// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>4601*****</p>
     */
    @NameInMap("CertNum")
    public String certNum;

    /**
     * <strong>example:</strong>
     * <p>0104</p>
     */
    @NameInMap("CredName")
    public String credName;

    /**
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("CredType")
    public String credType;

    /**
     * <strong>example:</strong>
     * <p>429001********8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("ImageContext")
    public String imageContext;

    /**
     * <strong>example:</strong>
     * <p><a href="http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg">http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsCheck")
    public String isCheck;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsOCR")
    public String isOCR;

    @NameInMap("MerchantDetail")
    public java.util.List<CredentialVerifyRequestMerchantDetail> merchantDetail;

    @NameInMap("MerchantId")
    public String merchantId;

    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Prompt")
    public String prompt;

    @NameInMap("PromptModel")
    public String promptModel;

    @NameInMap("UserName")
    public String userName;

    public static CredentialVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyRequest self = new CredentialVerifyRequest();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyRequest setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public CredentialVerifyRequest setCredName(String credName) {
        this.credName = credName;
        return this;
    }
    public String getCredName() {
        return this.credName;
    }

    public CredentialVerifyRequest setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CredentialVerifyRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public CredentialVerifyRequest setImageContext(String imageContext) {
        this.imageContext = imageContext;
        return this;
    }
    public String getImageContext() {
        return this.imageContext;
    }

    public CredentialVerifyRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CredentialVerifyRequest setIsCheck(String isCheck) {
        this.isCheck = isCheck;
        return this;
    }
    public String getIsCheck() {
        return this.isCheck;
    }

    public CredentialVerifyRequest setIsOCR(String isOCR) {
        this.isOCR = isOCR;
        return this;
    }
    public String getIsOCR() {
        return this.isOCR;
    }

    public CredentialVerifyRequest setMerchantDetail(java.util.List<CredentialVerifyRequestMerchantDetail> merchantDetail) {
        this.merchantDetail = merchantDetail;
        return this;
    }
    public java.util.List<CredentialVerifyRequestMerchantDetail> getMerchantDetail() {
        return this.merchantDetail;
    }

    public CredentialVerifyRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CredentialVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CredentialVerifyRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CredentialVerifyRequest setPromptModel(String promptModel) {
        this.promptModel = promptModel;
        return this;
    }
    public String getPromptModel() {
        return this.promptModel;
    }

    public CredentialVerifyRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class CredentialVerifyRequestMerchantDetail extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CredentialVerifyRequestMerchantDetail build(java.util.Map<String, ?> map) throws Exception {
            CredentialVerifyRequestMerchantDetail self = new CredentialVerifyRequestMerchantDetail();
            return TeaModel.build(map, self);
        }

        public CredentialVerifyRequestMerchantDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CredentialVerifyRequestMerchantDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
