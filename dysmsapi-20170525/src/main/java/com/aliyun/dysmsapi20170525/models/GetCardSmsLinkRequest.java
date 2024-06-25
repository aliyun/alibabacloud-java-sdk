// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsLinkRequest extends TeaModel {
    /**
     * <p>The code type of the URLs.</p>
     * <ul>
     * <li><strong>1</strong>: group texting</li>
     * <li><strong>2</strong>: personalization</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CardCodeType")
    public Integer cardCodeType;

    /**
     * <p>The type of the short URLs.</p>
     * <ul>
     * <li>1: standard short code.</li>
     * <li>2: custom short code.</li>
     * </ul>
     * <blockquote>
     * <p>If the <strong>CardLinkType</strong> is not specified, standard short codes are generated. If you need to generate custom short codes, contact Alibaba Cloud SMS technical support.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CardLinkType")
    public Integer cardLinkType;

    /**
     * <p>The code of the message template. You can view the template code in the <strong>Template Code</strong> column on the <strong>Templates</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>Make sure that the message template has been approved.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_****</p>
     */
    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    /**
     * <p>The variables of the message template.</p>
     */
    @NameInMap("CardTemplateParamJson")
    public String cardTemplateParamJson;

    /**
     * <p>The custom short code. It can contain 4 to 8 digits or letters.</p>
     * <blockquote>
     * <p>If the CardLinkType parameter is set to 2, the CustomShortCodeJson parameter is required.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abCde</p>
     */
    @NameInMap("CustomShortCodeJson")
    public String customShortCodeJson;

    /**
     * <p>The original domain name. You must submit domain names for approval in advance.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the <strong>CardLinkType</strong> parameter is set to <strong>2</strong>, the <strong>Domain</strong> parameter is required.</p>
     * </li>
     * <li><p>The <strong>Domain</strong> parameter cannot exceed 100 characters in length. If the parameter is not specified, a default domain name is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>xxx.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The extension field.</p>
     * 
     * <strong>example:</strong>
     * <p>BC20220608102511660860762****</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The mobile phone numbers of recipients, custom identifiers, or system identifiers.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>A maximum of 10,000 mobile phone numbers are supported.</p>
     * </li>
     * <li><p>You can enter custom identifier. Each identifier can be a maximum of 60 characters in length.</p>
     * </li>
     * <li><p>You can apply for a maximum of 10 OPPO templates at a time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;1390000****
     * \&quot;,\&quot;1370000****
     * \&quot;]</p>
     */
    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

    /**
     * <p>The signature. You can view the template code in the <strong>Signature</strong> column on the <strong>Signaturess</strong> tab of the <strong>Go China</strong> page in the Alibaba Cloud SMS console.</p>
     * <blockquote>
     * <p>The signatures must be approved and correspond to the mobile numbers in sequence.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignNameJson")
    public String signNameJson;

    public static GetCardSmsLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCardSmsLinkRequest self = new GetCardSmsLinkRequest();
        return TeaModel.build(map, self);
    }

    public GetCardSmsLinkRequest setCardCodeType(Integer cardCodeType) {
        this.cardCodeType = cardCodeType;
        return this;
    }
    public Integer getCardCodeType() {
        return this.cardCodeType;
    }

    public GetCardSmsLinkRequest setCardLinkType(Integer cardLinkType) {
        this.cardLinkType = cardLinkType;
        return this;
    }
    public Integer getCardLinkType() {
        return this.cardLinkType;
    }

    public GetCardSmsLinkRequest setCardTemplateCode(String cardTemplateCode) {
        this.cardTemplateCode = cardTemplateCode;
        return this;
    }
    public String getCardTemplateCode() {
        return this.cardTemplateCode;
    }

    public GetCardSmsLinkRequest setCardTemplateParamJson(String cardTemplateParamJson) {
        this.cardTemplateParamJson = cardTemplateParamJson;
        return this;
    }
    public String getCardTemplateParamJson() {
        return this.cardTemplateParamJson;
    }

    public GetCardSmsLinkRequest setCustomShortCodeJson(String customShortCodeJson) {
        this.customShortCodeJson = customShortCodeJson;
        return this;
    }
    public String getCustomShortCodeJson() {
        return this.customShortCodeJson;
    }

    public GetCardSmsLinkRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetCardSmsLinkRequest setOutId(String outId) {
        this.outId = outId;
        return this;
    }
    public String getOutId() {
        return this.outId;
    }

    public GetCardSmsLinkRequest setPhoneNumberJson(String phoneNumberJson) {
        this.phoneNumberJson = phoneNumberJson;
        return this;
    }
    public String getPhoneNumberJson() {
        return this.phoneNumberJson;
    }

    public GetCardSmsLinkRequest setSignNameJson(String signNameJson) {
        this.signNameJson = signNameJson;
        return this;
    }
    public String getSignNameJson() {
        return this.signNameJson;
    }

}
