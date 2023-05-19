// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnBlockedRegionsResponseBody extends TeaModel {
    /**
     * <p>The information about the country or region.</p>
     */
    @NameInMap("InfoList")
    public DescribeDcdnBlockedRegionsResponseBodyInfoList infoList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnBlockedRegionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnBlockedRegionsResponseBody self = new DescribeDcdnBlockedRegionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnBlockedRegionsResponseBody setInfoList(DescribeDcdnBlockedRegionsResponseBodyInfoList infoList) {
        this.infoList = infoList;
        return this;
    }
    public DescribeDcdnBlockedRegionsResponseBodyInfoList getInfoList() {
        return this.infoList;
    }

    public DescribeDcdnBlockedRegionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem extends TeaModel {
        /**
         * <p>The larger region to which the country or region belongs.</p>
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

        public static DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem self = new DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem setContinent(String continent) {
            this.continent = continent;
            return this;
        }
        public String getContinent() {
            return this.continent;
        }

        public DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem setCountriesAndRegions(String countriesAndRegions) {
            this.countriesAndRegions = countriesAndRegions;
            return this;
        }
        public String getCountriesAndRegions() {
            return this.countriesAndRegions;
        }

        public DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem setCountriesAndRegionsName(String countriesAndRegionsName) {
            this.countriesAndRegionsName = countriesAndRegionsName;
            return this;
        }
        public String getCountriesAndRegionsName() {
            return this.countriesAndRegionsName;
        }

    }

    public static class DescribeDcdnBlockedRegionsResponseBodyInfoList extends TeaModel {
        @NameInMap("InfoItem")
        public java.util.List<DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem> infoItem;

        public static DescribeDcdnBlockedRegionsResponseBodyInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnBlockedRegionsResponseBodyInfoList self = new DescribeDcdnBlockedRegionsResponseBodyInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnBlockedRegionsResponseBodyInfoList setInfoItem(java.util.List<DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem> infoItem) {
            this.infoItem = infoItem;
            return this;
        }
        public java.util.List<DescribeDcdnBlockedRegionsResponseBodyInfoListInfoItem> getInfoItem() {
            return this.infoItem;
        }

    }

}
