// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddLiveDomainPlayMappingRequest extends TeaModel {
    @NameInMap("PlayDomain")
    @Validation(required = true)
    public String playDomain;

    @NameInMap("PullDomain")
    @Validation(required = true)
    public String pullDomain;

    public static AddLiveDomainPlayMappingRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLiveDomainPlayMappingRequest self = new AddLiveDomainPlayMappingRequest();
        return TeaModel.build(map, self);
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
