// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetStatisticsResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public GetStatisticsResponseBodyData data;

    @NameInMap("Code")
    public String code;

    public static GetStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsResponseBody self = new GetStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetStatisticsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetStatisticsResponseBody setData(GetStatisticsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetStatisticsResponseBodyData getData() {
        return this.data;
    }

    public GetStatisticsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public static class GetStatisticsResponseBodyDataItemsDetail extends TeaModel {
        @NameInMap("DepartmentName")
        public String departmentName;

        @NameInMap("CloudCount")
        public Long cloudCount;

        @NameInMap("DepartmentId")
        public String departmentId;

        @NameInMap("Month")
        public Integer month;

        @NameInMap("ClientCount")
        public Long clientCount;

        public static GetStatisticsResponseBodyDataItemsDetail build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsResponseBodyDataItemsDetail self = new GetStatisticsResponseBodyDataItemsDetail();
            return TeaModel.build(map, self);
        }

        public GetStatisticsResponseBodyDataItemsDetail setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetStatisticsResponseBodyDataItemsDetail setCloudCount(Long cloudCount) {
            this.cloudCount = cloudCount;
            return this;
        }
        public Long getCloudCount() {
            return this.cloudCount;
        }

        public GetStatisticsResponseBodyDataItemsDetail setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public GetStatisticsResponseBodyDataItemsDetail setMonth(Integer month) {
            this.month = month;
            return this;
        }
        public Integer getMonth() {
            return this.month;
        }

        public GetStatisticsResponseBodyDataItemsDetail setClientCount(Long clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Long getClientCount() {
            return this.clientCount;
        }

    }

    public static class GetStatisticsResponseBodyDataItems extends TeaModel {
        @NameInMap("DepartmentName")
        public String departmentName;

        @NameInMap("CloudCount")
        public Long cloudCount;

        @NameInMap("Month")
        public String month;

        @NameInMap("ClientCount")
        public Long clientCount;

        @NameInMap("Detail")
        public java.util.List<GetStatisticsResponseBodyDataItemsDetail> detail;

        public static GetStatisticsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsResponseBodyDataItems self = new GetStatisticsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public GetStatisticsResponseBodyDataItems setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

        public GetStatisticsResponseBodyDataItems setCloudCount(Long cloudCount) {
            this.cloudCount = cloudCount;
            return this;
        }
        public Long getCloudCount() {
            return this.cloudCount;
        }

        public GetStatisticsResponseBodyDataItems setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

        public GetStatisticsResponseBodyDataItems setClientCount(Long clientCount) {
            this.clientCount = clientCount;
            return this;
        }
        public Long getClientCount() {
            return this.clientCount;
        }

        public GetStatisticsResponseBodyDataItems setDetail(java.util.List<GetStatisticsResponseBodyDataItemsDetail> detail) {
            this.detail = detail;
            return this;
        }
        public java.util.List<GetStatisticsResponseBodyDataItemsDetail> getDetail() {
            return this.detail;
        }

    }

    public static class GetStatisticsResponseBodyData extends TeaModel {
        @NameInMap("Items")
        public java.util.List<GetStatisticsResponseBodyDataItems> items;

        public static GetStatisticsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetStatisticsResponseBodyData self = new GetStatisticsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetStatisticsResponseBodyData setItems(java.util.List<GetStatisticsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<GetStatisticsResponseBodyDataItems> getItems() {
            return this.items;
        }

    }

}
