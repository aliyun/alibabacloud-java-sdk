// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeNetworkRegionBlockResponseBody extends TeaModel {
    /**
     * <p>The configuration of blocked locations.</p>
     */
    @NameInMap("Config")
    public DescribeNetworkRegionBlockResponseBodyConfig config;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeNetworkRegionBlockResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkRegionBlockResponseBody self = new DescribeNetworkRegionBlockResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkRegionBlockResponseBody setConfig(DescribeNetworkRegionBlockResponseBodyConfig config) {
        this.config = config;
        return this;
    }
    public DescribeNetworkRegionBlockResponseBodyConfig getConfig() {
        return this.config;
    }

    public DescribeNetworkRegionBlockResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeNetworkRegionBlockResponseBodyConfig extends TeaModel {
        /**
         * <p>An array consisting of the codes of the countries or areas from which the requests are blocked.</p>
         */
        @NameInMap("Countries")
        public java.util.List<String> countries;

        /**
         * <p>An array consisting of the codes of the administrative regions in China from which the requests are blocked.</p>
         */
        @NameInMap("Provinces")
        public java.util.List<String> provinces;

        /**
         * <p>The status of the Location Blacklist policy. Valid values:</p>
         * <br>
         * <p>*   **on**: enabled</p>
         * <p>*   **off**: disabled</p>
         */
        @NameInMap("RegionBlockSwitch")
        public String regionBlockSwitch;

        public static DescribeNetworkRegionBlockResponseBodyConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeNetworkRegionBlockResponseBodyConfig self = new DescribeNetworkRegionBlockResponseBodyConfig();
            return TeaModel.build(map, self);
        }

        public DescribeNetworkRegionBlockResponseBodyConfig setCountries(java.util.List<String> countries) {
            this.countries = countries;
            return this;
        }
        public java.util.List<String> getCountries() {
            return this.countries;
        }

        public DescribeNetworkRegionBlockResponseBodyConfig setProvinces(java.util.List<String> provinces) {
            this.provinces = provinces;
            return this;
        }
        public java.util.List<String> getProvinces() {
            return this.provinces;
        }

        public DescribeNetworkRegionBlockResponseBodyConfig setRegionBlockSwitch(String regionBlockSwitch) {
            this.regionBlockSwitch = regionBlockSwitch;
            return this;
        }
        public String getRegionBlockSwitch() {
            return this.regionBlockSwitch;
        }

    }

}
