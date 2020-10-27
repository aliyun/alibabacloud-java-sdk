// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachInstanceRamRoleResponse extends TeaModel {
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

    @NameInMap("AttachInstanceRamRoleResults")
    @Validation(required = true)
    public AttachInstanceRamRoleResponseAttachInstanceRamRoleResults attachInstanceRamRoleResults;

    public static AttachInstanceRamRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachInstanceRamRoleResponse self = new AttachInstanceRamRoleResponse();
        return TeaModel.build(map, self);
    }

    public AttachInstanceRamRoleResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AttachInstanceRamRoleResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public AttachInstanceRamRoleResponse setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public AttachInstanceRamRoleResponse setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public AttachInstanceRamRoleResponse setAttachInstanceRamRoleResults(AttachInstanceRamRoleResponseAttachInstanceRamRoleResults attachInstanceRamRoleResults) {
        this.attachInstanceRamRoleResults = attachInstanceRamRoleResults;
        return this;
    }
    public AttachInstanceRamRoleResponseAttachInstanceRamRoleResults getAttachInstanceRamRoleResults() {
        return this.attachInstanceRamRoleResults;
    }

    public static class AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult extends TeaModel {
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

        public static AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult self = new AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult();
            return TeaModel.build(map, self);
        }

        public AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class AttachInstanceRamRoleResponseAttachInstanceRamRoleResults extends TeaModel {
        @NameInMap("AttachInstanceRamRoleResult")
        @Validation(required = true)
        public java.util.List<AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult> attachInstanceRamRoleResult;

        public static AttachInstanceRamRoleResponseAttachInstanceRamRoleResults build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceRamRoleResponseAttachInstanceRamRoleResults self = new AttachInstanceRamRoleResponseAttachInstanceRamRoleResults();
            return TeaModel.build(map, self);
        }

        public AttachInstanceRamRoleResponseAttachInstanceRamRoleResults setAttachInstanceRamRoleResult(java.util.List<AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult> attachInstanceRamRoleResult) {
            this.attachInstanceRamRoleResult = attachInstanceRamRoleResult;
            return this;
        }
        public java.util.List<AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult> getAttachInstanceRamRoleResult() {
            return this.attachInstanceRamRoleResult;
        }

    }

}
