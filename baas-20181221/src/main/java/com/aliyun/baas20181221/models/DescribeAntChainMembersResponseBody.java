// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainMembersResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>E0DB75A2-28C8-4295-8851-A157FFB3DFED</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainMembersResponseBodyResult result;

    public static DescribeAntChainMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainMembersResponseBody self = new DescribeAntChainMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainMembersResponseBody setResult(DescribeAntChainMembersResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainMembersResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainMembersResponseBodyResultMembers extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1557477823000</p>
         */
        @NameInMap("JoinTime")
        public Long joinTime;

        /**
         * <strong>example:</strong>
         * <p>uid-1388601577407805</p>
         */
        @NameInMap("MemberId")
        public String memberId;

        /**
         * <strong>example:</strong>
         * <p>uid-1562589998337656</p>
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
         * <p>AllianceNotJoined</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeAntChainMembersResponseBodyResultMembers build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMembersResponseBodyResultMembers self = new DescribeAntChainMembersResponseBodyResultMembers();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMembersResponseBodyResultMembers setJoinTime(Long joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public Long getJoinTime() {
            return this.joinTime;
        }

        public DescribeAntChainMembersResponseBodyResultMembers setMemberId(String memberId) {
            this.memberId = memberId;
            return this;
        }
        public String getMemberId() {
            return this.memberId;
        }

        public DescribeAntChainMembersResponseBodyResultMembers setMemberName(String memberName) {
            this.memberName = memberName;
            return this;
        }
        public String getMemberName() {
            return this.memberName;
        }

        public DescribeAntChainMembersResponseBodyResultMembers setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeAntChainMembersResponseBodyResultMembers setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAntChainMembersResponseBodyResultPagination extends TeaModel {
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
         * <p>6</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainMembersResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMembersResponseBodyResultPagination self = new DescribeAntChainMembersResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMembersResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainMembersResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainMembersResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainMembersResponseBodyResult extends TeaModel {
        @NameInMap("Members")
        public java.util.List<DescribeAntChainMembersResponseBodyResultMembers> members;

        @NameInMap("Pagination")
        public DescribeAntChainMembersResponseBodyResultPagination pagination;

        public static DescribeAntChainMembersResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainMembersResponseBodyResult self = new DescribeAntChainMembersResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainMembersResponseBodyResult setMembers(java.util.List<DescribeAntChainMembersResponseBodyResultMembers> members) {
            this.members = members;
            return this;
        }
        public java.util.List<DescribeAntChainMembersResponseBodyResultMembers> getMembers() {
            return this.members;
        }

        public DescribeAntChainMembersResponseBodyResult setPagination(DescribeAntChainMembersResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainMembersResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
