// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteLiveDomainPlayMappingRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("PullDomain")
    public String pullDomain;

    public static DeleteLiveDomainPlayMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLiveDomainPlayMappingRequest self = new DeleteLiveDomainPlayMappingRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLiveDomainPlayMappingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteLiveDomainPlayMappingRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public DeleteLiveDomainPlayMappingRequest setPullDomain(String pullDomain) {
        this.pullDomain = pullDomain;
        return this;
    }
    public String getPullDomain() {
        return this.pullDomain;
    }

}
