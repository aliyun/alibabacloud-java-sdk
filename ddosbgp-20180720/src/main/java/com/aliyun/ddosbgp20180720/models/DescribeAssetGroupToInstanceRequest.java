// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeAssetGroupToInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance to query.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances of paid editions.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ddosbgp-cn-7212zaa5v***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The UID of the member to which the asset belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>170858869679****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

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
     * 
     * <strong>example:</strong>
     * <p>waf</p>
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

    public DescribeAssetGroupToInstanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
