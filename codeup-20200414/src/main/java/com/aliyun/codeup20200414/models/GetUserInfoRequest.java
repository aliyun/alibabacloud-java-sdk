// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class GetUserInfoRequest extends TeaModel {
    @NameInMap("AccessToken")
    public String accessToken;

    public static GetUserInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoRequest self = new GetUserInfoRequest();
        return TeaModel.build(map, self);
    }

    public GetUserInfoRequest setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }
    public String getAccessToken() {
        return this.accessToken;
    }

}
