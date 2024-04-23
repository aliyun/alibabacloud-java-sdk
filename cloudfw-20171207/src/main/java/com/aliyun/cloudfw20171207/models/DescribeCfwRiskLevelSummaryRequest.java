// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCfwRiskLevelSummaryRequest extends TeaModel {
    /**
     * <p>The instance type.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The language of the content within the response.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   **zh** (default): Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region ID of your Cloud Firewall.</p>
     * <br>
     * <p>>  For more information about Cloud Firewall supported regions, see [Supported regions](~~195657~~).</p>
     */
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
