// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopClientIpVisitResponseBody extends TeaModel {
    /**
     * <p>A list of client IP addresses.</p>
     */
    @NameInMap("ClientIpList")
    public java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> clientIpList;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>64D28B53-5902-409B-94F6-FD46680144FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainTopClientIpVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopClientIpVisitResponseBody self = new DescribeDomainTopClientIpVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopClientIpVisitResponseBody setClientIpList(java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }
    public java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> getClientIpList() {
        return this.clientIpList;
    }

    public DescribeDomainTopClientIpVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainTopClientIpVisitResponseBodyClientIpList extends TeaModel {
        /**
         * <p>The total number of requests.</p>
         * 
         * <strong>example:</strong>
         * <p>256</p>
         */
        @NameInMap("Acc")
        public Long acc;

        /**
         * <p>The client IP address returned. Only IPv4 addressed are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.xxx</p>
         */
        @NameInMap("ClientIp")
        public String clientIp;

        /**
         * <p>The ranking of the client IP address returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Rank")
        public Integer rank;

        /**
         * <p>The total amount of network traffic consumed. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("Traffic")
        public Long traffic;

        public static DescribeDomainTopClientIpVisitResponseBodyClientIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopClientIpVisitResponseBodyClientIpList self = new DescribeDomainTopClientIpVisitResponseBodyClientIpList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setAcc(Long acc) {
            this.acc = acc;
            return this;
        }
        public Long getAcc() {
            return this.acc;
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setRank(Integer rank) {
            this.rank = rank;
            return this;
        }
        public Integer getRank() {
            return this.rank;
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setTraffic(Long traffic) {
            this.traffic = traffic;
            return this;
        }
        public Long getTraffic() {
            return this.traffic;
        }

    }

}
