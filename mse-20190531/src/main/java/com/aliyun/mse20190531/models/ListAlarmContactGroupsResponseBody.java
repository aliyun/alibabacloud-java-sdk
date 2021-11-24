// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmContactGroupsResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAlarmContactGroupsResponseBodyData> data;

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

    public static ListAlarmContactGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmContactGroupsResponseBody self = new ListAlarmContactGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmContactGroupsResponseBody setData(java.util.List<ListAlarmContactGroupsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlarmContactGroupsResponseBodyData> getData() {
        return this.data;
    }

    public ListAlarmContactGroupsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAlarmContactGroupsResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListAlarmContactGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmContactGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlarmContactGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlarmContactGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmContactGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAlarmContactGroupsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlarmContactGroupsResponseBodyData extends TeaModel {
        @NameInMap("ContactGroupId")
        public String contactGroupId;

        @NameInMap("ContactGroupName")
        public String contactGroupName;

        public static ListAlarmContactGroupsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmContactGroupsResponseBodyData self = new ListAlarmContactGroupsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlarmContactGroupsResponseBodyData setContactGroupId(String contactGroupId) {
            this.contactGroupId = contactGroupId;
            return this;
        }
        public String getContactGroupId() {
            return this.contactGroupId;
        }

        public ListAlarmContactGroupsResponseBodyData setContactGroupName(String contactGroupName) {
            this.contactGroupName = contactGroupName;
            return this;
        }
        public String getContactGroupName() {
            return this.contactGroupName;
        }

    }

}
