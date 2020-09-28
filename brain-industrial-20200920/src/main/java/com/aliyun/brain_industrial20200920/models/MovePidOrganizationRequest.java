// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class MovePidOrganizationRequest extends TeaModel {
    @NameInMap("OrganizationId")
    @Validation(required = true)
    public String organizationId;

    @NameInMap("MoveType")
    @Validation(required = true)
    public String moveType;

    public static MovePidOrganizationRequest build(java.util.Map<String, ?> map) throws Exception {
        MovePidOrganizationRequest self = new MovePidOrganizationRequest();
        return TeaModel.build(map, self);
    }

    public MovePidOrganizationRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public MovePidOrganizationRequest setMoveType(String moveType) {
        this.moveType = moveType;
        return this;
    }
    public String getMoveType() {
        return this.moveType;
    }

}
