// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeCfwRiskLevelSummaryRequest extends TeaModel {
    /**
     * <p>The instance type. Valid value:</p>
     * <ul>
     * <li><strong>ecs</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>EcsEIP</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The language of the response.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the region where Cloud Firewall is deployed.</p>
     * <blockquote>
     * <p>For more information about the regions where Cloud Firewall is available, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
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
