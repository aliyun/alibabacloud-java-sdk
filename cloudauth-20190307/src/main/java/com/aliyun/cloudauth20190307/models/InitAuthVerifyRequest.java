// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitAuthVerifyRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com?callbackToken=100000****&certifyId=shaxxxx&subCode=200">https://www.aliyun.com?callbackToken=100000****&amp;certifyId=shaxxxx&amp;subCode=200</a></p>
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
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *   &quot;zimVer&quot;: &quot;3.0.0&quot;,
     *   &quot;appVersion&quot;: &quot;1&quot;,
     *   &quot;bioMetaInfo&quot;: &quot;4.1.0:1150****,0&quot;,
     *   &quot;appName&quot;: &quot;com.aliyun.antcloudauth&quot;,
     *   &quot;deviceType&quot;: &quot;ios&quot;,
     *   &quot;osVersion&quot;: &quot;iOS 10.3.2&quot;,
     *   &quot;apdidToken&quot;: &quot;&quot;,
     *   &quot;deviceModel&quot;: &quot;iPhone9,1&quot;
     * }</p>
     */
    @NameInMap("MetaInfo")
    public String metaInfo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_OCR</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1000002996</p>
     */
    @NameInMap("SceneId")
    public Long sceneId;

    public static InitAuthVerifyRequest build(java.util.Map<String, ?> map) throws Exception {
        InitAuthVerifyRequest self = new InitAuthVerifyRequest();
        return TeaModel.build(map, self);
    }

    public InitAuthVerifyRequest setCallbackToken(String callbackToken) {
        this.callbackToken = callbackToken;
        return this;
    }
    public String getCallbackToken() {
        return this.callbackToken;
    }

    public InitAuthVerifyRequest setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
        return this;
    }
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public InitAuthVerifyRequest setCardPageNumber(String cardPageNumber) {
        this.cardPageNumber = cardPageNumber;
        return this;
    }
    public String getCardPageNumber() {
        return this.cardPageNumber;
    }

    public InitAuthVerifyRequest setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public InitAuthVerifyRequest setDocScanMode(String docScanMode) {
        this.docScanMode = docScanMode;
        return this;
    }
    public String getDocScanMode() {
        return this.docScanMode;
    }

    public InitAuthVerifyRequest setIdSpoof(String idSpoof) {
        this.idSpoof = idSpoof;
        return this;
    }
    public String getIdSpoof() {
        return this.idSpoof;
    }

    public InitAuthVerifyRequest setMetaInfo(String metaInfo) {
        this.metaInfo = metaInfo;
        return this;
    }
    public String getMetaInfo() {
        return this.metaInfo;
    }

    public InitAuthVerifyRequest setOuterOrderNo(String outerOrderNo) {
        this.outerOrderNo = outerOrderNo;
        return this;
    }
    public String getOuterOrderNo() {
        return this.outerOrderNo;
    }

    public InitAuthVerifyRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public InitAuthVerifyRequest setSceneId(Long sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public Long getSceneId() {
        return this.sceneId;
    }

}
