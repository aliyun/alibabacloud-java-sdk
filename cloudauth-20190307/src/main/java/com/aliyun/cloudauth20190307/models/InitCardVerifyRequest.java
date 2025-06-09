// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitCardVerifyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CardPageNumber")
    public String cardPageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CardType")
    public String cardType;

    /**
     * <strong>example:</strong>
     * <p>shoot</p>
     */
    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c35****</p>
     */
    @NameInMap("MerchantBizId")
    public String merchantBizId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;zimVer&quot;:&quot;3.0.0&quot;,&quot;appVersion&quot;: &quot;1&quot;,&quot;bioMetaInfo&quot;: &quot;4.1.0:1150****,0&quot;,&quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,&quot;deviceType&quot;: &quot;ios&quot;,&quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,&quot;apdidToken&quot;: &quot;&quot;,&quot;deviceModel&quot;: &quot;iPhone9,1&quot;}</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>OCR_VERIFY</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>T</p>
     */
    @NameInMap("PictureSave")
    public String pictureSave;

    /**
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
