// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DetachInstanceRamRoleResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailCount")
    public Integer failCount;

    @NameInMap("DetachInstanceRamRoleResults")
    public java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults> detachInstanceRamRoleResults;

    public static DetachInstanceRamRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetachInstanceRamRoleResponseBody self = new DetachInstanceRamRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public DetachInstanceRamRoleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DetachInstanceRamRoleResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public DetachInstanceRamRoleResponseBody setDetachInstanceRamRoleResults(java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults> detachInstanceRamRoleResults) {
        this.detachInstanceRamRoleResults = detachInstanceRamRoleResults;
        return this;
    }
    public java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults> getDetachInstanceRamRoleResults() {
        return this.detachInstanceRamRoleResults;
    }

    public static class DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsInstanceRamRoleSets extends TeaModel {
        @NameInMap("RamRoleName")
        public String ramRoleName;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsInstanceRamRoleSets build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsInstanceRamRoleSets self = new DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsInstanceRamRoleSets();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsInstanceRamRoleSets setRamRoleName(String ramRoleName) {
            this.ramRoleName = ramRoleName;
            return this;
        }
        public String getRamRoleName() {
            return this.ramRoleName;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsInstanceRamRoleSets setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults extends TeaModel {
        @NameInMap("InstanceRamRoleSets")
        public java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsInstanceRamRoleSets> instanceRamRoleSets;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("InstanceId")
        public String instanceId;

        public static DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults self = new DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults();
            return TeaModel.build(map, self);
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults setInstanceRamRoleSets(java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsInstanceRamRoleSets> instanceRamRoleSets) {
            this.instanceRamRoleSets = instanceRamRoleSets;
            return this;
        }
        public java.util.List<DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResultsInstanceRamRoleSets> getInstanceRamRoleSets() {
            return this.instanceRamRoleSets;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DetachInstanceRamRoleResponseBodyDetachInstanceRamRoleResults setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
