// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLivePullStreamConfigRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("LiveapiRequestFrom")
    public String liveapiRequestFrom;

    public static DescribeLivePullStreamConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLivePullStreamConfigRequest self = new DescribeLivePullStreamConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLivePullStreamConfigRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeLivePullStreamConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLivePullStreamConfigRequest setLiveapiRequestFrom(String liveapiRequestFrom) {
        this.liveapiRequestFrom = liveapiRequestFrom;
        return this;
    }
    public String getLiveapiRequestFrom() {
        return this.liveapiRequestFrom;
    }

}
