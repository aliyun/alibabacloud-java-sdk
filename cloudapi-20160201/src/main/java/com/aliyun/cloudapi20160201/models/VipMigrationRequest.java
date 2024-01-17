// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class VipMigrationRequest extends TeaModel {
    @NameInMap("NewVip")
    public String newVip;

    @NameInMap("OriginalVip")
    public String originalVip;

    public static VipMigrationRequest build(java.util.Map<String, ?> map) throws Exception {
        VipMigrationRequest self = new VipMigrationRequest();
        return TeaModel.build(map, self);
    }

    public VipMigrationRequest setNewVip(String newVip) {
        this.newVip = newVip;
        return this;
    }
    public String getNewVip() {
        return this.newVip;
    }

    public VipMigrationRequest setOriginalVip(String originalVip) {
        this.originalVip = originalVip;
        return this;
    }
    public String getOriginalVip() {
        return this.originalVip;
    }

}
