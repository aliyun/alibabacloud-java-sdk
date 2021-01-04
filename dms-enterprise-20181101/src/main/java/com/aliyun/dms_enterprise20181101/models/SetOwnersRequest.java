// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SetOwnersRequest extends TeaModel {
    @NameInMap("Tid")
    public Long tid;

    @NameInMap("ResourceId")
    public String resourceId;

    @NameInMap("OwnerType")
    public String ownerType;

    @NameInMap("OwnerIds")
    public String ownerIds;

    public static SetOwnersRequest build(java.util.Map<String, ?> map) throws Exception {
        SetOwnersRequest self = new SetOwnersRequest();
        return TeaModel.build(map, self);
    }

    public SetOwnersRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public SetOwnersRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public SetOwnersRequest setOwnerType(String ownerType) {
        this.ownerType = ownerType;
        return this;
    }
    public String getOwnerType() {
        return this.ownerType;
    }

    public SetOwnersRequest setOwnerIds(String ownerIds) {
        this.ownerIds = ownerIds;
        return this;
    }
    public String getOwnerIds() {
        return this.ownerIds;
    }

}
