// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmItemsResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Data")
    public java.util.List<ListAlarmItemsResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static ListAlarmItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmItemsResponseBody self = new ListAlarmItemsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmItemsResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListAlarmItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAlarmItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmItemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlarmItemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlarmItemsResponseBody setData(java.util.List<ListAlarmItemsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlarmItemsResponseBodyData> getData() {
        return this.data;
    }

    public ListAlarmItemsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAlarmItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlarmItemsResponseBodyData extends TeaModel {
        @NameInMap("AlarmDesc")
        public String alarmDesc;

        @NameInMap("ClusterType")
        public String clusterType;

        @NameInMap("AlarmCode")
        public String alarmCode;

        public static ListAlarmItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmItemsResponseBodyData self = new ListAlarmItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlarmItemsResponseBodyData setAlarmDesc(String alarmDesc) {
            this.alarmDesc = alarmDesc;
            return this;
        }
        public String getAlarmDesc() {
            return this.alarmDesc;
        }

        public ListAlarmItemsResponseBodyData setClusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }
        public String getClusterType() {
            return this.clusterType;
        }

        public ListAlarmItemsResponseBodyData setAlarmCode(String alarmCode) {
            this.alarmCode = alarmCode;
            return this;
        }
        public String getAlarmCode() {
            return this.alarmCode;
        }

    }

}
