// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class QueryProjectMembersResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("code")
    public String code;

    @NameInMap("message")
    public String message;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("meta")
    public java.util.Map<String, ?> meta;

    @NameInMap("data")
    public QueryProjectMembersResponseBodyData data;

    public static QueryProjectMembersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProjectMembersResponseBody self = new QueryProjectMembersResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProjectMembersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProjectMembersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProjectMembersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryProjectMembersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryProjectMembersResponseBody setMeta(java.util.Map<String, ?> meta) {
        this.meta = meta;
        return this;
    }
    public java.util.Map<String, ?> getMeta() {
        return this.meta;
    }

    public QueryProjectMembersResponseBody setData(QueryProjectMembersResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProjectMembersResponseBodyData getData() {
        return this.data;
    }

    public static class QueryProjectMembersResponseBodyDataRows extends TeaModel {
        @NameInMap("id")
        public Long id;

        @NameInMap("empId")
        public String empId;

        @NameInMap("name")
        public String name;

        @NameInMap("lockStart")
        public Long lockStart;

        @NameInMap("lockEnd")
        public Long lockEnd;

        @NameInMap("lockDays")
        public Long lockDays;

        @NameInMap("demandId")
        public Long demandId;

        @NameInMap("jobName")
        public String jobName;

        @NameInMap("titleName")
        public String titleName;

        @NameInMap("tempLockStart")
        public String tempLockStart;

        @NameInMap("tempLockEnd")
        public String tempLockEnd;

        @NameInMap("tempLockDays")
        public Long tempLockDays;

        @NameInMap("processStatus")
        public Long processStatus;

        @NameInMap("processStatusName")
        public String processStatusName;

        @NameInMap("deptManagerId")
        public String deptManagerId;

        @NameInMap("deptManagerName")
        public String deptManagerName;

        @NameInMap("teamManagerId")
        public String teamManagerId;

        @NameInMap("teamManagerName")
        public String teamManagerName;

        @NameInMap("processId")
        public String processId;

        @NameInMap("evaluationLevel")
        public Long evaluationLevel;

        @NameInMap("currentEmpId")
        public String currentEmpId;

        @NameInMap("currentEmpName")
        public String currentEmpName;

        @NameInMap("departmentId")
        public String departmentId;

        @NameInMap("departmentName")
        public String departmentName;

        public static QueryProjectMembersResponseBodyDataRows build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectMembersResponseBodyDataRows self = new QueryProjectMembersResponseBodyDataRows();
            return TeaModel.build(map, self);
        }

        public QueryProjectMembersResponseBodyDataRows setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryProjectMembersResponseBodyDataRows setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public QueryProjectMembersResponseBodyDataRows setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryProjectMembersResponseBodyDataRows setLockStart(Long lockStart) {
            this.lockStart = lockStart;
            return this;
        }
        public Long getLockStart() {
            return this.lockStart;
        }

        public QueryProjectMembersResponseBodyDataRows setLockEnd(Long lockEnd) {
            this.lockEnd = lockEnd;
            return this;
        }
        public Long getLockEnd() {
            return this.lockEnd;
        }

        public QueryProjectMembersResponseBodyDataRows setLockDays(Long lockDays) {
            this.lockDays = lockDays;
            return this;
        }
        public Long getLockDays() {
            return this.lockDays;
        }

        public QueryProjectMembersResponseBodyDataRows setDemandId(Long demandId) {
            this.demandId = demandId;
            return this;
        }
        public Long getDemandId() {
            return this.demandId;
        }

        public QueryProjectMembersResponseBodyDataRows setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public QueryProjectMembersResponseBodyDataRows setTitleName(String titleName) {
            this.titleName = titleName;
            return this;
        }
        public String getTitleName() {
            return this.titleName;
        }

        public QueryProjectMembersResponseBodyDataRows setTempLockStart(String tempLockStart) {
            this.tempLockStart = tempLockStart;
            return this;
        }
        public String getTempLockStart() {
            return this.tempLockStart;
        }

        public QueryProjectMembersResponseBodyDataRows setTempLockEnd(String tempLockEnd) {
            this.tempLockEnd = tempLockEnd;
            return this;
        }
        public String getTempLockEnd() {
            return this.tempLockEnd;
        }

        public QueryProjectMembersResponseBodyDataRows setTempLockDays(Long tempLockDays) {
            this.tempLockDays = tempLockDays;
            return this;
        }
        public Long getTempLockDays() {
            return this.tempLockDays;
        }

        public QueryProjectMembersResponseBodyDataRows setProcessStatus(Long processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public Long getProcessStatus() {
            return this.processStatus;
        }

        public QueryProjectMembersResponseBodyDataRows setProcessStatusName(String processStatusName) {
            this.processStatusName = processStatusName;
            return this;
        }
        public String getProcessStatusName() {
            return this.processStatusName;
        }

        public QueryProjectMembersResponseBodyDataRows setDeptManagerId(String deptManagerId) {
            this.deptManagerId = deptManagerId;
            return this;
        }
        public String getDeptManagerId() {
            return this.deptManagerId;
        }

        public QueryProjectMembersResponseBodyDataRows setDeptManagerName(String deptManagerName) {
            this.deptManagerName = deptManagerName;
            return this;
        }
        public String getDeptManagerName() {
            return this.deptManagerName;
        }

        public QueryProjectMembersResponseBodyDataRows setTeamManagerId(String teamManagerId) {
            this.teamManagerId = teamManagerId;
            return this;
        }
        public String getTeamManagerId() {
            return this.teamManagerId;
        }

        public QueryProjectMembersResponseBodyDataRows setTeamManagerName(String teamManagerName) {
            this.teamManagerName = teamManagerName;
            return this;
        }
        public String getTeamManagerName() {
            return this.teamManagerName;
        }

        public QueryProjectMembersResponseBodyDataRows setProcessId(String processId) {
            this.processId = processId;
            return this;
        }
        public String getProcessId() {
            return this.processId;
        }

        public QueryProjectMembersResponseBodyDataRows setEvaluationLevel(Long evaluationLevel) {
            this.evaluationLevel = evaluationLevel;
            return this;
        }
        public Long getEvaluationLevel() {
            return this.evaluationLevel;
        }

        public QueryProjectMembersResponseBodyDataRows setCurrentEmpId(String currentEmpId) {
            this.currentEmpId = currentEmpId;
            return this;
        }
        public String getCurrentEmpId() {
            return this.currentEmpId;
        }

        public QueryProjectMembersResponseBodyDataRows setCurrentEmpName(String currentEmpName) {
            this.currentEmpName = currentEmpName;
            return this;
        }
        public String getCurrentEmpName() {
            return this.currentEmpName;
        }

        public QueryProjectMembersResponseBodyDataRows setDepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public String getDepartmentId() {
            return this.departmentId;
        }

        public QueryProjectMembersResponseBodyDataRows setDepartmentName(String departmentName) {
            this.departmentName = departmentName;
            return this;
        }
        public String getDepartmentName() {
            return this.departmentName;
        }

    }

    public static class QueryProjectMembersResponseBodyData extends TeaModel {
        @NameInMap("pageSize")
        public Long pageSize;

        @NameInMap("currentPage")
        public Long currentPage;

        @NameInMap("totalCount")
        public Long totalCount;

        @NameInMap("rows")
        public java.util.List<QueryProjectMembersResponseBodyDataRows> rows;

        public static QueryProjectMembersResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProjectMembersResponseBodyData self = new QueryProjectMembersResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProjectMembersResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public QueryProjectMembersResponseBodyData setCurrentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Long getCurrentPage() {
            return this.currentPage;
        }

        public QueryProjectMembersResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryProjectMembersResponseBodyData setRows(java.util.List<QueryProjectMembersResponseBodyDataRows> rows) {
            this.rows = rows;
            return this;
        }
        public java.util.List<QueryProjectMembersResponseBodyDataRows> getRows() {
            return this.rows;
        }

    }

}
