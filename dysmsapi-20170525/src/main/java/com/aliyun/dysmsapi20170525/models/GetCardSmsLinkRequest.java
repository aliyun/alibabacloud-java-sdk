// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsLinkRequest extends TeaModel {
    @NameInMap("CardCodeType")
    public Integer cardCodeType;

    @NameInMap("CardLinkType")
    public Integer cardLinkType;

    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    @NameInMap("CardTemplateParamJson")
    public String cardTemplateParamJson;

    @NameInMap("CustomShortCodeJson")
    public String customShortCodeJson;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("OutId")
    public String outId;

    @NameInMap("PhoneNumberJson")
    public String phoneNumberJson;

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
