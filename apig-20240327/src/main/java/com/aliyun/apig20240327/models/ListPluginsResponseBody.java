// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListPluginsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>168BA42D-F822-569D-A67F-FC59E6ABC2B1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPluginsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginsResponseBody self = new ListPluginsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPluginsResponseBody setData(ListPluginsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPluginsResponseBodyData getData() {
        return this.data;
    }

    public ListPluginsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPluginsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPluginsResponseBodyDataItemsAttachmentInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("enable")
        public String enable;

        /**
         * <strong>example:</strong>
         * <p>pa-ct2irn6m1hkreaen0t40</p>
         */
        @NameInMap("pluginAttachmentId")
        public String pluginAttachmentId;

        public static ListPluginsResponseBodyDataItemsAttachmentInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsResponseBodyDataItemsAttachmentInfo self = new ListPluginsResponseBodyDataItemsAttachmentInfo();
            return TeaModel.build(map, self);
        }

        public ListPluginsResponseBodyDataItemsAttachmentInfo setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListPluginsResponseBodyDataItemsAttachmentInfo setPluginAttachmentId(String pluginAttachmentId) {
            this.pluginAttachmentId = pluginAttachmentId;
            return this;
        }
        public String getPluginAttachmentId() {
            return this.pluginAttachmentId;
        }

    }

    public static class ListPluginsResponseBodyDataItemsGatewayInfo extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>gw-cq7og15lhtxx6qasrj60</p>
         */
        @NameInMap("gatewayId")
        public String gatewayId;

        /**
         * <strong>example:</strong>
         * <p>apitest-gw</p>
         */
        @NameInMap("name")
        public String name;

        public static ListPluginsResponseBodyDataItemsGatewayInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsResponseBodyDataItemsGatewayInfo self = new ListPluginsResponseBodyDataItemsGatewayInfo();
            return TeaModel.build(map, self);
        }

        public ListPluginsResponseBodyDataItemsGatewayInfo setGatewayId(String gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public String getGatewayId() {
            return this.gatewayId;
        }

        public ListPluginsResponseBodyDataItemsGatewayInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListPluginsResponseBodyDataItemsPluginClassInfo extends TeaModel {
        @NameInMap("alias")
        public String alias;

        /**
         * <strong>example:</strong>
         * <p>999</p>
         */
        @NameInMap("executePriority")
        public String executePriority;

        /**
         * <strong>example:</strong>
         * <p>AUTHZ</p>
         */
        @NameInMap("executeStage")
        public String executeStage;

        /**
         * <strong>example:</strong>
         * <p>key-rate-limit</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>pls-cqebrgh46ppatmpri</p>
         */
        @NameInMap("pluginClassId")
        public String pluginClassId;

        /**
         * <strong>example:</strong>
         * <p>HigressOfficial</p>
         */
        @NameInMap("source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>2.0.3</p>
         */
        @NameInMap("version")
        public String version;

        @NameInMap("versionDescription")
        public String versionDescription;

        public static ListPluginsResponseBodyDataItemsPluginClassInfo build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsResponseBodyDataItemsPluginClassInfo self = new ListPluginsResponseBodyDataItemsPluginClassInfo();
            return TeaModel.build(map, self);
        }

        public ListPluginsResponseBodyDataItemsPluginClassInfo setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListPluginsResponseBodyDataItemsPluginClassInfo setExecutePriority(String executePriority) {
            this.executePriority = executePriority;
            return this;
        }
        public String getExecutePriority() {
            return this.executePriority;
        }

        public ListPluginsResponseBodyDataItemsPluginClassInfo setExecuteStage(String executeStage) {
            this.executeStage = executeStage;
            return this;
        }
        public String getExecuteStage() {
            return this.executeStage;
        }

        public ListPluginsResponseBodyDataItemsPluginClassInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListPluginsResponseBodyDataItemsPluginClassInfo setPluginClassId(String pluginClassId) {
            this.pluginClassId = pluginClassId;
            return this;
        }
        public String getPluginClassId() {
            return this.pluginClassId;
        }

        public ListPluginsResponseBodyDataItemsPluginClassInfo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListPluginsResponseBodyDataItemsPluginClassInfo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public ListPluginsResponseBodyDataItemsPluginClassInfo setVersionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public String getVersionDescription() {
            return this.versionDescription;
        }

    }

    public static class ListPluginsResponseBodyDataItems extends TeaModel {
        @NameInMap("attachmentInfo")
        public ListPluginsResponseBodyDataItemsAttachmentInfo attachmentInfo;

        @NameInMap("gatewayInfo")
        public ListPluginsResponseBodyDataItemsGatewayInfo gatewayInfo;

        @NameInMap("pluginClassInfo")
        public ListPluginsResponseBodyDataItemsPluginClassInfo pluginClassInfo;

        /**
         * <strong>example:</strong>
         * <p>pl-cvu6r4um1hko3b3ti0a0</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        public static ListPluginsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsResponseBodyDataItems self = new ListPluginsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListPluginsResponseBodyDataItems setAttachmentInfo(ListPluginsResponseBodyDataItemsAttachmentInfo attachmentInfo) {
            this.attachmentInfo = attachmentInfo;
            return this;
        }
        public ListPluginsResponseBodyDataItemsAttachmentInfo getAttachmentInfo() {
            return this.attachmentInfo;
        }

        public ListPluginsResponseBodyDataItems setGatewayInfo(ListPluginsResponseBodyDataItemsGatewayInfo gatewayInfo) {
            this.gatewayInfo = gatewayInfo;
            return this;
        }
        public ListPluginsResponseBodyDataItemsGatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        public ListPluginsResponseBodyDataItems setPluginClassInfo(ListPluginsResponseBodyDataItemsPluginClassInfo pluginClassInfo) {
            this.pluginClassInfo = pluginClassInfo;
            return this;
        }
        public ListPluginsResponseBodyDataItemsPluginClassInfo getPluginClassInfo() {
            return this.pluginClassInfo;
        }

        public ListPluginsResponseBodyDataItems setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

    }

    public static class ListPluginsResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListPluginsResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("totalSize")
        public Integer totalSize;

        public static ListPluginsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPluginsResponseBodyData self = new ListPluginsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPluginsResponseBodyData setItems(java.util.List<ListPluginsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListPluginsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListPluginsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPluginsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPluginsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
