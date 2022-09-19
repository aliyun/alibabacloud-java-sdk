// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkAppAttemptsResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListSparkAppAttemptsResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static ListSparkAppAttemptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkAppAttemptsResponseBody self = new ListSparkAppAttemptsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkAppAttemptsResponseBody setData(ListSparkAppAttemptsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSparkAppAttemptsResponseBodyData getData() {
        return this.data;
    }

    public ListSparkAppAttemptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSparkAppAttemptsResponseBodyData extends TeaModel {
        @NameInMap("AttemptInfoList")
        public java.util.List<SparkAttemptInfo> attemptInfoList;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListSparkAppAttemptsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSparkAppAttemptsResponseBodyData self = new ListSparkAppAttemptsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSparkAppAttemptsResponseBodyData setAttemptInfoList(java.util.List<SparkAttemptInfo> attemptInfoList) {
            this.attemptInfoList = attemptInfoList;
            return this;
        }
        public java.util.List<SparkAttemptInfo> getAttemptInfoList() {
            return this.attemptInfoList;
        }

        public ListSparkAppAttemptsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListSparkAppAttemptsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListSparkAppAttemptsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
