// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class UpdateConsumerAuthorizationRuleRequest extends TeaModel {
    /**
     * <p>The list of resource authorization information.</p>
     */
    @NameInMap("authorizationResourceInfos")
    public java.util.List<AuthorizationResourceInfo> authorizationResourceInfos;

    /**
     * <p>The expiry mode. Valid values: LongTerm and ShortTerm.</p>
     * 
     * <strong>example:</strong>
     * <p>LongTerm</p>
     */
    @NameInMap("expireMode")
    public String expireMode;

    /**
     * <p>The expiration time.</p>
     * 
     * <strong>example:</strong>
     * <p>1750852089975</p>
     */
    @NameInMap("expireTimestamp")
    public Long expireTimestamp;

    public static UpdateConsumerAuthorizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConsumerAuthorizationRuleRequest self = new UpdateConsumerAuthorizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConsumerAuthorizationRuleRequest setAuthorizationResourceInfos(java.util.List<AuthorizationResourceInfo> authorizationResourceInfos) {
        this.authorizationResourceInfos = authorizationResourceInfos;
        return this;
    }
    public java.util.List<AuthorizationResourceInfo> getAuthorizationResourceInfos() {
        return this.authorizationResourceInfos;
    }

    public UpdateConsumerAuthorizationRuleRequest setExpireMode(String expireMode) {
        this.expireMode = expireMode;
        return this;
    }
    public String getExpireMode() {
        return this.expireMode;
    }

    public UpdateConsumerAuthorizationRuleRequest setExpireTimestamp(Long expireTimestamp) {
        this.expireTimestamp = expireTimestamp;
        return this;
    }
    public Long getExpireTimestamp() {
        return this.expireTimestamp;
    }

}
