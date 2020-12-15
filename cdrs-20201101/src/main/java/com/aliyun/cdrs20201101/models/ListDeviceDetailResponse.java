// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListDeviceDetailResponse extends TeaModel {
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
    public java.util.List<ListDeviceDetailResponseData> data;

    public static ListDeviceDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceDetailResponse self = new ListDeviceDetailResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceDetailResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceDetailResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceDetailResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListDeviceDetailResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListDeviceDetailResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDeviceDetailResponse setData(java.util.List<ListDeviceDetailResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeviceDetailResponseData> getData() {
        return this.data;
    }

    public static class ListDeviceDetailResponseData extends TeaModel {
        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("CorpId")
        @Validation(required = true)
        public String corpId;

        @NameInMap("DataSourceName")
        @Validation(required = true)
        public String dataSourceName;

        @NameInMap("DataSourcePoi")
        @Validation(required = true)
        public String dataSourcePoi;

        @NameInMap("NearPoi")
        @Validation(required = true)
        public String nearPoi;

        @NameInMap("Latitude")
        @Validation(required = true)
        public String latitude;

        @NameInMap("Longitude")
        @Validation(required = true)
        public String longitude;

        public static ListDeviceDetailResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceDetailResponseData self = new ListDeviceDetailResponseData();
            return TeaModel.build(map, self);
        }

        public ListDeviceDetailResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDeviceDetailResponseData setCorpId(String corpId) {
            this.corpId = corpId;
            return this;
        }
        public String getCorpId() {
            return this.corpId;
        }

        public ListDeviceDetailResponseData setDataSourceName(String dataSourceName) {
            this.dataSourceName = dataSourceName;
            return this;
        }
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        public ListDeviceDetailResponseData setDataSourcePoi(String dataSourcePoi) {
            this.dataSourcePoi = dataSourcePoi;
            return this;
        }
        public String getDataSourcePoi() {
            return this.dataSourcePoi;
        }

        public ListDeviceDetailResponseData setNearPoi(String nearPoi) {
            this.nearPoi = nearPoi;
            return this;
        }
        public String getNearPoi() {
            return this.nearPoi;
        }

        public ListDeviceDetailResponseData setLatitude(String latitude) {
            this.latitude = latitude;
            return this;
        }
        public String getLatitude() {
            return this.latitude;
        }

        public ListDeviceDetailResponseData setLongitude(String longitude) {
            this.longitude = longitude;
            return this;
        }
        public String getLongitude() {
            return this.longitude;
        }

    }

}
