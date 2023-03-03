// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListTraceAppsRequest extends TeaModel {
    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<ListTraceAppsRequestTags> tags;

    public static ListTraceAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTraceAppsRequest self = new ListTraceAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListTraceAppsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListTraceAppsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListTraceAppsRequest setTags(java.util.List<ListTraceAppsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListTraceAppsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListTraceAppsRequestTags extends TeaModel {
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

        public static ListTraceAppsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListTraceAppsRequestTags self = new ListTraceAppsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListTraceAppsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTraceAppsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
