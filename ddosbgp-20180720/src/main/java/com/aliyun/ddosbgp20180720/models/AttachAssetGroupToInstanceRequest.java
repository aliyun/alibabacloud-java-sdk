// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class AttachAssetGroupToInstanceRequest extends TeaModel {
    @NameInMap("AssetGroupList")
    public java.util.List<AttachAssetGroupToInstanceRequestAssetGroupList> assetGroupList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

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
        @NameInMap("MemberUid")
        public String memberUid;

        @NameInMap("Name")
        public String name;

        @NameInMap("Region")
        public String region;

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
