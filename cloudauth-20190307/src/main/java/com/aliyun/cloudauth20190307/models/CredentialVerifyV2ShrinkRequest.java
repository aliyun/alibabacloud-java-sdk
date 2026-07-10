// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyV2ShrinkRequest extends TeaModel {
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
     * <li>01: personal card or certificate<ul>
     * <li>0101: ID card</li>
     * <li>0102: bank card</li>
     * <li>0104: teacher qualification certificate</li>
     * <li>0107: student ID card</li>
     * </ul>
     * </li>
     * <li>02: business scenario<ul>
     * <li>0201: storefront photo</li>
     * <li>0202: counter photo</li>
     * <li>0203: scene photo</li>
     * </ul>
     * </li>
     * <li>03: enterprise qualification<ul>
     * <li>0301: business license.</li>
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
     * <li>01: personal card or certificate</li>
     * <li>02: business scenario</li>
     * <li>03: enterprise qualification.</li>
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
     * <p>4****************1</p>
     */
    @NameInMap("IdentifyNum")
    public String identifyNum;

    /**
     * <p>The Base64-encoded image. Specify one of imageUrl, imageFile, or imageContext.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("ImageContext")
    public String imageContext;

    /**
     * <p>The input stream of the image. Specify one of imageUrl, imageFile, or imageContext.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("ImageFile")
    public String imageFile;

    /**
     * <p>The URL of the image. Specify one of imageUrl, imageFile, or imageContext.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg">http://marry.momocdn.com/avatar/3B/B6/3BB6527E-7467-926E-1048-B43614F20CC420230803_L.jpg</a></p>
     */
    @NameInMap("ImageUrl")
    public String imageUrl;

    /**
     * <p>Specifies whether to enable authoritative verification. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Disabled.</li>
     * <li><strong>1</strong>: Enabled.<blockquote>
     * <p>Danger: Deprecated.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsCheck")
    public String isCheck;

    /**
     * <p>Specifies whether to enable OCR.</p>
     * <blockquote>
     * <p>Danger: Deprecated.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("IsOcr")
    public String isOcr;

    /**
     * <p>This feature is offline. This parameter no longer takes effect.</p>
     */
    @NameInMap("MerchantDetail")
    public String merchantDetailShrink;

    /**
     * <p>The merchant ID. This parameter is required when CredName is set to 02.</p>
     * 
     * <strong>example:</strong>
     * <p>无。</p>
     */
    @NameInMap("MerchantId")
    public String merchantId;

    /**
     * <p>The call mode. Valid values:</p>
     * <ul>
     * <li>ANTI_FAKE_CHECK (default): image anti-forgery detection.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ANTI_FAKE_CHECK</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>This feature is offline. This parameter no longer takes effect.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("Prompt")
    public String prompt;

    /**
     * <p>This feature is offline. This parameter no longer takes effect.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("PromptModel")
    public String promptModel;

    /**
     * <p>The name.</p>
     * 
     * <strong>example:</strong>
     * <p>张三</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static CredentialVerifyV2ShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyV2ShrinkRequest self = new CredentialVerifyV2ShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyV2ShrinkRequest setCertNum(String certNum) {
        this.certNum = certNum;
        return this;
    }
    public String getCertNum() {
        return this.certNum;
    }

    public CredentialVerifyV2ShrinkRequest setCredName(String credName) {
        this.credName = credName;
        return this;
    }
    public String getCredName() {
        return this.credName;
    }

    public CredentialVerifyV2ShrinkRequest setCredType(String credType) {
        this.credType = credType;
        return this;
    }
    public String getCredType() {
        return this.credType;
    }

    public CredentialVerifyV2ShrinkRequest setIdentifyNum(String identifyNum) {
        this.identifyNum = identifyNum;
        return this;
    }
    public String getIdentifyNum() {
        return this.identifyNum;
    }

    public CredentialVerifyV2ShrinkRequest setImageContext(String imageContext) {
        this.imageContext = imageContext;
        return this;
    }
    public String getImageContext() {
        return this.imageContext;
    }

    public CredentialVerifyV2ShrinkRequest setImageFile(String imageFile) {
        this.imageFile = imageFile;
        return this;
    }
    public String getImageFile() {
        return this.imageFile;
    }

    public CredentialVerifyV2ShrinkRequest setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public CredentialVerifyV2ShrinkRequest setIsCheck(String isCheck) {
        this.isCheck = isCheck;
        return this;
    }
    public String getIsCheck() {
        return this.isCheck;
    }

    public CredentialVerifyV2ShrinkRequest setIsOcr(String isOcr) {
        this.isOcr = isOcr;
        return this;
    }
    public String getIsOcr() {
        return this.isOcr;
    }

    public CredentialVerifyV2ShrinkRequest setMerchantDetailShrink(String merchantDetailShrink) {
        this.merchantDetailShrink = merchantDetailShrink;
        return this;
    }
    public String getMerchantDetailShrink() {
        return this.merchantDetailShrink;
    }

    public CredentialVerifyV2ShrinkRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CredentialVerifyV2ShrinkRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public CredentialVerifyV2ShrinkRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public CredentialVerifyV2ShrinkRequest setPromptModel(String promptModel) {
        this.promptModel = promptModel;
        return this;
    }
    public String getPromptModel() {
        return this.promptModel;
    }

    public CredentialVerifyV2ShrinkRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
