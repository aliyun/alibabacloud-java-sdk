// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class GetApplicationProvisioningScopeHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The authentication information. Format: Bearer ${access_token}. Example: Bearer ATxxxx.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Bearer AT8csE2seYxxxxxij</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    public static GetApplicationProvisioningScopeHeaders build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationProvisioningScopeHeaders self = new GetApplicationProvisioningScopeHeaders();
        return TeaModel.build(map, self);
    }

    public GetApplicationProvisioningScopeHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public GetApplicationProvisioningScopeHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
