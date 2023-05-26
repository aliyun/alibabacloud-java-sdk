// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class AddPrometheusGlobalViewRequest extends TeaModel {
    /**
     * <p>The queried global aggregation instances. The value is a JSON string.</p>
     */
    @NameInMap("Clusters")
    public String clusters;

    /**
     * <p>The name of the aggregation instance.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<AddPrometheusGlobalViewRequestTag> tag;

    public static AddPrometheusGlobalViewRequest build(java.util.Map<String, ?> map) throws Exception {
        AddPrometheusGlobalViewRequest self = new AddPrometheusGlobalViewRequest();
        return TeaModel.build(map, self);
    }

    public AddPrometheusGlobalViewRequest setClusters(String clusters) {
        this.clusters = clusters;
        return this;
    }
    public String getClusters() {
        return this.clusters;
    }

    public AddPrometheusGlobalViewRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public AddPrometheusGlobalViewRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddPrometheusGlobalViewRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public AddPrometheusGlobalViewRequest setTag(java.util.List<AddPrometheusGlobalViewRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<AddPrometheusGlobalViewRequestTag> getTag() {
        return this.tag;
    }

    public static class AddPrometheusGlobalViewRequestTag extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static AddPrometheusGlobalViewRequestTag build(java.util.Map<String, ?> map) throws Exception {
            AddPrometheusGlobalViewRequestTag self = new AddPrometheusGlobalViewRequestTag();
            return TeaModel.build(map, self);
        }

        public AddPrometheusGlobalViewRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public AddPrometheusGlobalViewRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
