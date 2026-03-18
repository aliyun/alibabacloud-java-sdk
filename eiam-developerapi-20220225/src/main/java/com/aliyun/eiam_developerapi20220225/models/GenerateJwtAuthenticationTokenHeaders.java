// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GenerateJwtAuthenticationTokenHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Bearer xxxxxx</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    public static GenerateJwtAuthenticationTokenHeaders build(java.util.Map<String, ?> map) throws Exception {
        GenerateJwtAuthenticationTokenHeaders self = new GenerateJwtAuthenticationTokenHeaders();
        return TeaModel.build(map, self);
    }

    public GenerateJwtAuthenticationTokenHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GenerateJwtAuthenticationTokenHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
