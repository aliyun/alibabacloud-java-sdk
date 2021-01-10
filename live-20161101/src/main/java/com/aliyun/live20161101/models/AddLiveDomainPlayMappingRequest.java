// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainPlayMappingRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PlayDomain")
    public String playDomain;

    @NameInMap("PullDomain")
    public String pullDomain;

    public static AddLiveDomainPlayMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainPlayMappingRequest self = new AddLiveDomainPlayMappingRequest();
        return TeaModel.build(map, self);
    }

    public AddLiveDomainPlayMappingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddLiveDomainPlayMappingRequest setPlayDomain(String playDomain) {
        this.playDomain = playDomain;
        return this;
    }
    public String getPlayDomain() {
        return this.playDomain;
    }

    public AddLiveDomainPlayMappingRequest setPullDomain(String pullDomain) {
        this.pullDomain = pullDomain;
        return this;
    }
    public String getPullDomain() {
        return this.pullDomain;
    }

}
