// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DettachAssetGroupToInstanceRequest extends TeaModel {
    /**
     * <p>The information about the asset that you want to dissociate.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AssetGroupList")
    public java.util.List<DettachAssetGroupToInstanceRequestAssetGroupList> assetGroupList;

    /**
     * <p>The ID of the instance.</p>
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
        /**
         * <p>The ID of the asset. If the asset is a Web Application Firewall (WAF) instance, specify the ID of the WAF instance.</p>
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
         * <p>The type of the asset. Valid values:</p>
         * <br>
         * <p>*   **waf**: WAF instance</p>
         * <p>*   **ga**: Global Accelerator (GA) instance</p>
         * <br>
         * <p>This parameter is required.</p>
         */
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
