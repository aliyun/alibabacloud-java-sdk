// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class GetResourceTypeResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>No parent resource:
     * Instance
     * Has parent resource:
     * DBInstance/Account</p>
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
         * <p>The required RAM permissions.</p>
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
         * <p>The required RAM permissions.</p>
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
         * <p>The required RAM permissions.</p>
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
         * <p>The required RAM permissions.</p>
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
         * <p>The required RAM permissions.</p>
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
         * <p>The information associated with the create operation.</p>
         */
        @NameInMap("create")
        public GetResourceTypeResponseBodyResourceTypeHandlersCreate create;

        /**
         * <p>The information associated with the delete operation.</p>
         */
        @NameInMap("delete")
        public GetResourceTypeResponseBodyResourceTypeHandlersDelete delete;

        /**
         * <p>The information associated with the get operation.</p>
         */
        @NameInMap("get")
        public GetResourceTypeResponseBodyResourceTypeHandlersGet get;

        /**
         * <p>The information associated with the list operation.</p>
         */
        @NameInMap("list")
        public GetResourceTypeResponseBodyResourceTypeHandlersList list;

        /**
         * <p>The information associated with the update operation.</p>
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
         * <p>The billing method. Valid values:</p>
         * <p>paid: paid.</p>
         * <p>free: free.</p>
         * 
         * <strong>example:</strong>
         * <p>paid</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The delivery scope. Valid values: </p>
         * <p>center: centralized deployment.</p>
         * <p>region: region-level deployment.</p>
         * <p>zone: zone-level deployment.</p>
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
         * <p>The properties exclusive to the create operation. These properties are not returned in resource query operations but are required as input parameters for the create operation.</p>
         */
        @NameInMap("createOnlyProperties")
        public java.util.List<String> createOnlyProperties;

        /**
         * <p>The properties exclusive to the delete operation. These properties are not returned in resource query operations but are required as input parameters for the delete operation.</p>
         */
        @NameInMap("deleteOnlyProperties")
        public java.util.List<String> deleteOnlyProperties;

        /**
         * <p>The properties that can be used as filter parameters in the list operation.</p>
         */
        @NameInMap("filterProperties")
        public java.util.List<String> filterProperties;

        /**
         * <p>The properties exclusive to the get operation. These properties are not returned in resource query operations but are required as input parameters for the get operation.</p>
         */
        @NameInMap("getOnlyProperties")
        public java.util.List<String> getOnlyProperties;

        /**
         * <p>The properties returned by the get operation.</p>
         */
        @NameInMap("getResponseProperties")
        public java.util.List<String> getResponseProperties;

        /**
         * <p>The supported resource operations, including RAM permissions.</p>
         */
        @NameInMap("handlers")
        public GetResourceTypeResponseBodyResourceTypeHandlers handlers;

        /**
         * <p>The basic information about the resource type.</p>
         */
        @NameInMap("info")
        public GetResourceTypeResponseBodyResourceTypeInfo info;

        /**
         * <p>The properties exclusive to the list operation. These properties are not returned in resource query operations but are required as input parameters for the list operation.</p>
         */
        @NameInMap("listOnlyProperties")
        public java.util.List<String> listOnlyProperties;

        /**
         * <p>The properties returned by the list operation.</p>
         */
        @NameInMap("listResponseProperties")
        public java.util.List<String> listResponseProperties;

        /**
         * <p>The resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>/properties/InstanceId</p>
         */
        @NameInMap("primaryIdentifier")
        public String primaryIdentifier;

        /**
         * <p>The product code.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("product")
        public String product;

        /**
         * <p>The resource property definitions. The key is the property name, and the value is the detailed property information.</p>
         */
        @NameInMap("properties")
        public java.util.Map<String, ?> properties;

        /**
         * <p>The common properties that represent basic resource attributes. These are not operation-specific properties.</p>
         */
        @NameInMap("publicProperties")
        public java.util.List<String> publicProperties;

        /**
         * <p>The read-only properties. These properties are returned only in list or get operations and cannot be used as input parameters for create or update operations.</p>
         */
        @NameInMap("readOnlyProperties")
        public java.util.List<String> readOnlyProperties;

        /**
         * <p>The required parameters for resource creation.</p>
         */
        @NameInMap("required")
        public java.util.List<String> required;

        /**
         * <p>The resource type. If the resource has a parent resource, the format is {parentResourceTypeCode/resourceTypeCode}.</p>
         * 
         * <strong>example:</strong>
         * <p>无父资源：
         * Instance
         * 有父资源：
         * DBInstance/Account</p>
         */
        @NameInMap("resourceType")
        public String resourceType;

        /**
         * <p>The sensitive properties, such as passwords.</p>
         */
        @NameInMap("sensitiveInfoProperties")
        public java.util.List<String> sensitiveInfoProperties;

        /**
         * <p>The properties exclusive to the update operation. These properties are not returned in resource query operations but are required as input parameters for the update operation.</p>
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
