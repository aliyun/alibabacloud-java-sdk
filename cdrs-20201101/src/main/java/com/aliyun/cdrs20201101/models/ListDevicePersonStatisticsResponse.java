// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListDevicePersonStatisticsResponse extends TeaModel {
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

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<ListDevicePersonStatisticsResponseData> data;

    public static ListDevicePersonStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDevicePersonStatisticsResponse self = new ListDevicePersonStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListDevicePersonStatisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDevicePersonStatisticsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDevicePersonStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevicePersonStatisticsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDevicePersonStatisticsResponse setData(java.util.List<ListDevicePersonStatisticsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDevicePersonStatisticsResponseData> getData() {
        return this.data;
    }

    public static class ListDevicePersonStatisticsResponseData extends TeaModel {
        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("ShotTime")
        @Validation(required = true)
        public String shotTime;

        @NameInMap("Number")
        @Validation(required = true)
        public String number;

        public static ListDevicePersonStatisticsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDevicePersonStatisticsResponseData self = new ListDevicePersonStatisticsResponseData();
            return TeaModel.build(map, self);
        }

        public ListDevicePersonStatisticsResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDevicePersonStatisticsResponseData setShotTime(String shotTime) {
            this.shotTime = shotTime;
            return this;
        }
        public String getShotTime() {
            return this.shotTime;
        }

        public ListDevicePersonStatisticsResponseData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

}
