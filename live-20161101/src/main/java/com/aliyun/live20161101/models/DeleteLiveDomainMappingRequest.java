// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainMappingRequest extends TeaModel {
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

    public static DeleteLiveDomainMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainMappingRequest self = new DeleteLiveDomainMappingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainMappingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveDomainMappingRequest setPullDomain(String pullDomain) {
        this.pullDomain = pullDomain;
        return this;
    }
    public String getPullDomain() {
        return this.pullDomain;
    }

    public DeleteLiveDomainMappingRequest setPushDomain(String pushDomain) {
        this.pushDomain = pushDomain;
        return this;
    }
    public String getPushDomain() {
        return this.pushDomain;
    }

    public DeleteLiveDomainMappingRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
