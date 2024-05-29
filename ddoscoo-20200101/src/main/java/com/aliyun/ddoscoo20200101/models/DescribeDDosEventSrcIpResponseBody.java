// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpResponseBody extends TeaModel {
    /**
     * <p>An array that consists of information about the source IP address of the volumetric attack.</p>
     */
    @NameInMap("Ips")
    public java.util.List<DescribeDDosEventSrcIpResponseBodyIps> ips;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The code or ID of the source region. For more information, see [Codes of administrative regions in China and codes of countries and areas](https://help.aliyun.com/document_detail/167926.html). For example, **110000** indicates Beijing, China, and **us** indicates the United States.</p>
         */
        @NameInMap("AreaId")
        public String areaId;

        /**
         * <p>The Internet service provider (ISP) for the volumetric attack. Valid values:</p>
         * <br>
         * <p>*   **100017**: China Telecom</p>
         * <p>*   **100026**: China Unicom</p>
         * <p>*   **100025**: China Mobile</p>
         * <p>*   **100027**: China Education and Research Network</p>
         * <p>*   **100020**: China Mobile Tietong</p>
         * <p>*   **1000143**: Dr.Peng Telecom & Media Group</p>
         * <p>*   **100080**: Beijing Gehua CATV Network</p>
         * <p>*   **1000139**: National Radio and Television Administration</p>
         * <p>*   **100023**: Oriental Cable Network</p>
         * <p>*   **100063**: Founder Broadband</p>
         * <p>*   **1000337**: China Internet Exchange</p>
         * <p>*   **100021**: 21Vianet Group</p>
         * <p>*   **1000333**: Wasu Media Holding</p>
         * <p>*   **100093**: Wangsu Science & Technology</p>
         * <p>*   **1000401**: Tencent</p>
         * <p>*   **100099**: Baidu</p>
         * <p>*   **1000323**: Alibaba Cloud</p>
         * <p>*   **100098**: Alibaba</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The source IP address of the volumetric attack.</p>
         */
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
