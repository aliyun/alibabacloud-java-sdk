// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveLazyPullStreamConfigRequest extends TeaModel {
    @NameInMap("DomainName")
    @Validation(required = true)
    public String domainName;

    @NameInMap("AppName")
    public String appName;

    @NameInMap("LiveapiRequestFrom")
    public String liveapiRequestFrom;

    public static DescribeLiveLazyPullStreamConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveLazyPullStreamConfigRequest self = new DescribeLiveLazyPullStreamConfigRequest();
        return TeaModel.build(map, self);
    }

    public DescribeLiveLazyPullStreamConfigRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeLiveLazyPullStreamConfigRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public DescribeLiveLazyPullStreamConfigRequest setLiveapiRequestFrom(String liveapiRequestFrom) {
        this.liveapiRequestFrom = liveapiRequestFrom;
        return this;
    }
    public String getLiveapiRequestFrom() {
        return this.liveapiRequestFrom;
    }

}
