// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneLogResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeLorneLogResponseBodyData> data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeLorneLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneLogResponseBody self = new DescribeLorneLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLorneLogResponseBody setData(java.util.List<DescribeLorneLogResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeLorneLogResponseBodyData> getData() {
        return this.data;
    }

    public DescribeLorneLogResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLorneLogResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLorneLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLorneLogResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeLorneLogResponseBodyData extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Count")
        public String count;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Message")
        public String message;

        @NameInMap("StartTime")
        public String startTime;

        public static DescribeLorneLogResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLorneLogResponseBodyData self = new DescribeLorneLogResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeLorneLogResponseBodyData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeLorneLogResponseBodyData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeLorneLogResponseBodyData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeLorneLogResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeLorneLogResponseBodyData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
