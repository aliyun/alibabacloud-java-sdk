// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceCountriesResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>An array consisting of countries or areas from which the requests are sent.</p>
     */
    @NameInMap("SourceCountrys")
    public java.util.List<DescribePortViewSourceCountriesResponseBodySourceCountrys> sourceCountrys;

    public static DescribePortViewSourceCountriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePortViewSourceCountriesResponseBody self = new DescribePortViewSourceCountriesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePortViewSourceCountriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePortViewSourceCountriesResponseBody setSourceCountrys(java.util.List<DescribePortViewSourceCountriesResponseBodySourceCountrys> sourceCountrys) {
        this.sourceCountrys = sourceCountrys;
        return this;
    }
    public java.util.List<DescribePortViewSourceCountriesResponseBodySourceCountrys> getSourceCountrys() {
        return this.sourceCountrys;
    }

    public static class DescribePortViewSourceCountriesResponseBodySourceCountrys extends TeaModel {
        /**
         * <p>The number of requests.</p>
         */
        @NameInMap("Count")
        public Long count;

        /**
         * <p>The abbreviation of the country or area. For example, **cn** indicates China and **us** indicates the United States.</p>
         * <br>
         * <p>> For more information, see [Location parameters](https://help.aliyun.com/document_detail/167926.html).</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        public static DescribePortViewSourceCountriesResponseBodySourceCountrys build(java.util.Map<String, ?> map) throws Exception {
            DescribePortViewSourceCountriesResponseBodySourceCountrys self = new DescribePortViewSourceCountriesResponseBodySourceCountrys();
            return TeaModel.build(map, self);
        }

        public DescribePortViewSourceCountriesResponseBodySourceCountrys setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public DescribePortViewSourceCountriesResponseBodySourceCountrys setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

    }

}
