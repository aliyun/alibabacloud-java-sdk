// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeLorneLogResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Data")
    @Validation(required = true)
    public java.util.List<DescribeLorneLogResponseData> data;

    public static DescribeLorneLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLorneLogResponse self = new DescribeLorneLogResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLorneLogResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLorneLogResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeLorneLogResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeLorneLogResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeLorneLogResponse setData(java.util.List<DescribeLorneLogResponseData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeLorneLogResponseData> getData() {
        return this.data;
    }

    public static class DescribeLorneLogResponseData extends TeaModel {
        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("Count")
        @Validation(required = true)
        public String count;

        @NameInMap("StartTime")
        @Validation(required = true)
        public String startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        public static DescribeLorneLogResponseData build(java.util.Map<String, ?> map) throws Exception {
            DescribeLorneLogResponseData self = new DescribeLorneLogResponseData();
            return TeaModel.build(map, self);
        }

        public DescribeLorneLogResponseData setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeLorneLogResponseData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeLorneLogResponseData setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public DescribeLorneLogResponseData setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeLorneLogResponseData setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

    }

}
