// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnL2VipsByDomainResponseBody extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Vips")
    public java.util.List<String> vips;

    public static DescribeDcdnL2VipsByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnL2VipsByDomainResponseBody self = new DescribeDcdnL2VipsByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnL2VipsByDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnL2VipsByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnL2VipsByDomainResponseBody setVips(java.util.List<String> vips) {
        this.vips = vips;
        return this;
    }
    public java.util.List<String> getVips() {
        return this.vips;
    }

}
