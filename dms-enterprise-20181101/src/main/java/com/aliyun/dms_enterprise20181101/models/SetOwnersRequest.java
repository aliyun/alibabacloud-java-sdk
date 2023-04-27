// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SetOwnersRequest extends TeaModel {
    /**
     * <p>The operation that you want to perform. Set the value to **SetOwners**.</p>
     */
    @NameInMap("OwnerIds")
    public String ownerIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("OwnerType")
    public String ownerType;

    /**
     * <p>The error code.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The ID of the user whom you want to specify as an owner. Separate multiple IDs with commas (,). You can call the [GetUser](~~147098~~) or [ListUsers](~~141938~~) operation to query the ID of the user.</p>
     * <br>
     * <p>>  The value of the OwnerIds parameter is that of the UserId parameter.</p>
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
