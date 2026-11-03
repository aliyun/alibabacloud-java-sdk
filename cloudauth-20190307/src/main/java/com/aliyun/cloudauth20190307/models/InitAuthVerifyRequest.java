// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitAuthVerifyRequest extends TeaModel {
    /**
     * <p>The security token that you generate for anti-replay and anti-tampering verification.
     * If this parameter is specified, the CallbackToken field is included in the callback request sent to CallbackUrl.</p>
     * 
     * <strong>example:</strong>
     * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <p>The callback URL for OCR results. The default callback request method is GET. The callback URL must start with https. After OCR recognition is completed, a callback request is sent to this URL, and the certifyId and subcode fields are automatically appended.
     * Warning</p>
     * <ul>
     * <li>The accessibility of this URL is verified before the API is invoked. If the specified URL does not support public network access, a 400 error is returned.</li>
     * <li>The callback is executed immediately after the OCR recognition is invoked, but may be delayed due to network or other issues. Accept the request completion notification on the client side first, and then invoke the query API to obtain the result details.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com?callbackToken=100000****&certifyId=shaxxxx&subCode=200">https://www.aliyun.com?callbackToken=100000****&amp;certifyId=shaxxxx&amp;subCode=200</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The number of pages of the identity document to be collected by the SDK. Valid values:</p>
     * <ul>
     * <li>1: the front side.</li>
     * <li>2: both the front and back sides.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CardPageNumber")
    public String cardPageNumber;

    /**
     * <p>The type of the identity document. Valid values: IDENTITY_CARD.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CardType")
    public String cardType;

    /**
     * <p>The OCR identity document scanning pattern. Valid values:</p>
     * <ul>
     * <li>shoot: takes a photo. This is the default value.</li>
     * <li>scan: scans the document.</li>
     * <li>auto: automatic switchover between photo and scan patterns.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shoot</p>
     */
    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <p>Specifies whether to enable the anti-counterfeiting detection feature for the identity document. Valid values:</p>
     * <ul>
     * <li>Y: Enabled.</li>
     * <li>N: Disabled. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Y</p>
     */
    @NameInMap("IdSpoof")
    public String idSpoof;

    /**
     * <p>The MetaInfo environment parameter, which must be obtained through the client SDK.</p>
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
     * <p>The custom unique business identifier used for subsequent troubleshooting.</p>
     * <p>The value can contain uppercase and lowercase letters and digits, and can be up to 32 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>The product solution to be integrated. Valid values: ID_OCR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_OCR</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The ID of the authentication scene.</p>
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
