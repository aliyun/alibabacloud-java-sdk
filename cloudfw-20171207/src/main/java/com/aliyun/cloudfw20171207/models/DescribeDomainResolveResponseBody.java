// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDomainResolveResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResolveResult")
    public DescribeDomainResolveResponseBodyResolveResult resolveResult;

    public static DescribeDomainResolveResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainResolveResponseBody self = new DescribeDomainResolveResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainResolveResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainResolveResponseBody setResolveResult(DescribeDomainResolveResponseBodyResolveResult resolveResult) {
        this.resolveResult = resolveResult;
        return this;
    }
    public DescribeDomainResolveResponseBodyResolveResult getResolveResult() {
        return this.resolveResult;
    }

    public static class DescribeDomainResolveResponseBodyResolveResult extends TeaModel {
        @NameInMap("IpAddrs")
        public String ipAddrs;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeDomainResolveResponseBodyResolveResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainResolveResponseBodyResolveResult self = new DescribeDomainResolveResponseBodyResolveResult();
            return TeaModel.build(map, self);
        }

        public DescribeDomainResolveResponseBodyResolveResult setIpAddrs(String ipAddrs) {
            this.ipAddrs = ipAddrs;
            return this;
        }
        public String getIpAddrs() {
            return this.ipAddrs;
        }

        public DescribeDomainResolveResponseBodyResolveResult setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
