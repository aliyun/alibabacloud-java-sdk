// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCfwRiskLevelSummaryRequest extends TeaModel {
    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCfwRiskLevelSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCfwRiskLevelSummaryRequest self = new DescribeCfwRiskLevelSummaryRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCfwRiskLevelSummaryRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public DescribeCfwRiskLevelSummaryRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCfwRiskLevelSummaryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
