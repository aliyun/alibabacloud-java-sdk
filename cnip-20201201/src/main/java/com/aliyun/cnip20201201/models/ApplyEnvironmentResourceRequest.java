// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class ApplyEnvironmentResourceRequest extends TeaModel {
    @NameInMap("accessKeyID")
    public String accessKeyID;

    @NameInMap("accessKeySecret")
    public String accessKeySecret;

    @NameInMap("securityToken")
    public String securityToken;

    public static ApplyEnvironmentResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ApplyEnvironmentResourceRequest self = new ApplyEnvironmentResourceRequest();
        return TeaModel.build(map, self);
    }

    public ApplyEnvironmentResourceRequest setAccessKeyID(String accessKeyID) {
        this.accessKeyID = accessKeyID;
        return this;
    }
    public String getAccessKeyID() {
        return this.accessKeyID;
    }

    public ApplyEnvironmentResourceRequest setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public ApplyEnvironmentResourceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
