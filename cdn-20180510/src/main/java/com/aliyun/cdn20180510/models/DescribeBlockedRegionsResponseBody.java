// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeBlockedRegionsResponseBody extends TeaModel {
    /**
     * <p>A list of countries and regions.</p>
     */
    @NameInMap("InfoList")
    public DescribeBlockedRegionsResponseBodyInfoList infoList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBlockedRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBlockedRegionsResponseBody self = new DescribeBlockedRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBlockedRegionsResponseBody setInfoList(DescribeBlockedRegionsResponseBodyInfoList infoList) {
        this.infoList = infoList;
        return this;
    }
    public DescribeBlockedRegionsResponseBodyInfoList getInfoList() {
        return this.infoList;
    }

    public DescribeBlockedRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBlockedRegionsResponseBodyInfoListInfoItem extends TeaModel {
        /**
         * <p>The district to which the country or region belongs.</p>
         */
        @NameInMap("Continent")
        public String continent;

        /**
         * <p>The abbreviation of the name of the country or region.</p>
         */
        @NameInMap("CountriesAndRegions")
        public String countriesAndRegions;

        /**
         * <p>The name of the country or region.</p>
         */
        @NameInMap("CountriesAndRegionsName")
        public String countriesAndRegionsName;

        public static DescribeBlockedRegionsResponseBodyInfoListInfoItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockedRegionsResponseBodyInfoListInfoItem self = new DescribeBlockedRegionsResponseBodyInfoListInfoItem();
            return TeaModel.build(map, self);
        }

        public DescribeBlockedRegionsResponseBodyInfoListInfoItem setContinent(String continent) {
            this.continent = continent;
            return this;
        }
        public String getContinent() {
            return this.continent;
        }

        public DescribeBlockedRegionsResponseBodyInfoListInfoItem setCountriesAndRegions(String countriesAndRegions) {
            this.countriesAndRegions = countriesAndRegions;
            return this;
        }
        public String getCountriesAndRegions() {
            return this.countriesAndRegions;
        }

        public DescribeBlockedRegionsResponseBodyInfoListInfoItem setCountriesAndRegionsName(String countriesAndRegionsName) {
            this.countriesAndRegionsName = countriesAndRegionsName;
            return this;
        }
        public String getCountriesAndRegionsName() {
            return this.countriesAndRegionsName;
        }

    }

    public static class DescribeBlockedRegionsResponseBodyInfoList extends TeaModel {
        @NameInMap("InfoItem")
        public java.util.List<DescribeBlockedRegionsResponseBodyInfoListInfoItem> infoItem;

        public static DescribeBlockedRegionsResponseBodyInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeBlockedRegionsResponseBodyInfoList self = new DescribeBlockedRegionsResponseBodyInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeBlockedRegionsResponseBodyInfoList setInfoItem(java.util.List<DescribeBlockedRegionsResponseBodyInfoListInfoItem> infoItem) {
            this.infoItem = infoItem;
            return this;
        }
        public java.util.List<DescribeBlockedRegionsResponseBodyInfoListInfoItem> getInfoItem() {
            return this.infoItem;
        }

    }

}
