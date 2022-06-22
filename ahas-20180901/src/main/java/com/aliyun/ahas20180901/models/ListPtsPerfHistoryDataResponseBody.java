// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class ListPtsPerfHistoryDataResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListPtsPerfHistoryDataResponseBodyData> data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListPtsPerfHistoryDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListPtsPerfHistoryDataResponseBody self = new ListPtsPerfHistoryDataResponseBody();
        return TeaModel.build(map, self);
    }

    public ListPtsPerfHistoryDataResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListPtsPerfHistoryDataResponseBody setData(java.util.List<ListPtsPerfHistoryDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListPtsPerfHistoryDataResponseBodyData> getData() {
        return this.data;
    }

    public ListPtsPerfHistoryDataResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListPtsPerfHistoryDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListPtsPerfHistoryDataResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListPtsPerfHistoryDataResponseBodyDataResult extends TeaModel {
        @NameInMap("DataIndicatorDesc")
        public String dataIndicatorDesc;

        @NameInMap("DataIndicatorType")
        public String dataIndicatorType;

        @NameInMap("DataValue")
        public String dataValue;

        @NameInMap("InstanceType")
        public String instanceType;

        @NameInMap("ObjectName")
        public String objectName;

        @NameInMap("TimeStamp")
        public Long timeStamp;

        public static ListPtsPerfHistoryDataResponseBodyDataResult build(java.util.Map<String, ?> map) throws Exception {
            ListPtsPerfHistoryDataResponseBodyDataResult self = new ListPtsPerfHistoryDataResponseBodyDataResult();
            return TeaModel.build(map, self);
        }

        public ListPtsPerfHistoryDataResponseBodyDataResult setDataIndicatorDesc(String dataIndicatorDesc) {
            this.dataIndicatorDesc = dataIndicatorDesc;
            return this;
        }
        public String getDataIndicatorDesc() {
            return this.dataIndicatorDesc;
        }

        public ListPtsPerfHistoryDataResponseBodyDataResult setDataIndicatorType(String dataIndicatorType) {
            this.dataIndicatorType = dataIndicatorType;
            return this;
        }
        public String getDataIndicatorType() {
            return this.dataIndicatorType;
        }

        public ListPtsPerfHistoryDataResponseBodyDataResult setDataValue(String dataValue) {
            this.dataValue = dataValue;
            return this;
        }
        public String getDataValue() {
            return this.dataValue;
        }

        public ListPtsPerfHistoryDataResponseBodyDataResult setInstanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }
        public String getInstanceType() {
            return this.instanceType;
        }

        public ListPtsPerfHistoryDataResponseBodyDataResult setObjectName(String objectName) {
            this.objectName = objectName;
            return this;
        }
        public String getObjectName() {
            return this.objectName;
        }

        public ListPtsPerfHistoryDataResponseBodyDataResult setTimeStamp(Long timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public Long getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class ListPtsPerfHistoryDataResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Result")
        public java.util.List<ListPtsPerfHistoryDataResponseBodyDataResult> result;

        @NameInMap("TotalItem")
        public Long totalItem;

        @NameInMap("TotalPage")
        public Integer totalPage;

        public static ListPtsPerfHistoryDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListPtsPerfHistoryDataResponseBodyData self = new ListPtsPerfHistoryDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListPtsPerfHistoryDataResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListPtsPerfHistoryDataResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListPtsPerfHistoryDataResponseBodyData setResult(java.util.List<ListPtsPerfHistoryDataResponseBodyDataResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<ListPtsPerfHistoryDataResponseBodyDataResult> getResult() {
            return this.result;
        }

        public ListPtsPerfHistoryDataResponseBodyData setTotalItem(Long totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Long getTotalItem() {
            return this.totalItem;
        }

        public ListPtsPerfHistoryDataResponseBodyData setTotalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Integer getTotalPage() {
            return this.totalPage;
        }

    }

}
