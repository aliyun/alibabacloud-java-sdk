// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectsNewResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainContractProjectsNewResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAntChainContractProjectsNewResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectsNewResponseBody self = new DescribeAntChainContractProjectsNewResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectsNewResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAntChainContractProjectsNewResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeAntChainContractProjectsNewResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAntChainContractProjectsNewResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainContractProjectsNewResponseBody setResult(DescribeAntChainContractProjectsNewResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainContractProjectsNewResponseBodyResult getResult() {
        return this.result;
    }

    public DescribeAntChainContractProjectsNewResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeAntChainContractProjectsNewResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public DescribeAntChainContractProjectsNewResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAntChainContractProjectsNewResponseBodyResultContractProjects extends TeaModel {
        @NameInMap("ConsortiumId")
        public String consortiumId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ProjectDescription")
        public String projectDescription;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProjectVersion")
        public String projectVersion;

        @NameInMap("UpdateTime")
        public Long updateTime;

        public static DescribeAntChainContractProjectsNewResponseBodyResultContractProjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectsNewResponseBodyResultContractProjects self = new DescribeAntChainContractProjectsNewResponseBodyResultContractProjects();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultContractProjects setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultContractProjects setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultContractProjects setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultContractProjects setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultContractProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultContractProjects setProjectVersion(String projectVersion) {
            this.projectVersion = projectVersion;
            return this;
        }
        public String getProjectVersion() {
            return this.projectVersion;
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultContractProjects setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeAntChainContractProjectsNewResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainContractProjectsNewResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectsNewResponseBodyResultPagination self = new DescribeAntChainContractProjectsNewResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainContractProjectsNewResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainContractProjectsNewResponseBodyResult extends TeaModel {
        @NameInMap("ContractProjects")
        public java.util.List<DescribeAntChainContractProjectsNewResponseBodyResultContractProjects> contractProjects;

        @NameInMap("Pagination")
        public DescribeAntChainContractProjectsNewResponseBodyResultPagination pagination;

        public static DescribeAntChainContractProjectsNewResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectsNewResponseBodyResult self = new DescribeAntChainContractProjectsNewResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectsNewResponseBodyResult setContractProjects(java.util.List<DescribeAntChainContractProjectsNewResponseBodyResultContractProjects> contractProjects) {
            this.contractProjects = contractProjects;
            return this;
        }
        public java.util.List<DescribeAntChainContractProjectsNewResponseBodyResultContractProjects> getContractProjects() {
            return this.contractProjects;
        }

        public DescribeAntChainContractProjectsNewResponseBodyResult setPagination(DescribeAntChainContractProjectsNewResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainContractProjectsNewResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
