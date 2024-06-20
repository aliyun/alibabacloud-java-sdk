// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMembersV2ResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D68D66B6-1964-4073-8714-B49F5EF1AEFC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMembersV2ResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultCode")
    public String resultCode;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("ResultMessage")
    public String resultMessage;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainMembersV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMembersV2ResponseBody self = new DescribeAntChainMembersV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMembersV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainMembersV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainMembersV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainMembersV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMembersV2ResponseBody setResult(DescribeAntChainMembersV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMembersV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainMembersV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainMembersV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainMembersV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainMembersV2ResponseBodyResultMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1609745002000</p>
         */
        @NameInMap("JoinTime")
        public Long joinTime;

        /**
         * <strong>example:</strong>
         * <p>1034774750177934</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <strong>example:</strong>
         * <p>uid-1034774750177934</p>
         */
        @NameInMap("MemberName")
        public String memberName;

        /**
         * <strong>example:</strong>
         * <p>Member</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>AllianceJoined</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAntChainMembersV2ResponseBodyResultMembers build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMembersV2ResponseBodyResultMembers self = new DescribeAntChainMembersV2ResponseBodyResultMembers();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMembersV2ResponseBodyResultMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public DescribeAntChainMembersV2ResponseBodyResultMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DescribeAntChainMembersV2ResponseBodyResultMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public DescribeAntChainMembersV2ResponseBodyResultMembers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeAntChainMembersV2ResponseBodyResultMembers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAntChainMembersV2ResponseBodyResultPagination extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainMembersV2ResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMembersV2ResponseBodyResultPagination self = new DescribeAntChainMembersV2ResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMembersV2ResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainMembersV2ResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainMembersV2ResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainMembersV2ResponseBodyResult extends TeaModel {
        @NameInMap("Members")
        public java.util.List<DescribeAntChainMembersV2ResponseBodyResultMembers> members;

        @NameInMap("Pagination")
        public DescribeAntChainMembersV2ResponseBodyResultPagination pagination;

        public static DescribeAntChainMembersV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMembersV2ResponseBodyResult self = new DescribeAntChainMembersV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMembersV2ResponseBodyResult setMembers(java.util.List<DescribeAntChainMembersV2ResponseBodyResultMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<DescribeAntChainMembersV2ResponseBodyResultMembers> getMembers() {
            return this.members;
        }

        public DescribeAntChainMembersV2ResponseBodyResult setPagination(DescribeAntChainMembersV2ResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainMembersV2ResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
