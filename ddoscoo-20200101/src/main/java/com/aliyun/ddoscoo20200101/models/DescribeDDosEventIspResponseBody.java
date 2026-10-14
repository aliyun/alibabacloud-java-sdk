// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventIspResponseBody extends TeaModel {
    /**
     * <p>The ISP information of attack sources.</p>
     */
    @NameInMap("Isps")
    public java.util.List<DescribeDDosEventIspResponseBodyIsps> isps;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>C4A3BCD1-4A32-4342-941A-4745AE69508C</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDDosEventIspResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventIspResponseBody self = new DescribeDDosEventIspResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventIspResponseBody setIsps(java.util.List<DescribeDDosEventIspResponseBodyIsps> isps) {
        this.isps = isps;
        return this;
    }
    public java.util.List<DescribeDDosEventIspResponseBodyIsps> getIsps() {
        return this.isps;
    }

    public DescribeDDosEventIspResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDDosEventIspResponseBodyIsps extends TeaModel {
        /**
         * <p>The number of request packets from the ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>230</p>
         */
        @NameInMap("InPkts")
        public Long inPkts;

        /**
         * <p>The code of the attack source ISP. Valid values:</p>
         * <ul>
         * <li><strong>100017</strong>: China Telecom</li>
         * <li><strong>100026</strong>: China Unicom</li>
         * <li><strong>100025</strong>: China Mobile</li>
         * <li><strong>100027</strong>: CERNET</li>
         * <li><strong>100020</strong>: China Tietong</li>
         * <li><strong>1000143</strong>: Dr. Peng</li>
         * <li><strong>100080</strong>: Gehua</li>
         * <li><strong>1000139</strong>: China Broadcasting Network</li>
         * <li><strong>100023</strong>: Youxiantong</li>
         * <li><strong>100063</strong>: Founder Broadband</li>
         * <li><strong>1000337</strong>: Haokuan Network</li>
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
         * <p>1000323</p>
         */
        @NameInMap("Isp")
        public String isp;

        public static DescribeDDosEventIspResponseBodyIsps build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDosEventIspResponseBodyIsps self = new DescribeDDosEventIspResponseBodyIsps();
            return TeaModel.build(map, self);
        }

        public DescribeDDosEventIspResponseBodyIsps setInPkts(Long inPkts) {
            this.inPkts = inPkts;
            return this;
        }
        public Long getInPkts() {
            return this.inPkts;
        }

        public DescribeDDosEventIspResponseBodyIsps setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

    }

}
