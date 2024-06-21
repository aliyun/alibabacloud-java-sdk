// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeAssetGroupRequest extends TeaModel {
    /**
     * <p>The ID of the asset. If the asset is a Web Application Firewall (WAF) instance, specify the ID of the WAF instance.</p>
     * 
     * <strong>example:</strong>
     * <p>waf_v2_public_cn-lbj382l****</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the asset.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The type of the asset. Valid values:</p>
     * <ul>
     * <li><strong>waf</strong>: WAF instance</li>
     * <li><strong>ga</strong>: Global Accelerator (GA) instance</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeAssetGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetGroupRequest self = new DescribeAssetGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetGroupRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAssetGroupRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeAssetGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAssetGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
