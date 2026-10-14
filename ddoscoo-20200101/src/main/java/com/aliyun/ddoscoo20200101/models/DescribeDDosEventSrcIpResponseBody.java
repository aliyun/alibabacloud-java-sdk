// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventSrcIpResponseBody extends TeaModel {
    /**
     * <p>The information about attack source IP addresses.</p>
     */
    @NameInMap("Ips")
    public java.util.List<DescribeDDosEventSrcIpResponseBodyIps> ips;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>38A0224E-FDBC-4733-A362-B391827FC1E9</p>
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
         * <p>The region code of the attack source. For more information, see <a href="https://help.aliyun.com/document_detail/167926.html">Region codes</a>. For example, <strong>110000</strong> indicates Beijing, China, and <strong>us</strong> indicates the United States.</p>
         * 
         * <strong>example:</strong>
         * <p>110000</p>
         */
        @NameInMap("AreaId")
        public String areaId;

        /**
         * <p>The Internet service provider (ISP) of the attack source. Valid values:</p>
         * <ul>
         * <li><strong>100017</strong>: China Telecom</li>
         * <li><strong>100026</strong>: China Unicom</li>
         * <li><strong>100025</strong>: China Mobile</li>
         * <li><strong>100027</strong>: CERNET</li>
         * <li><strong>100020</strong>: China Tietong</li>
         * <li><strong>1000143</strong>: Dr. Peng</li>
         * <li><strong>100080</strong>: Gehua</li>
         * <li><strong>1000139</strong>: China Broadcasting Network</li>
         * <li><strong>100023</strong>: Wired</li>
         * <li><strong>100063</strong>: Founder Broadband</li>
         * <li><strong>1000337</strong>: Haonet</li>
         * <li><strong>100021</strong>: 21Vianet</li>
         * <li><strong>1000333</strong>: Wasu Media</li>
         * <li><strong>100093</strong>: ChinaNetCenter</li>
         * <li><strong>1000401</strong>: Tencent</li>
         * <li><strong>100099</strong>: Baidu</li>
         * <li><strong>1000323</strong>: Alibaba Cloud</li>
         * <li><strong>100098</strong>: Alibaba</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100026</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The attack source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>218.<em><strong>.</strong></em>.24</p>
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
