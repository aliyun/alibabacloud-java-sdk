// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDDosEventAreaResponseBody extends TeaModel {
    /**
     * <p>The information about the attack source regions.</p>
     */
    @NameInMap("Areas")
    public java.util.List<DescribeDDosEventAreaResponseBodyAreas> areas;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>11710C9F-BC5E-481A-BEC5-C6D8FBFCA827</p>
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
         * <p>The code of the attack source region, including Chinese regions (at the province or city level) and international regions (at the country level). For example, <strong>110000</strong> indicates Beijing, China, and <strong>us</strong> indicates the United States.</p>
         * <blockquote>
         * <p>For more information about the valid values of this parameter, see <a href="https://help.aliyun.com/document_detail/167926.html">China and international regions</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>110000</p>
         */
        @NameInMap("Area")
        public String area;

        /**
         * <p>The number of request packets from the attack source region.</p>
         * 
         * <strong>example:</strong>
         * <p>228</p>
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
