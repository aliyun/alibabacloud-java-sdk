// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class ModifyProjectResourceRequest extends TeaModel {
    @NameInMap("BatchLockResourceRequest")
    public ModifyProjectResourceRequestBatchLockResourceRequest batchLockResourceRequest;

    public static ModifyProjectResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyProjectResourceRequest self = new ModifyProjectResourceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyProjectResourceRequest setBatchLockResourceRequest(ModifyProjectResourceRequestBatchLockResourceRequest batchLockResourceRequest) {
        this.batchLockResourceRequest = batchLockResourceRequest;
        return this;
    }
    public ModifyProjectResourceRequestBatchLockResourceRequest getBatchLockResourceRequest() {
        return this.batchLockResourceRequest;
    }

    public static class ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList extends TeaModel {
        @NameInMap("Id")
        public Long id;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("LockStart")
        public Long lockStart;

        @NameInMap("LockEnd")
        public Long lockEnd;

        @NameInMap("LockDays")
        public Long lockDays;

        @NameInMap("TempLockStart")
        public Long tempLockStart;

        @NameInMap("TempLockEnd")
        public Long tempLockEnd;

        @NameInMap("TempLockDays")
        public Long tempLockDays;

        @NameInMap("DemandId")
        public Long demandId;

        @NameInMap("Status")
        public Long status;

        @NameInMap("ProcessStatus")
        public Long processStatus;

        @NameInMap("DeptManagerId")
        public String deptManagerId;

        @NameInMap("TeamManagerId")
        public String teamManagerId;

        public static ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList build(java.util.Map<String, ?> map) throws Exception {
            ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList self = new ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList();
            return TeaModel.build(map, self);
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setLockStart(Long lockStart) {
            this.lockStart = lockStart;
            return this;
        }
        public Long getLockStart() {
            return this.lockStart;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setLockEnd(Long lockEnd) {
            this.lockEnd = lockEnd;
            return this;
        }
        public Long getLockEnd() {
            return this.lockEnd;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setLockDays(Long lockDays) {
            this.lockDays = lockDays;
            return this;
        }
        public Long getLockDays() {
            return this.lockDays;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setTempLockStart(Long tempLockStart) {
            this.tempLockStart = tempLockStart;
            return this;
        }
        public Long getTempLockStart() {
            return this.tempLockStart;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setTempLockEnd(Long tempLockEnd) {
            this.tempLockEnd = tempLockEnd;
            return this;
        }
        public Long getTempLockEnd() {
            return this.tempLockEnd;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setTempLockDays(Long tempLockDays) {
            this.tempLockDays = tempLockDays;
            return this;
        }
        public Long getTempLockDays() {
            return this.tempLockDays;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setDemandId(Long demandId) {
            this.demandId = demandId;
            return this;
        }
        public Long getDemandId() {
            return this.demandId;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setProcessStatus(Long processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public Long getProcessStatus() {
            return this.processStatus;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setDeptManagerId(String deptManagerId) {
            this.deptManagerId = deptManagerId;
            return this;
        }
        public String getDeptManagerId() {
            return this.deptManagerId;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList setTeamManagerId(String teamManagerId) {
            this.teamManagerId = teamManagerId;
            return this;
        }
        public String getTeamManagerId() {
            return this.teamManagerId;
        }

    }

    public static class ModifyProjectResourceRequestBatchLockResourceRequest extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("LockResourceRequestList")
        public java.util.List<ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList> lockResourceRequestList;

        public static ModifyProjectResourceRequestBatchLockResourceRequest build(java.util.Map<String, ?> map) throws Exception {
            ModifyProjectResourceRequestBatchLockResourceRequest self = new ModifyProjectResourceRequestBatchLockResourceRequest();
            return TeaModel.build(map, self);
        }

        public ModifyProjectResourceRequestBatchLockResourceRequest setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ModifyProjectResourceRequestBatchLockResourceRequest setLockResourceRequestList(java.util.List<ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList> lockResourceRequestList) {
            this.lockResourceRequestList = lockResourceRequestList;
            return this;
        }
        public java.util.List<ModifyProjectResourceRequestBatchLockResourceRequestLockResourceRequestList> getLockResourceRequestList() {
            return this.lockResourceRequestList;
        }

    }

}
