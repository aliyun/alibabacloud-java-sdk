// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainCertificateApplicationsV2ResponseBody extends TeaModel {
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
    public DescribeAntChainCertificateApplicationsV2ResponseBodyResult result;

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

    public static DescribeAntChainCertificateApplicationsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainCertificateApplicationsV2ResponseBody self = new DescribeAntChainCertificateApplicationsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainCertificateApplicationsV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainCertificateApplicationsV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainCertificateApplicationsV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainCertificateApplicationsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainCertificateApplicationsV2ResponseBody setResult(DescribeAntChainCertificateApplicationsV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainCertificateApplicationsV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainCertificateApplicationsV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainCertificateApplicationsV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainCertificateApplicationsV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>8bd720bde18c4b37b0f4a1c7834db163</p>
         */
        @NameInMap("AntChainId")
        public String antChainId;

        /**
         * <strong>example:</strong>
         * <p>26842</p>
         */
        @NameInMap("Bid")
        public String bid;

        /**
         * <strong>example:</strong>
         * <p>1609848404000</p>
         */
        @NameInMap("Createtime")
        public Long createtime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>1609848404000</p>
         */
        @NameInMap("Updatetime")
        public Long updatetime;

        /**
         * <strong>example:</strong>
         * <p>uid-103477475017****</p>
         */
        @NameInMap("Username")
        public String username;

        public static DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications self = new DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications setAntChainId(String antChainId) {
            this.antChainId = antChainId;
            return this;
        }
        public String getAntChainId() {
            return this.antChainId;
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications setCreatetime(Long createtime) {
            this.createtime = createtime;
            return this;
        }
        public Long getCreatetime() {
            return this.createtime;
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications setUpdatetime(Long updatetime) {
            this.updatetime = updatetime;
            return this;
        }
        public Long getUpdatetime() {
            return this.updatetime;
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications setUsername(String username) {
            this.username = username;
            return this;
        }
        public String getUsername() {
            return this.username;
        }

    }

    public static class DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination extends TeaModel {
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

        public static DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination self = new DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainCertificateApplicationsV2ResponseBodyResult extends TeaModel {
        @NameInMap("CertificateApplications")
        public java.util.List<DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications> certificateApplications;

        @NameInMap("Pagination")
        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination pagination;

        public static DescribeAntChainCertificateApplicationsV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainCertificateApplicationsV2ResponseBodyResult self = new DescribeAntChainCertificateApplicationsV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResult setCertificateApplications(java.util.List<DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications> certificateApplications) {
            this.certificateApplications = certificateApplications;
            return this;
        }
        public java.util.List<DescribeAntChainCertificateApplicationsV2ResponseBodyResultCertificateApplications> getCertificateApplications() {
            return this.certificateApplications;
        }

        public DescribeAntChainCertificateApplicationsV2ResponseBodyResult setPagination(DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainCertificateApplicationsV2ResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
