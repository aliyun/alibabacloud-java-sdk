// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePluginsByGroupResponseBody extends TeaModel {
    /**
     * <p>Pagination parameter: current page number</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Pagination parameter: number of items per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Returns information about the plugins</p>
     */
    @NameInMap("Plugins")
    public DescribePluginsByGroupResponseBodyPlugins plugins;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>5F5574BA-F22B-563D-841E-C817964F517F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total number of results returned</p>
     * 
     * <strong>example:</strong>
     * <p>32</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribePluginsByGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePluginsByGroupResponseBody self = new DescribePluginsByGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePluginsByGroupResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePluginsByGroupResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePluginsByGroupResponseBody setPlugins(DescribePluginsByGroupResponseBodyPlugins plugins) {
        this.plugins = plugins;
        return this;
    }
    public DescribePluginsByGroupResponseBodyPlugins getPlugins() {
        return this.plugins;
    }

    public DescribePluginsByGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePluginsByGroupResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePluginsByGroupResponseBodyPluginsPluginAttribute extends TeaModel {
        /**
         * <p>Creation time, in GMT</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-20T02:05:57Z</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <p>Plugin description</p>
         * 
         * <strong>example:</strong>
         * <p>traffic controll</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Last modified time, in GMT</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-15T02:30:18Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>Plugin definition statement</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;unit\&quot;:\&quot;MINUTE\&quot;,\&quot;apiDefault\&quot;:20}</p>
         */
        @NameInMap("PluginData")
        public String pluginData;

        /**
         * <p>Plugin ID</p>
         * 
         * <strong>example:</strong>
         * <p>5e204eeb4aa94c919a49f471ad3fc716</p>
         */
        @NameInMap("PluginId")
        public String pluginId;

        /**
         * <p>Plugin name</p>
         * 
         * <strong>example:</strong>
         * <p>firstPlugin</p>
         */
        @NameInMap("PluginName")
        public String pluginName;

        /**
         * <p>Plugin type</p>
         * 
         * <strong>example:</strong>
         * <p>trafficControl</p>
         */
        @NameInMap("PluginType")
        public String pluginType;

        /**
         * <p>插件所在Region</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        public static DescribePluginsByGroupResponseBodyPluginsPluginAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginsByGroupResponseBodyPluginsPluginAttribute self = new DescribePluginsByGroupResponseBodyPluginsPluginAttribute();
            return TeaModel.build(map, self);
        }

        public DescribePluginsByGroupResponseBodyPluginsPluginAttribute setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public DescribePluginsByGroupResponseBodyPluginsPluginAttribute setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePluginsByGroupResponseBodyPluginsPluginAttribute setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public DescribePluginsByGroupResponseBodyPluginsPluginAttribute setPluginData(String pluginData) {
            this.pluginData = pluginData;
            return this;
        }
        public String getPluginData() {
            return this.pluginData;
        }

        public DescribePluginsByGroupResponseBodyPluginsPluginAttribute setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public DescribePluginsByGroupResponseBodyPluginsPluginAttribute setPluginName(String pluginName) {
            this.pluginName = pluginName;
            return this;
        }
        public String getPluginName() {
            return this.pluginName;
        }

        public DescribePluginsByGroupResponseBodyPluginsPluginAttribute setPluginType(String pluginType) {
            this.pluginType = pluginType;
            return this;
        }
        public String getPluginType() {
            return this.pluginType;
        }

        public DescribePluginsByGroupResponseBodyPluginsPluginAttribute setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

    }

    public static class DescribePluginsByGroupResponseBodyPlugins extends TeaModel {
        @NameInMap("PluginAttribute")
        public java.util.List<DescribePluginsByGroupResponseBodyPluginsPluginAttribute> pluginAttribute;

        public static DescribePluginsByGroupResponseBodyPlugins build(java.util.Map<String, ?> map) throws Exception {
            DescribePluginsByGroupResponseBodyPlugins self = new DescribePluginsByGroupResponseBodyPlugins();
            return TeaModel.build(map, self);
        }

        public DescribePluginsByGroupResponseBodyPlugins setPluginAttribute(java.util.List<DescribePluginsByGroupResponseBodyPluginsPluginAttribute> pluginAttribute) {
            this.pluginAttribute = pluginAttribute;
            return this;
        }
        public java.util.List<DescribePluginsByGroupResponseBodyPluginsPluginAttribute> getPluginAttribute() {
            return this.pluginAttribute;
        }

    }

}
