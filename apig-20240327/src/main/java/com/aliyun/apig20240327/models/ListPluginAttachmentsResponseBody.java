// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class ListPluginAttachmentsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Ok</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public ListPluginAttachmentsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>9640D776-794A-5077-9184-A247CA4B45C1</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListPluginAttachmentsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPluginAttachmentsResponseBody self = new ListPluginAttachmentsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPluginAttachmentsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPluginAttachmentsResponseBody setData(ListPluginAttachmentsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListPluginAttachmentsResponseBodyData getData() {
        return this.data;
    }

    public ListPluginAttachmentsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPluginAttachmentsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListPluginAttachmentsResponseBodyDataItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>GatewayRoute</p>
         */
        @NameInMap("attachResourceType")
        public String attachResourceType;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("enable")
        public Boolean enable;

        @NameInMap("environmentInfo")
        public EnvironmentInfo environmentInfo;

        @NameInMap("parentResourceInfo")
        public ParentResourceInfo parentResourceInfo;

        /**
         * <strong>example:</strong>
         * <p>pa-d0j9t5em1hkncrlo51mg</p>
         */
        @NameInMap("pluginAttachmentId")
        public String pluginAttachmentId;

        @NameInMap("pluginClassInfo")
        public PluginClassInfo pluginClassInfo;

        /**
         * <strong>example:</strong>
         * <p>bGltaXRfYnlfaGVhZGVyOiB4LWFwaS1rZXkKbGltaXRfa2V5czoKLSBrZXk6IGV4YW1wbGUta2V5LWEKICBxdWVyeV9wZXJfc2Vjb25kOiAxMAotIGtleTogZXhhbXBsZS1rZXktYgogIHF1ZXJ5X3Blcl9zZWNvbmQ6IDEK</p>
         */
        @NameInMap("pluginConfig")
        public String pluginConfig;

        /**
         * <strong>example:</strong>
         * <p>pl-cvu6r4um1hko3b3ti0a0</p>
         */
        @NameInMap("pluginId")
        public String pluginId;

        @NameInMap("resourceInfos")
        public java.util.List<ResourceInfo> resourceInfos;

        public static ListPluginAttachmentsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            ListPluginAttachmentsResponseBodyDataItems self = new ListPluginAttachmentsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public ListPluginAttachmentsResponseBodyDataItems setAttachResourceType(String attachResourceType) {
            this.attachResourceType = attachResourceType;
            return this;
        }
        public String getAttachResourceType() {
            return this.attachResourceType;
        }

        public ListPluginAttachmentsResponseBodyDataItems setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public ListPluginAttachmentsResponseBodyDataItems setEnvironmentInfo(EnvironmentInfo environmentInfo) {
            this.environmentInfo = environmentInfo;
            return this;
        }
        public EnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        public ListPluginAttachmentsResponseBodyDataItems setParentResourceInfo(ParentResourceInfo parentResourceInfo) {
            this.parentResourceInfo = parentResourceInfo;
            return this;
        }
        public ParentResourceInfo getParentResourceInfo() {
            return this.parentResourceInfo;
        }

        public ListPluginAttachmentsResponseBodyDataItems setPluginAttachmentId(String pluginAttachmentId) {
            this.pluginAttachmentId = pluginAttachmentId;
            return this;
        }
        public String getPluginAttachmentId() {
            return this.pluginAttachmentId;
        }

        public ListPluginAttachmentsResponseBodyDataItems setPluginClassInfo(PluginClassInfo pluginClassInfo) {
            this.pluginClassInfo = pluginClassInfo;
            return this;
        }
        public PluginClassInfo getPluginClassInfo() {
            return this.pluginClassInfo;
        }

        public ListPluginAttachmentsResponseBodyDataItems setPluginConfig(String pluginConfig) {
            this.pluginConfig = pluginConfig;
            return this;
        }
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        public ListPluginAttachmentsResponseBodyDataItems setPluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }
        public String getPluginId() {
            return this.pluginId;
        }

        public ListPluginAttachmentsResponseBodyDataItems setResourceInfos(java.util.List<ResourceInfo> resourceInfos) {
            this.resourceInfos = resourceInfos;
            return this;
        }
        public java.util.List<ResourceInfo> getResourceInfos() {
            return this.resourceInfos;
        }

    }

    public static class ListPluginAttachmentsResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<ListPluginAttachmentsResponseBodyDataItems> items;

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

        public static ListPluginAttachmentsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPluginAttachmentsResponseBodyData self = new ListPluginAttachmentsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPluginAttachmentsResponseBodyData setItems(java.util.List<ListPluginAttachmentsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<ListPluginAttachmentsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public ListPluginAttachmentsResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListPluginAttachmentsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPluginAttachmentsResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
