// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainMembersNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMembersNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainMembersNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMembersNewResponseBody self = new DescribeAntChainMembersNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMembersNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainMembersNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainMembersNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainMembersNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMembersNewResponseBody setResult(DescribeAntChainMembersNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMembersNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainMembersNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainMembersNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainMembersNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainMembersNewResponseBodyResultMembers extends TeaModel {
        @NameInMap("JoinTime")
        public Long joinTime;

        @NameInMap("MemberId")
        public String memberId;

        @NameInMap("MemberName")
        public String memberName;

        @NameInMap("Role")
        public String role;

        @NameInMap("Status")
        public String status;

        public static DescribeAntChainMembersNewResponseBodyResultMembers build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMembersNewResponseBodyResultMembers self = new DescribeAntChainMembersNewResponseBodyResultMembers();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMembersNewResponseBodyResultMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public DescribeAntChainMembersNewResponseBodyResultMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DescribeAntChainMembersNewResponseBodyResultMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public DescribeAntChainMembersNewResponseBodyResultMembers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeAntChainMembersNewResponseBodyResultMembers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAntChainMembersNewResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainMembersNewResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMembersNewResponseBodyResultPagination self = new DescribeAntChainMembersNewResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMembersNewResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainMembersNewResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainMembersNewResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainMembersNewResponseBodyResult extends TeaModel {
        @NameInMap("Members")
        public java.util.List<DescribeAntChainMembersNewResponseBodyResultMembers> members;

        @NameInMap("Pagination")
        public DescribeAntChainMembersNewResponseBodyResultPagination pagination;

        public static DescribeAntChainMembersNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMembersNewResponseBodyResult self = new DescribeAntChainMembersNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMembersNewResponseBodyResult setMembers(java.util.List<DescribeAntChainMembersNewResponseBodyResultMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<DescribeAntChainMembersNewResponseBodyResultMembers> getMembers() {
            return this.members;
        }

        public DescribeAntChainMembersNewResponseBodyResult setPagination(DescribeAntChainMembersNewResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainMembersNewResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
