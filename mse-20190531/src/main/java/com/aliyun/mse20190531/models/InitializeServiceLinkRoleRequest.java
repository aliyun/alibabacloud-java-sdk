// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class InitializeServiceLinkRoleRequest extends TeaModel {
    /**
     * <p>The language in which the returned results are displayed. Valid values: zh (default): Chinese. en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("AcceptLanguage")
    public String acceptLanguage;

    /**
     * <p>The name of the server-linked role. Set this parameter to AliyunServiceRoleForMSE</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForMSE</p>
     */
    @NameInMap("RoleName")
    public String roleName;

    /**
     * <p>This parameter is reserved and not in use.</p>
     * 
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
