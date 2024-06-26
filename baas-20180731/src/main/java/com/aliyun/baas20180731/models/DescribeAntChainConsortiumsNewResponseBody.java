// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainConsortiumsNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainConsortiumsNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainConsortiumsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConsortiumsNewResponseBody self = new DescribeAntChainConsortiumsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConsortiumsNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainConsortiumsNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainConsortiumsNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainConsortiumsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainConsortiumsNewResponseBody setResult(DescribeAntChainConsortiumsNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainConsortiumsNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainConsortiumsNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainConsortiumsNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainConsortiumsNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums extends TeaModel {
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

        public static DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums self = new DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums setChainNum(Long chainNum) {
            this.chainNum = chainNum;
            return this;
        }
        public Long getChainNum() {
            return this.chainNum;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums setConsortiumDescription(String consortiumDescription) {
            this.consortiumDescription = consortiumDescription;
            return this;
        }
        public String getConsortiumDescription() {
            return this.consortiumDescription;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums setIsEmptyConsortium(Boolean isEmptyConsortium) {
            this.isEmptyConsortium = isEmptyConsortium;
            return this;
        }
        public Boolean getIsEmptyConsortium() {
            return this.isEmptyConsortium;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums setMemberNum(Long memberNum) {
            this.memberNum = memberNum;
            return this;
        }
        public Long getMemberNum() {
            return this.memberNum;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAntChainConsortiumsNewResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainConsortiumsNewResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainConsortiumsNewResponseBodyResultPagination self = new DescribeAntChainConsortiumsNewResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainConsortiumsNewResponseBodyResult extends TeaModel {
        @NameInMap("AntConsortiums")
        public java.util.List<DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums> antConsortiums;

        @NameInMap("Pagination")
        public DescribeAntChainConsortiumsNewResponseBodyResultPagination pagination;

        public static DescribeAntChainConsortiumsNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainConsortiumsNewResponseBodyResult self = new DescribeAntChainConsortiumsNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainConsortiumsNewResponseBodyResult setAntConsortiums(java.util.List<DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums> antConsortiums) {
            this.antConsortiums = antConsortiums;
            return this;
        }
        public java.util.List<DescribeAntChainConsortiumsNewResponseBodyResultAntConsortiums> getAntConsortiums() {
            return this.antConsortiums;
        }

        public DescribeAntChainConsortiumsNewResponseBodyResult setPagination(DescribeAntChainConsortiumsNewResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainConsortiumsNewResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
