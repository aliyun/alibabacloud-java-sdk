// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource type. Valid values:</p>
     */
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
        /**
         * <p>The information about the required RAM permissions.</p>
         */
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
        /**
         * <p>The information about the required RAM permissions.</p>
         */
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
        /**
         * <p>The information about the required RAM permissions.</p>
         */
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
        /**
         * <p>The information about the required RAM permissions.</p>
         */
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
        /**
         * <p>The information about the required RAM permissions.</p>
         */
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
        /**
         * <p>The information about the create operation.</p>
         */
        @NameInMap("create")
        public GetResourceTypeResponseBodyResourceTypeHandlersCreate create;

        /**
         * <p>The information about the delete operation.</p>
         */
        @NameInMap("delete")
        public GetResourceTypeResponseBodyResourceTypeHandlersDelete delete;

        /**
         * <p>The information about the query operation.</p>
         */
        @NameInMap("get")
        public GetResourceTypeResponseBodyResourceTypeHandlersGet get;

        /**
         * <p>The information about the list operation.</p>
         */
        @NameInMap("list")
        public GetResourceTypeResponseBodyResourceTypeHandlersList list;

        /**
         * <p>The information about the update operation.</p>
         */
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
        /**
         * <p>The payment form. Valid values:</p>
         * <p>paid free</p>
         * 
         * <strong>example:</strong>
         * <p>paid</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The delivery level. Valid values:</p>
         * <p>center</p>
         * <p>region</p>
         * <p>zone</p>
         * 
         * <strong>example:</strong>
         * <p>region</p>
         */
        @NameInMap("deliveryScope")
        public String deliveryScope;

        /**
         * <p>The description of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>An ECS instance is equivalent to a virtual machine, including the most basic computing components such as CPU, memory, operating system, network, and disk. You can easily customize and change the configuration of the instance. You have full control over the virtual machine.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The name of the resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
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
        /**
         * <p>The properties that are specific to the create operation. You need to specify these properties when you create the resource. These properties are not returned when you query the resource.</p>
         */
        @NameInMap("createOnlyProperties")
        public java.util.List<String> createOnlyProperties;

        /**
         * <p>The properties that are specific to the delete operation. You need to specify these properties when you delete the resource. These properties are not returned when you query the resource.</p>
         */
        @NameInMap("deleteOnlyProperties")
        public java.util.List<String> deleteOnlyProperties;

        /**
         * <p>The properties that can be used to filter the resource when you list the resource.</p>
         */
        @NameInMap("filterProperties")
        public java.util.List<String> filterProperties;

        /**
         * <p>The properties that are specific to the query operation. You need to specify these properties when you query the resource. These properties are not returned in the query result.</p>
         */
        @NameInMap("getOnlyProperties")
        public java.util.List<String> getOnlyProperties;

        /**
         * <p>The properties that are returned when you query the resource.</p>
         */
        @NameInMap("getResponseProperties")
        public java.util.List<String> getResponseProperties;

        /**
         * <p>The information about the operation, including the required Resource Access Management (RAM) permissions.</p>
         */
        @NameInMap("handlers")
        public GetResourceTypeResponseBodyResourceTypeHandlers handlers;

        /**
         * <p>The basic information about the resource type.</p>
         */
        @NameInMap("info")
        public GetResourceTypeResponseBodyResourceTypeInfo info;

        /**
         * <p>The properties that are specific to the list operation. You need to specify these properties when you list the resource. These properties are not returned when you query the resource.</p>
         */
        @NameInMap("listOnlyProperties")
        public java.util.List<String> listOnlyProperties;

        /**
         * <p>The properties that are returned when you list the resource.</p>
         */
        @NameInMap("listResponseProperties")
        public java.util.List<String> listResponseProperties;

        /**
         * <p>The ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>/properties/InstanceId</p>
         */
        @NameInMap("primaryIdentifier")
        public String primaryIdentifier;

        /**
         * <p>The code of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The resource properties. The key specifies the property name and the value specifies the details of the property.</p>
         */
        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>The common properties of the resource. The common properties are not operation-specific.</p>
         */
        @NameInMap("publicProperties")
        public java.util.List<String> publicProperties;

        /**
         * <p>The read-only properties. These properties are returned only when you perform the List or Get operation. You do not need to specify these properties when you create or update the resource.</p>
         */
        @NameInMap("readOnlyProperties")
        public java.util.List<String> readOnlyProperties;

        /**
         * <p>The properties that must be specified when you create the resource.</p>
         */
        @NameInMap("required")
        public java.util.List<String> required;

        /**
         * <p>The type of the resource. If the resource belongs to a parent resource, the return format is {parent resource type code /resource type code}.</p>
         * 
         * <strong>example:</strong>
         * <p>Instance</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The sensitive properties, such as the password.</p>
         */
        @NameInMap("sensitiveInfoProperties")
        public java.util.List<String> sensitiveInfoProperties;

        /**
         * <p>The properties that are specific to the update operation. You need to specify these properties when you update the resource. These properties are not returned when you query the resource.</p>
         */
        @NameInMap("updateOnlyProperties")
        public java.util.List<String> updateOnlyProperties;

        /**
         * <p>The properties that can be modified.</p>
         */
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

        public GetResourceTypeResponseBodyResourceType setGetResponseProperties(java.util.List<String> getResponseProperties) {
            this.getResponseProperties = getResponseProperties;
            return this;
        }
        public java.util.List<String> getGetResponseProperties() {
            return this.getResponseProperties;
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

        public GetResourceTypeResponseBodyResourceType setListResponseProperties(java.util.List<String> listResponseProperties) {
            this.listResponseProperties = listResponseProperties;
            return this;
        }
        public java.util.List<String> getListResponseProperties() {
            return this.listResponseProperties;
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
