// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAreaResponseBody extends TeaModel {
    @NameInMap("Areas")
    public java.util.List<DescribeDDosEventAreaResponseBodyAreas> areas;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDDosEventAreaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDDosEventAreaResponseBody self = new DescribeDDosEventAreaResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDDosEventAreaResponseBody setAreas(java.util.List<DescribeDDosEventAreaResponseBodyAreas> areas) {
        this.areas = areas;
        return this;
    }
    public java.util.List<DescribeDDosEventAreaResponseBodyAreas> getAreas() {
        return this.areas;
    }

    public DescribeDDosEventAreaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDDosEventAreaResponseBodyAreas extends TeaModel {
        @NameInMap("Area")
        public String area;

        @NameInMap("InPkts")
        public Long inPkts;

        public static DescribeDDosEventAreaResponseBodyAreas build(java.util.Map<String, ?> map) throws Exception {
            DescribeDDosEventAreaResponseBodyAreas self = new DescribeDDosEventAreaResponseBodyAreas();
            return TeaModel.build(map, self);
        }

        public DescribeDDosEventAreaResponseBodyAreas setArea(String area) {
            this.area = area;
            return this;
        }
        public String getArea() {
            return this.area;
        }

        public DescribeDDosEventAreaResponseBodyAreas setInPkts(Long inPkts) {
            this.inPkts = inPkts;
            return this;
        }
        public Long getInPkts() {
            return this.inPkts;
        }

    }

}
