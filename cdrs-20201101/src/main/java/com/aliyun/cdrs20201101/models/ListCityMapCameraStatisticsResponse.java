// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapCameraStatisticsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListCityMapCameraStatisticsResponseData> data;

    public static ListCityMapCameraStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapCameraStatisticsResponse self = new ListCityMapCameraStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListCityMapCameraStatisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCityMapCameraStatisticsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCityMapCameraStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCityMapCameraStatisticsResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListCityMapCameraStatisticsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListCityMapCameraStatisticsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListCityMapCameraStatisticsResponse setData(java.util.List<ListCityMapCameraStatisticsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCityMapCameraStatisticsResponseData> getData() {
        return this.data;
    }

    public static class ListCityMapCameraStatisticsResponseData extends TeaModel {
        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("Latitude")
        @Validation(required = true)
        public String latitude;

        @NameInMap("Longitude")
        @Validation(required = true)
        public String longitude;

        @NameInMap("DataSourceName")
        @Validation(required = true)
        public String dataSourceName;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("AdultValue")
        @Validation(required = true)
        public String adultValue;

        @NameInMap("WomanValue")
        @Validation(required = true)
        public String womanValue;

        @NameInMap("MotorValue")
        @Validation(required = true)
        public String motorValue;

        @NameInMap("ManValue")
        @Validation(required = true)
        public String manValue;

        @NameInMap("OldValue")
        @Validation(required = true)
        public String oldValue;

        @NameInMap("ChildValue")
        @Validation(required = true)
        public String childValue;

        @NameInMap("StatisticTime")
        @Validation(required = true)
        public String statisticTime;

        public static ListCityMapCameraStatisticsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCityMapCameraStatisticsResponseData self = new ListCityMapCameraStatisticsResponseData();
            return TeaModel.build(map, self);
        }

        public ListCityMapCameraStatisticsResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListCityMapCameraStatisticsResponseData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListCityMapCameraStatisticsResponseData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public ListCityMapCameraStatisticsResponseData setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListCityMapCameraStatisticsResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListCityMapCameraStatisticsResponseData setAdultValue(String adultValue) {
            this.adultValue = adultValue;
            return this;
        }
        public String getAdultValue() {
            return this.adultValue;
        }

        public ListCityMapCameraStatisticsResponseData setWomanValue(String womanValue) {
            this.womanValue = womanValue;
            return this;
        }
        public String getWomanValue() {
            return this.womanValue;
        }

        public ListCityMapCameraStatisticsResponseData setMotorValue(String motorValue) {
            this.motorValue = motorValue;
            return this;
        }
        public String getMotorValue() {
            return this.motorValue;
        }

        public ListCityMapCameraStatisticsResponseData setManValue(String manValue) {
            this.manValue = manValue;
            return this;
        }
        public String getManValue() {
            return this.manValue;
        }

        public ListCityMapCameraStatisticsResponseData setOldValue(String oldValue) {
            this.oldValue = oldValue;
            return this;
        }
        public String getOldValue() {
            return this.oldValue;
        }

        public ListCityMapCameraStatisticsResponseData setChildValue(String childValue) {
            this.childValue = childValue;
            return this;
        }
        public String getChildValue() {
            return this.childValue;
        }

        public ListCityMapCameraStatisticsResponseData setStatisticTime(String statisticTime) {
            this.statisticTime = statisticTime;
            return this;
        }
        public String getStatisticTime() {
            return this.statisticTime;
        }

    }

}
