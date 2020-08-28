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

    }

    public static class DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets extends TeaModel {
        @NameInMap("InstanceRamRoleSet")
        @Validation(required = true)
        public java.util.List<DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSetsInstanceRamRoleSet> instanceRamRoleSet;

        public static DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets self = new DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResultInstanceRamRoleSets();
            return TeaModel.build(map, self);
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

    }

    public static class DetachInstanceRamRoleResponseDetachInstanceRamRoleResults extends TeaModel {
        @NameInMap("DetachInstanceRamRoleResult")
        @Validation(required = true)
        public java.util.List<DetachInstanceRamRoleResponseDetachInstanceRamRoleResultsDetachInstanceRamRoleResult> detachInstanceRamRoleResult;

        public static DetachInstanceRamRoleResponseDetachInstanceRamRoleResults build(java.util.Map<String, ?> map) throws Exception {
            DetachInstanceRamRoleResponseDetachInstanceRamRoleResults self = new DetachInstanceRamRoleResponseDetachInstanceRamRoleResults();
            return TeaModel.build(map, self);
        }

    }

}
