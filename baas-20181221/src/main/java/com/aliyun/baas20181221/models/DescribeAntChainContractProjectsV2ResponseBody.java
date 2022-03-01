// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectsV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainContractProjectsV2ResponseBodyResult result;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

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
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
