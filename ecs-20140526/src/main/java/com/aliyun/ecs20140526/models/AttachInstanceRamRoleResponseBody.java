// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AttachInstanceRamRoleResponseBody extends TeaModel {
    @NameInMap("AttachInstanceRamRoleResults")
    public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResults attachInstanceRamRoleResults;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("FailCount")
    public Integer failCount;

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

    public AttachInstanceRamRoleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public AttachInstanceRamRoleResponseBody setFailCount(Integer failCount) {
        this.failCount = failCount;
        return this;
    }
    public Integer getFailCount() {
        return this.failCount;
    }

    public static class AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult extends TeaModel {
        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("InstanceId")
        public String instanceId;

        public static AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult self = new AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult();
            return TeaModel.build(map, self);
        }

        public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public AttachInstanceRamRoleResponseBodyAttachInstanceRamRoleResultsAttachInstanceRamRoleResult setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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
