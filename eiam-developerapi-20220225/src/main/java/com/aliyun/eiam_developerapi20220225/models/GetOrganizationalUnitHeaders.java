// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetOrganizationalUnitHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    // 认证信息，格式:Bearer access_token
    @NameInMap("Authorization")
    public String authorization;

    public static GetOrganizationalUnitHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetOrganizationalUnitHeaders self = new GetOrganizationalUnitHeaders();
        return TeaModel.build(map, self);
    }

    public GetOrganizationalUnitHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetOrganizationalUnitHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
