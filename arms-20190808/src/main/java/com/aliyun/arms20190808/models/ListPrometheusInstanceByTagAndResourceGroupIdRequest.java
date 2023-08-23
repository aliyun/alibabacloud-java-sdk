// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListPrometheusInstanceByTagAndResourceGroupIdRequest extends TeaModel {
    /**
     * <p>The region ID of the Prometheus instance.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdRequestTag> tag;

    public static ListPrometheusInstanceByTagAndResourceGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrometheusInstanceByTagAndResourceGroupIdRequest self = new ListPrometheusInstanceByTagAndResourceGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListPrometheusInstanceByTagAndResourceGroupIdRequest setTag(java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListPrometheusInstanceByTagAndResourceGroupIdRequestTag> getTag() {
        return this.tag;
    }

    public static class ListPrometheusInstanceByTagAndResourceGroupIdRequestTag extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListPrometheusInstanceByTagAndResourceGroupIdRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListPrometheusInstanceByTagAndResourceGroupIdRequestTag self = new ListPrometheusInstanceByTagAndResourceGroupIdRequestTag();
            return TeaModel.build(map, self);
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListPrometheusInstanceByTagAndResourceGroupIdRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
