// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.grace20220606.models;

import com.aliyun.tea.*;

public class GetFileRequest extends TeaModel {
    @NameInMap("name")
    public String name;

    @NameInMap("token")
    public String token;

    public static GetFileRequest build(java.util.Map<String, ?> map) throws Exception {
        GetFileRequest self = new GetFileRequest();
        return TeaModel.build(map, self);
    }

    public GetFileRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetFileRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
