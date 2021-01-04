// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddospro20170725.models;

import com.aliyun.tea.*;

public class DescribeDdosAttackEventSourceIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DescribeDdosAttackEventSourceIpsResponseBodyData data;

    public static DescribeDdosAttackEventSourceIpsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDdosAttackEventSourceIpsResponseBody self = new DescribeDdosAttackEventSourceIpsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDdosAttackEventSourceIpsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDdosAttackEventSourceIpsResponseBody setData(DescribeDdosAttackEventSourceIpsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeDdosAttackEventSourceIpsResponseBodyData getData() {
        return this.data;
    }

    public static class DescribeDdosAttackEventSourceIpsResponseBodyDataIpList extends TeaModel {
        @NameInMap("SourceIp")
        public String sourceIp;

        @NameInMap("InBps")
        public Integer inBps;

        @NameInMap("City")
        public String city;

        public static DescribeDdosAttackEventSourceIpsResponseBodyDataIpList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosAttackEventSourceIpsResponseBodyDataIpList self = new DescribeDdosAttackEventSourceIpsResponseBodyDataIpList();
            return TeaModel.build(map, self);
        }

        public DescribeDdosAttackEventSourceIpsResponseBodyDataIpList setSourceIp(String sourceIp) {
            this.sourceIp = sourceIp;
            return this;
        }
        public String getSourceIp() {
            return this.sourceIp;
        }

        public DescribeDdosAttackEventSourceIpsResponseBodyDataIpList setInBps(Integer inBps) {
            this.inBps = inBps;
            return this;
        }
        public Integer getInBps() {
            return this.inBps;
        }

        public DescribeDdosAttackEventSourceIpsResponseBodyDataIpList setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

    }

    public static class DescribeDdosAttackEventSourceIpsResponseBodyData extends TeaModel {
        @NameInMap("IpList")
        public java.util.List<DescribeDdosAttackEventSourceIpsResponseBodyDataIpList> ipList;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeDdosAttackEventSourceIpsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDdosAttackEventSourceIpsResponseBodyData self = new DescribeDdosAttackEventSourceIpsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeDdosAttackEventSourceIpsResponseBodyData setIpList(java.util.List<DescribeDdosAttackEventSourceIpsResponseBodyDataIpList> ipList) {
            this.ipList = ipList;
            return this;
        }
        public java.util.List<DescribeDdosAttackEventSourceIpsResponseBodyDataIpList> getIpList() {
            return this.ipList;
        }

        public DescribeDdosAttackEventSourceIpsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
