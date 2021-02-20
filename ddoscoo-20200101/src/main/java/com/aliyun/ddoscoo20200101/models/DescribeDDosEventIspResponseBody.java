// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventIspResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Isps")
    public java.util.List<DescribeDDosEventIspResponseBodyIsps> isps;

    public static DescribeDDosEventIspResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventIspResponseBody self = new DescribeDDosEventIspResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventIspResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDDosEventIspResponseBody setIsps(java.util.List<DescribeDDosEventIspResponseBodyIsps> isps) {
        this.isps = isps;
        return this;
    }
    public java.util.List<DescribeDDosEventIspResponseBodyIsps> getIsps() {
        return this.isps;
    }

    public static class DescribeDDosEventIspResponseBodyIsps extends TeaModel {
        @NameInMap("InPkts")
        public Long inPkts;

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
