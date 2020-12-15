// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListDeviceGenderStatisticsResponse extends TeaModel {
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
    public java.util.List<ListDeviceGenderStatisticsResponseData> data;

    public static ListDeviceGenderStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDeviceGenderStatisticsResponse self = new ListDeviceGenderStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public ListDeviceGenderStatisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListDeviceGenderStatisticsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListDeviceGenderStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDeviceGenderStatisticsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDeviceGenderStatisticsResponse setData(java.util.List<ListDeviceGenderStatisticsResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListDeviceGenderStatisticsResponseData> getData() {
        return this.data;
    }

    public static class ListDeviceGenderStatisticsResponseData extends TeaModel {
        @NameInMap("DataSourceId")
        @Validation(required = true)
        public String dataSourceId;

        @NameInMap("Gender")
        @Validation(required = true)
        public String gender;

        @NameInMap("Number")
        @Validation(required = true)
        public String number;

        public static ListDeviceGenderStatisticsResponseData build(java.util.Map<String, ?> map) throws Exception {
            ListDeviceGenderStatisticsResponseData self = new ListDeviceGenderStatisticsResponseData();
            return TeaModel.build(map, self);
        }

        public ListDeviceGenderStatisticsResponseData setDataSourceId(String dataSourceId) {
            this.dataSourceId = dataSourceId;
            return this;
        }
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        public ListDeviceGenderStatisticsResponseData setGender(String gender) {
            this.gender = gender;
            return this;
        }
        public String getGender() {
            return this.gender;
        }

        public ListDeviceGenderStatisticsResponseData setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

    }

}
