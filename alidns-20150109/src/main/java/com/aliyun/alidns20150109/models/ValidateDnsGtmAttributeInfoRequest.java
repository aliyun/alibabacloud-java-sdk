// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class ValidateDnsGtmAttributeInfoRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("LineCode")
    public String lineCode;

    public static ValidateDnsGtmAttributeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateDnsGtmAttributeInfoRequest self = new ValidateDnsGtmAttributeInfoRequest();
        return TeaModel.build(map, self);
    }

    public ValidateDnsGtmAttributeInfoRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ValidateDnsGtmAttributeInfoRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public ValidateDnsGtmAttributeInfoRequest setLineCode(String lineCode) {
        this.lineCode = lineCode;
        return this;
    }
    public String getLineCode() {
        return this.lineCode;
    }

}
