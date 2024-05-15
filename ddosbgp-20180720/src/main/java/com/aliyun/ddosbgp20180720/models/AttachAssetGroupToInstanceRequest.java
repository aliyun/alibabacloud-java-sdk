// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachAssetGroupToInstanceRequest extends TeaModel {
    /**
     * <p>The information about the asset to be associated.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssetGroupList")
    public java.util.List<AttachAssetGroupToInstanceRequestAssetGroupList> assetGroupList;

    /**
     * <p>The ID of the instance to query.</p>
     * <br>
     * <p>>  You can call the [DescribeInstanceList](https://help.aliyun.com/document_detail/118698.html) operation to query the IDs of all Anti-DDoS Origin instances of paid editions.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the region in which the instance resides.</p>
     * <br>
     * <p>>  You can call the [DescribeRegions](https://help.aliyun.com/document_detail/118703.html) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The source IP address of the request. The system specifies this parameter.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static AttachAssetGroupToInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        AttachAssetGroupToInstanceRequest self = new AttachAssetGroupToInstanceRequest();
        return TeaModel.build(map, self);
    }

    public AttachAssetGroupToInstanceRequest setAssetGroupList(java.util.List<AttachAssetGroupToInstanceRequestAssetGroupList> assetGroupList) {
        this.assetGroupList = assetGroupList;
        return this;
    }
    public java.util.List<AttachAssetGroupToInstanceRequestAssetGroupList> getAssetGroupList() {
        return this.assetGroupList;
    }

    public AttachAssetGroupToInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AttachAssetGroupToInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AttachAssetGroupToInstanceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static class AttachAssetGroupToInstanceRequestAssetGroupList extends TeaModel {
        /**
         * <p>The UID of the member to which the asset belongs.</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The ID of the asset that you want to add. If the asset is a Web Application Firewall (WAF) instance, specify the ID of the WAF instance.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID of the asset.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The type of the asset.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static AttachAssetGroupToInstanceRequestAssetGroupList build(java.util.Map<String, ?> map) throws Exception {
            AttachAssetGroupToInstanceRequestAssetGroupList self = new AttachAssetGroupToInstanceRequestAssetGroupList();
            return TeaModel.build(map, self);
        }

        public AttachAssetGroupToInstanceRequestAssetGroupList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public AttachAssetGroupToInstanceRequestAssetGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public AttachAssetGroupToInstanceRequestAssetGroupList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public AttachAssetGroupToInstanceRequestAssetGroupList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
