// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserIdByEmailHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("Authorization")
    public String authorization;

    public static GetUserIdByEmailHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByEmailHeaders self = new GetUserIdByEmailHeaders();
        return TeaModel.build(map, self);
    }

    public GetUserIdByEmailHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUserIdByEmailHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
