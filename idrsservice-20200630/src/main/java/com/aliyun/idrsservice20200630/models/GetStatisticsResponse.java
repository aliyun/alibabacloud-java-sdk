// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetStatisticsResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public GetStatisticsResponseData data;

    public static GetStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsResponse self = new GetStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetStatisticsResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetStatisticsResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStatisticsResponse setData(GetStatisticsResponseData data) {
        this.data = data;
        return this;
    }
    public GetStatisticsResponseData getData() {
        return this.data;
    }

    public static class GetStatisticsResponseDataItemsDetail extends TeaModel {
        @NameInMap("ClientCount")
        @Validation(required = true)
        public Long clientCount;

        @NameInMap("CloudCount")
        @Validation(required = true)
        public Long cloudCount;

        @NameInMap("DepartmentId")
        @Validation(required = true)
        public String departmentId;

        @NameInMap("DepartmentName")
        @Validation(required = true)
        public String departmentName;

        @NameInMap("Month")
        @Validation(required = true)
        public Integer month;

        public static GetStatisticsResponseDataItemsDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsResponseDataItemsDetail self = new GetStatisticsResponseDataItemsDetail();
            return TeaModel.build(map, self);
        }

        public GetStatisticsResponseDataItemsDetail setClientCount(Long clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Long getClientCount() {
            return this.clientCount;
        }

        public GetStatisticsResponseDataItemsDetail setCloudCount(Long cloudCount) {
            this.cloudCount = cloudCount;
            return this;
        }
        public Long getCloudCount() {
            return this.cloudCount;
        }

        public GetStatisticsResponseDataItemsDetail setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public GetStatisticsResponseDataItemsDetail setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetStatisticsResponseDataItemsDetail setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

    }

    public static class GetStatisticsResponseDataItems extends TeaModel {
        @NameInMap("ClientCount")
        @Validation(required = true)
        public Long clientCount;

        @NameInMap("CloudCount")
        @Validation(required = true)
        public Long cloudCount;

        @NameInMap("DepartmentName")
        @Validation(required = true)
        public String departmentName;

        @NameInMap("Month")
        @Validation(required = true)
        public String month;

        @NameInMap("Detail")
        @Validation(required = true)
        public java.util.List<GetStatisticsResponseDataItemsDetail> detail;

        public static GetStatisticsResponseDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsResponseDataItems self = new GetStatisticsResponseDataItems();
            return TeaModel.build(map, self);
        }

        public GetStatisticsResponseDataItems setClientCount(Long clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Long getClientCount() {
            return this.clientCount;
        }

        public GetStatisticsResponseDataItems setCloudCount(Long cloudCount) {
            this.cloudCount = cloudCount;
            return this;
        }
        public Long getCloudCount() {
            return this.cloudCount;
        }

        public GetStatisticsResponseDataItems setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetStatisticsResponseDataItems setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

        public GetStatisticsResponseDataItems setDetail(java.util.List<GetStatisticsResponseDataItemsDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<GetStatisticsResponseDataItemsDetail> getDetail() {
            return this.detail;
        }

    }

    public static class GetStatisticsResponseData extends TeaModel {
        @NameInMap("Items")
        @Validation(required = true)
        public java.util.List<GetStatisticsResponseDataItems> items;

        public static GetStatisticsResponseData build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsResponseData self = new GetStatisticsResponseData();
            return TeaModel.build(map, self);
        }

        public GetStatisticsResponseData setItems(java.util.List<GetStatisticsResponseDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetStatisticsResponseDataItems> getItems() {
            return this.items;
        }

    }

}
