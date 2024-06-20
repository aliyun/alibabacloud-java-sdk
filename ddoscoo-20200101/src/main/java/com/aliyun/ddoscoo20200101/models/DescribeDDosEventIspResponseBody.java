// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventIspResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the ISPs for the volumetric attack.</p>
     */
    @NameInMap("Isps")
    public java.util.List<DescribeDDosEventIspResponseBodyIsps> isps;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The number of request packets that were sent from the ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>230</p>
         */
        @NameInMap("InPkts")
        public Long inPkts;

        /**
         * <p>The code of the ISP. Valid values:</p>
         * <ul>
         * <li><strong>100017</strong>: China Telecom</li>
         * <li><strong>100026</strong>: China Unicom</li>
         * <li><strong>100025</strong>: China Mobile</li>
         * <li><strong>100027</strong>: China Education and Research Network</li>
         * <li><strong>100020</strong>: China Mobile Tietong</li>
         * <li><strong>1000143</strong>: Dr.Peng Telecom &amp; Media Group</li>
         * <li><strong>100080</strong>: Beijing Gehua CATV Network</li>
         * <li><strong>1000139</strong>: National Radio and Television Administration</li>
         * <li><strong>100023</strong>: Oriental Cable Network</li>
         * <li><strong>100063</strong>: Founder Broadband</li>
         * <li><strong>1000337</strong>: China Internet Exchange</li>
         * <li><strong>100021</strong>: 21Vianet Group</li>
         * <li><strong>1000333</strong>: Wasu Media Holding</li>
         * <li><strong>100093</strong>: Wangsu Science &amp; Technology</li>
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
