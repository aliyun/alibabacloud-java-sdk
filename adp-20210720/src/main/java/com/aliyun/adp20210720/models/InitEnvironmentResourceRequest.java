// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class InitEnvironmentResourceRequest extends TeaModel {
    @NameInMap("accessKeyID")
    public String accessKeyID;

    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    @NameInMap("securityToken")
    public String securityToken;

    public static InitEnvironmentResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        InitEnvironmentResourceRequest self = new InitEnvironmentResourceRequest();
        return TeaModel.build(map, self);
    }

    public InitEnvironmentResourceRequest setAccessKeyID(String accessKeyID) {
        this.accessKeyID = accessKeyID;
        return this;
    }
    public String getAccessKeyID() {
        return this.accessKeyID;
    }

    public InitEnvironmentResourceRequest setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public InitEnvironmentResourceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
