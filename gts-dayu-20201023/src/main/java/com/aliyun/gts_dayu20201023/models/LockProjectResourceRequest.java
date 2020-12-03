// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gts_dayu20201023.models;

import com.aliyun.tea.*;

public class LockProjectResourceRequest extends TeaModel {
    @NameInMap("ResourceLockRequest")
    public LockProjectResourceRequestResourceLockRequest resourceLockRequest;

    public static LockProjectResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        LockProjectResourceRequest self = new LockProjectResourceRequest();
        return TeaModel.build(map, self);
    }

    public LockProjectResourceRequest setResourceLockRequest(LockProjectResourceRequestResourceLockRequest resourceLockRequest) {
        this.resourceLockRequest = resourceLockRequest;
        return this;
    }
    public LockProjectResourceRequestResourceLockRequest getResourceLockRequest() {
        return this.resourceLockRequest;
    }

    public static class LockProjectResourceRequestResourceLockRequestAcuRequestList extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("EmpId")
        public String empId;

        @NameInMap("LockStart")
        public Long lockStart;

        @NameInMap("LockEnd")
        public Long lockEnd;

        @NameInMap("LockDays")
        public Long lockDays;

        @NameInMap("DepartmentId")
        public Long departmentId;

        @NameInMap("ResourcePoolType")
        public String resourcePoolType;

        public static LockProjectResourceRequestResourceLockRequestAcuRequestList build(java.util.Map<String, ?> map) throws Exception {
            LockProjectResourceRequestResourceLockRequestAcuRequestList self = new LockProjectResourceRequestResourceLockRequestAcuRequestList();
            return TeaModel.build(map, self);
        }

        public LockProjectResourceRequestResourceLockRequestAcuRequestList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public LockProjectResourceRequestResourceLockRequestAcuRequestList setEmpId(String empId) {
            this.empId = empId;
            return this;
        }
        public String getEmpId() {
            return this.empId;
        }

        public LockProjectResourceRequestResourceLockRequestAcuRequestList setLockStart(Long lockStart) {
            this.lockStart = lockStart;
            return this;
        }
        public Long getLockStart() {
            return this.lockStart;
        }

        public LockProjectResourceRequestResourceLockRequestAcuRequestList setLockEnd(Long lockEnd) {
            this.lockEnd = lockEnd;
            return this;
        }
        public Long getLockEnd() {
            return this.lockEnd;
        }

        public LockProjectResourceRequestResourceLockRequestAcuRequestList setLockDays(Long lockDays) {
            this.lockDays = lockDays;
            return this;
        }
        public Long getLockDays() {
            return this.lockDays;
        }

        public LockProjectResourceRequestResourceLockRequestAcuRequestList setDepartmentId(Long departmentId) {
            this.departmentId = departmentId;
            return this;
        }
        public Long getDepartmentId() {
            return this.departmentId;
        }

        public LockProjectResourceRequestResourceLockRequestAcuRequestList setResourcePoolType(String resourcePoolType) {
            this.resourcePoolType = resourcePoolType;
            return this;
        }
        public String getResourcePoolType() {
            return this.resourcePoolType;
        }

    }

    public static class LockProjectResourceRequestResourceLockRequest extends TeaModel {
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("DemandId")
        public Long demandId;

        @NameInMap("AcuRequestList")
        public java.util.List<LockProjectResourceRequestResourceLockRequestAcuRequestList> acuRequestList;

        public static LockProjectResourceRequestResourceLockRequest build(java.util.Map<String, ?> map) throws Exception {
            LockProjectResourceRequestResourceLockRequest self = new LockProjectResourceRequestResourceLockRequest();
            return TeaModel.build(map, self);
        }

        public LockProjectResourceRequestResourceLockRequest setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public LockProjectResourceRequestResourceLockRequest setDemandId(Long demandId) {
            this.demandId = demandId;
            return this;
        }
        public Long getDemandId() {
            return this.demandId;
        }

        public LockProjectResourceRequestResourceLockRequest setAcuRequestList(java.util.List<LockProjectResourceRequestResourceLockRequestAcuRequestList> acuRequestList) {
            this.acuRequestList = acuRequestList;
            return this;
        }
        public java.util.List<LockProjectResourceRequestResourceLockRequestAcuRequestList> getAcuRequestList() {
            return this.acuRequestList;
        }

    }

}
