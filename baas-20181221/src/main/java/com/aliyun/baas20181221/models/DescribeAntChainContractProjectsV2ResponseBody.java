// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectsV2ResponseBody extends TeaModel {
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
    public DescribeAntChainContractProjectsV2ResponseBodyResult result;

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

    public static DescribeAntChainContractProjectsV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectsV2ResponseBody self = new DescribeAntChainContractProjectsV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectsV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainContractProjectsV2ResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainContractProjectsV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainContractProjectsV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainContractProjectsV2ResponseBody setResult(DescribeAntChainContractProjectsV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainContractProjectsV2ResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainContractProjectsV2ResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainContractProjectsV2ResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainContractProjectsV2ResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>M8GaMEyX</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>1609848383000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectDescription")
        public String projectDescription;

        /**
         * <strong>example:</strong>
         * <p>RXwQj6m8</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("ProjectVersion")
        public String projectVersion;

        /**
         * <strong>example:</strong>
         * <p>1609848383000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects self = new DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects setProjectVersion(String projectVersion) {
            this.projectVersion = projectVersion;
            return this;
        }
        public String getProjectVersion() {
            return this.projectVersion;
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeAntChainContractProjectsV2ResponseBodyResultPagination extends TeaModel {
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

        public static DescribeAntChainContractProjectsV2ResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectsV2ResponseBodyResultPagination self = new DescribeAntChainContractProjectsV2ResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainContractProjectsV2ResponseBodyResult extends TeaModel {
        @NameInMap("ContractProjects")
        public java.util.List<DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects> contractProjects;

        @NameInMap("Pagination")
        public DescribeAntChainContractProjectsV2ResponseBodyResultPagination pagination;

        public static DescribeAntChainContractProjectsV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectsV2ResponseBodyResult self = new DescribeAntChainContractProjectsV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResult setContractProjects(java.util.List<DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects> contractProjects) {
            this.contractProjects = contractProjects;
            return this;
        }
        public java.util.List<DescribeAntChainContractProjectsV2ResponseBodyResultContractProjects> getContractProjects() {
            return this.contractProjects;
        }

        public DescribeAntChainContractProjectsV2ResponseBodyResult setPagination(DescribeAntChainContractProjectsV2ResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainContractProjectsV2ResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
