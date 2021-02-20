// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainOverviewResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MaxHttps")
    public Long maxHttps;

    @NameInMap("MaxHttp")
    public Long maxHttp;

    public static DescribeDomainOverviewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainOverviewResponseBody self = new DescribeDomainOverviewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainOverviewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainOverviewResponseBody setMaxHttps(Long maxHttps) {
        this.maxHttps = maxHttps;
        return this;
    }
    public Long getMaxHttps() {
        return this.maxHttps;
    }

    public DescribeDomainOverviewResponseBody setMaxHttp(Long maxHttp) {
        this.maxHttp = maxHttp;
        return this;
    }
    public Long getMaxHttp() {
        return this.maxHttp;
    }

}
