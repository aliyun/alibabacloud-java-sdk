// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddAuthorityTemplateItemsRequest extends TeaModel {
    /**
     * <p>The resources that you want to add to the permission template.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Items")
    public java.util.List<AddAuthorityTemplateItemsRequestItems> items;

    /**
     * <p>The ID of the permission template. You can call the <a href="https://help.aliyun.com/document_detail/600705.html">CreateAuthorityTemplate</a> operation to obtain the value of this parameter.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>15***</p>
     */
    @NameInMap("TemplateId")
    public Long templateId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p>To view the tenant ID, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
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
         * <p>The database ID. Databases are divided into physical databases and logical databases.</p>
         * <ul>
         * <li>To query the ID of a physical database, call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * <li>To query the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is required if the ResourceType parameter is set to META_DB, LOGIC_DB, META_TABLE, or LOGIC_TABLE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>2478****</p>
         */
        @NameInMap("DbId")
        public Integer dbId;

        /**
         * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the instance ID.</p>
         * <blockquote>
         * <p>This parameter is required if the ResourceType parameter is set to INSTANCE.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>237****</p>
         */
        @NameInMap("InstanceId")
        public Integer instanceId;

        /**
         * <p>The permission types.</p>
         */
        @NameInMap("PermissionTypes")
        public java.util.List<String> permissionTypes;

        /**
         * <p>The type of the resource from which you want to remove tags. Valid values:</p>
         * <ul>
         * <li><strong>INSTANCE</strong>: instance</li>
         * <li><strong>LOGIC_DB</strong>: logical database</li>
         * <li><strong>META_DB</strong>: physical database</li>
         * <li><strong>LOGIC_TABLE</strong>: logical table</li>
         * <li><strong>LOGIC_TABLE</strong>: physical table</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        @NameInMap("ResourceType")
        public String resourceType;

        /**
         * <p>The table name. You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the name of the table.</p>
         * <blockquote>
         * <p>This parameter is required if the ResourceType parameter is set to META_TABLE or LOGIC_TABLE.</p>
         * </blockquote>
         * 
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
