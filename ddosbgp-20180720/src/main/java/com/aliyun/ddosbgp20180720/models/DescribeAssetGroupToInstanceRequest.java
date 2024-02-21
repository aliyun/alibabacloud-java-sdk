// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeAssetGroupToInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance to query.</p>
     * <br>
     * <p>>  You can call the [DescribeInstanceList](~~118698~~) operation to query the IDs of all Anti-DDoS Origin instances of paid editions.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The UID of the member to which the asset belongs.</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

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

    public static DescribeAssetGroupToInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAssetGroupToInstanceRequest self = new DescribeAssetGroupToInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAssetGroupToInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeAssetGroupToInstanceRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeAssetGroupToInstanceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public DescribeAssetGroupToInstanceRequest setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public DescribeAssetGroupToInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAssetGroupToInstanceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeAssetGroupToInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
