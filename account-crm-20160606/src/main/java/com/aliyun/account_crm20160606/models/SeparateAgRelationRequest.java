// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class SeparateAgRelationRequest extends TeaModel {
    @NameInMap("Mpk")
    public String mpk;

    @NameInMap("Pk")
    public String pk;

    public static SeparateAgRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        SeparateAgRelationRequest self = new SeparateAgRelationRequest();
        return TeaModel.build(map, self);
    }

    public SeparateAgRelationRequest setMpk(String mpk) {
        this.mpk = mpk;
        return this;
    }
    public String getMpk() {
        return this.mpk;
    }

    public SeparateAgRelationRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
