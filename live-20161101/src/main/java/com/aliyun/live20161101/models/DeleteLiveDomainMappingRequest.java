// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainMappingRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("PushDomain")
    @Validation(required = true)
    public String pushDomain;

    @NameInMap("PullDomain")
    @Validation(required = true)
    public String pullDomain;

    public static DeleteLiveDomainMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainMappingRequest self = new DeleteLiveDomainMappingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainMappingRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteLiveDomainMappingRequest setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public DeleteLiveDomainMappingRequest setPullDomain(String pullDomain) {
        this.pullDomain = pullDomain;
        return this;
    }
    public String getPullDomain() {
        return this.pullDomain;
    }

}
