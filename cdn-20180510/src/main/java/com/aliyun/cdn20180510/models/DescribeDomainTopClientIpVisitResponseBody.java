// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainTopClientIpVisitResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ClientIpList")
    public java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> clientIpList;

    public static DescribeDomainTopClientIpVisitResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainTopClientIpVisitResponseBody self = new DescribeDomainTopClientIpVisitResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainTopClientIpVisitResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainTopClientIpVisitResponseBody setClientIpList(java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> clientIpList) {
        this.clientIpList = clientIpList;
        return this;
    }
    public java.util.List<DescribeDomainTopClientIpVisitResponseBodyClientIpList> getClientIpList() {
        return this.clientIpList;
    }

    public static class DescribeDomainTopClientIpVisitResponseBodyClientIpList extends TeaModel {
        @NameInMap("Rank")
        public Integer rank;

        @NameInMap("ClientIp")
        public String clientIp;

        @NameInMap("Acc")
        public Long acc;

        @NameInMap("Traffic")
        public Long traffic;

        public static DescribeDomainTopClientIpVisitResponseBodyClientIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainTopClientIpVisitResponseBodyClientIpList self = new DescribeDomainTopClientIpVisitResponseBodyClientIpList();
            return TeaModel.build(map, self);
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setRank(Integer rank) {
            this.rank = rank;
            return this;
        }
        public Integer getRank() {
            return this.rank;
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setClientIp(String clientIp) {
            this.clientIp = clientIp;
            return this;
        }
        public String getClientIp() {
            return this.clientIp;
        }

        public DescribeDomainTopClientIpVisitResponseBodyClientIpList setAcc(Long acc) {
            this.acc = acc;
            return this;
        }
        public Long getAcc() {
            return this.acc;
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
