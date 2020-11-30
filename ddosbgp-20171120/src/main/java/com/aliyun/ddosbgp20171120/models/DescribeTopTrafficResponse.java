// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20171120.models;

import com.aliyun.tea.*;

public class DescribeTopTrafficResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Long total;

    @NameInMap("TrafficList")
    @Validation(required = true)
    public java.util.List<DescribeTopTrafficResponseTrafficList> trafficList;

    public static DescribeTopTrafficResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeTopTrafficResponse self = new DescribeTopTrafficResponse();
        return TeaModel.build(map, self);
    }

    public DescribeTopTrafficResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTopTrafficResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public DescribeTopTrafficResponse setTrafficList(java.util.List<DescribeTopTrafficResponseTrafficList> trafficList) {
        this.trafficList = trafficList;
        return this;
    }
    public java.util.List<DescribeTopTrafficResponseTrafficList> getTrafficList() {
        return this.trafficList;
    }

    public static class DescribeTopTrafficResponseTrafficList extends TeaModel {
        @NameInMap("Pps")
        @Validation(required = true)
        public Integer pps;

        @NameInMap("Bps")
        @Validation(required = true)
        public Integer bps;

        @NameInMap("AttackBps")
        @Validation(required = true)
        public Integer attackBps;

        @NameInMap("AttackPps")
        @Validation(required = true)
        public Integer attackPps;

        @NameInMap("Ip")
        @Validation(required = true)
        public String ip;

        public static DescribeTopTrafficResponseTrafficList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTopTrafficResponseTrafficList self = new DescribeTopTrafficResponseTrafficList();
            return TeaModel.build(map, self);
        }

        public DescribeTopTrafficResponseTrafficList setPps(Integer pps) {
            this.pps = pps;
            return this;
        }
        public Integer getPps() {
            return this.pps;
        }

        public DescribeTopTrafficResponseTrafficList setBps(Integer bps) {
            this.bps = bps;
            return this;
        }
        public Integer getBps() {
            return this.bps;
        }

        public DescribeTopTrafficResponseTrafficList setAttackBps(Integer attackBps) {
            this.attackBps = attackBps;
            return this;
        }
        public Integer getAttackBps() {
            return this.attackBps;
        }

        public DescribeTopTrafficResponseTrafficList setAttackPps(Integer attackPps) {
            this.attackPps = attackPps;
            return this;
        }
        public Integer getAttackPps() {
            return this.attackPps;
        }

        public DescribeTopTrafficResponseTrafficList setIp(String ip) {
            this.ip = ip;
            return this;
        }
        public String getIp() {
            return this.ip;
        }

    }

}
