// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ciomarketpop20250709.models;

import com.aliyun.tea.*;

public class GetEveryOneSellsFormListRequest extends TeaModel {
    @NameInMap("Auth")
    public String auth;

    public static GetEveryOneSellsFormListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEveryOneSellsFormListRequest self = new GetEveryOneSellsFormListRequest();
        return TeaModel.build(map, self);
    }

    public GetEveryOneSellsFormListRequest setAuth(String auth) {
        this.auth = auth;
        return this;
    }
    public String getAuth() {
        return this.auth;
    }

}
