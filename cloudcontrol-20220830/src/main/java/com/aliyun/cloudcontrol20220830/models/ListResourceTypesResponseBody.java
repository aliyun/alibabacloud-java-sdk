// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudcontrol20220830.models;

import com.aliyun.tea.*;

public class ListResourceTypesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.</p>
     * 
     * <strong>example:</strong>
     * <p>ECS::Disk</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The ID of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The information about the resource types.</p>
     */
    @NameInMap("resourceTypes")
    public java.util.List<ListResourceTypesResponseBodyResourceTypes> resourceTypes;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
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
        /**
         * <p>The RAM permissions required.</p>
         */
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
        /**
         * <p>The RAM permissions required.</p>
         */
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
        /**
         * <p>The RAM permissions required.</p>
         */
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
        /**
         * <p>The RAM permissions required.</p>
         */
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
        /**
         * <p>The RAM permissions required.</p>
         */
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
        /**
         * <p>The information about the create operation.</p>
         */
        @NameInMap("create")
        public ListResourceTypesResponseBodyResourceTypesHandlersCreate create;

        /**
         * <p>The information about the delete operation.</p>
         */
        @NameInMap("delete")
        public ListResourceTypesResponseBodyResourceTypesHandlersDelete delete;

        /**
         * <p>The information about the query operation.</p>
         */
        @NameInMap("get")
        public ListResourceTypesResponseBodyResourceTypesHandlersGet get;

        /**
         * <p>The information about the list operation.</p>
         */
        @NameInMap("list")
        public ListResourceTypesResponseBodyResourceTypesHandlersList list;

        /**
         * <p>The information about the update operation.</p>
         */
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
        /**
         * <p>Billing method\
         * paid free</p>
         * 
         * <strong>example:</strong>
         * <p>paid</p>
         */
        @NameInMap("chargeType")
        public String chargeType;

        /**
         * <p>The deployment level of the resource.</p>
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
        public ListResourceTypesResponseBodyResourceTypesHandlers handlers;

        /**
         * <p>The information about the resource type.</p>
         */
        @NameInMap("info")
        public ListResourceTypesResponseBodyResourceTypesInfo info;

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
         * <p>The read-only properties. These properties are returned only when you list or query the resource. You do not need to specify these properties when you create or update the resource.</p>
         */
        @NameInMap("readOnlyProperties")
        public java.util.List<String> readOnlyProperties;

        /**
         * <p>The properties that must be specified when you create the resource.</p>
         */
        @NameInMap("required")
        public java.util.List<String> required;

        /**
         * <p>The resource type.</p>
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
