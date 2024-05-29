// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeDomainViewSourceCountriesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of the country or area from which the requests are sent.</p>
     */
    @NameInMap("SourceCountrys")
    public java.util.List<DescribeDomainViewSourceCountriesResponseBodySourceCountrys> sourceCountrys;

    public static DescribeDomainViewSourceCountriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainViewSourceCountriesResponseBody self = new DescribeDomainViewSourceCountriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainViewSourceCountriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDomainViewSourceCountriesResponseBody setSourceCountrys(java.util.List<DescribeDomainViewSourceCountriesResponseBodySourceCountrys> sourceCountrys) {
        this.sourceCountrys = sourceCountrys;
        return this;
    }
    public java.util.List<DescribeDomainViewSourceCountriesResponseBodySourceCountrys> getSourceCountrys() {
        return this.sourceCountrys;
    }

    public static class DescribeDomainViewSourceCountriesResponseBodySourceCountrys extends TeaModel {
        /**
         * <p>The total number of requests.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The abbreviation of the country or area. For more information, see the **Codes of countries and areas** section of the [Codes of administrative regions in China and codes of countries and areas](https://help.aliyun.com/document_detail/167926.html) topic. For example, **cn** indicates China, and **us** indicates the United States.</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        public static DescribeDomainViewSourceCountriesResponseBodySourceCountrys build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainViewSourceCountriesResponseBodySourceCountrys self = new DescribeDomainViewSourceCountriesResponseBodySourceCountrys();
            return TeaModel.build(map, self);
        }

        public DescribeDomainViewSourceCountriesResponseBodySourceCountrys setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribeDomainViewSourceCountriesResponseBodySourceCountrys setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

    }

}
