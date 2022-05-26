// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class GetAgRelationRequest extends TeaModel {
    @NameInMap("AgAccountType")
    public String agAccountType;

    @NameInMap("Pk")
    public String pk;

    public static GetAgRelationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAgRelationRequest self = new GetAgRelationRequest();
        return TeaModel.build(map, self);
    }

    public GetAgRelationRequest setAgAccountType(String agAccountType) {
        this.agAccountType = agAccountType;
        return this;
    }
    public String getAgAccountType() {
        return this.agAccountType;
    }

    public GetAgRelationRequest setPk(String pk) {
        this.pk = pk;
        return this;
    }
    public String getPk() {
        return this.pk;
    }

}
