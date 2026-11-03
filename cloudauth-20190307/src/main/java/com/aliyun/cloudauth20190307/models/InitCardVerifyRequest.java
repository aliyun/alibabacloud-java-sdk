// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitCardVerifyRequest extends TeaModel {
    /**
     * <p>The security token used for anti-replay and anti-tampering verification. If you specify this parameter, the CallbackToken field is displayed in the callback URL.</p>
     * 
     * <strong>example:</strong>
     * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <p>The callback URL for authentication results. The URL must start with https. After the authentication is completed, the platform calls back this URL and automatically adds the certifyId and passed fields. Example: <a href="https://www.aliyun.com?certifyId=xxxx&passed=T">https://www.aliyun.com?certifyId=xxxx&amp;passed=T</a>.
     * Warning: The callback is triggered only when the authentication is completed. If the authentication is abandoned, abnormally interrupted, or not performed, no notification is sent. When you receive the callback notification, call the query API to obtain the authentication details if needed.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The number of pages of the ID document collected by the SDK. Valid values:</p>
     * <ul>
     * <li>1: collects the front side.</li>
     * <li>2: collects the front and back sides.
     * If the verification type is the validity period of the ID document (VerifyMeta is set to ID_PERIOD), you must set this parameter to 2.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CardPageNumber")
    public String cardPageNumber;

    /**
     * <p>The type of the ID document. Valid values:</p>
     * <ul>
     * <li>IDENTITY_CARD: second-generation resident ID card.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CardType")
    public String cardType;

    /**
     * <p>The photo capture mode. Valid values:</p>
     * <ul>
     * <li>shoot: photo capture.</li>
     * <li>scan: scanning.</li>
     * <li>auto: automatic switchover.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shoot</p>
     */
    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <p>The custom unique business identifier used for subsequent troubleshooting. The value must be a unique combination of up to 32 letters and digits.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>The MetaInfo environment parameter, which must be obtained by using the client SDK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;zimVer&quot;:&quot;3.0.0&quot;,&quot;appVersion&quot;: &quot;1&quot;,&quot;bioMetaInfo&quot;: &quot;4.1.0:1150****,0&quot;,&quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,&quot;deviceType&quot;: &quot;ios&quot;,&quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,&quot;apdidToken&quot;: &quot;&quot;,&quot;deviceModel&quot;: &quot;iPhone9,1&quot;}</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>The verification method. Valid values:</p>
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
     * <p>Specifies whether to temporarily store the image information collected by the app. Valid values:</p>
     * <ul>
     * <li>Y: yes. If you select this value, the query API can return the image information of the ID document.</li>
     * <li>N: no.</li>
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
     * <li>ID_2_META: two identity elements (name and ID number).</li>
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
