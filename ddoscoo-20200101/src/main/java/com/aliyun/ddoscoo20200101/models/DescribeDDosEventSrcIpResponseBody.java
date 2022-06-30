// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpResponseBody extends TeaModel {
    @NameInMap("Ips")
    public java.util.List<DescribeDDosEventSrcIpResponseBodyIps> ips;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDDosEventSrcIpResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventSrcIpResponseBody self = new DescribeDDosEventSrcIpResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventSrcIpResponseBody setIps(java.util.List<DescribeDDosEventSrcIpResponseBodyIps> ips) {
        this.ips = ips;
        return this;
    }
    public java.util.List<DescribeDDosEventSrcIpResponseBodyIps> getIps() {
        return this.ips;
    }

    public DescribeDDosEventSrcIpResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDDosEventSrcIpResponseBodyIps extends TeaModel {
        @NameInMap("AreaId")
        public String areaId;

        @NameInMap("Isp")
        public String isp;

        @NameInMap("SrcIp")
        public String srcIp;

        public static DescribeDDosEventSrcIpResponseBodyIps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDosEventSrcIpResponseBodyIps self = new DescribeDDosEventSrcIpResponseBodyIps();
            return TeaModel.build(map, self);
        }

        public DescribeDDosEventSrcIpResponseBodyIps setAreaId(String areaId) {
            this.areaId = areaId;
            return this;
        }
        public String getAreaId() {
            return this.areaId;
        }

        public DescribeDDosEventSrcIpResponseBodyIps setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeDDosEventSrcIpResponseBodyIps setSrcIp(String srcIp) {
            this.srcIp = srcIp;
            return this;
        }
        public String getSrcIp() {
            return this.srcIp;
        }

    }

}
