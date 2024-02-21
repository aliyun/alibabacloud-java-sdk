// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeAssetGroupRequest extends TeaModel {
    /**
     * <p>The ID of the asset. If the asset is a Web Application Firewall (WAF) instance, specify the ID of the WAF instance.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID of the asset.</p>
     */
    @NameInMap("Region")
    public String region;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](~~118703~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source IP address of the request. The system specifies this parameter.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the asset. Valid values:</p>
     * <br>
     * <p>*   **waf**: WAF instance</p>
     * <p>*   **ga**: Global Accelerator (GA) instance</p>
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

    public DescribeAssetGroupRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAssetGroupRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
