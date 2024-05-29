// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewSourceProvincesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the details of the administrative region in China from which the requests are sent.</p>
     */
    @NameInMap("SourceProvinces")
    public java.util.List<DescribeDomainViewSourceProvincesResponseBodySourceProvinces> sourceProvinces;

    public static DescribeDomainViewSourceProvincesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewSourceProvincesResponseBody self = new DescribeDomainViewSourceProvincesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewSourceProvincesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainViewSourceProvincesResponseBody setSourceProvinces(java.util.List<DescribeDomainViewSourceProvincesResponseBodySourceProvinces> sourceProvinces) {
        this.sourceProvinces = sourceProvinces;
        return this;
    }
    public java.util.List<DescribeDomainViewSourceProvincesResponseBodySourceProvinces> getSourceProvinces() {
        return this.sourceProvinces;
    }

    public static class DescribeDomainViewSourceProvincesResponseBodySourceProvinces extends TeaModel {
        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The ID of the region inside China. For more information, see the **Codes of administrative regions in China** section of the [Codes of administrative regions in China and codes of countries and areas](https://help.aliyun.com/document_detail/167926.html) topic. For example, **110000** indicates Beijing, and **120000** indicates Tianjin.</p>
         */
        @NameInMap("ProvinceId")
        public String provinceId;

        public static DescribeDomainViewSourceProvincesResponseBodySourceProvinces build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainViewSourceProvincesResponseBodySourceProvinces self = new DescribeDomainViewSourceProvincesResponseBodySourceProvinces();
            return TeaModel.build(map, self);
        }

        public DescribeDomainViewSourceProvincesResponseBodySourceProvinces setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDomainViewSourceProvincesResponseBodySourceProvinces setProvinceId(String provinceId) {
            this.provinceId = provinceId;
            return this;
        }
        public String getProvinceId() {
            return this.provinceId;
        }

    }

}
