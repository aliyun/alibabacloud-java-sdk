// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainSubnetMemberListResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainSubnetMemberListResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainSubnetMemberListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainSubnetMemberListResponseBody self = new DescribeAntChainSubnetMemberListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainSubnetMemberListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainSubnetMemberListResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainSubnetMemberListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainSubnetMemberListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainSubnetMemberListResponseBody setResult(DescribeAntChainSubnetMemberListResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainSubnetMemberListResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainSubnetMemberListResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainSubnetMemberListResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainSubnetMemberListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList extends TeaModel {
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

        public static DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList self = new DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAntChainSubnetMemberListResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static DescribeAntChainSubnetMemberListResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainSubnetMemberListResponseBodyResultPagination self = new DescribeAntChainSubnetMemberListResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainSubnetMemberListResponseBodyResultPagination setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainSubnetMemberListResponseBodyResultPagination setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainSubnetMemberListResponseBodyResultPagination setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainSubnetMemberListResponseBodyResult extends TeaModel {
        @NameInMap("ConsortiumAdmin")
        public Boolean consortiumAdmin;

        @NameInMap("ConsortiumMemberInfoList")
        public java.util.List<DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList> consortiumMemberInfoList;

        @NameInMap("Pagination")
        public DescribeAntChainSubnetMemberListResponseBodyResultPagination pagination;

        public static DescribeAntChainSubnetMemberListResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainSubnetMemberListResponseBodyResult self = new DescribeAntChainSubnetMemberListResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainSubnetMemberListResponseBodyResult setConsortiumAdmin(Boolean consortiumAdmin) {
            this.consortiumAdmin = consortiumAdmin;
            return this;
        }
        public Boolean getConsortiumAdmin() {
            return this.consortiumAdmin;
        }

        public DescribeAntChainSubnetMemberListResponseBodyResult setConsortiumMemberInfoList(java.util.List<DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList> consortiumMemberInfoList) {
            this.consortiumMemberInfoList = consortiumMemberInfoList;
            return this;
        }
        public java.util.List<DescribeAntChainSubnetMemberListResponseBodyResultConsortiumMemberInfoList> getConsortiumMemberInfoList() {
            return this.consortiumMemberInfoList;
        }

        public DescribeAntChainSubnetMemberListResponseBodyResult setPagination(DescribeAntChainSubnetMemberListResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainSubnetMemberListResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
