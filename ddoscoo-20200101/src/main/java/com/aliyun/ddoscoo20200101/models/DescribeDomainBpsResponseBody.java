// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainBpsResponseBody extends TeaModel {
    @NameInMap("DomainBps")
    public java.util.List<DescribeDomainBpsResponseBodyDomainBps> domainBps;

    /**
     * <strong>example:</strong>
     * <p>C33EB3D5-AF96-43CA-9C7E-37A81BC06A1E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainBpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainBpsResponseBody self = new DescribeDomainBpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainBpsResponseBody setDomainBps(java.util.List<DescribeDomainBpsResponseBodyDomainBps> domainBps) {
        this.domainBps = domainBps;
        return this;
    }
    public java.util.List<DescribeDomainBpsResponseBodyDomainBps> getDomainBps() {
        return this.domainBps;
    }

    public DescribeDomainBpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainBpsResponseBodyDomainBps extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InBps")
        public Long inBps;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OutBps")
        public Long outBps;

        public static DescribeDomainBpsResponseBodyDomainBps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainBpsResponseBodyDomainBps self = new DescribeDomainBpsResponseBodyDomainBps();
            return TeaModel.build(map, self);
        }

        public DescribeDomainBpsResponseBodyDomainBps setInBps(Long inBps) {
            this.inBps = inBps;
            return this;
        }
        public Long getInBps() {
            return this.inBps;
        }

        public DescribeDomainBpsResponseBodyDomainBps setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public DescribeDomainBpsResponseBodyDomainBps setOutBps(Long outBps) {
            this.outBps = outBps;
            return this;
        }
        public Long getOutBps() {
            return this.outBps;
        }

    }

}
