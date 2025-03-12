// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20171228.models;

import com.aliyun.tea.*;

public class DescribeDomainOverviewResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxHttp")
    public Long maxHttp;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MaxHttps")
    public Long maxHttps;

    /**
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
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
