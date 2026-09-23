// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class PatchOrganizationalUnitParentIdHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    /**
     * <p>The authentication information. Format: Bearer access_token.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Bearer xxxx</p>
     */
    @NameInMap("Authorization")
    public String authorization;

    public static PatchOrganizationalUnitParentIdHeaders build(java.util.Map<String, ?> map) throws Exception {
        PatchOrganizationalUnitParentIdHeaders self = new PatchOrganizationalUnitParentIdHeaders();
        return TeaModel.build(map, self);
    }

    public PatchOrganizationalUnitParentIdHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public PatchOrganizationalUnitParentIdHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
