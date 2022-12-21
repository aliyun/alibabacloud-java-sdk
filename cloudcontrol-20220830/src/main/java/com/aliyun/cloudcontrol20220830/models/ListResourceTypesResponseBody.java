// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    @NameInMap("maxResults")
    public Integer maxResults;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceTypes")
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListResourceTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListResourceTypesResponseBody self = new ListResourceTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListResourceTypesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListResourceTypesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListResourceTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListResourceTypesResponseBody setResourceTypes(java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes) {
        this.resourceTypes = resourceTypes;
        return this;
    }
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> getResourceTypes() {
        return this.resourceTypes;
    }

    public ListResourceTypesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListResourceTypesResponseBodyResourceTypesHandlersCreate extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static ListResourceTypesResponseBodyResourceTypesHandlersCreate build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesHandlersCreate self = new ListResourceTypesResponseBodyResourceTypesHandlersCreate();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesHandlersCreate setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypesHandlersDelete extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static ListResourceTypesResponseBodyResourceTypesHandlersDelete build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesHandlersDelete self = new ListResourceTypesResponseBodyResourceTypesHandlersDelete();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesHandlersDelete setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypesHandlersGet extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static ListResourceTypesResponseBodyResourceTypesHandlersGet build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesHandlersGet self = new ListResourceTypesResponseBodyResourceTypesHandlersGet();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesHandlersGet setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypesHandlersList extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static ListResourceTypesResponseBodyResourceTypesHandlersList build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesHandlersList self = new ListResourceTypesResponseBodyResourceTypesHandlersList();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesHandlersList setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypesHandlersUpdate extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static ListResourceTypesResponseBodyResourceTypesHandlersUpdate build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesHandlersUpdate self = new ListResourceTypesResponseBodyResourceTypesHandlersUpdate();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesHandlersUpdate setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypesHandlers extends TeaModel {
        @NameInMap("create")
        public ListResourceTypesResponseBodyResourceTypesHandlersCreate create;

        @NameInMap("delete")
        public ListResourceTypesResponseBodyResourceTypesHandlersDelete delete;

        @NameInMap("get")
        public ListResourceTypesResponseBodyResourceTypesHandlersGet get;

        @NameInMap("list")
        public ListResourceTypesResponseBodyResourceTypesHandlersList list;

        @NameInMap("update")
        public ListResourceTypesResponseBodyResourceTypesHandlersUpdate update;

        public static ListResourceTypesResponseBodyResourceTypesHandlers build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesHandlers self = new ListResourceTypesResponseBodyResourceTypesHandlers();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesHandlers setCreate(ListResourceTypesResponseBodyResourceTypesHandlersCreate create) {
            this.create = create;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesHandlersCreate getCreate() {
            return this.create;
        }

        public ListResourceTypesResponseBodyResourceTypesHandlers setDelete(ListResourceTypesResponseBodyResourceTypesHandlersDelete delete) {
            this.delete = delete;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesHandlersDelete getDelete() {
            return this.delete;
        }

        public ListResourceTypesResponseBodyResourceTypesHandlers setGet(ListResourceTypesResponseBodyResourceTypesHandlersGet get) {
            this.get = get;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesHandlersGet getGet() {
            return this.get;
        }

        public ListResourceTypesResponseBodyResourceTypesHandlers setList(ListResourceTypesResponseBodyResourceTypesHandlersList list) {
            this.list = list;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesHandlersList getList() {
            return this.list;
        }

        public ListResourceTypesResponseBodyResourceTypesHandlers setUpdate(ListResourceTypesResponseBodyResourceTypesHandlersUpdate update) {
            this.update = update;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesHandlersUpdate getUpdate() {
            return this.update;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypesInfo extends TeaModel {
        @NameInMap("chargeType")
        public String chargeType;

        @NameInMap("deliveryScope")
        public String deliveryScope;

        @NameInMap("description")
        public String description;

        @NameInMap("title")
        public String title;

        public static ListResourceTypesResponseBodyResourceTypesInfo build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypesInfo self = new ListResourceTypesResponseBodyResourceTypesInfo();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setDeliveryScope(String deliveryScope) {
            this.deliveryScope = deliveryScope;
            return this;
        }
        public String getDeliveryScope() {
            return this.deliveryScope;
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListResourceTypesResponseBodyResourceTypesInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListResourceTypesResponseBodyResourceTypes extends TeaModel {
        @NameInMap("createOnlyProperties")
        public java.util.List<String> createOnlyProperties;

        @NameInMap("deleteOnlyProperties")
        public java.util.List<String> deleteOnlyProperties;

        @NameInMap("filterProperties")
        public java.util.List<String> filterProperties;

        @NameInMap("getOnlyProperties")
        public java.util.List<String> getOnlyProperties;

        @NameInMap("getResponseProperties")
        public java.util.List<String> getResponseProperties;

        @NameInMap("handlers")
        public ListResourceTypesResponseBodyResourceTypesHandlers handlers;

        @NameInMap("info")
        public ListResourceTypesResponseBodyResourceTypesInfo info;

        @NameInMap("listOnlyProperties")
        public java.util.List<String> listOnlyProperties;

        @NameInMap("listResponseProperties")
        public java.util.List<String> listResponseProperties;

        @NameInMap("primaryIdentifier")
        public String primaryIdentifier;

        @NameInMap("product")
        public String product;

        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

        @NameInMap("publicProperties")
        public java.util.List<String> publicProperties;

        @NameInMap("readOnlyProperties")
        public java.util.List<String> readOnlyProperties;

        @NameInMap("required")
        public java.util.List<String> required;

        @NameInMap("resourceType")
        public String resourceType;

        @NameInMap("sensitiveInfoProperties")
        public java.util.List<String> sensitiveInfoProperties;

        @NameInMap("updateOnlyProperties")
        public java.util.List<String> updateOnlyProperties;

        @NameInMap("updateTypeProperties")
        public java.util.List<String> updateTypeProperties;

        public static ListResourceTypesResponseBodyResourceTypes build(java.util.Map<String, ?> map) throws Exception {
            ListResourceTypesResponseBodyResourceTypes self = new ListResourceTypesResponseBodyResourceTypes();
            return TeaModel.build(map, self);
        }

        public ListResourceTypesResponseBodyResourceTypes setCreateOnlyProperties(java.util.List<String> createOnlyProperties) {
            this.createOnlyProperties = createOnlyProperties;
            return this;
        }
        public java.util.List<String> getCreateOnlyProperties() {
            return this.createOnlyProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setDeleteOnlyProperties(java.util.List<String> deleteOnlyProperties) {
            this.deleteOnlyProperties = deleteOnlyProperties;
            return this;
        }
        public java.util.List<String> getDeleteOnlyProperties() {
            return this.deleteOnlyProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setFilterProperties(java.util.List<String> filterProperties) {
            this.filterProperties = filterProperties;
            return this;
        }
        public java.util.List<String> getFilterProperties() {
            return this.filterProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setGetOnlyProperties(java.util.List<String> getOnlyProperties) {
            this.getOnlyProperties = getOnlyProperties;
            return this;
        }
        public java.util.List<String> getGetOnlyProperties() {
            return this.getOnlyProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setGetResponseProperties(java.util.List<String> getResponseProperties) {
            this.getResponseProperties = getResponseProperties;
            return this;
        }
        public java.util.List<String> getGetResponseProperties() {
            return this.getResponseProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setHandlers(ListResourceTypesResponseBodyResourceTypesHandlers handlers) {
            this.handlers = handlers;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesHandlers getHandlers() {
            return this.handlers;
        }

        public ListResourceTypesResponseBodyResourceTypes setInfo(ListResourceTypesResponseBodyResourceTypesInfo info) {
            this.info = info;
            return this;
        }
        public ListResourceTypesResponseBodyResourceTypesInfo getInfo() {
            return this.info;
        }

        public ListResourceTypesResponseBodyResourceTypes setListOnlyProperties(java.util.List<String> listOnlyProperties) {
            this.listOnlyProperties = listOnlyProperties;
            return this;
        }
        public java.util.List<String> getListOnlyProperties() {
            return this.listOnlyProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setListResponseProperties(java.util.List<String> listResponseProperties) {
            this.listResponseProperties = listResponseProperties;
            return this;
        }
        public java.util.List<String> getListResponseProperties() {
            return this.listResponseProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setPrimaryIdentifier(String primaryIdentifier) {
            this.primaryIdentifier = primaryIdentifier;
            return this;
        }
        public String getPrimaryIdentifier() {
            return this.primaryIdentifier;
        }

        public ListResourceTypesResponseBodyResourceTypes setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public ListResourceTypesResponseBodyResourceTypes setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public ListResourceTypesResponseBodyResourceTypes setPublicProperties(java.util.List<String> publicProperties) {
            this.publicProperties = publicProperties;
            return this;
        }
        public java.util.List<String> getPublicProperties() {
            return this.publicProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setReadOnlyProperties(java.util.List<String> readOnlyProperties) {
            this.readOnlyProperties = readOnlyProperties;
            return this;
        }
        public java.util.List<String> getReadOnlyProperties() {
            return this.readOnlyProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setRequired(java.util.List<String> required) {
            this.required = required;
            return this;
        }
        public java.util.List<String> getRequired() {
            return this.required;
        }

        public ListResourceTypesResponseBodyResourceTypes setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public ListResourceTypesResponseBodyResourceTypes setSensitiveInfoProperties(java.util.List<String> sensitiveInfoProperties) {
            this.sensitiveInfoProperties = sensitiveInfoProperties;
            return this;
        }
        public java.util.List<String> getSensitiveInfoProperties() {
            return this.sensitiveInfoProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setUpdateOnlyProperties(java.util.List<String> updateOnlyProperties) {
            this.updateOnlyProperties = updateOnlyProperties;
            return this;
        }
        public java.util.List<String> getUpdateOnlyProperties() {
            return this.updateOnlyProperties;
        }

        public ListResourceTypesResponseBodyResourceTypes setUpdateTypeProperties(java.util.List<String> updateTypeProperties) {
            this.updateTypeProperties = updateTypeProperties;
            return this;
        }
        public java.util.List<String> getUpdateTypeProperties() {
            return this.updateTypeProperties;
        }

    }

}
