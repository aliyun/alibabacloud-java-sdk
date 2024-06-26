// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeSmartContractJobsByNameResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public Integer errorCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeSmartContractJobsByNameResponseBodyResult result;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSmartContractJobsByNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSmartContractJobsByNameResponseBody self = new DescribeSmartContractJobsByNameResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSmartContractJobsByNameResponseBody setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Integer getErrorCode() {
        return this.errorCode;
    }

    public DescribeSmartContractJobsByNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSmartContractJobsByNameResponseBody setResult(DescribeSmartContractJobsByNameResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeSmartContractJobsByNameResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeSmartContractJobsByNameResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSmartContractJobsByNameResponseBodyResultContent extends TeaModel {
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
        public String userId;

        public static DescribeSmartContractJobsByNameResponseBodyResultContent build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractJobsByNameResponseBodyResultContent self = new DescribeSmartContractJobsByNameResponseBodyResultContent();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractJobsByNameResponseBodyResultContent setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeSmartContractJobsByNameResponseBodyResultContent setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public DescribeSmartContractJobsByNameResponseBodyResultContent setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public DescribeSmartContractJobsByNameResponseBodyResultContent setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSmartContractJobsByNameResponseBodyResultContent setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public DescribeSmartContractJobsByNameResponseBodyResultContent setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeSmartContractJobsByNameResponseBodyResultContent setUserBid(String userBid) {
            this.userBid = userBid;
            return this;
        }
        public String getUserBid() {
            return this.userBid;
        }

        public DescribeSmartContractJobsByNameResponseBodyResultContent setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeSmartContractJobsByNameResponseBodyResult extends TeaModel {
        @NameInMap("Content")
        public java.util.List<DescribeSmartContractJobsByNameResponseBodyResultContent> content;

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

        public static DescribeSmartContractJobsByNameResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeSmartContractJobsByNameResponseBodyResult self = new DescribeSmartContractJobsByNameResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeSmartContractJobsByNameResponseBodyResult setContent(java.util.List<DescribeSmartContractJobsByNameResponseBodyResultContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<DescribeSmartContractJobsByNameResponseBodyResultContent> getContent() {
            return this.content;
        }

        public DescribeSmartContractJobsByNameResponseBodyResult setFirst(Boolean first) {
            this.first = first;
            return this;
        }
        public Boolean getFirst() {
            return this.first;
        }

        public DescribeSmartContractJobsByNameResponseBodyResult setLast(Boolean last) {
            this.last = last;
            return this;
        }
        public Boolean getLast() {
            return this.last;
        }

        public DescribeSmartContractJobsByNameResponseBodyResult setNumberOfElements(Integer numberOfElements) {
            this.numberOfElements = numberOfElements;
            return this;
        }
        public Integer getNumberOfElements() {
            return this.numberOfElements;
        }

        public DescribeSmartContractJobsByNameResponseBodyResult setSize(Integer size) {
            this.size = size;
            return this;
        }
        public Integer getSize() {
            return this.size;
        }

        public DescribeSmartContractJobsByNameResponseBodyResult setTotalElements(Integer totalElements) {
            this.totalElements = totalElements;
            return this;
        }
        public Integer getTotalElements() {
            return this.totalElements;
        }

        public DescribeSmartContractJobsByNameResponseBodyResult setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
