// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainCertificateApplicationsNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainCertificateApplicationsNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainCertificateApplicationsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainCertificateApplicationsNewResponseBody self = new DescribeAntChainCertificateApplicationsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainCertificateApplicationsNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainCertificateApplicationsNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainCertificateApplicationsNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainCertificateApplicationsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainCertificateApplicationsNewResponseBody setResult(DescribeAntChainCertificateApplicationsNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainCertificateApplicationsNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainCertificateApplicationsNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainCertificateApplicationsNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainCertificateApplicationsNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications extends TeaModel {
        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("Createtime")
        public Long createtime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Updatetime")
        public Long updatetime;

        @NameInMap("Username")
        public String username;

        public static DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications self = new DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications setUpdatetime(Long updatetime) {
            this.updatetime = updatetime;
            return this;
        }
        public Long getUpdatetime() {
            return this.updatetime;
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination self = new DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainCertificateApplicationsNewResponseBodyResult extends TeaModel {
        @NameInMap("CertificateApplications")
        public java.util.List<DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications> certificateApplications;

        @NameInMap("Pagination")
        public DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination pagination;

        public static DescribeAntChainCertificateApplicationsNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainCertificateApplicationsNewResponseBodyResult self = new DescribeAntChainCertificateApplicationsNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResult setCertificateApplications(java.util.List<DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications> certificateApplications) {
            this.certificateApplications = certificateApplications;
            return this;
        }
        public java.util.List<DescribeAntChainCertificateApplicationsNewResponseBodyResultCertificateApplications> getCertificateApplications() {
            return this.certificateApplications;
        }

        public DescribeAntChainCertificateApplicationsNewResponseBodyResult setPagination(DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainCertificateApplicationsNewResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
