// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsGtmAvailableAlertGroupRequest extends TeaModel {
    /**
     * <p>The language to return some response parameters. Default value: en. Valid values: en, zh, and ja.</p>
     */
    @NameInMap("Lang")
    public String lang;

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

}
