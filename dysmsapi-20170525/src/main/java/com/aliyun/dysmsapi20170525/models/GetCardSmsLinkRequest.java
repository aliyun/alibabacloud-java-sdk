// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsLinkRequest extends TeaModel {
    /**
     * <p>The encoding type of the short URL for the card message. Valid values:</p>
     * <ul>
     * <li>1: bulk sending.</li>
     * <li>2: personalized.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CardCodeType")
    public Integer cardCodeType;

    /**
     * <p>The type of the short URL for the card message. Valid values:</p>
     * <ul>
     * <li>1: standard short URL.</li>
     * <li>2: custom short URL.</li>
     * </ul>
     * <blockquote>
     * <p>If <strong>CardLinkType</strong> is left empty, the default value is standard short URL. To generate a custom short URL, contact Alibaba Cloud operations to register in advance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CardLinkType")
    public Integer cardLinkType;

    /**
     * <p>The code of the card message template. In the console, go to the <a href="https://dysms.console.aliyun.com/domestic/card">Card Messages &gt; Template Management</a> page and select the code of an approved card message template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CARD_SMS_****</p>
     */
    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    /**
     * <p>The variables of the card message template.</p>
     * 
     * <strong>example:</strong>
     * <p>[{\&quot;customUrl\&quot;:\&quot;<a href="https://alibaba.com%5C%5C%22,%5C%5C%22dyncParams%5C%5C">https://alibaba.com\\&quot;,\\&quot;dyncParams\\</a>&quot;: \&quot;{\\\&quot;动参key\\\&quot;:\\\&quot;动参value\\\&quot;}\&quot;},{\&quot;customUrl\&quot;:\&quot;<a href="https://alibaba.com%5C%5C%22,%5C%5C%22dyncParams%5C%5C">https://alibaba.com\\&quot;,\\&quot;dyncParams\\</a>&quot;: \&quot;{\\\&quot;动参key\\\&quot;:\\\&quot;动参value\\\&quot;}\&quot;}]</p>
     */
    @NameInMap("CardTemplateParamJson")
    public String cardTemplateParamJson;

    /**
     * <p>The custom short code. The value must be 4 to 8 digits or letters.</p>
     * <blockquote>
     * <p>This parameter is required when the generation type is custom short URL.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>abCde</p>
     */
    @NameInMap("CustomShortCodeJson")
    public String customShortCodeJson;

    /**
     * <p>The short URL domain assigned to the sending account. The domain must be registered in advance.</p>
     * <blockquote>
     * <ul>
     * <li>When <strong>CardLinkType</strong> is set to <strong>2</strong>, the <strong>Domain</strong> parameter is required.</li>
     * <li>If the <strong>Domain</strong> parameter is left empty, the system default domain is used. The value can be up to 100 characters in length.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>xxx.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The external extension field.</p>
     * 
     * <strong>example:</strong>
     * <p>BC20220608102511660860762****</p>
     */
    @NameInMap("OutId")
    public String outId;

    /**
     * <p>The phone number, user ID, or internal system identifier.</p>
     * <blockquote>
     * <ul>
     * <li>Supports up to 10,000 phone numbers.</li>
     * <li>You can also specify a custom identifier of up to 60 characters.</li>
     * <li>For OPPO templates, you can submit up to 10 requests at a time.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;1390000****
     * \&quot;,\&quot;1370000****
     * \&quot;]</p>
     */
    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

    /**
     * <p>The signature name of the SMS message.
     * In the console, go to the <a href="https://dysms.console.aliyun.com/domestic/text/sign">Domestic Messages &gt; Signature Management</a> tab and view the name in the <strong>Signature Name</strong> column. You can also call the <a href="https://www.alibabacloud.com/help/en/sms/developer-reference/api-dysmsapi-2017-05-25-querysmssignlist">QuerySmsSignList</a> operation to view SMS signature names.</p>
     * <blockquote>
     * <p>The signature must be added and approved. The number of SMS signatures must match the number of phone numbers, and each signature must correspond to a phone number.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;阿里云\&quot;, \&quot;阿里云2\&quot;]</p>
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
