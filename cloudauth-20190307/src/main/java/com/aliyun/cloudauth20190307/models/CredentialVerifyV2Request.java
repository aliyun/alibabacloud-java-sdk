// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyV2Request extends TeaModel {
    /**
     * <p>Relevant certificate number.</p>
     * 
     * <strong>example:</strong>
     * <p>4601*****</p>
     */
    @NameInMap("CertNum")
    public String certNum;

    /**
     * <ul>
     * <li>01: Personal ID cards<ul>
     * <li>0101: ID card</li>
     * <li>0102: Bank card</li>
     * <li>0104: Teacher qualification certificate</li>
     * <li>0107: Student ID card</li>
     * </ul>
     * </li>
     * <li>02: Business scenario<ul>
     * <li>0201: Storefront photo</li>
     * <li>0202: Counter photo</li>
     * <li>0203: Scene photo</li>
     * </ul>
     * </li>
     * <li>03: Corporate qualifications<ul>
     * <li>0301: Business license</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0104</p>
     */
    @NameInMap("CredName")
    public String credName;

    /**
     * <p>Credential type:</p>
     * <ul>
     * <li>01: Personal ID cards</li>
     * <li>02: Business scenario</li>
     * <li>03: Corporate qualifications</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("CredType")
    public String credType;

    /**
     * <p>ID number.</p>
     * 
     * <strong>example:</strong>
     * <p>4****************1</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>Base64 encoded image, choose one from <code>imageUrl</code>, <code>imageFile</code>, or <code>imageContext</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("ImageContext")
    public String imageContext;

    /**
     * <p>Image input stream, choose one from <code>imageUrl</code>, <code>imageFile</code>, or <code>imageContext</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("ImageFile")
    public String imageFile;

    /**
     * <p>Image URL, choose one from <code>imageUrl</code>, <code>imageFile</code>, or <code>imageContext</code>.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg">http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Whether to enable authoritative authentication</p>
     * <ul>
     * <li><strong><strong>0</strong></strong>: No</li>
     * <li><strong>1</strong>: Yes</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsCheck")
    public String isCheck;

    /**
     * <p>Whether to use OCR</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsOcr")
    public String isOcr;

    /**
     * <p>Merchant details:</p>
     * <p>MerchantName: Merchant name</p>
     * <p>BusinessType: Industry information</p>
     * <p>BusinessContent: Business content</p>
     * <p>This field is required when PromptModel is set to DEFAULT.</p>
     */
    @NameInMap("MerchantDetail")
    public java.util.List<CredentialVerifyV2RequestMerchantDetail> merchantDetail;

    /**
     * <p>Merchant ID. This field is required when <strong><strong>CredName</strong></strong> is set to <strong>02</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    /**
     * <p>Invocation mode:</p>
     * <ul>
     * <li><p>ANTI_FAKE_CHECK: Image anti-forgery check</p>
     * </li>
     * <li><p>ANTI_FAKE_VL: Image anti-forgery check and semantic understanding</p>
     * </li>
     * <li><p>IMAGE_VL_COG: Image semantic understanding</p>
     * </li>
     * </ul>
     * <p>Default value: ANTI_FAKE_CHECK</p>
     * <p>When CredType is set to 02, ProductCode can only be ANTI_FAKE_VL or IMAGE_VL_COG.</p>
     * 
     * <strong>example:</strong>
     * <p>ANTI_FAKE_CHECK</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Customer-defined prompt content for image semantic understanding.</p>
     * <p>This field is required when PromptModel is set to CUSTOM.</p>
     * 
     * <strong>example:</strong>
     * <p>none</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Prompt acquisition method for image semantic understanding:</p>
     * <ul>
     * <li><p>DEFAULT: System default</p>
     * </li>
     * <li><p>CUSTOM: Customer-defined</p>
     * </li>
     * </ul>
     * <p>Note: When ProductCode is set to ANTI_FAKE_VL or IMAGE_VL_COG, this parameter must be provided.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("PromptModel")
    public String promptModel;

    /**
     * <p>Name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
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

    public CredentialVerifyV2Request setImageContext(String imageContext) {
        this.imageContext = imageContext;
        return this;
    }
    public String getImageContext() {
        return this.imageContext;
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
         * <p>Keyword key.</p>
         * 
         * <strong>example:</strong>
         * <p>MerchantName</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>Keyword value.</p>
         * 
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
