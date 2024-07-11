// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SetOwnersRequest extends TeaModel {
    /**
     * <p>The ID of the user whom you want to specify as an owner. Separate multiple IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> or <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> operation to query the ID of the user.</p>
     * <blockquote>
     * <p> The value of the OwnerIds parameter is that of the UserId parameter.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51****</p>
     */
    @NameInMap("OwnerIds")
    public String ownerIds;

    /**
     * <p>The type of the owner. Valid values:</p>
     * <ul>
     * <li>INSTANCE: an owner of an instance.</li>
     * <li>DATABASE: an owner of a physical database.</li>
     * <li>LOGIC_DATABASE: an owner of a logical database.</li>
     * <li>TABLE: an owner of a physical table.</li>
     * <li>LOGIC_TABLE: an owner of a logical table.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>INSTANCE</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The ID of the resource. The ID of the resource varies with the owner type. The owner types and resource IDs have the following mappings:</p>
     * <ul>
     * <li>INSTANCE: the ID of an instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> operation to query the ID of the instance.</li>
     * <li>DATABASE: the ID of a physical database. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to query the ID of the physical database.</li>
     * <li>LOGIC_DATABASE: the ID of a logical database. You can call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to query the ID of the logical database.</li>
     * <li>TABLE: the ID of a physical table. You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the ID of the physical table.</li>
     * <li>LOGIC_DATABASE: the ID of a logical table. You can call the <a href="https://help.aliyun.com/document_detail/141875.html">ListLogicTables</a> operation to query the ID of the logical table.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>174****</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the &quot;View information about the current tenant&quot; section of the <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a> topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
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
