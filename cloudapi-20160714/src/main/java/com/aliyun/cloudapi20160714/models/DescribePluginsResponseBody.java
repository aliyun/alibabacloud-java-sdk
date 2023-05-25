// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Plugins")
    public DescribePluginsResponseBodyPlugins plugins;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginsResponseBody self = new DescribePluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePluginsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePluginsResponseBody setPlugins(DescribePluginsResponseBodyPlugins plugins) {
        this.plugins = plugins;
        return this;
    }
    public DescribePluginsResponseBodyPlugins getPlugins() {
        return this.plugins;
    }

    public DescribePluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePluginsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePluginsResponseBodyPluginsPluginAttributeTagsTagInfo extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribePluginsResponseBodyPluginsPluginAttributeTagsTagInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginsResponseBodyPluginsPluginAttributeTagsTagInfo self = new DescribePluginsResponseBodyPluginsPluginAttributeTagsTagInfo();
            return TeaModel.build(map, self);
        }

        public DescribePluginsResponseBodyPluginsPluginAttributeTagsTagInfo setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribePluginsResponseBodyPluginsPluginAttributeTagsTagInfo setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribePluginsResponseBodyPluginsPluginAttributeTags extends TeaModel {
        @NameInMap("TagInfo")
        public java.util.List<DescribePluginsResponseBodyPluginsPluginAttributeTagsTagInfo> tagInfo;

        public static DescribePluginsResponseBodyPluginsPluginAttributeTags build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginsResponseBodyPluginsPluginAttributeTags self = new DescribePluginsResponseBodyPluginsPluginAttributeTags();
            return TeaModel.build(map, self);
        }

        public DescribePluginsResponseBodyPluginsPluginAttributeTags setTagInfo(java.util.List<DescribePluginsResponseBodyPluginsPluginAttributeTagsTagInfo> tagInfo) {
            this.tagInfo = tagInfo;
            return this;
        }
        public java.util.List<DescribePluginsResponseBodyPluginsPluginAttributeTagsTagInfo> getTagInfo() {
            return this.tagInfo;
        }

    }

    public static class DescribePluginsResponseBodyPluginsPluginAttribute extends TeaModel {
        @NameInMap("CreatedTime")
        public String createdTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("PluginData")
        public String pluginData;

        @NameInMap("PluginId")
        public String pluginId;

        @NameInMap("PluginName")
        public String pluginName;

        @NameInMap("PluginType")
        public String pluginType;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("Tags")
        public DescribePluginsResponseBodyPluginsPluginAttributeTags tags;

        public static DescribePluginsResponseBodyPluginsPluginAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginsResponseBodyPluginsPluginAttribute self = new DescribePluginsResponseBodyPluginsPluginAttribute();
            return TeaModel.build(map, self);
        }

        public DescribePluginsResponseBodyPluginsPluginAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribePluginsResponseBodyPluginsPluginAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePluginsResponseBodyPluginsPluginAttribute setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribePluginsResponseBodyPluginsPluginAttribute setPluginData(String pluginData) {
            this.pluginData = pluginData;
            return this;
        }
        public String getPluginData() {
            return this.pluginData;
        }

        public DescribePluginsResponseBodyPluginsPluginAttribute setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public DescribePluginsResponseBodyPluginsPluginAttribute setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public DescribePluginsResponseBodyPluginsPluginAttribute setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public DescribePluginsResponseBodyPluginsPluginAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribePluginsResponseBodyPluginsPluginAttribute setTags(DescribePluginsResponseBodyPluginsPluginAttributeTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribePluginsResponseBodyPluginsPluginAttributeTags getTags() {
            return this.tags;
        }

    }

    public static class DescribePluginsResponseBodyPlugins extends TeaModel {
        @NameInMap("PluginAttribute")
        public java.util.List<DescribePluginsResponseBodyPluginsPluginAttribute> pluginAttribute;

        public static DescribePluginsResponseBodyPlugins build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginsResponseBodyPlugins self = new DescribePluginsResponseBodyPlugins();
            return TeaModel.build(map, self);
        }

        public DescribePluginsResponseBodyPlugins setPluginAttribute(java.util.List<DescribePluginsResponseBodyPluginsPluginAttribute> pluginAttribute) {
            this.pluginAttribute = pluginAttribute;
            return this;
        }
        public java.util.List<DescribePluginsResponseBodyPluginsPluginAttribute> getPluginAttribute() {
            return this.pluginAttribute;
        }

    }

}
