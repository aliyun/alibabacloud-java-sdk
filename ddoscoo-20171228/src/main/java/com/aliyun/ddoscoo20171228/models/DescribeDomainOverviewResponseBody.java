// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainOverviewResponseBody extends TeaModel {
    @NameInMap("MaxHttp")
    public Long maxHttp;

    @NameInMap("MaxHttps")
    public Long maxHttps;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainOverviewResponseBody self = new DescribeDomainOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainOverviewResponseBody setMaxHttp(Long maxHttp) {
        this.maxHttp = maxHttp;
        return this;
    }
    public Long getMaxHttp() {
        return this.maxHttp;
    }

    public DescribeDomainOverviewResponseBody setMaxHttps(Long maxHttps) {
        this.maxHttps = maxHttps;
        return this;
    }
    public Long getMaxHttps() {
        return this.maxHttps;
    }

    public DescribeDomainOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
