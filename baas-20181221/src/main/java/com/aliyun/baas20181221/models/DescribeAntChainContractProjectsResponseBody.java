// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeAntChainContractProjectsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>5EDAC16F-EA3E-4017-B223-D76220F985DF</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>DV80nJXq</p>
         */
        @NameInMap("ConsortiumId")
        public String consortiumId;

        /**
         * <strong>example:</strong>
         * <p>1562847564000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>description</p>
         */
        @NameInMap("ProjectDescription")
        public String projectDescription;

        /**
         * <strong>example:</strong>
         * <p>2L9VK68g</p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>projectname</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ProjectVersion")
        public String projectVersion;

        /**
         * <strong>example:</strong>
         * <p>1563954499000</p>
         */
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
         * <p>1</p>
         */
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
