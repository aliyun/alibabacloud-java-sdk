// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aisearch20230101.models;

import com.aliyun.tea.*;

public class ListBatchTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListBatchTasksResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListBatchTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListBatchTasksResponseBody self = new ListBatchTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListBatchTasksResponseBody setData(ListBatchTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListBatchTasksResponseBodyData getData() {
        return this.data;
    }

    public ListBatchTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListBatchTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListBatchTasksResponseBodyDataIncrements extends TeaModel {
        @NameInMap("BucketName")
        public String bucketName;

        @NameInMap("CallbackAddress")
        public String callbackAddress;

        @NameInMap("CallbackTaskStatus")
        public String callbackTaskStatus;

        @NameInMap("ErrorUrl")
        public String errorUrl;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Msg")
        public String msg;

        @NameInMap("OssPath")
        public String ossPath;

        @NameInMap("Status")
        public String status;

        @NameInMap("UtcCreateTime")
        public String utcCreateTime;

        @NameInMap("UtcUpdateTime")
        public String utcUpdateTime;

        public static ListBatchTasksResponseBodyDataIncrements build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTasksResponseBodyDataIncrements self = new ListBatchTasksResponseBodyDataIncrements();
            return TeaModel.build(map, self);
        }

        public ListBatchTasksResponseBodyDataIncrements setBucketName(String bucketName) {
            this.bucketName = bucketName;
            return this;
        }
        public String getBucketName() {
            return this.bucketName;
        }

        public ListBatchTasksResponseBodyDataIncrements setCallbackAddress(String callbackAddress) {
            this.callbackAddress = callbackAddress;
            return this;
        }
        public String getCallbackAddress() {
            return this.callbackAddress;
        }

        public ListBatchTasksResponseBodyDataIncrements setCallbackTaskStatus(String callbackTaskStatus) {
            this.callbackTaskStatus = callbackTaskStatus;
            return this;
        }
        public String getCallbackTaskStatus() {
            return this.callbackTaskStatus;
        }

        public ListBatchTasksResponseBodyDataIncrements setErrorUrl(String errorUrl) {
            this.errorUrl = errorUrl;
            return this;
        }
        public String getErrorUrl() {
            return this.errorUrl;
        }

        public ListBatchTasksResponseBodyDataIncrements setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListBatchTasksResponseBodyDataIncrements setMsg(String msg) {
            this.msg = msg;
            return this;
        }
        public String getMsg() {
            return this.msg;
        }

        public ListBatchTasksResponseBodyDataIncrements setOssPath(String ossPath) {
            this.ossPath = ossPath;
            return this;
        }
        public String getOssPath() {
            return this.ossPath;
        }

        public ListBatchTasksResponseBodyDataIncrements setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListBatchTasksResponseBodyDataIncrements setUtcCreateTime(String utcCreateTime) {
            this.utcCreateTime = utcCreateTime;
            return this;
        }
        public String getUtcCreateTime() {
            return this.utcCreateTime;
        }

        public ListBatchTasksResponseBodyDataIncrements setUtcUpdateTime(String utcUpdateTime) {
            this.utcUpdateTime = utcUpdateTime;
            return this;
        }
        public String getUtcUpdateTime() {
            return this.utcUpdateTime;
        }

    }

    public static class ListBatchTasksResponseBodyData extends TeaModel {
        @NameInMap("Increments")
        public java.util.List<ListBatchTasksResponseBodyDataIncrements> increments;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Long total;

        public static ListBatchTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListBatchTasksResponseBodyData self = new ListBatchTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListBatchTasksResponseBodyData setIncrements(java.util.List<ListBatchTasksResponseBodyDataIncrements> increments) {
            this.increments = increments;
            return this;
        }
        public java.util.List<ListBatchTasksResponseBodyDataIncrements> getIncrements() {
            return this.increments;
        }

        public ListBatchTasksResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListBatchTasksResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListBatchTasksResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
