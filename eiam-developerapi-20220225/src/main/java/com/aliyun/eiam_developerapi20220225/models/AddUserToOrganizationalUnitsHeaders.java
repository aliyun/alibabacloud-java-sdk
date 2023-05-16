// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class AddUserToOrganizationalUnitsHeaders extends TeaModel {
    @NameInMap("commonHeaders")
    public java.util.Map<String, String> commonHeaders;

    @NameInMap("Authorization")
    public String authorization;

    public static AddUserToOrganizationalUnitsHeaders build(java.util.Map<String, ?> map) throws Exception {
        AddUserToOrganizationalUnitsHeaders self = new AddUserToOrganizationalUnitsHeaders();
        return TeaModel.build(map, self);
    }

    public AddUserToOrganizationalUnitsHeaders setCommonHeaders(java.util.Map<String, String> commonHeaders) {
        this.commonHeaders = commonHeaders;
        return this;
    }
    public java.util.Map<String, String> getCommonHeaders() {
        return this.commonHeaders;
    }

    public AddUserToOrganizationalUnitsHeaders setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }
    public String getAuthorization() {
        return this.authorization;
    }

}
