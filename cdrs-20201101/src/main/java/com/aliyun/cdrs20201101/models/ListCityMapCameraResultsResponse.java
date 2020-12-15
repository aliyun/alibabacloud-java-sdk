// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapCameraResultsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNum")
    @Validation(required = true)
    public String pageNum;

    @NameInMap("PageSize")
    @Validation(required = true)
    public String pageSize;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListCityMapCameraResultsResponseData> data;

    public static ListCityMapCameraResultsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapCameraResultsResponse self = new ListCityMapCameraResultsResponse();
        return TeaModel.build(map, self);
    }

    public ListCityMapCameraResultsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListCityMapCameraResultsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCityMapCameraResultsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCityMapCameraResultsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListCityMapCameraResultsResponse setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public ListCityMapCameraResultsResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListCityMapCameraResultsResponse setData(java.util.List<ListCityMapCameraResultsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCityMapCameraResultsResponseData> getData() {
        return this.data;
    }

    public static class ListCityMapCameraResultsResponseData extends TeaModel {
        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("Latitude")
        @Validation(required = true)
        public String latitude;

        @NameInMap("Longitude")
        @Validation(required = true)
        public String longitude;

        @NameInMap("NearPoi")
        @Validation(required = true)
        public String nearPoi;

        @NameInMap("DataSourcePoi")
        @Validation(required = true)
        public String dataSourcePoi;

        @NameInMap("DataSourceName")
        @Validation(required = true)
        public String dataSourceName;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        public static ListCityMapCameraResultsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListCityMapCameraResultsResponseData self = new ListCityMapCameraResultsResponseData();
            return TeaModel.build(map, self);
        }

        public ListCityMapCameraResultsResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListCityMapCameraResultsResponseData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListCityMapCameraResultsResponseData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

        public ListCityMapCameraResultsResponseData setNearPoi(String nearPoi) {
            this.nearPoi = nearPoi;
            return this;
        }
        public String getNearPoi() {
            return this.nearPoi;
        }

        public ListCityMapCameraResultsResponseData setDataSourcePoi(String dataSourcePoi) {
            this.dataSourcePoi = dataSourcePoi;
            return this;
        }
        public String getDataSourcePoi() {
            return this.dataSourcePoi;
        }

        public ListCityMapCameraResultsResponseData setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListCityMapCameraResultsResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

    }

}
