// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainCertificateApplicationsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainCertificateApplicationsResponseBodyResult result;

    public static DescribeAntChainCertificateApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainCertificateApplicationsResponseBody self = new DescribeAntChainCertificateApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainCertificateApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainCertificateApplicationsResponseBody setResult(DescribeAntChainCertificateApplicationsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainCertificateApplicationsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainCertificateApplicationsResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainCertificateApplicationsResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainCertificateApplicationsResponseBodyResultPagination self = new DescribeAntChainCertificateApplicationsResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("Updatetime")
        public Long updatetime;

        @NameInMap("Createtime")
        public Long createtime;

        @NameInMap("Bid")
        public String bid;

        @NameInMap("AntChainId")
        public String antChainId;

        @NameInMap("Username")
        public String username;

        public static DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications self = new DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications setUpdatetime(Long updatetime) {
            this.updatetime = updatetime;
            return this;
        }
        public Long getUpdatetime() {
            return this.updatetime;
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeAntChainCertificateApplicationsResponseBodyResult extends TeaModel {
        @NameInMap("Pagination")
        public DescribeAntChainCertificateApplicationsResponseBodyResultPagination pagination;

        @NameInMap("CertificateApplications")
        public java.util.List<DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications> certificateApplications;

        public static DescribeAntChainCertificateApplicationsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainCertificateApplicationsResponseBodyResult self = new DescribeAntChainCertificateApplicationsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResult setPagination(DescribeAntChainCertificateApplicationsResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainCertificateApplicationsResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

        public DescribeAntChainCertificateApplicationsResponseBodyResult setCertificateApplications(java.util.List<DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications> certificateApplications) {
            this.certificateApplications = certificateApplications;
            return this;
        }
        public java.util.List<DescribeAntChainCertificateApplicationsResponseBodyResultCertificateApplications> getCertificateApplications() {
            return this.certificateApplications;
        }

    }

}
