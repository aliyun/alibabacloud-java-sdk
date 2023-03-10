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
         */
        @NameInMap("InPkts")
        public Long inPkts;

        /**
         * <p>The code of the ISP. Valid values:</p>
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
