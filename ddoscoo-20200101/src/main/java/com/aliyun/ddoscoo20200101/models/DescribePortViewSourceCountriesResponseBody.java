// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribePortViewSourceCountriesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CountryId")
        public String countryId;

        @NameInMap("Count")
        public Long count;

        public static DescribePortViewSourceCountriesResponseBodySourceCountrys build(java.util.Map<String, ?> map) throws Exception {
            DescribePortViewSourceCountriesResponseBodySourceCountrys self = new DescribePortViewSourceCountriesResponseBodySourceCountrys();
            return TeaModel.build(map, self);
        }

        public DescribePortViewSourceCountriesResponseBodySourceCountrys setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public DescribePortViewSourceCountriesResponseBodySourceCountrys setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

}
