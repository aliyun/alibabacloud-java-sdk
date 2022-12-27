// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachInstanceRamRoleResponseBody extends TeaModel {
    // Details about the results of detaching the instance RAM role from the instances.
    @NameInMap("DetachInstanceRamRoleResults")
    public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults detachInstanceRamRoleResults;

    // The number of the instances from which the RAM role failed to be detached.
    @NameInMap("FailCount")
    public Integer failCount;

    // The name of the instance RAM role.
    @NameInMap("RamRoleName")
    public String ramRoleName;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of the instances from which you detached the RAM role.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DetachInstanceRamRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceRamRoleResponseBody self = new DetachInstanceRamRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachInstanceRamRoleResponseBody setDetachInstanceRamRoleResults(DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults detachInstanceRamRoleResults) {
        this.detachInstanceRamRoleResults = detachInstanceRamRoleResults;
        return this;
    }
    public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults getDetachInstanceRamRoleResults() {
        return this.detachInstanceRamRoleResults;
    }

    public DetachInstanceRamRoleResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public DetachInstanceRamRoleResponseBody setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public DetachInstanceRamRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetachInstanceRamRoleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet extends TeaModel {
        // The ID of the instance from which the RAM role was detached.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the instance RAM role.
        @NameInMap("RamRoleName")
        public String ramRoleName;

        public static DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet self = new DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

    }

    public static class DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets extends TeaModel {
        @NameInMap("InstanceRamRoleSet")
        public java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet;

        public static DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets self = new DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets setInstanceRamRoleSet(java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet) {
            this.instanceRamRoleSet = instanceRamRoleSet;
            return this;
        }
        public java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet> getInstanceRamRoleSet() {
            return this.instanceRamRoleSet;
        }

    }

    public static class DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult extends TeaModel {
        // The code that indicates whether the instance RAM role was detached. If 200 is returned, the instance RAM role was detached. If any other value is returned, the instance RAM role failed to be detached. For more information, see the "Error codes" section.
        @NameInMap("Code")
        public String code;

        // The ID of the instance from which you attempted to detach the instance RAM role.
        @NameInMap("InstanceId")
        public String instanceId;

        // The details about the instance RAM roles of the instances.
        @NameInMap("InstanceRamRoleSets")
        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets instanceRamRoleSets;

        // The message that indicates whether the instance RAM role was detached. If success is returned, the instance RAM role was detached. If any other value is returned, the instance RAM role failed to be detached. For more information, see the "Error codes" section.
        @NameInMap("Message")
        public String message;

        // Indicates whether the RAM role was detached.
        @NameInMap("Success")
        public Boolean success;

        public static DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult self = new DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setInstanceRamRoleSets(DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets instanceRamRoleSets) {
            this.instanceRamRoleSets = instanceRamRoleSets;
            return this;
        }
        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets getInstanceRamRoleSets() {
            return this.instanceRamRoleSets;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults extends TeaModel {
        @NameInMap("DetachInstanceRamRoleResult")
        public java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult> detachInstanceRamRoleResult;

        public static DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults self = new DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults setDetachInstanceRamRoleResult(java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult> detachInstanceRamRoleResult) {
            this.detachInstanceRamRoleResult = detachInstanceRamRoleResult;
            return this;
        }
        public java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResult> getDetachInstanceRamRoleResult() {
            return this.detachInstanceRamRoleResult;
        }

    }

}
