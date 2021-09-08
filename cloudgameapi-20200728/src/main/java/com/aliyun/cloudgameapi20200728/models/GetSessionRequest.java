// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class GetSessionRequest extends TeaModel {
    @NameInMap("Token")
    public String token;

    public static GetSessionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSessionRequest self = new GetSessionRequest();
        return TeaModel.build(map, self);
    }

    public GetSessionRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
