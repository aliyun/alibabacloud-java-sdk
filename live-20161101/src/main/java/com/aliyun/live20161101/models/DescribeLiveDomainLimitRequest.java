// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainLimitRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("LiveapiRequestFrom")
    public String liveapiRequestFrom;

    public static DescribeLiveDomainLimitRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainLimitRequest self = new DescribeLiveDomainLimitRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainLimitRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveDomainLimitRequest setLiveapiRequestFrom(String liveapiRequestFrom) {
        this.liveapiRequestFrom = liveapiRequestFrom;
        return this;
    }
    public String getLiveapiRequestFrom() {
        return this.liveapiRequestFrom;
    }

}
