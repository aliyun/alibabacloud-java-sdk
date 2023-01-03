// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListRetcodeAppsRequest extends TeaModel {
    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<ListRetcodeAppsRequestTags> tags;

    public static ListRetcodeAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRetcodeAppsRequest self = new ListRetcodeAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListRetcodeAppsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListRetcodeAppsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListRetcodeAppsRequest setTags(java.util.List<ListRetcodeAppsRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListRetcodeAppsRequestTags> getTags() {
        return this.tags;
    }

    public static class ListRetcodeAppsRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListRetcodeAppsRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListRetcodeAppsRequestTags self = new ListRetcodeAppsRequestTags();
            return TeaModel.build(map, self);
        }

        public ListRetcodeAppsRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListRetcodeAppsRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
