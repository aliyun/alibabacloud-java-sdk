// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class RemoveUserFromOrganizationalUnitsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("Authorization")
    public String authorization;

    public static RemoveUserFromOrganizationalUnitsHeaders build(java.util.Map<String, ?> map) throws Exception {
        RemoveUserFromOrganizationalUnitsHeaders self = new RemoveUserFromOrganizationalUnitsHeaders();
        return TeaModel.build(map, self);
    }

    public RemoveUserFromOrganizationalUnitsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public RemoveUserFromOrganizationalUnitsHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
