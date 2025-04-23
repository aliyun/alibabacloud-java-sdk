// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetRamPolicyExportTaskResponseBody extends TeaModel {
    @NameInMap("ramPolicyExportTask")
    public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask ramPolicyExportTask;

    /**
     * <strong>example:</strong>
     * <p>3E49127A-BB65-5CCD-AB93-0EC0A43E5446</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetRamPolicyExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRamPolicyExportTaskResponseBody self = new GetRamPolicyExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRamPolicyExportTaskResponseBody setRamPolicyExportTask(GetRamPolicyExportTaskResponseBodyRamPolicyExportTask ramPolicyExportTask) {
        this.ramPolicyExportTask = ramPolicyExportTask;
        return this;
    }
    public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask getRamPolicyExportTask() {
        return this.ramPolicyExportTask;
    }

    public GetRamPolicyExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRamPolicyExportTaskResponseBodyRamPolicyExportTask extends TeaModel {
        @NameInMap("authorizationAccountIds")
        public java.util.List<Long> authorizationAccountIds;

        @NameInMap("authorizationActions")
        public java.util.List<String> authorizationActions;

        @NameInMap("authorizationRegionIds")
        public java.util.List<String> authorizationRegionIds;

        /**
         * <strong>example:</strong>
         * <p>2022-06-16T10:03:39Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>mod-66c23a9cc0cacddf</p>
         */
        @NameInMap("moduleId")
        public String moduleId;

        /**
         * <strong>example:</strong>
         * <p>v1</p>
         */
        @NameInMap("moduleVersion")
        public String moduleVersion;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>rpe-40252e48f9286a</p>
         */
        @NameInMap("ramPolicyExportTaskId")
        public String ramPolicyExportTaskId;

        /**
         * <strong>example:</strong>
         * <p>ramName</p>
         */
        @NameInMap("ramRole")
        public String ramRole;

        /**
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>12345678/default/rampolicytask/rpe-4399111870d7e6b0f11a</p>
         */
        @NameInMap("taskOutputPath")
        public String taskOutputPath;

        @NameInMap("terraformProviderVersion")
        public String terraformProviderVersion;

        /**
         * <strong>example:</strong>
         * <p>Manual</p>
         */
        @NameInMap("triggerStrategy")
        public String triggerStrategy;

        public static GetRamPolicyExportTaskResponseBodyRamPolicyExportTask build(java.util.Map<String, ?> map) throws Exception {
            GetRamPolicyExportTaskResponseBodyRamPolicyExportTask self = new GetRamPolicyExportTaskResponseBodyRamPolicyExportTask();
            return TeaModel.build(map, self);
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setAuthorizationAccountIds(java.util.List<Long> authorizationAccountIds) {
            this.authorizationAccountIds = authorizationAccountIds;
            return this;
        }
        public java.util.List<Long> getAuthorizationAccountIds() {
            return this.authorizationAccountIds;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setAuthorizationActions(java.util.List<String> authorizationActions) {
            this.authorizationActions = authorizationActions;
            return this;
        }
        public java.util.List<String> getAuthorizationActions() {
            return this.authorizationActions;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setAuthorizationRegionIds(java.util.List<String> authorizationRegionIds) {
            this.authorizationRegionIds = authorizationRegionIds;
            return this;
        }
        public java.util.List<String> getAuthorizationRegionIds() {
            return this.authorizationRegionIds;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setModuleId(String moduleId) {
            this.moduleId = moduleId;
            return this;
        }
        public String getModuleId() {
            return this.moduleId;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setModuleVersion(String moduleVersion) {
            this.moduleVersion = moduleVersion;
            return this;
        }
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setRamPolicyExportTaskId(String ramPolicyExportTaskId) {
            this.ramPolicyExportTaskId = ramPolicyExportTaskId;
            return this;
        }
        public String getRamPolicyExportTaskId() {
            return this.ramPolicyExportTaskId;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setRamRole(String ramRole) {
            this.ramRole = ramRole;
            return this;
        }
        public String getRamRole() {
            return this.ramRole;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setTaskOutputPath(String taskOutputPath) {
            this.taskOutputPath = taskOutputPath;
            return this;
        }
        public String getTaskOutputPath() {
            return this.taskOutputPath;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setTerraformProviderVersion(String terraformProviderVersion) {
            this.terraformProviderVersion = terraformProviderVersion;
            return this;
        }
        public String getTerraformProviderVersion() {
            return this.terraformProviderVersion;
        }

        public GetRamPolicyExportTaskResponseBodyRamPolicyExportTask setTriggerStrategy(String triggerStrategy) {
            this.triggerStrategy = triggerStrategy;
            return this;
        }
        public String getTriggerStrategy() {
            return this.triggerStrategy;
        }

    }

}
