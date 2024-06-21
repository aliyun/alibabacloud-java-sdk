// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListGrafanaWorkspaceRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AliyunLang")
    public String aliyunLang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
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
