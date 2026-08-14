// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortCcAttackTopIPResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TopIp")
    public java.util.List<DescribePortCcAttackTopIPResponseBodyTopIp> topIp;

    public static DescribePortCcAttackTopIPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortCcAttackTopIPResponseBody self = new DescribePortCcAttackTopIPResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortCcAttackTopIPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortCcAttackTopIPResponseBody setTopIp(java.util.List<DescribePortCcAttackTopIPResponseBodyTopIp> topIp) {
        this.topIp = topIp;
        return this;
    }
    public java.util.List<DescribePortCcAttackTopIPResponseBodyTopIp> getTopIp() {
        return this.topIp;
    }

    public static class DescribePortCcAttackTopIPResponseBodyTopIp extends TeaModel {
        @NameInMap("AreaId")
        public String areaId;

        @NameInMap("Pv")
        public Long pv;

        @NameInMap("SrcIp")
        public String srcIp;

        public static DescribePortCcAttackTopIPResponseBodyTopIp build(java.util.Map<String, ?> map) throws Exception {
            DescribePortCcAttackTopIPResponseBodyTopIp self = new DescribePortCcAttackTopIPResponseBodyTopIp();
            return TeaModel.build(map, self);
        }

        public DescribePortCcAttackTopIPResponseBodyTopIp setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public DescribePortCcAttackTopIPResponseBodyTopIp setPv(Long pv) {
            this.pv = pv;
            return this;
        }
        public Long getPv() {
            return this.pv;
        }

        public DescribePortCcAttackTopIPResponseBodyTopIp setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

    }

}
