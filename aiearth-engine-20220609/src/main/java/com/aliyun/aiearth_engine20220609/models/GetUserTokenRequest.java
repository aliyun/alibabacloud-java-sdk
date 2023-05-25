// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiearth_engine20220609.models;

import com.aliyun.tea.*;

public class GetUserTokenRequest extends TeaModel {
    @NameInMap("ForceCreate")
    public Boolean forceCreate;

    public static GetUserTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserTokenRequest self = new GetUserTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetUserTokenRequest setForceCreate(Boolean forceCreate) {
        this.forceCreate = forceCreate;
        return this;
    }
    public Boolean getForceCreate() {
        return this.forceCreate;
    }

}
