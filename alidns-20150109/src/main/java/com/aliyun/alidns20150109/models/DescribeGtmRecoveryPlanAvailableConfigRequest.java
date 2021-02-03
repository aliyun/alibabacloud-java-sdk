// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeGtmRecoveryPlanAvailableConfigRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    public static DescribeGtmRecoveryPlanAvailableConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGtmRecoveryPlanAvailableConfigRequest self = new DescribeGtmRecoveryPlanAvailableConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGtmRecoveryPlanAvailableConfigRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
