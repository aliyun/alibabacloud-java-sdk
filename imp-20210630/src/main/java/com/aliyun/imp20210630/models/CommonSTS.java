// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class CommonSTS extends TeaModel {
    // AccessKey ID 标识用户
    @NameInMap("AccessKeyId")
    public String accessKeyId;

    // AccessKey Secret 验证用户的密钥
    @NameInMap("AccessKeySecret")
    public String accessKeySecret;

    // 临时token
    @NameInMap("SecurityToken")
    public String securityToken;

    public static CommonSTS build(java.util.Map<String, ?> map) throws Exception {
        CommonSTS self = new CommonSTS();
        return TeaModel.build(map, self);
    }

    public CommonSTS setAccessKeyId(String accessKeyId) {
        this.accessKeyId = accessKeyId;
        return this;
    }
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    public CommonSTS setAccessKeySecret(String accessKeySecret) {
        this.accessKeySecret = accessKeySecret;
        return this;
    }
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    public CommonSTS setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
