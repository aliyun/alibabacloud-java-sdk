// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class InitAuthVerifyRequest extends TeaModel {
    /**
     * <p>A security token that you generate to prevent replay attacks and data tampering.
     * If this value is set, the CallbackToken field is included in the callback to CallbackUrl.</p>
     * 
     * <strong>example:</strong>
     * <p>NMjvQanQgplBSaEI0sL86WnQplB</p>
     */
    @NameInMap("CallbackToken")
    public String callbackToken;

    /**
     * <p>The callback URL for OCR results. The callback request method is GET by default. The callback URL must start with https. After OCR is completed, a callback is sent to this URL with the certifyId and subcode fields automatically appended.</p>
     * <blockquote>
     * <p>Warning</p>
     * </blockquote>
     * <ul>
     * <li>The URL is validated for public network access before the API is invoked. If the URL is not publicly accessible, a 400 error is returned.</li>
     * <li>The callback is executed immediately after the OCR invocation is completed, but may be delayed due to network issues. Accept the request completion notification from the client side first, and then invoke the query API to obtain the result details.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.aliyun.com?callbackToken=100000****&certifyId=shaxxxx&subCode=200">https://www.aliyun.com?callbackToken=100000****&amp;certifyId=shaxxxx&amp;subCode=200</a></p>
     */
    @NameInMap("CallbackUrl")
    public String callbackUrl;

    /**
     * <p>The number of card pages collected by the SDK. Valid values:</p>
     * <ul>
     * <li>&quot;1&quot;: front side only</li>
     * <li>&quot;2&quot;: both front and back sides.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CardPageNumber")
    public String cardPageNumber;

    /**
     * <p>The document type. Set the value to IDENTITY_CARD.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>IDENTITY_CARD</p>
     */
    @NameInMap("CardType")
    public String cardType;

    /**
     * <p>The OCR document scan pattern. Valid values:</p>
     * <ul>
     * <li>shoot (default): photo capture</li>
     * <li>scan: scan</li>
     * <li>auto: automatic switchover between photo capture and scan.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>shoot</p>
     */
    @NameInMap("DocScanMode")
    public String docScanMode;

    /**
     * <p>Specifies whether to enable the document anti-forgery detection feature. Valid values:</p>
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
     * <p>The MetaInfo environment parameter, which must be obtained from the client SDK.</p>
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
     * <p>A custom business unique identifier that you specify for subsequent troubleshooting.</p>
     * <p>The value can contain letters (both uppercase and lowercase) and digits, with a maximum length of 32 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>e0c34a77f5ac40a5aa5e6ed20c******</p>
     */
    @NameInMap("OuterOrderNo")
    public String outerOrderNo;

    /**
     * <p>The product solution to use. Set the value to ID_OCR.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ID_OCR</p>
     */
    @NameInMap("ProductCode")
    public String productCode;

    /**
     * <p>The China Chinese authentication scenario ID.</p>
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
