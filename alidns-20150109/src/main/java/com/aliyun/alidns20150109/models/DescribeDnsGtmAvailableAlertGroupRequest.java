// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAvailableAlertGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("UserClientIp")
    public String userClientIp;

    public static DescribeDnsGtmAvailableAlertGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsGtmAvailableAlertGroupRequest self = new DescribeDnsGtmAvailableAlertGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDnsGtmAvailableAlertGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeDnsGtmAvailableAlertGroupRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

}
