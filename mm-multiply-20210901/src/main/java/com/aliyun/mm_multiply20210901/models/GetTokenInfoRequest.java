// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class GetTokenInfoRequest extends TeaModel {
    // token
    @NameInMap("Token")
    public String token;

    public static GetTokenInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTokenInfoRequest self = new GetTokenInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetTokenInfoRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
