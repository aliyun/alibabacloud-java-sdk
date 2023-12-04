// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DettachAssetGroupToInstanceRequest extends TeaModel {
    @NameInMap("AssetGroupList")
    public java.util.List<DettachAssetGroupToInstanceRequestAssetGroupList> assetGroupList;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SourceIp")
    public String sourceIp;

    public static DettachAssetGroupToInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DettachAssetGroupToInstanceRequest self = new DettachAssetGroupToInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DettachAssetGroupToInstanceRequest setAssetGroupList(java.util.List<DettachAssetGroupToInstanceRequestAssetGroupList> assetGroupList) {
        this.assetGroupList = assetGroupList;
        return this;
    }
    public java.util.List<DettachAssetGroupToInstanceRequestAssetGroupList> getAssetGroupList() {
        return this.assetGroupList;
    }

    public DettachAssetGroupToInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DettachAssetGroupToInstanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DettachAssetGroupToInstanceRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static class DettachAssetGroupToInstanceRequestAssetGroupList extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Region")
        public String region;

        @NameInMap("Type")
        public String type;

        public static DettachAssetGroupToInstanceRequestAssetGroupList build(java.util.Map<String, ?> map) throws Exception {
            DettachAssetGroupToInstanceRequestAssetGroupList self = new DettachAssetGroupToInstanceRequestAssetGroupList();
            return TeaModel.build(map, self);
        }

        public DettachAssetGroupToInstanceRequestAssetGroupList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DettachAssetGroupToInstanceRequestAssetGroupList setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public DettachAssetGroupToInstanceRequestAssetGroupList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
