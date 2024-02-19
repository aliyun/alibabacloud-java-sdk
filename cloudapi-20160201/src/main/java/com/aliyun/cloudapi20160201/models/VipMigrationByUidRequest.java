// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VipMigrationByUidRequest extends TeaModel {
    @NameInMap("NewVip")
    public String newVip;

    @NameInMap("OriginalVip")
    public String originalVip;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static VipMigrationByUidRequest build(java.util.Map<String, ?> map) throws Exception {
        VipMigrationByUidRequest self = new VipMigrationByUidRequest();
        return TeaModel.build(map, self);
    }

    public VipMigrationByUidRequest setNewVip(String newVip) {
        this.newVip = newVip;
        return this;
    }
    public String getNewVip() {
        return this.newVip;
    }

    public VipMigrationByUidRequest setOriginalVip(String originalVip) {
        this.originalVip = originalVip;
        return this;
    }
    public String getOriginalVip() {
        return this.originalVip;
    }

    public VipMigrationByUidRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
