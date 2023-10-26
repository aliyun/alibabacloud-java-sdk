// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListGrafanaWorkspaceRequest extends TeaModel {
    @NameInMap("AliyunLang")
    public String aliyunLang;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<ListGrafanaWorkspaceRequestTags> tags;

    public static ListGrafanaWorkspaceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGrafanaWorkspaceRequest self = new ListGrafanaWorkspaceRequest();
        return TeaModel.build(map, self);
    }

    public ListGrafanaWorkspaceRequest setAliyunLang(String aliyunLang) {
        this.aliyunLang = aliyunLang;
        return this;
    }
    public String getAliyunLang() {
        return this.aliyunLang;
    }

    public ListGrafanaWorkspaceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListGrafanaWorkspaceRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListGrafanaWorkspaceRequest setTags(java.util.List<ListGrafanaWorkspaceRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<ListGrafanaWorkspaceRequestTags> getTags() {
        return this.tags;
    }

    public static class ListGrafanaWorkspaceRequestTags extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static ListGrafanaWorkspaceRequestTags build(java.util.Map<String, ?> map) throws Exception {
            ListGrafanaWorkspaceRequestTags self = new ListGrafanaWorkspaceRequestTags();
            return TeaModel.build(map, self);
        }

        public ListGrafanaWorkspaceRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGrafanaWorkspaceRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
