// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainMappingRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The streaming domain. The type of the domain name is <strong>liveVideo</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("PullDomain")
    public String pullDomain;

    /**
     * <p>The ingest domain. The type of the domain name is <strong>liveEdge</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo.aliyundoc.com</p>
     */
    @NameInMap("PushDomain")
    public String pushDomain;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static AddLiveDomainMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainMappingRequest self = new AddLiveDomainMappingRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainMappingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveDomainMappingRequest setPullDomain(String pullDomain) {
        this.pullDomain = pullDomain;
        return this;
    }
    public String getPullDomain() {
        return this.pullDomain;
    }

    public AddLiveDomainMappingRequest setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public AddLiveDomainMappingRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
