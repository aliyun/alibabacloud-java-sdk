// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class EnableMetricRuleBlackListRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("IsEnable")
    public Boolean isEnable;

    @NameInMap("RegionId")
    public String regionId;

    public static EnableMetricRuleBlackListRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableMetricRuleBlackListRequest self = new EnableMetricRuleBlackListRequest();
        return TeaModel.build(map, self);
    }

    public EnableMetricRuleBlackListRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public EnableMetricRuleBlackListRequest setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
        return this;
    }
    public Boolean getIsEnable() {
        return this.isEnable;
    }

    public EnableMetricRuleBlackListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
