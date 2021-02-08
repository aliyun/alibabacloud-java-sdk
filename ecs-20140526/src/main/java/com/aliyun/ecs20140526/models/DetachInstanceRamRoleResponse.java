// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachInstanceRamRoleResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("FailCount")
    @Validation(required = true)
    public Integer failCount;

    @NameInMap("RamRoleName")
    @Validation(required = true)
    public String ramRoleName;

    @NameInMap("DetachInstanceRamRoleResults")
    @Validation(required = true)
    public DetachInstanceRamRoleResponseDetachInstanceRamRoleResults detachInstanceRamRoleResults;

    public static DetachInstanceRamRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceRamRoleResponse self = new DetachInstanceRamRoleResponse();
        return TeaModel.build(map, self);
    }

    public DetachInstanceRamRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachInstanceRamRoleResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DetachInstanceRamRoleResponse setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public DetachInstanceRamRoleResponse setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public DetachInstanceRamRoleResponse setDetachInstanceRamRoleResults(DetachInstanceRamRoleResponseDetachInstanceRamRoleResults detachInstanceRamRoleResults) {
        this.detachInstanceRamRoleResults = detachInstanceRamRoleResults;
        return this;
    }
    public DetachInstanceRamRoleResponseDetachInstanceRamRoleResults getDetachInstanceRamRoleResults() {
        return this.detachInstanceRamRoleResults;
    }

    public static class DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("RamRoleName")
        @Validation(required = true)
        public String ramRoleName;

        public static DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet self = new DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

    }

    public static class DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets extends TeaModel {
        @NameInMap("InstanceRamRoleSet")
        @Validation(required = true)
        public java.util.List<DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet;

        public static DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets self = new DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets setInstanceRamRoleSet(java.util.List<DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet) {
            this.instanceRamRoleSet = instanceRamRoleSet;
            return this;
        }
        public java.util.List<DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet> getInstanceRamRoleSet() {
            return this.instanceRamRoleSet;
        }

    }

    public static class DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Success")
        @Validation(required = true)
        public Boolean success;

        @NameInMap("Code")
        @Validation(required = true)
        public String code;

        @NameInMap("Message")
        @Validation(required = true)
        public String message;

        @NameInMap("InstanceRamRoleSets")
        @Validation(required = true)
        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets instanceRamRoleSets;

        public static DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult self = new DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setInstanceRamRoleSets(DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets instanceRamRoleSets) {
            this.instanceRamRoleSets = instanceRamRoleSets;
            return this;
        }
        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets getInstanceRamRoleSets() {
            return this.instanceRamRoleSets;
        }

    }

    public static class DetachInstanceRamRoleResponseDetachInstanceRamRoleResults extends TeaModel {
        @NameInMap("DetachInstanceRamRoleResult")
        @Validation(required = true)
        public java.util.List<DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult> detachInstanceRamRoleResult;

        public static DetachInstanceRamRoleResponseDetachInstanceRamRoleResults build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseDetachInstanceRamRoleResults self = new DetachInstanceRamRoleResponseDetachInstanceRamRoleResults();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseDetachInstanceRamRoleResults setDetachInstanceRamRoleResult(java.util.List<DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult> detachInstanceRamRoleResult) {
            this.detachInstanceRamRoleResult = detachInstanceRamRoleResult;
            return this;
        }
        public java.util.List<DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult> getDetachInstanceRamRoleResult() {
            return this.detachInstanceRamRoleResult;
        }

    }

}
