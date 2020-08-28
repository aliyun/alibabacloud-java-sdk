// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeSiteMonitorISPCityListResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public String success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("IspCityList")
    @Validation(required = true)
    public DescribeSiteMonitorISPCityListResponseIspCityList ispCityList;

    public static DescribeSiteMonitorISPCityListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSiteMonitorISPCityListResponse self = new DescribeSiteMonitorISPCityListResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeSiteMonitorISPCityListResponseIspCityListIspCityIspName extends TeaModel {
        @NameInMap("en")
        @Validation(required = true)
        public String en;

        @NameInMap("zh_CN")
        @Validation(required = true)
        public String zhCN;

        public static DescribeSiteMonitorISPCityListResponseIspCityListIspCityIspName build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorISPCityListResponseIspCityListIspCityIspName self = new DescribeSiteMonitorISPCityListResponseIspCityListIspCityIspName();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorISPCityListResponseIspCityListIspCityCityName extends TeaModel {
        @NameInMap("en")
        @Validation(required = true)
        public String en;

        @NameInMap("zh_CN")
        @Validation(required = true)
        public String zhCN;

        public static DescribeSiteMonitorISPCityListResponseIspCityListIspCityCityName build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorISPCityListResponseIspCityListIspCityCityName self = new DescribeSiteMonitorISPCityListResponseIspCityListIspCityCityName();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorISPCityListResponseIspCityListIspCity extends TeaModel {
        @NameInMap("Isp")
        @Validation(required = true)
        public String isp;

        @NameInMap("City")
        @Validation(required = true)
        public String city;

        @NameInMap("Region")
        @Validation(required = true)
        public String region;

        @NameInMap("Country")
        @Validation(required = true)
        public String country;

        @NameInMap("IspName")
        @Validation(required = true)
        public DescribeSiteMonitorISPCityListResponseIspCityListIspCityIspName ispName;

        @NameInMap("CityName")
        @Validation(required = true)
        public DescribeSiteMonitorISPCityListResponseIspCityListIspCityCityName cityName;

        public static DescribeSiteMonitorISPCityListResponseIspCityListIspCity build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorISPCityListResponseIspCityListIspCity self = new DescribeSiteMonitorISPCityListResponseIspCityListIspCity();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeSiteMonitorISPCityListResponseIspCityList extends TeaModel {
        @NameInMap("IspCity")
        @Validation(required = true)
        public java.util.List<DescribeSiteMonitorISPCityListResponseIspCityListIspCity> ispCity;

        public static DescribeSiteMonitorISPCityListResponseIspCityList build(java.util.Map<String, ?> map) throws Exception {
            DescribeSiteMonitorISPCityListResponseIspCityList self = new DescribeSiteMonitorISPCityListResponseIspCityList();
            return TeaModel.build(map, self);
        }

    }

}
