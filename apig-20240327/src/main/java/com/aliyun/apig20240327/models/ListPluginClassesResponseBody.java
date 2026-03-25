// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginClassesResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("data")
    public ListPluginClassesResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The ID of the request</p>
     * 
     * <strong>example:</strong>
     * <p>61EBF577-1601-51E1-B136-9CD6xxxxxxxx</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPluginClassesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginClassesResponseBody self = new ListPluginClassesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginClassesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPluginClassesResponseBody setData(ListPluginClassesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPluginClassesResponseBodyData getData() {
        return this.data;
    }

    public ListPluginClassesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPluginClassesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPluginClassesResponseBodyDataItems extends TeaModel {
        /**
         * <p>The alias of the plugin.</p>
         */
        @NameInMap("alias")
        public String alias;

        /**
         * <p>The description of the plugin.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>Indicates whether the plugin is installed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("installed")
        public Boolean installed;

        /**
         * <p>The plugin name.</p>
         * 
         * <strong>example:</strong>
         * <p>oauth</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The plugin type ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pls-d4ghv6em1hkixxxxxxxx</p>
         */
        @NameInMap("pluginClassId")
        public String pluginClassId;

        /**
         * <p>The plugin ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-cvu6r4um1hkoxxxxxxxx</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        /**
         * <p>The publishing status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("publishStatus")
        public String publishStatus;

        /**
         * <p>The source of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>HigressOfficial</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <p>The minimum version of the gateway supported by the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0.0</p>
         */
        @NameInMap("supportedMinGatewayVersion")
        public String supportedMinGatewayVersion;

        /**
         * <p>The type of the plugin.</p>
         * 
         * <strong>example:</strong>
         * <p>Auth</p>
         */
        @NameInMap("type")
        public String type;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("version")
        public String version;

        public static ListPluginClassesResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListPluginClassesResponseBodyDataItems self = new ListPluginClassesResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListPluginClassesResponseBodyDataItems setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListPluginClassesResponseBodyDataItems setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListPluginClassesResponseBodyDataItems setInstalled(Boolean installed) {
            this.installed = installed;
            return this;
        }
        public Boolean getInstalled() {
            return this.installed;
        }

        public ListPluginClassesResponseBodyDataItems setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPluginClassesResponseBodyDataItems setPluginClassId(String pluginClassId) {
            this.pluginClassId = pluginClassId;
            return this;
        }
        public String getPluginClassId() {
            return this.pluginClassId;
        }

        public ListPluginClassesResponseBodyDataItems setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListPluginClassesResponseBodyDataItems setPublishStatus(String publishStatus) {
            this.publishStatus = publishStatus;
            return this;
        }
        public String getPublishStatus() {
            return this.publishStatus;
        }

        public ListPluginClassesResponseBodyDataItems setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListPluginClassesResponseBodyDataItems setSupportedMinGatewayVersion(String supportedMinGatewayVersion) {
            this.supportedMinGatewayVersion = supportedMinGatewayVersion;
            return this;
        }
        public String getSupportedMinGatewayVersion() {
            return this.supportedMinGatewayVersion;
        }

        public ListPluginClassesResponseBodyDataItems setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListPluginClassesResponseBodyDataItems setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class ListPluginClassesResponseBodyData extends TeaModel {
        /**
         * <p>The plugin details.</p>
         */
        @NameInMap("items")
        public java.util.List<ListPluginClassesResponseBodyDataItems> items;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListPluginClassesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPluginClassesResponseBodyData self = new ListPluginClassesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPluginClassesResponseBodyData setItems(java.util.List<ListPluginClassesResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListPluginClassesResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListPluginClassesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPluginClassesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPluginClassesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
