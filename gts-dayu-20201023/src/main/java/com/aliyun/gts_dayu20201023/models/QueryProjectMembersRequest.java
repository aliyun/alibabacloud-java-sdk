// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class QueryProjectMembersRequest extends TeaModel {
    @NameInMap("QueryLockResourceRequest")
    public QueryProjectMembersRequestQueryLockResourceRequest queryLockResourceRequest;

    public static QueryProjectMembersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectMembersRequest self = new QueryProjectMembersRequest();
        return TeaModel.build(map, self);
    }

    public QueryProjectMembersRequest setQueryLockResourceRequest(QueryProjectMembersRequestQueryLockResourceRequest queryLockResourceRequest) {
        this.queryLockResourceRequest = queryLockResourceRequest;
        return this;
    }
    public QueryProjectMembersRequestQueryLockResourceRequest getQueryLockResourceRequest() {
        return this.queryLockResourceRequest;
    }

    public static class QueryProjectMembersRequestQueryLockResourceRequest extends TeaModel {
        @NameInMap("DemandId")
        public Long demandId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("TitleId")
        public Long titleId;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("Name")
        public String name;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("DeptManagerId")
        public String deptManagerId;

        @NameInMap("TeamManagerId")
        public String teamManagerId;

        @NameInMap("ProcessStatus")
        public Long processStatus;

        @NameInMap("ProcessId")
        public String processId;

        @NameInMap("Type")
        public String type;

        @NameInMap("EvaluationLevel")
        public String evaluationLevel;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TenantId")
        public Long tenantId;

        public static QueryProjectMembersRequestQueryLockResourceRequest build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectMembersRequestQueryLockResourceRequest self = new QueryProjectMembersRequestQueryLockResourceRequest();
            return TeaModel.build(map, self);
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setDemandId(Long demandId) {
            this.demandId = demandId;
            return this;
        }
        public Long getDemandId() {
            return this.demandId;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setTitleId(Long titleId) {
            this.titleId = titleId;
            return this;
        }
        public Long getTitleId() {
            return this.titleId;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setDeptManagerId(String deptManagerId) {
            this.deptManagerId = deptManagerId;
            return this;
        }
        public String getDeptManagerId() {
            return this.deptManagerId;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setTeamManagerId(String teamManagerId) {
            this.teamManagerId = teamManagerId;
            return this;
        }
        public String getTeamManagerId() {
            return this.teamManagerId;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setProcessStatus(Long processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public Long getProcessStatus() {
            return this.processStatus;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setEvaluationLevel(String evaluationLevel) {
            this.evaluationLevel = evaluationLevel;
            return this;
        }
        public String getEvaluationLevel() {
            return this.evaluationLevel;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryProjectMembersRequestQueryLockResourceRequest setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

}
