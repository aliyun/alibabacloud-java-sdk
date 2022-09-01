// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByUsernameHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("Authorization")
    public String authorization;

    public static GetUserIdByUsernameHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByUsernameHeaders self = new GetUserIdByUsernameHeaders();
        return TeaModel.build(map, self);
    }

    public GetUserIdByUsernameHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUserIdByUsernameHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
