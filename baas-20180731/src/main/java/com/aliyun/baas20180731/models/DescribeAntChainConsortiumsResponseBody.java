// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainConsortiumsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainConsortiumsResponseBodyResult result;

    public static DescribeAntChainConsortiumsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConsortiumsResponseBody self = new DescribeAntChainConsortiumsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConsortiumsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainConsortiumsResponseBody setResult(DescribeAntChainConsortiumsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainConsortiumsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainConsortiumsResponseBodyResultAntConsortiums extends TeaModel {
        @NameInMap("ChainNum")
        public Long chainNum;

        @NameInMap("ConsortiumDescription")
        public String consortiumDescription;

        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("ConsortiumName")
        public String consortiumName;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("IsEmptyConsortium")
        public Boolean isEmptyConsortium;

        @NameInMap("MemberNum")
        public Long memberNum;

        @NameInMap("Role")
        public String role;

        @NameInMap("Status")
        public String status;

        public static DescribeAntChainConsortiumsResponseBodyResultAntConsortiums build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainConsortiumsResponseBodyResultAntConsortiums self = new DescribeAntChainConsortiumsResponseBodyResultAntConsortiums();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainConsortiumsResponseBodyResultAntConsortiums setChainNum(Long chainNum) {
            this.chainNum = chainNum;
            return this;
        }
        public Long getChainNum() {
            return this.chainNum;
        }

        public DescribeAntChainConsortiumsResponseBodyResultAntConsortiums setConsortiumDescription(String consortiumDescription) {
            this.consortiumDescription = consortiumDescription;
            return this;
        }
        public String getConsortiumDescription() {
            return this.consortiumDescription;
        }

        public DescribeAntChainConsortiumsResponseBodyResultAntConsortiums setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeAntChainConsortiumsResponseBodyResultAntConsortiums setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeAntChainConsortiumsResponseBodyResultAntConsortiums setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainConsortiumsResponseBodyResultAntConsortiums setIsEmptyConsortium(Boolean isEmptyConsortium) {
            this.isEmptyConsortium = isEmptyConsortium;
            return this;
        }
        public Boolean getIsEmptyConsortium() {
            return this.isEmptyConsortium;
        }

        public DescribeAntChainConsortiumsResponseBodyResultAntConsortiums setMemberNum(Long memberNum) {
            this.memberNum = memberNum;
            return this;
        }
        public Long getMemberNum() {
            return this.memberNum;
        }

        public DescribeAntChainConsortiumsResponseBodyResultAntConsortiums setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeAntChainConsortiumsResponseBodyResultAntConsortiums setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAntChainConsortiumsResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainConsortiumsResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainConsortiumsResponseBodyResultPagination self = new DescribeAntChainConsortiumsResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainConsortiumsResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainConsortiumsResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainConsortiumsResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainConsortiumsResponseBodyResult extends TeaModel {
        @NameInMap("AntConsortiums")
        public java.util.List<DescribeAntChainConsortiumsResponseBodyResultAntConsortiums> antConsortiums;

        @NameInMap("Pagination")
        public DescribeAntChainConsortiumsResponseBodyResultPagination pagination;

        public static DescribeAntChainConsortiumsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainConsortiumsResponseBodyResult self = new DescribeAntChainConsortiumsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainConsortiumsResponseBodyResult setAntConsortiums(java.util.List<DescribeAntChainConsortiumsResponseBodyResultAntConsortiums> antConsortiums) {
            this.antConsortiums = antConsortiums;
            return this;
        }
        public java.util.List<DescribeAntChainConsortiumsResponseBodyResultAntConsortiums> getAntConsortiums() {
            return this.antConsortiums;
        }

        public DescribeAntChainConsortiumsResponseBodyResult setPagination(DescribeAntChainConsortiumsResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainConsortiumsResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
