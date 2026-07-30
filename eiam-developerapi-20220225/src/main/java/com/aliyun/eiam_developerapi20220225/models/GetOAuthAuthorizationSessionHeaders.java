// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOAuthAuthorizationSessionHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The authentication information. Format: Bearer ${access_token}.</p>
     * <blockquote>
     * <p>Enter the Access Token issued by IDaaS.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Bearer xxxxxx</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    public static GetOAuthAuthorizationSessionHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetOAuthAuthorizationSessionHeaders self = new GetOAuthAuthorizationSessionHeaders();
        return TeaModel.build(map, self);
    }

    public GetOAuthAuthorizationSessionHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetOAuthAuthorizationSessionHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
