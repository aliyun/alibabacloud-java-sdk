// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspace20191128.models;

import com.aliyun.tea.*;

public class CreateMemberTypeBySourceIdRequest extends TeaModel {
    @NameInMap("AuthId")
    public String authId;

    @NameInMap("Description")
    public String description;

    @NameInMap("IdentityType")
    public Long identityType;

    @NameInMap("Name")
    public String name;

    @NameInMap("TenantId")
    public String tenantId;

    public static CreateMemberTypeBySourceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMemberTypeBySourceIdRequest self = new CreateMemberTypeBySourceIdRequest();
        return TeaModel.build(map, self);
    }

    public CreateMemberTypeBySourceIdRequest setAuthId(String authId) {
        this.authId = authId;
        return this;
    }
    public String getAuthId() {
        return this.authId;
    }

    public CreateMemberTypeBySourceIdRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMemberTypeBySourceIdRequest setIdentityType(Long identityType) {
        this.identityType = identityType;
        return this;
    }
    public Long getIdentityType() {
        return this.identityType;
    }

    public CreateMemberTypeBySourceIdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateMemberTypeBySourceIdRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
