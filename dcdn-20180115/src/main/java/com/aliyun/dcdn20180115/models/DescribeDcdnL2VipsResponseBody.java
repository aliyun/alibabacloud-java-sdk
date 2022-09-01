// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnL2VipsResponseBody extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Vips")
    public java.util.List<String> vips;

    public static DescribeDcdnL2VipsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnL2VipsResponseBody self = new DescribeDcdnL2VipsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnL2VipsResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnL2VipsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnL2VipsResponseBody setVips(java.util.List<String> vips) {
        this.vips = vips;
        return this;
    }
    public java.util.List<String> getVips() {
        return this.vips;
    }

}
