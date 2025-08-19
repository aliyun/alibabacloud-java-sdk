// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitCardVerifyRequest extends TeaModel {
    /**
     * <p>Security Token, used for anti-replay and anti-tampering checks. If this parameter is passed, the CallbackToken field will be displayed in the callback address.</p>
     * 
     * <strong>example:</strong>
     * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <ul>
     * <li>The callback notification address for the authentication result, which must start with https.</li>
     * <li>The platform will call back this address after completing the authentication and automatically add the certifyId and passed fields, example: <a href="https://www.aliyun.com?certifyId=xxxx&passed=T">https://www.aliyun.com?certifyId=xxxx&amp;passed=T</a></li>
     * <li>Warning
     * The callback is triggered only when the authentication is completed. If the authentication is abandoned, interrupted abnormally, or not performed, no notification will be sent. It is recommended that when you receive the callback notification, if necessary, you can obtain detailed authentication information through the query interface.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>Number of card pages collected by the SDK</p>
     * <ul>
     * <li><p>You can input 1 or 2; input 1 to collect the front side, input 2 to collect both the front and back sides.</p>
     * </li>
     * <li><p>If the verification type is ID period (VerifyMeta value is ID_PERIOD), you must input 2.</p>
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
     * <p>Type of identification</p>
     * <ul>
     * <li>Resident Second Generation ID Card: IDENTITY_CARD</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CardType")
    public String cardType;

    /**
     * <p>Enumeration of photo-taking methods (manual/auto)</p>
     * <ul>
     * <li>Take a photo: shoot</li>
     * <li>Scan: scan </li>
     * <li>Auto switch: auto</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shoot</p>
     */
    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <p>A unique business identifier you define, used for subsequent troubleshooting.
     * Supports a combination of 32 alphanumeric characters, please ensure uniqueness.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>MetaInfo environment parameter, which needs to be obtained through the client SDK.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;zimVer&quot;:&quot;3.0.0&quot;,&quot;appVersion&quot;: &quot;1&quot;,&quot;bioMetaInfo&quot;: &quot;4.1.0:1150****,0&quot;,&quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,&quot;deviceType&quot;: &quot;ios&quot;,&quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,&quot;apdidToken&quot;: &quot;&quot;,&quot;deviceModel&quot;: &quot;iPhone9,1&quot;}</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>Verification method, value:</p>
     * <ul>
     * <li>OCR_VERIFY: OCR recognition and verification mode.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OCR_VERIFY</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>Whether to temporarily store the images collected by the app.</p>
     * <ul>
     * <li>Y: Yes</li>
     * <li>N: No</li>
     * <li>If \&quot;Yes\&quot; is selected here, the query interface will support returning the card image information.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("PictureSave")
    public String pictureSave;

    /**
     * <p>Verification type, value:</p>
     * <ul>
     * <li>Identity two elements (name + ID number): ID_2_META</li>
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
