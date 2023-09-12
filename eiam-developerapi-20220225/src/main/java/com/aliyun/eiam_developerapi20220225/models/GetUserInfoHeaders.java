// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetUserInfoHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The authentication information. Format: Bearer ${access_token}. Example: Bearer ATxxxx.</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    public static GetUserInfoHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetUserInfoHeaders self = new GetUserInfoHeaders();
        return TeaModel.build(map, self);
    }

    public GetUserInfoHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetUserInfoHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
