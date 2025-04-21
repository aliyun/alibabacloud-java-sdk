// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyV2Request extends TeaModel {
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
     * <p>4****************1</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    @NameInMap("ImageFile")
    public String imageFile;

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
     * <p>0</p>
     */
    @NameInMap("IsOcr")
    public String isOcr;

    @NameInMap("MerchantDetail")
    public java.util.List<CredentialVerifyV2RequestMerchantDetail> merchantDetail;

    @NameInMap("MerchantId")
    public String merchantId;

    /**
     * <strong>example:</strong>
     * <p>ANTI_FAKE_CHECK</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    @NameInMap("Prompt")
    public String prompt;

    /**
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("PromptModel")
    public String promptModel;

    @NameInMap("UserName")
    public String userName;

    public static CredentialVerifyV2Request build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyV2Request self = new CredentialVerifyV2Request();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyV2Request setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public CredentialVerifyV2Request setCredName(String credName) {
        this.credName = credName;
        return this;
    }
    public String getCredName() {
        return this.credName;
    }

    public CredentialVerifyV2Request setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CredentialVerifyV2Request setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public CredentialVerifyV2Request setImageFile(String imageFile) {
        this.imageFile = imageFile;
        return this;
    }
    public String getImageFile() {
        return this.imageFile;
    }

    public CredentialVerifyV2Request setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CredentialVerifyV2Request setIsCheck(String isCheck) {
        this.isCheck = isCheck;
        return this;
    }
    public String getIsCheck() {
        return this.isCheck;
    }

    public CredentialVerifyV2Request setIsOcr(String isOcr) {
        this.isOcr = isOcr;
        return this;
    }
    public String getIsOcr() {
        return this.isOcr;
    }

    public CredentialVerifyV2Request setMerchantDetail(java.util.List<CredentialVerifyV2RequestMerchantDetail> merchantDetail) {
        this.merchantDetail = merchantDetail;
        return this;
    }
    public java.util.List<CredentialVerifyV2RequestMerchantDetail> getMerchantDetail() {
        return this.merchantDetail;
    }

    public CredentialVerifyV2Request setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CredentialVerifyV2Request setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CredentialVerifyV2Request setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CredentialVerifyV2Request setPromptModel(String promptModel) {
        this.promptModel = promptModel;
        return this;
    }
    public String getPromptModel() {
        return this.promptModel;
    }

    public CredentialVerifyV2Request setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public static class CredentialVerifyV2RequestMerchantDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>MerchantName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <hr>
         */
        @NameInMap("Value")
        public String value;

        public static CredentialVerifyV2RequestMerchantDetail build(java.util.Map<String, ?> map) throws Exception {
            CredentialVerifyV2RequestMerchantDetail self = new CredentialVerifyV2RequestMerchantDetail();
            return TeaModel.build(map, self);
        }

        public CredentialVerifyV2RequestMerchantDetail setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CredentialVerifyV2RequestMerchantDetail setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
