// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmItemsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAlarmItemsResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAlarmItemsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmItemsResponseBody self = new ListAlarmItemsResponseBody();
        return TeaModel.build(map, self);
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

    public ListAlarmItemsResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListAlarmItemsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmItemsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlarmItemsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlarmItemsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmItemsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAlarmItemsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlarmItemsResponseBodyData extends TeaModel {
        @NameInMap("AlarmCode")
        public String alarmCode;

        @NameInMap("AlarmDesc")
        public String alarmDesc;

        @NameInMap("ClusterType")
        public String clusterType;

        public static ListAlarmItemsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmItemsResponseBodyData self = new ListAlarmItemsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlarmItemsResponseBodyData setAlarmCode(String alarmCode) {
            this.alarmCode = alarmCode;
            return this;
        }
        public String getAlarmCode() {
            return this.alarmCode;
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

    }

}
