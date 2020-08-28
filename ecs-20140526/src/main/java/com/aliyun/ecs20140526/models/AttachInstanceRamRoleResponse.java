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

    }

    public static class AttachInstanceRamRoleResponseAttachInstanceRamRoleResults extends TeaModel {
        @NameInMap("AttachInstanceRamRoleResult")
        @Validation(required = true)
        public java.util.List<AttachInstanceRamRoleResponseAttachInstanceRamRoleResultsAttachInstanceRamRoleResult> attachInstanceRamRoleResult;

        public static AttachInstanceRamRoleResponseAttachInstanceRamRoleResults build(java.util.Map<String, ?> map) throws Exception {
            AttachInstanceRamRoleResponseAttachInstanceRamRoleResults self = new AttachInstanceRamRoleResponseAttachInstanceRamRoleResults();
            return TeaModel.build(map, self);
        }

    }

}
