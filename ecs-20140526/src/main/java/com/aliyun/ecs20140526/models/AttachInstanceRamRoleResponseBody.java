// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachInstanceRamRoleResponseBody extends TeaModel {
    // Details about the results of binding the instance RAM role.
    @NameInMap("AttachInstanceRamRoleResults")
    public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults attachInstanceRamRoleResults;

    // The number of RAM roles that fail to be bound.
    @NameInMap("FailCount")
    public Integer failCount;

    // The name of the instance RAM role.
    @NameInMap("RamRoleName")
    public String ramRoleName;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of instances to which you attempted to attach the instance RAM role.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static AttachInstanceRamRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceRamRoleResponseBody self = new AttachInstanceRamRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public AttachInstanceRamRoleResponseBody setAttachInstanceRamRoleResults(AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults attachInstanceRamRoleResults) {
        this.attachInstanceRamRoleResults = attachInstanceRamRoleResults;
        return this;
    }
    public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults getAttachInstanceRamRoleResults() {
        return this.attachInstanceRamRoleResults;
    }

    public AttachInstanceRamRoleResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public AttachInstanceRamRoleResponseBody setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public AttachInstanceRamRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachInstanceRamRoleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult extends TeaModel {
        // Indicates whether the instance RAM role was bound. If 200 is returned, the RAM role was bound. If any other value is returned, the RAM role failed to be bound. For more information, see the "Error codes" section of this topic.
        @NameInMap("Code")
        public String code;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // Indicates whether the instance RAM role was bound. If success is returned, the RAM role was bound. If any other value is returned, the RAM role failed to be bound. For more information, see the "Error codes" section of this topic.
        @NameInMap("Message")
        public String message;

        // Indicates whether the RAM role was bound.
        @NameInMap("Success")
        public Boolean success;

        public static AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult self = new AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult();
            return TeaModel.build(map, self);
        }

        public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults extends TeaModel {
        @NameInMap("AttachInstanceRamRoleResult")
        public java.util.List<AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult> attachInstanceRamRoleResult;

        public static AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults self = new AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults();
            return TeaModel.build(map, self);
        }

        public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults setAttachInstanceRamRoleResult(java.util.List<AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult> attachInstanceRamRoleResult) {
            this.attachInstanceRamRoleResult = attachInstanceRamRoleResult;
            return this;
        }
        public java.util.List<AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult> getAttachInstanceRamRoleResult() {
            return this.attachInstanceRamRoleResult;
        }

    }

}
