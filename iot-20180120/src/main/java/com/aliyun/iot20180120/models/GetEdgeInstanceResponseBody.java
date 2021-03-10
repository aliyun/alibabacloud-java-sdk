// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class GetEdgeInstanceResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public String code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Data")
    public GetEdgeInstanceResponseBodyData data;

    public static GetEdgeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEdgeInstanceResponseBody self = new GetEdgeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEdgeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetEdgeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetEdgeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetEdgeInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetEdgeInstanceResponseBody setData(GetEdgeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetEdgeInstanceResponseBodyData getData() {
        return this.data;
    }

    public static class GetEdgeInstanceResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Type")
        public String type;

        @NameInMap("Spec")
        public Integer spec;

        @NameInMap("BizEnable")
        public Boolean bizEnable;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("RoleAttachTime")
        public String roleAttachTime;

        @NameInMap("LatestDeploymentStatus")
        public Integer latestDeploymentStatus;

        @NameInMap("LatestDeploymentType")
        public String latestDeploymentType;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("RoleAttachTimestamp")
        public Long roleAttachTimestamp;

        public static GetEdgeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetEdgeInstanceResponseBodyData self = new GetEdgeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetEdgeInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetEdgeInstanceResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetEdgeInstanceResponseBodyData setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public GetEdgeInstanceResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetEdgeInstanceResponseBodyData setSpec(Integer spec) {
            this.spec = spec;
            return this;
        }
        public Integer getSpec() {
            return this.spec;
        }

        public GetEdgeInstanceResponseBodyData setBizEnable(Boolean bizEnable) {
            this.bizEnable = bizEnable;
            return this;
        }
        public Boolean getBizEnable() {
            return this.bizEnable;
        }

        public GetEdgeInstanceResponseBodyData setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetEdgeInstanceResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetEdgeInstanceResponseBodyData setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public GetEdgeInstanceResponseBodyData setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public GetEdgeInstanceResponseBodyData setRoleAttachTime(String roleAttachTime) {
            this.roleAttachTime = roleAttachTime;
            return this;
        }
        public String getRoleAttachTime() {
            return this.roleAttachTime;
        }

        public GetEdgeInstanceResponseBodyData setLatestDeploymentStatus(Integer latestDeploymentStatus) {
            this.latestDeploymentStatus = latestDeploymentStatus;
            return this;
        }
        public Integer getLatestDeploymentStatus() {
            return this.latestDeploymentStatus;
        }

        public GetEdgeInstanceResponseBodyData setLatestDeploymentType(String latestDeploymentType) {
            this.latestDeploymentType = latestDeploymentType;
            return this;
        }
        public String getLatestDeploymentType() {
            return this.latestDeploymentType;
        }

        public GetEdgeInstanceResponseBodyData setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public GetEdgeInstanceResponseBodyData setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public GetEdgeInstanceResponseBodyData setRoleAttachTimestamp(Long roleAttachTimestamp) {
            this.roleAttachTimestamp = roleAttachTimestamp;
            return this;
        }
        public Long getRoleAttachTimestamp() {
            return this.roleAttachTimestamp;
        }

    }

}
