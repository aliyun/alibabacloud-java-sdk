// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractJobsResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeSmartContractJobsResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSmartContractJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractJobsResponseBody self = new DescribeSmartContractJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractJobsResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeSmartContractJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartContractJobsResponseBody setResult(DescribeSmartContractJobsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSmartContractJobsResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeSmartContractJobsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSmartContractJobsResponseBodyResultContent extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("FinishedTime")
        public Long finishedTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Name")
        public String name;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("Status")
        public String status;

        @NameInMap("UserBid")
        public String userBid;

        @NameInMap("UserId")
        public Long userId;

        public static DescribeSmartContractJobsResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractJobsResponseBodyResultContent self = new DescribeSmartContractJobsResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractJobsResponseBodyResultContent setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSmartContractJobsResponseBodyResultContent setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeSmartContractJobsResponseBodyResultContent setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSmartContractJobsResponseBodyResultContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSmartContractJobsResponseBodyResultContent setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeSmartContractJobsResponseBodyResultContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSmartContractJobsResponseBodyResultContent setUserBid(String userBid) {
            this.userBid = userBid;
            return this;
        }
        public String getUserBid() {
            return this.userBid;
        }

        public DescribeSmartContractJobsResponseBodyResultContent setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

    }

    public static class DescribeSmartContractJobsResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public java.util.List<DescribeSmartContractJobsResponseBodyResultContent> content;

        @NameInMap("First")
        public Boolean first;

        @NameInMap("Last")
        public Boolean last;

        @NameInMap("NumberOfElements")
        public Integer numberOfElements;

        @NameInMap("Size")
        public Integer size;

        @NameInMap("TotalElements")
        public Integer totalElements;

        @NameInMap("TotalPages")
        public Integer totalPages;

        public static DescribeSmartContractJobsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractJobsResponseBodyResult self = new DescribeSmartContractJobsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractJobsResponseBodyResult setContent(java.util.List<DescribeSmartContractJobsResponseBodyResultContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeSmartContractJobsResponseBodyResultContent> getContent() {
            return this.content;
        }

        public DescribeSmartContractJobsResponseBodyResult setFirst(Boolean first) {
            this.first = first;
            return this;
        }
        public Boolean getFirst() {
            return this.first;
        }

        public DescribeSmartContractJobsResponseBodyResult setLast(Boolean last) {
            this.last = last;
            return this;
        }
        public Boolean getLast() {
            return this.last;
        }

        public DescribeSmartContractJobsResponseBodyResult setNumberOfElements(Integer numberOfElements) {
            this.numberOfElements = numberOfElements;
            return this;
        }
        public Integer getNumberOfElements() {
            return this.numberOfElements;
        }

        public DescribeSmartContractJobsResponseBodyResult setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeSmartContractJobsResponseBodyResult setTotalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Integer getTotalElements() {
            return this.totalElements;
        }

        public DescribeSmartContractJobsResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
