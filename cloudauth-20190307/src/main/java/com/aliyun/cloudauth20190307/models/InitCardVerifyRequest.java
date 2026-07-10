// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitCardVerifyRequest extends TeaModel {
    /**
     * <p>The security token used for anti-replay and anti-tampering verification. If you specify this parameter, the CallbackToken field is included in the callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <p>The callback URL for authentication results. The URL must start with https. After the authentication is complete, the system sends a callback to this URL with the certifyId and passed fields automatically appended. Example: <a href="https://www.aliyun.com?certifyId=xxxx&passed=T">https://www.aliyun.com?certifyId=xxxx&amp;passed=T</a></p>
     * <blockquote>
     * <p><strong>Warning</strong> The callback is triggered only when the authentication is complete. No notification is sent if the authentication is abandoned, interrupted, or not performed. After you receive the callback notification, call the query operation to obtain the authentication details if needed.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The number of card pages to be collected by the SDK. Valid values:</p>
     * <ul>
     * <li><p>1: collects the front side only.</p>
     * </li>
     * <li><p>2: collects both the front and back sides.</p>
     * </li>
     * <li><p>If the verification type is ID card validity period (VerifyMeta is set to ID_PERIOD), set this parameter to 2.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CardPageNumber")
    public String cardPageNumber;

    /**
     * <p>The document type. Valid values:</p>
     * <ul>
     * <li>IDENTITY_CARD: resident identity card.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CardType")
    public String cardType;

    /**
     * <p>The photo capture mode (manual or automatic). Valid values:</p>
     * <ul>
     * <li>shoot: manual capture</li>
     * <li>scan: scan mode </li>
     * <li>auto: automatic switchover.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shoot</p>
     */
    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <p>A custom business unique identifier that you define for subsequent troubleshooting. The value is a combination of letters and digits up to 32 characters in length. Make sure the value is unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The MetaInfo environment parameter. Obtain this value by using the client SDK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;zimVer&quot;:&quot;3.0.0&quot;,&quot;appVersion&quot;: &quot;1&quot;,&quot;bioMetaInfo&quot;: &quot;4.1.0:1150****,0&quot;,&quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,&quot;deviceType&quot;: &quot;ios&quot;,&quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,&quot;apdidToken&quot;: &quot;&quot;,&quot;deviceModel&quot;: &quot;iPhone9,1&quot;}</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>The verification mode. Valid values:</p>
     * <ul>
     * <li>OCR_VERIFY: OCR recognition and authentication mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OCR_VERIFY</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Specifies whether to temporarily store images collected by the app. Valid values:</p>
     * <ul>
     * <li>Y: Yes.</li>
     * <li>N: No.</li>
     * <li>If you set this parameter to Y, the query operation returns card image information.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("PictureSave")
    public String pictureSave;

    /**
     * <p>The verification type. Valid values:</p>
     * <ul>
     * <li>ID_2_META: two-factor identity verification (name + ID card number).</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_2_META</p>
     */
    @NameInMap("VerifyMeta")
    public String verifyMeta;

    public static InitCardVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitCardVerifyRequest self = new InitCardVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitCardVerifyRequest setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    public String getCallbackToken() {
        return this.callbackToken;
    }

    public InitCardVerifyRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitCardVerifyRequest setCardPageNumber(String cardPageNumber) {
        this.cardPageNumber = cardPageNumber;
        return this;
    }
    public String getCardPageNumber() {
        return this.cardPageNumber;
    }

    public InitCardVerifyRequest setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public InitCardVerifyRequest setDocScanMode(String docScanMode) {
        this.docScanMode = docScanMode;
        return this;
    }
    public String getDocScanMode() {
        return this.docScanMode;
    }

    public InitCardVerifyRequest setMerchantBizId(String merchantBizId) {
        this.merchantBizId = merchantBizId;
        return this;
    }
    public String getMerchantBizId() {
        return this.merchantBizId;
    }

    public InitCardVerifyRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitCardVerifyRequest setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public InitCardVerifyRequest setPictureSave(String pictureSave) {
        this.pictureSave = pictureSave;
        return this;
    }
    public String getPictureSave() {
        return this.pictureSave;
    }

    public InitCardVerifyRequest setVerifyMeta(String verifyMeta) {
        this.verifyMeta = verifyMeta;
        return this;
    }
    public String getVerifyMeta() {
        return this.verifyMeta;
    }

}
