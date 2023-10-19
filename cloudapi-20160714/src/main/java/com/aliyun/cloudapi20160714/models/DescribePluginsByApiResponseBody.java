// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsByApiResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The plug-in information. The information is an array that consists of PluginAttribute data.</p>
     */
    @NameInMap("Plugins")
    public DescribePluginsByApiResponseBodyPlugins plugins;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of returned entries.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePluginsByApiResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginsByApiResponseBody self = new DescribePluginsByApiResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginsByApiResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePluginsByApiResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePluginsByApiResponseBody setPlugins(DescribePluginsByApiResponseBodyPlugins plugins) {
        this.plugins = plugins;
        return this;
    }
    public DescribePluginsByApiResponseBodyPlugins getPlugins() {
        return this.plugins;
    }

    public DescribePluginsByApiResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePluginsByApiResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePluginsByApiResponseBodyPluginsPluginAttribute extends TeaModel {
        /**
         * <p>The time when the plug-in was created. The time is displayed in UTC.</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>The plug-in description.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The time when the plug-in was last modified. The time is displayed in UTC.</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The definition statement of the plug-in.</p>
         */
        @NameInMap("PluginData")
        public String pluginData;

        /**
         * <p>The plug-in ID.</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>The plug-in name.</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>The plug-in type.</p>
         */
        @NameInMap("PluginType")
        public String pluginType;

        /**
         * <p>The region where the plug-in resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribePluginsByApiResponseBodyPluginsPluginAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginsByApiResponseBodyPluginsPluginAttribute self = new DescribePluginsByApiResponseBodyPluginsPluginAttribute();
            return TeaModel.build(map, self);
        }

        public DescribePluginsByApiResponseBodyPluginsPluginAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribePluginsByApiResponseBodyPluginsPluginAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePluginsByApiResponseBodyPluginsPluginAttribute setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribePluginsByApiResponseBodyPluginsPluginAttribute setPluginData(String pluginData) {
            this.pluginData = pluginData;
            return this;
        }
        public String getPluginData() {
            return this.pluginData;
        }

        public DescribePluginsByApiResponseBodyPluginsPluginAttribute setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public DescribePluginsByApiResponseBodyPluginsPluginAttribute setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public DescribePluginsByApiResponseBodyPluginsPluginAttribute setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public DescribePluginsByApiResponseBodyPluginsPluginAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribePluginsByApiResponseBodyPlugins extends TeaModel {
        @NameInMap("PluginAttribute")
        public java.util.List<DescribePluginsByApiResponseBodyPluginsPluginAttribute> pluginAttribute;

        public static DescribePluginsByApiResponseBodyPlugins build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginsByApiResponseBodyPlugins self = new DescribePluginsByApiResponseBodyPlugins();
            return TeaModel.build(map, self);
        }

        public DescribePluginsByApiResponseBodyPlugins setPluginAttribute(java.util.List<DescribePluginsByApiResponseBodyPluginsPluginAttribute> pluginAttribute) {
            this.pluginAttribute = pluginAttribute;
            return this;
        }
        public java.util.List<DescribePluginsByApiResponseBodyPluginsPluginAttribute> getPluginAttribute() {
            return this.pluginAttribute;
        }

    }

}
