// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainRealTimeDetailDataResponseBody extends TeaModel {
    /**
     * <p>The name of the Internet service provider. You can call the [DescribeCdnRegionAndIsp](~~91077~~) operation to query ISPs.</p>
     */
    @NameInMap("Data")
    public String data;

    /**
     * <p>The accelerated domain name for which you want to query data. You can specify multiple accelerated domain names and separate them with commas (,).</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainRealTimeDetailDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainRealTimeDetailDataResponseBody self = new DescribeDomainRealTimeDetailDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainRealTimeDetailDataResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public DescribeDomainRealTimeDetailDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
