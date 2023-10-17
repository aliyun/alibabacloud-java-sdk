// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnUserVipsByDomainResponseBody extends TeaModel {
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Vips")
    public DescribeDcdnUserVipsByDomainResponseBodyVips vips;

    public static DescribeDcdnUserVipsByDomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnUserVipsByDomainResponseBody self = new DescribeDcdnUserVipsByDomainResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnUserVipsByDomainResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeDcdnUserVipsByDomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnUserVipsByDomainResponseBody setVips(DescribeDcdnUserVipsByDomainResponseBodyVips vips) {
        this.vips = vips;
        return this;
    }
    public DescribeDcdnUserVipsByDomainResponseBodyVips getVips() {
        return this.vips;
    }

    public static class DescribeDcdnUserVipsByDomainResponseBodyVips extends TeaModel {
        @NameInMap("Vip")
        public java.util.List<String> vip;

        public static DescribeDcdnUserVipsByDomainResponseBodyVips build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnUserVipsByDomainResponseBodyVips self = new DescribeDcdnUserVipsByDomainResponseBodyVips();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnUserVipsByDomainResponseBodyVips setVip(java.util.List<String> vip) {
            this.vip = vip;
            return this;
        }
        public java.util.List<String> getVip() {
            return this.vip;
        }

    }

}
