// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetProjectByTokenRequest extends TeaModel {
    @NameInMap("Token")
    public String token;

    public static GetProjectByTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        GetProjectByTokenRequest self = new GetProjectByTokenRequest();
        return TeaModel.build(map, self);
    }

    public GetProjectByTokenRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
