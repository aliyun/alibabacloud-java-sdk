// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public DescribeAntChainContractProjectsResponseBodyResult result;

    public static DescribeAntChainContractProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAntChainContractProjectsResponseBody self = new DescribeAntChainContractProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAntChainContractProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAntChainContractProjectsResponseBody setResult(DescribeAntChainContractProjectsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAntChainContractProjectsResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAntChainContractProjectsResponseBodyResultContractProjects extends TeaModel {
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

        public static DescribeAntChainContractProjectsResponseBodyResultContractProjects build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectsResponseBodyResultContractProjects self = new DescribeAntChainContractProjectsResponseBodyResultContractProjects();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectsResponseBodyResultContractProjects setConsortiumId(String consortiumId) {
            this.consortiumId = consortiumId;
            return this;
        }
        public String getConsortiumId() {
            return this.consortiumId;
        }

        public DescribeAntChainContractProjectsResponseBodyResultContractProjects setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeAntChainContractProjectsResponseBodyResultContractProjects setProjectDescription(String projectDescription) {
            this.projectDescription = projectDescription;
            return this;
        }
        public String getProjectDescription() {
            return this.projectDescription;
        }

        public DescribeAntChainContractProjectsResponseBodyResultContractProjects setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public DescribeAntChainContractProjectsResponseBodyResultContractProjects setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public DescribeAntChainContractProjectsResponseBodyResultContractProjects setProjectVersion(String projectVersion) {
            this.projectVersion = projectVersion;
            return this;
        }
        public String getProjectVersion() {
            return this.projectVersion;
        }

        public DescribeAntChainContractProjectsResponseBodyResultContractProjects setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeAntChainContractProjectsResponseBodyResultPagination extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAntChainContractProjectsResponseBodyResultPagination build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectsResponseBodyResultPagination self = new DescribeAntChainContractProjectsResponseBodyResultPagination();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectsResponseBodyResultPagination setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeAntChainContractProjectsResponseBodyResultPagination setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAntChainContractProjectsResponseBodyResultPagination setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAntChainContractProjectsResponseBodyResult extends TeaModel {
        @NameInMap("ContractProjects")
        public java.util.List<DescribeAntChainContractProjectsResponseBodyResultContractProjects> contractProjects;

        @NameInMap("Pagination")
        public DescribeAntChainContractProjectsResponseBodyResultPagination pagination;

        public static DescribeAntChainContractProjectsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAntChainContractProjectsResponseBodyResult self = new DescribeAntChainContractProjectsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAntChainContractProjectsResponseBodyResult setContractProjects(java.util.List<DescribeAntChainContractProjectsResponseBodyResultContractProjects> contractProjects) {
            this.contractProjects = contractProjects;
            return this;
        }
        public java.util.List<DescribeAntChainContractProjectsResponseBodyResultContractProjects> getContractProjects() {
            return this.contractProjects;
        }

        public DescribeAntChainContractProjectsResponseBodyResult setPagination(DescribeAntChainContractProjectsResponseBodyResultPagination pagination) {
            this.pagination = pagination;
            return this;
        }
        public DescribeAntChainContractProjectsResponseBodyResultPagination getPagination() {
            return this.pagination;
        }

    }

}
