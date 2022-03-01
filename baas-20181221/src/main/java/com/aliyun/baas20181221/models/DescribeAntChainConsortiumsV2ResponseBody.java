// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainConsortiumsV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainConsortiumsV2ResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainConsortiumsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainConsortiumsV2ResponseBody self = new DescribeAntChainConsortiumsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainConsortiumsV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainConsortiumsV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainConsortiumsV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainConsortiumsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainConsortiumsV2ResponseBody setResult(DescribeAntChainConsortiumsV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainConsortiumsV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainConsortiumsV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainConsortiumsV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainConsortiumsV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums extends TeaModel {
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

        public static DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums self = new DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums setChainNum(Long chainNum) {
            this.chainNum = chainNum;
            return this;
        }
        public Long getChainNum() {
            return this.chainNum;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums setConsortiumDescription(String consortiumDescription) {
            this.consortiumDescription = consortiumDescription;
            return this;
        }
        public String getConsortiumDescription() {
            return this.consortiumDescription;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums setConsortiumName(String consortiumName) {
            this.consortiumName = consortiumName;
            return this;
        }
        public String getConsortiumName() {
            return this.consortiumName;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums setIsEmptyConsortium(Boolean isEmptyConsortium) {
            this.isEmptyConsortium = isEmptyConsortium;
            return this;
        }
        public Boolean getIsEmptyConsortium() {
            return this.isEmptyConsortium;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums setMemberNum(Long memberNum) {
            this.memberNum = memberNum;
            return this;
        }
        public Long getMemberNum() {
            return this.memberNum;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeAntChainConsortiumsV2ResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainConsortiumsV2ResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainConsortiumsV2ResponseBodyResultPagination self = new DescribeAntChainConsortiumsV2ResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainConsortiumsV2ResponseBodyResult extends TeaModel {
        @NameInMap("AntConsortiums")
        public java.util.List<DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums> antConsortiums;

        @NameInMap("Pagination")
        public DescribeAntChainConsortiumsV2ResponseBodyResultPagination pagination;

        public static DescribeAntChainConsortiumsV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainConsortiumsV2ResponseBodyResult self = new DescribeAntChainConsortiumsV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResult setAntConsortiums(java.util.List<DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums> antConsortiums) {
            this.antConsortiums = antConsortiums;
            return this;
        }
        public java.util.List<DescribeAntChainConsortiumsV2ResponseBodyResultAntConsortiums> getAntConsortiums() {
            return this.antConsortiums;
        }

        public DescribeAntChainConsortiumsV2ResponseBodyResult setPagination(DescribeAntChainConsortiumsV2ResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainConsortiumsV2ResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
