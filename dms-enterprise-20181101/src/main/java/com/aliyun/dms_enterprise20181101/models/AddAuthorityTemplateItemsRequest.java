// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddAuthorityTemplateItemsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Items")
    public java.util.List<AddAuthorityTemplateItemsRequestItems> items;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15***</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static AddAuthorityTemplateItemsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthorityTemplateItemsRequest self = new AddAuthorityTemplateItemsRequest();
        return TeaModel.build(map, self);
    }

    public AddAuthorityTemplateItemsRequest setItems(java.util.List<AddAuthorityTemplateItemsRequestItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AddAuthorityTemplateItemsRequestItems> getItems() {
        return this.items;
    }

    public AddAuthorityTemplateItemsRequest setTemplateId(Long templateId) {
        this.templateId = templateId;
        return this;
    }
    public Long getTemplateId() {
        return this.templateId;
    }

    public AddAuthorityTemplateItemsRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public static class AddAuthorityTemplateItemsRequestItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2478****</p>
         */
        @NameInMap("DbId")
        public Integer dbId;

        /**
         * <strong>example:</strong>
         * <p>237****</p>
         */
        @NameInMap("InstanceId")
        public Integer instanceId;

        @NameInMap("PermissionTypes")
        public java.util.List<String> permissionTypes;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static AddAuthorityTemplateItemsRequestItems build(java.util.Map<String, ?> map) throws Exception {
            AddAuthorityTemplateItemsRequestItems self = new AddAuthorityTemplateItemsRequestItems();
            return TeaModel.build(map, self);
        }

        public AddAuthorityTemplateItemsRequestItems setDbId(Integer dbId) {
            this.dbId = dbId;
            return this;
        }
        public Integer getDbId() {
            return this.dbId;
        }

        public AddAuthorityTemplateItemsRequestItems setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public AddAuthorityTemplateItemsRequestItems setPermissionTypes(java.util.List<String> permissionTypes) {
            this.permissionTypes = permissionTypes;
            return this;
        }
        public java.util.List<String> getPermissionTypes() {
            return this.permissionTypes;
        }

        public AddAuthorityTemplateItemsRequestItems setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public AddAuthorityTemplateItemsRequestItems setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

}
