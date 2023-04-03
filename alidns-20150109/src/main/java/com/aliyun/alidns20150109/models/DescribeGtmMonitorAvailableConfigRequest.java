// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmMonitorAvailableConfigRequest extends TeaModel {
    /**
     * <p>The language of the values of specific response parameters.</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeGtmMonitorAvailableConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmMonitorAvailableConfigRequest self = new DescribeGtmMonitorAvailableConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmMonitorAvailableConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
