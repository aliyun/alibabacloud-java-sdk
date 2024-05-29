// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAreaResponseBody extends TeaModel {
    /**
     * <p>The information about the source region from which the volumetric attack was initiated.</p>
     */
    @NameInMap("Areas")
    public java.util.List<DescribeDDosEventAreaResponseBodyAreas> areas;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The code or ID of the source region. For more information, see [Codes of administrative regions in China and codes of countries and areas](https://help.aliyun.com/document_detail/167926.html). For example, **110000** indicates Beijing, China, and **us** indicates the United States.</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The number of request packets that were sent from the source region.</p>
         */
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
