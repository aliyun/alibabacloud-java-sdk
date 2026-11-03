// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyRequest extends TeaModel {
    /**
     * <p>The certificate number.</p>
     * 
     * <strong>example:</strong>
     * <p>4601*****</p>
     */
    @NameInMap("CertNum")
    public String certNum;

    /**
     * <p>The credential name. Valid values:</p>
     * <ul>
     * <li>01: Personal cards and certificates<ul>
     * <li>0101: ID card</li>
     * <li>0102: Bank card</li>
     * <li>0104: Teacher qualification certificate</li>
     * <li>0107: Student ID card</li>
     * </ul>
     * </li>
     * <li>02: Business scenarios<ul>
     * <li>0201: Storefront photo</li>
     * <li>0202: Counter photo</li>
     * <li>0203: Scene photo</li>
     * </ul>
     * </li>
     * <li>03: Enterprise qualifications<ul>
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
     * <p>The credential type. Valid values:</p>
     * <ul>
     * <li>01: Personal cards and certificates.</li>
     * <li>02: Business scenarios.</li>
     * <li>03: Enterprise qualifications.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>01</p>
     */
    @NameInMap("CredType")
    public String credType;

    /**
     * <p>The ID card number.</p>
     * 
     * <strong>example:</strong>
     * <p>429001********8211</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The Base64-encoded image content. You must specify either imageUrl or imageContext.</p>
     * 
     * <strong>example:</strong>
     * <p>base64</p>
     */
    @NameInMap("ImageContext")
    public String imageContext;

    /**
     * <p>The image URL. You must specify either imageUrl or imageContext.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg">http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Specifies whether to enable authoritative verification. Valid values:</p>
     * <ul>
     * <li><strong><strong>0</strong></strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsCheck")
    public String isCheck;

    /**
     * <p>Specifies whether to enable optical character recognition (OCR). Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: No.</li>
     * <li><strong>1</strong>: Yes.</li>
     * </ul>
     * <p>You can set this parameter to <strong>1</strong> only when <strong>CredType</strong> is set to <strong>01</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsOCR")
    public String isOCR;

    /**
     * <p>The merchant details. This parameter is required when PromptModel is set to DEFAULT.</p>
     */
    @NameInMap("MerchantDetail")
    public java.util.List<CredentialVerifyRequestMerchantDetail> merchantDetail;

    /**
     * <p>The merchant ID. This parameter is required when <strong><strong>CredName</strong></strong> is set to <strong>02</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    /**
     * <p>The call mode. Valid values:</p>
     * <ul>
     * <li><p>ANTI_FAKE_CHECK: Image anti-counterfeiting detection.</p>
     * </li>
     * <li><p>ANTI_FAKE_VL: Image anti-counterfeiting detection and semantic understanding.</p>
     * </li>
     * <li><p>IMAGE_VL_COG: Image semantic understanding.</p>
     * </li>
     * </ul>
     * <p>Default value: ANTI_FAKE_CHECK.</p>
     * <p>You can set this parameter to ANTI_FAKE_VL or IMAGE_VL_COG only when CredType is set to 02.</p>
     * 
     * <strong>example:</strong>
     * <p>ANTI_FAKE_CHECK</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The custom prompt content for image semantic understanding.</p>
     * <p>This parameter is required when PromptModel is set to CUSTOM.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>The method to obtain the prompt for image semantic understanding. Valid values:</p>
     * <ul>
     * <li><p>DEFAULT: System default.</p>
     * </li>
     * <li><p>CUSTOM: Custom.</p>
     * </li>
     * </ul>
     * <p>Note: This parameter is required when ProductCode is set to ANTI_FAKE_VL or IMAGE_VL_COG.</p>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("PromptModel")
    public String promptModel;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>Zhang*</p>
     */
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
        /**
         * <p>The key of the replacement keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>keyword</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the replacement keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>Keyword</p>
         */
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
