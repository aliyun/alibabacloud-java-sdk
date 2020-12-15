// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListRangeDeviceResponse extends TeaModel {
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
    public java.util.List<ListRangeDeviceResponseData> data;

    public static ListRangeDeviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRangeDeviceResponse self = new ListRangeDeviceResponse();
        return TeaModel.build(map, self);
    }

    public ListRangeDeviceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRangeDeviceResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRangeDeviceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRangeDeviceResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRangeDeviceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRangeDeviceResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListRangeDeviceResponse setData(java.util.List<ListRangeDeviceResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListRangeDeviceResponseData> getData() {
        return this.data;
    }

    public static class ListRangeDeviceResponseData extends TeaModel {
        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("NearPoi")
        @Validation(required = true)
        public String nearPoi;

        @NameInMap("Distance")
        @Validation(required = true)
        public String distance;

        @NameInMap("DataSourceIdPoi")
        @Validation(required = true)
        public String dataSourceIdPoi;

        @NameInMap("Latitude")
        @Validation(required = true)
        public String latitude;

        @NameInMap("DataSourceIdName")
        @Validation(required = true)
        public String dataSourceIdName;

        @NameInMap("Longitude")
        @Validation(required = true)
        public String longitude;

        public static ListRangeDeviceResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListRangeDeviceResponseData self = new ListRangeDeviceResponseData();
            return TeaModel.build(map, self);
        }

        public ListRangeDeviceResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListRangeDeviceResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListRangeDeviceResponseData setNearPoi(String nearPoi) {
            this.nearPoi = nearPoi;
            return this;
        }
        public String getNearPoi() {
            return this.nearPoi;
        }

        public ListRangeDeviceResponseData setDistance(String distance) {
            this.distance = distance;
            return this;
        }
        public String getDistance() {
            return this.distance;
        }

        public ListRangeDeviceResponseData setDataSourceIdPoi(String dataSourceIdPoi) {
            this.dataSourceIdPoi = dataSourceIdPoi;
            return this;
        }
        public String getDataSourceIdPoi() {
            return this.dataSourceIdPoi;
        }

        public ListRangeDeviceResponseData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListRangeDeviceResponseData setDataSourceIdName(String dataSourceIdName) {
            this.dataSourceIdName = dataSourceIdName;
            return this;
        }
        public String getDataSourceIdName() {
            return this.dataSourceIdName;
        }

        public ListRangeDeviceResponseData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

    }

}
