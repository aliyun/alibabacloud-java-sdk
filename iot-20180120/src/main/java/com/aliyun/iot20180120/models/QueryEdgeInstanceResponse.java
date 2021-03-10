// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("Data")
    @Validation(required = true)
    public QueryEdgeInstanceResponseData data;

    public static QueryEdgeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceResponse self = new QueryEdgeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryEdgeInstanceResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceResponse setData(QueryEdgeInstanceResponseData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceResponseData getData() {
        return this.data;
    }

    public static class QueryEdgeInstanceResponseDataInstanceList extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Tags")
        @Validation(required = true)
        public String tags;

        @NameInMap("Type")
        @Validation(required = true)
        public Integer type;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public String gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public String gmtModified;

        @NameInMap("RoleArn")
        @Validation(required = true)
        public String roleArn;

        @NameInMap("RoleName")
        @Validation(required = true)
        public String roleName;

        @NameInMap("RoleAttachTime")
        @Validation(required = true)
        public String roleAttachTime;

        @NameInMap("Spec")
        @Validation(required = true)
        public Integer spec;

        @NameInMap("BizEnable")
        @Validation(required = true)
        public Boolean bizEnable;

        @NameInMap("LatestDeploymentStatus")
        @Validation(required = true)
        public Integer latestDeploymentStatus;

        @NameInMap("LatestDeploymentType")
        @Validation(required = true)
        public String latestDeploymentType;

        @NameInMap("GmtCreateTimestamp")
        @Validation(required = true)
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModifiedTimestamp")
        @Validation(required = true)
        public Long gmtModifiedTimestamp;

        @NameInMap("RoleAttachTimestamp")
        @Validation(required = true)
        public Long roleAttachTimestamp;

        public static QueryEdgeInstanceResponseDataInstanceList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceResponseDataInstanceList self = new QueryEdgeInstanceResponseDataInstanceList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceResponseDataInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryEdgeInstanceResponseDataInstanceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEdgeInstanceResponseDataInstanceList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public QueryEdgeInstanceResponseDataInstanceList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

        public QueryEdgeInstanceResponseDataInstanceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceResponseDataInstanceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceResponseDataInstanceList setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryEdgeInstanceResponseDataInstanceList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public QueryEdgeInstanceResponseDataInstanceList setRoleAttachTime(String roleAttachTime) {
            this.roleAttachTime = roleAttachTime;
            return this;
        }
        public String getRoleAttachTime() {
            return this.roleAttachTime;
        }

        public QueryEdgeInstanceResponseDataInstanceList setSpec(Integer spec) {
            this.spec = spec;
            return this;
        }
        public Integer getSpec() {
            return this.spec;
        }

        public QueryEdgeInstanceResponseDataInstanceList setBizEnable(Boolean bizEnable) {
            this.bizEnable = bizEnable;
            return this;
        }
        public Boolean getBizEnable() {
            return this.bizEnable;
        }

        public QueryEdgeInstanceResponseDataInstanceList setLatestDeploymentStatus(Integer latestDeploymentStatus) {
            this.latestDeploymentStatus = latestDeploymentStatus;
            return this;
        }
        public Integer getLatestDeploymentStatus() {
            return this.latestDeploymentStatus;
        }

        public QueryEdgeInstanceResponseDataInstanceList setLatestDeploymentType(String latestDeploymentType) {
            this.latestDeploymentType = latestDeploymentType;
            return this;
        }
        public String getLatestDeploymentType() {
            return this.latestDeploymentType;
        }

        public QueryEdgeInstanceResponseDataInstanceList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeInstanceResponseDataInstanceList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeInstanceResponseDataInstanceList setRoleAttachTimestamp(Long roleAttachTimestamp) {
            this.roleAttachTimestamp = roleAttachTimestamp;
            return this;
        }
        public Long getRoleAttachTimestamp() {
            return this.roleAttachTimestamp;
        }

    }

    public static class QueryEdgeInstanceResponseData extends TeaModel {
        @NameInMap("Total")
        @Validation(required = true)
        public Integer total;

        @NameInMap("PageSize")
        @Validation(required = true)
        public Integer pageSize;

        @NameInMap("CurrentPage")
        @Validation(required = true)
        public Integer currentPage;

        @NameInMap("InstanceList")
        @Validation(required = true)
        public java.util.List<QueryEdgeInstanceResponseDataInstanceList> instanceList;

        public static QueryEdgeInstanceResponseData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceResponseData self = new QueryEdgeInstanceResponseData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceResponseData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

        public QueryEdgeInstanceResponseData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceResponseData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceResponseData setInstanceList(java.util.List<QueryEdgeInstanceResponseDataInstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceResponseDataInstanceList> getInstanceList() {
            return this.instanceList;
        }

    }

}
