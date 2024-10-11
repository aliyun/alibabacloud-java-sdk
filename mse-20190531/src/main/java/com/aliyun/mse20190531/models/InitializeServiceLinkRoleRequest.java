// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class InitializeServiceLinkRoleRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForMSE</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Token")
    public String token;

    public static InitializeServiceLinkRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        InitializeServiceLinkRoleRequest self = new InitializeServiceLinkRoleRequest();
        return TeaModel.build(map, self);
    }

    public InitializeServiceLinkRoleRequest setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    public InitializeServiceLinkRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

    public InitializeServiceLinkRoleRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
