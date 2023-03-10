// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainOverviewResponseBody extends TeaModel {
    /**
     * <p>The peak queries per second (QPS) during HTTP traffic scrubbing. Unit: QPS.</p>
     */
    @NameInMap("MaxHttp")
    public Long maxHttp;

    /**
     * <p>The peak QPS during HTTPS traffic scrubbing. Unit: QPS.</p>
     */
    @NameInMap("MaxHttps")
    public Long maxHttps;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
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
