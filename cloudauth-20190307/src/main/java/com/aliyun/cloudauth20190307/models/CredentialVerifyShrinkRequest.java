// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyShrinkRequest extends TeaModel {
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
     * <li><strong>0101</strong>: ID card</li>
     * <li><strong>0102</strong>: Bank card</li>
     * <li><strong>0104</strong>: Teacher qualification certificate</li>
     * <li><strong>0107</strong>: Student ID card</li>
     * </ul>
     * </li>
     * <li>02: Business scenario<ul>
     * <li><strong>0201</strong>: Storefront photo</li>
     * <li><strong>0202</strong>: Counter photo</li>
     * <li><strong>0203</strong>: Scene photo</li>
     * </ul>
     * </li>
     * <li>03: Corporate qualifications<ul>
     * <li><strong>0301</strong>: Business license</li>
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
     * <p>ID number:</p>
     * <p>Note
     * Only supports the ID numbers of second-generation resident IDs and Hong Kong, Macao, and Taiwan residence permits.</p>
     * <ul>
     * <li><p>When paramType is normal: enter the plaintext ID number.</p>
     * </li>
     * <li><p>When paramType is md5: first 6 digits of the ID number (plaintext) + date of birth (ciphertext) + last 4 digits of the ID number (plaintext).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>429001********8211</p>
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
     * <p>Whether to enable OCR recognition.</p>
     * <ul>
     * <li><strong>0</strong>: No</li>
     * <li><strong>1</strong>: Yes</li>
     * </ul>
     * <blockquote>
     * <p>IsOCR can be set to 1 only when <strong>CredType</strong> is 01.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("IsOCR")
    public String isOCR;

    /**
     * <p>Merchant details:</p>
     * <blockquote>
     * <p>This field is required when PromptModel is set to DEFAULT.</p>
     * </blockquote>
     */
    @NameInMap("MerchantDetail")
    public String merchantDetailShrink;

    /**
     * <p>Merchant ID. </p>
     * <blockquote>
     * <p>This field is required when <strong><strong>CredName</strong></strong> is set to <strong>02</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>913100********KW8P</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    /**
     * <p>Invocation mode:</p>
     * <ul>
     * <li><p><strong>ANTI_FAKE_CHECK</strong>: Image anti-forgery check</p>
     * </li>
     * <li><p><strong>ANTI_FAKE_VL</strong>: Image anti-forgery check and semantic understanding</p>
     * </li>
     * <li><p><strong>IMAGE_VL_COG</strong>: Image semantic understanding</p>
     * </li>
     * </ul>
     * <p>Default value: ANTI_FAKE_CHECK</p>
     * <blockquote>
     * <p>When <strong>CredType</strong> is set to 02, <strong>ProductCode</strong> can only be ANTI_FAKE_VL or IMAGE_VL_COG.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ANTI_FAKE_CHECK</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>Customer-defined prompt content for image semantic understanding.</p>
     * <blockquote>
     * <p>This field is required when PromptModel is set to CUSTOM.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>Prompt acquisition method for image semantic understanding:</p>
     * <ul>
     * <li><p><strong>DEFAULT</strong>: System default</p>
     * </li>
     * <li><p><strong>CUSTOM</strong>: Customer-defined</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When <strong>ProductCode</strong> is set to <strong>ANTI_FAKE_VL</strong> or <strong>IMAGE_VL_COG</strong>, this parameter must be provided.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>DEFAULT</p>
     */
    @NameInMap("PromptModel")
    public String promptModel;

    /**
     * <p>UserName</p>
     * 
     * <strong>example:</strong>
     * <p>张*</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static CredentialVerifyShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyShrinkRequest self = new CredentialVerifyShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyShrinkRequest setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public CredentialVerifyShrinkRequest setCredName(String credName) {
        this.credName = credName;
        return this;
    }
    public String getCredName() {
        return this.credName;
    }

    public CredentialVerifyShrinkRequest setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CredentialVerifyShrinkRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public CredentialVerifyShrinkRequest setImageContext(String imageContext) {
        this.imageContext = imageContext;
        return this;
    }
    public String getImageContext() {
        return this.imageContext;
    }

    public CredentialVerifyShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CredentialVerifyShrinkRequest setIsCheck(String isCheck) {
        this.isCheck = isCheck;
        return this;
    }
    public String getIsCheck() {
        return this.isCheck;
    }

    public CredentialVerifyShrinkRequest setIsOCR(String isOCR) {
        this.isOCR = isOCR;
        return this;
    }
    public String getIsOCR() {
        return this.isOCR;
    }

    public CredentialVerifyShrinkRequest setMerchantDetailShrink(String merchantDetailShrink) {
        this.merchantDetailShrink = merchantDetailShrink;
        return this;
    }
    public String getMerchantDetailShrink() {
        return this.merchantDetailShrink;
    }

    public CredentialVerifyShrinkRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CredentialVerifyShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CredentialVerifyShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CredentialVerifyShrinkRequest setPromptModel(String promptModel) {
        this.promptModel = promptModel;
        return this;
    }
    public String getPromptModel() {
        return this.promptModel;
    }

    public CredentialVerifyShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
