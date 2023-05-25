// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachInstanceRamRoleResponseBody extends TeaModel {
    /**
     * <p>Details about the results of attaching the instance RAM role.</p>
     */
    @NameInMap("AttachInstanceRamRoleResults")
    public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults attachInstanceRamRoleResults;

    /**
     * <p>The number of instances to which the instance RAM role failed to be attached.</p>
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
     * <p>The total number of instances to which you attempted to attach the instance RAM role.</p>
     */
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
        /**
         * <p>Indicates whether the instance RAM role was attached. If the instance RAM role was attached, 200 is returned. If the instance RAM role failed to be attached, any other value is returned. For more information, see the "Error codes" section.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the instance RAM role was attached. If the instance RAM role was attached, success is returned. If the instance RAM role failed to be attached, any other value is returned. For more information, see the "Error codes" section.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the instance RAM role was attached.</p>
         */
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
