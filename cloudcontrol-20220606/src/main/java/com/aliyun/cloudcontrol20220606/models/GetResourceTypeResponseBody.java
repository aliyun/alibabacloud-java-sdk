// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220606.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resourceType")
    public GetResourceTypeResponseBodyResourceType resourceType;

    public static GetResourceTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetResourceTypeResponseBody self = new GetResourceTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetResourceTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetResourceTypeResponseBody setResourceType(GetResourceTypeResponseBodyResourceType resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public GetResourceTypeResponseBodyResourceType getResourceType() {
        return this.resourceType;
    }

    public static class GetResourceTypeResponseBodyResourceTypeHandlersCreate extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static GetResourceTypeResponseBodyResourceTypeHandlersCreate build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceTypeHandlersCreate self = new GetResourceTypeResponseBodyResourceTypeHandlersCreate();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceTypeHandlersCreate setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class GetResourceTypeResponseBodyResourceTypeHandlersDelete extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static GetResourceTypeResponseBodyResourceTypeHandlersDelete build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceTypeHandlersDelete self = new GetResourceTypeResponseBodyResourceTypeHandlersDelete();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceTypeHandlersDelete setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class GetResourceTypeResponseBodyResourceTypeHandlersGet extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static GetResourceTypeResponseBodyResourceTypeHandlersGet build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceTypeHandlersGet self = new GetResourceTypeResponseBodyResourceTypeHandlersGet();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceTypeHandlersGet setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class GetResourceTypeResponseBodyResourceTypeHandlersList extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static GetResourceTypeResponseBodyResourceTypeHandlersList build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceTypeHandlersList self = new GetResourceTypeResponseBodyResourceTypeHandlersList();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceTypeHandlersList setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class GetResourceTypeResponseBodyResourceTypeHandlersUpdate extends TeaModel {
        @NameInMap("permissions")
        public java.util.List<String> permissions;

        public static GetResourceTypeResponseBodyResourceTypeHandlersUpdate build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceTypeHandlersUpdate self = new GetResourceTypeResponseBodyResourceTypeHandlersUpdate();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceTypeHandlersUpdate setPermissions(java.util.List<String> permissions) {
            this.permissions = permissions;
            return this;
        }
        public java.util.List<String> getPermissions() {
            return this.permissions;
        }

    }

    public static class GetResourceTypeResponseBodyResourceTypeHandlers extends TeaModel {
        @NameInMap("create")
        public GetResourceTypeResponseBodyResourceTypeHandlersCreate create;

        @NameInMap("delete")
        public GetResourceTypeResponseBodyResourceTypeHandlersDelete delete;

        @NameInMap("get")
        public GetResourceTypeResponseBodyResourceTypeHandlersGet get;

        @NameInMap("list")
        public GetResourceTypeResponseBodyResourceTypeHandlersList list;

        @NameInMap("update")
        public GetResourceTypeResponseBodyResourceTypeHandlersUpdate update;

        public static GetResourceTypeResponseBodyResourceTypeHandlers build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceTypeHandlers self = new GetResourceTypeResponseBodyResourceTypeHandlers();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceTypeHandlers setCreate(GetResourceTypeResponseBodyResourceTypeHandlersCreate create) {
            this.create = create;
            return this;
        }
        public GetResourceTypeResponseBodyResourceTypeHandlersCreate getCreate() {
            return this.create;
        }

        public GetResourceTypeResponseBodyResourceTypeHandlers setDelete(GetResourceTypeResponseBodyResourceTypeHandlersDelete delete) {
            this.delete = delete;
            return this;
        }
        public GetResourceTypeResponseBodyResourceTypeHandlersDelete getDelete() {
            return this.delete;
        }

        public GetResourceTypeResponseBodyResourceTypeHandlers setGet(GetResourceTypeResponseBodyResourceTypeHandlersGet get) {
            this.get = get;
            return this;
        }
        public GetResourceTypeResponseBodyResourceTypeHandlersGet getGet() {
            return this.get;
        }

        public GetResourceTypeResponseBodyResourceTypeHandlers setList(GetResourceTypeResponseBodyResourceTypeHandlersList list) {
            this.list = list;
            return this;
        }
        public GetResourceTypeResponseBodyResourceTypeHandlersList getList() {
            return this.list;
        }

        public GetResourceTypeResponseBodyResourceTypeHandlers setUpdate(GetResourceTypeResponseBodyResourceTypeHandlersUpdate update) {
            this.update = update;
            return this;
        }
        public GetResourceTypeResponseBodyResourceTypeHandlersUpdate getUpdate() {
            return this.update;
        }

    }

    public static class GetResourceTypeResponseBodyResourceTypeInfo extends TeaModel {
        @NameInMap("chargeType")
        public String chargeType;

        @NameInMap("deliveryScope")
        public String deliveryScope;

        @NameInMap("description")
        public String description;

        @NameInMap("title")
        public String title;

        public static GetResourceTypeResponseBodyResourceTypeInfo build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceTypeInfo self = new GetResourceTypeResponseBodyResourceTypeInfo();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceTypeInfo setChargeType(String chargeType) {
            this.chargeType = chargeType;
            return this;
        }
        public String getChargeType() {
            return this.chargeType;
        }

        public GetResourceTypeResponseBodyResourceTypeInfo setDeliveryScope(String deliveryScope) {
            this.deliveryScope = deliveryScope;
            return this;
        }
        public String getDeliveryScope() {
            return this.deliveryScope;
        }

        public GetResourceTypeResponseBodyResourceTypeInfo setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetResourceTypeResponseBodyResourceTypeInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetResourceTypeResponseBodyResourceType extends TeaModel {
        @NameInMap("createOnlyProperties")
        public java.util.List<String> createOnlyProperties;

        @NameInMap("deleteOnlyProperties")
        public java.util.List<String> deleteOnlyProperties;

        @NameInMap("filterProperties")
        public java.util.List<String> filterProperties;

        @NameInMap("getOnlyProperties")
        public java.util.List<String> getOnlyProperties;

        @NameInMap("handlers")
        public GetResourceTypeResponseBodyResourceTypeHandlers handlers;

        @NameInMap("info")
        public GetResourceTypeResponseBodyResourceTypeInfo info;

        @NameInMap("listOnlyProperties")
        public java.util.List<String> listOnlyProperties;

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

        @NameInMap("resourceTypeVersion")
        public String resourceTypeVersion;

        @NameInMap("sensitiveInfoProperties")
        public java.util.List<String> sensitiveInfoProperties;

        @NameInMap("updateOnlyProperties")
        public java.util.List<String> updateOnlyProperties;

        @NameInMap("updateTypeProperties")
        public java.util.List<String> updateTypeProperties;

        public static GetResourceTypeResponseBodyResourceType build(java.util.Map<String, ?> map) throws Exception {
            GetResourceTypeResponseBodyResourceType self = new GetResourceTypeResponseBodyResourceType();
            return TeaModel.build(map, self);
        }

        public GetResourceTypeResponseBodyResourceType setCreateOnlyProperties(java.util.List<String> createOnlyProperties) {
            this.createOnlyProperties = createOnlyProperties;
            return this;
        }
        public java.util.List<String> getCreateOnlyProperties() {
            return this.createOnlyProperties;
        }

        public GetResourceTypeResponseBodyResourceType setDeleteOnlyProperties(java.util.List<String> deleteOnlyProperties) {
            this.deleteOnlyProperties = deleteOnlyProperties;
            return this;
        }
        public java.util.List<String> getDeleteOnlyProperties() {
            return this.deleteOnlyProperties;
        }

        public GetResourceTypeResponseBodyResourceType setFilterProperties(java.util.List<String> filterProperties) {
            this.filterProperties = filterProperties;
            return this;
        }
        public java.util.List<String> getFilterProperties() {
            return this.filterProperties;
        }

        public GetResourceTypeResponseBodyResourceType setGetOnlyProperties(java.util.List<String> getOnlyProperties) {
            this.getOnlyProperties = getOnlyProperties;
            return this;
        }
        public java.util.List<String> getGetOnlyProperties() {
            return this.getOnlyProperties;
        }

        public GetResourceTypeResponseBodyResourceType setHandlers(GetResourceTypeResponseBodyResourceTypeHandlers handlers) {
            this.handlers = handlers;
            return this;
        }
        public GetResourceTypeResponseBodyResourceTypeHandlers getHandlers() {
            return this.handlers;
        }

        public GetResourceTypeResponseBodyResourceType setInfo(GetResourceTypeResponseBodyResourceTypeInfo info) {
            this.info = info;
            return this;
        }
        public GetResourceTypeResponseBodyResourceTypeInfo getInfo() {
            return this.info;
        }

        public GetResourceTypeResponseBodyResourceType setListOnlyProperties(java.util.List<String> listOnlyProperties) {
            this.listOnlyProperties = listOnlyProperties;
            return this;
        }
        public java.util.List<String> getListOnlyProperties() {
            return this.listOnlyProperties;
        }

        public GetResourceTypeResponseBodyResourceType setPrimaryIdentifier(String primaryIdentifier) {
            this.primaryIdentifier = primaryIdentifier;
            return this;
        }
        public String getPrimaryIdentifier() {
            return this.primaryIdentifier;
        }

        public GetResourceTypeResponseBodyResourceType setProduct(String product) {
            this.product = product;
            return this;
        }
        public String getProduct() {
            return this.product;
        }

        public GetResourceTypeResponseBodyResourceType setProperties(java.util.Map<String, ?> properties) {
            this.properties = properties;
            return this;
        }
        public java.util.Map<String, ?> getProperties() {
            return this.properties;
        }

        public GetResourceTypeResponseBodyResourceType setPublicProperties(java.util.List<String> publicProperties) {
            this.publicProperties = publicProperties;
            return this;
        }
        public java.util.List<String> getPublicProperties() {
            return this.publicProperties;
        }

        public GetResourceTypeResponseBodyResourceType setReadOnlyProperties(java.util.List<String> readOnlyProperties) {
            this.readOnlyProperties = readOnlyProperties;
            return this;
        }
        public java.util.List<String> getReadOnlyProperties() {
            return this.readOnlyProperties;
        }

        public GetResourceTypeResponseBodyResourceType setRequired(java.util.List<String> required) {
            this.required = required;
            return this;
        }
        public java.util.List<String> getRequired() {
            return this.required;
        }

        public GetResourceTypeResponseBodyResourceType setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetResourceTypeResponseBodyResourceType setResourceTypeVersion(String resourceTypeVersion) {
            this.resourceTypeVersion = resourceTypeVersion;
            return this;
        }
        public String getResourceTypeVersion() {
            return this.resourceTypeVersion;
        }

        public GetResourceTypeResponseBodyResourceType setSensitiveInfoProperties(java.util.List<String> sensitiveInfoProperties) {
            this.sensitiveInfoProperties = sensitiveInfoProperties;
            return this;
        }
        public java.util.List<String> getSensitiveInfoProperties() {
            return this.sensitiveInfoProperties;
        }

        public GetResourceTypeResponseBodyResourceType setUpdateOnlyProperties(java.util.List<String> updateOnlyProperties) {
            this.updateOnlyProperties = updateOnlyProperties;
            return this;
        }
        public java.util.List<String> getUpdateOnlyProperties() {
            return this.updateOnlyProperties;
        }

        public GetResourceTypeResponseBodyResourceType setUpdateTypeProperties(java.util.List<String> updateTypeProperties) {
            this.updateTypeProperties = updateTypeProperties;
            return this;
        }
        public java.util.List<String> getUpdateTypeProperties() {
            return this.updateTypeProperties;
        }

    }

}
