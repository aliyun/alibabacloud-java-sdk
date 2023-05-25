// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachInstanceRamRoleResponseBody extends TeaModel {
    /**
     * <p>Details about the results of detaching instance RAM roles from the instances.</p>
     */
    @NameInMap("DetachInstanceRamRoleResults")
    public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults detachInstanceRamRoleResults;

    /**
     * <p>The number of instances from which instance RAM roles failed to be detached.</p>
     */
    @NameInMap("FailCount")
    public Integer failCount;

    /**
     * <p>The name of the instance RAM role.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances from which you attempted to detach instance RAM roles.</p>
     */
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
        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the instance RAM role.</p>
         */
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
        /**
         * <p>Indicates whether the instance RAM role was detached. If 200 is returned, the instance RAM role was detached. If any other value is returned, the instance RAM role failed to be detached. For more information, see the "Error codes" section.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the instance from which you attempted to detach the instance RAM role.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Details about the instance RAM role of the instance.</p>
         */
        @NameInMap("InstanceRamRoleSets")
        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets instanceRamRoleSets;

        /**
         * <p>Indicates whether the instance RAM role was detached. If success is returned, the instance RAM role was detached. If any other value is returned, the instance RAM role failed to be detached. For more information, see the "Error codes" section.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the instance RAM role was detached.</p>
         */
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
