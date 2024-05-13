// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SetOwnersRequest extends TeaModel {
    /**
     * <p>The ID of the user whom you want to specify as an owner. Separate multiple IDs with commas (,). You can call the [GetUser](https://help.aliyun.com/document_detail/147098.html) or [ListUsers](https://help.aliyun.com/document_detail/141938.html) operation to query the ID of the user.</p>
     * <br>
     * <p>>  The value of the OwnerIds parameter is that of the UserId parameter.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerIds")
    public String ownerIds;

    /**
     * <p>The type of the owner. Valid values:</p>
     * <br>
     * <p>*   INSTANCE: an owner of an instance.</p>
     * <p>*   DATABASE: an owner of a physical database.</p>
     * <p>*   LOGIC_DATABASE: an owner of a logical database.</p>
     * <p>*   TABLE: an owner of a physical table.</p>
     * <p>*   LOGIC_TABLE: an owner of a logical table.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The ID of the resource. The ID of the resource varies with the owner type. The owner types and resource IDs have the following mappings:</p>
     * <br>
     * <p>*   INSTANCE: the ID of an instance. You can call the [ListInstances](https://help.aliyun.com/document_detail/141936.html) operation to query the ID of the instance.</p>
     * <p>*   DATABASE: the ID of a physical database. You can call the [ListDatabases](https://help.aliyun.com/document_detail/141873.html) operation to query the ID of the physical database.</p>
     * <p>*   LOGIC_DATABASE: the ID of a logical database. You can call the [ListLogicDatabases](https://help.aliyun.com/document_detail/141874.html) operation to query the ID of the logical database.</p>
     * <p>*   TABLE: the ID of a physical table. You can call the [ListTables](https://help.aliyun.com/document_detail/141878.html) operation to query the ID of the physical table.</p>
     * <p>*   LOGIC_DATABASE: the ID of a logical table. You can call the [ListLogicTables](https://help.aliyun.com/document_detail/141875.html) operation to query the ID of the logical table.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](https://help.aliyun.com/document_detail/181330.html) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static SetOwnersRequest build(java.util.Map<String, ?> map) throws Exception {
        SetOwnersRequest self = new SetOwnersRequest();
        return TeaModel.build(map, self);
    }

    public SetOwnersRequest setOwnerIds(String ownerIds) {
        this.ownerIds = ownerIds;
        return this;
    }
    public String getOwnerIds() {
        return this.ownerIds;
    }

    public SetOwnersRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public SetOwnersRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public SetOwnersRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
