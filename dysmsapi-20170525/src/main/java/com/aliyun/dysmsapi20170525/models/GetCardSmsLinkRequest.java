// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysmsapi20170525.models;

import com.aliyun.tea.*;

public class GetCardSmsLinkRequest extends TeaModel {
    @NameInMap("CardTemplateCode")
    public String cardTemplateCode;

    @NameInMap("CardTemplateParamJson")
    public String cardTemplateParamJson;

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
