// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryEdgeInstanceResponseBodyData data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryEdgeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceResponseBody self = new QueryEdgeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryEdgeInstanceResponseBody setData(QueryEdgeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryEdgeInstanceResponseBodyData getData() {
        return this.data;
    }

    public QueryEdgeInstanceResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryEdgeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEdgeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryEdgeInstanceResponseBodyDataInstanceList extends TeaModel {
        @NameInMap("BizEnable")
        public Boolean bizEnable;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtCreateTimestamp")
        public Long gmtCreateTimestamp;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("GmtModifiedTimestamp")
        public Long gmtModifiedTimestamp;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LatestDeploymentStatus")
        public Integer latestDeploymentStatus;

        @NameInMap("LatestDeploymentType")
        public String latestDeploymentType;

        @NameInMap("Name")
        public String name;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("RoleAttachTime")
        public String roleAttachTime;

        @NameInMap("RoleAttachTimestamp")
        public Long roleAttachTimestamp;

        @NameInMap("RoleName")
        public String roleName;

        @NameInMap("Spec")
        public Integer spec;

        @NameInMap("Tags")
        public String tags;

        @NameInMap("Type")
        public Integer type;

        public static QueryEdgeInstanceResponseBodyDataInstanceList build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceResponseBodyDataInstanceList self = new QueryEdgeInstanceResponseBodyDataInstanceList();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setBizEnable(Boolean bizEnable) {
            this.bizEnable = bizEnable;
            return this;
        }
        public Boolean getBizEnable() {
            return this.bizEnable;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setGmtCreateTimestamp(Long gmtCreateTimestamp) {
            this.gmtCreateTimestamp = gmtCreateTimestamp;
            return this;
        }
        public Long getGmtCreateTimestamp() {
            return this.gmtCreateTimestamp;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setGmtModifiedTimestamp(Long gmtModifiedTimestamp) {
            this.gmtModifiedTimestamp = gmtModifiedTimestamp;
            return this;
        }
        public Long getGmtModifiedTimestamp() {
            return this.gmtModifiedTimestamp;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setLatestDeploymentStatus(Integer latestDeploymentStatus) {
            this.latestDeploymentStatus = latestDeploymentStatus;
            return this;
        }
        public Integer getLatestDeploymentStatus() {
            return this.latestDeploymentStatus;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setLatestDeploymentType(String latestDeploymentType) {
            this.latestDeploymentType = latestDeploymentType;
            return this;
        }
        public String getLatestDeploymentType() {
            return this.latestDeploymentType;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setRoleAttachTime(String roleAttachTime) {
            this.roleAttachTime = roleAttachTime;
            return this;
        }
        public String getRoleAttachTime() {
            return this.roleAttachTime;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setRoleAttachTimestamp(Long roleAttachTimestamp) {
            this.roleAttachTimestamp = roleAttachTimestamp;
            return this;
        }
        public Long getRoleAttachTimestamp() {
            return this.roleAttachTimestamp;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setRoleName(String roleName) {
            this.roleName = roleName;
            return this;
        }
        public String getRoleName() {
            return this.roleName;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setSpec(Integer spec) {
            this.spec = spec;
            return this;
        }
        public Integer getSpec() {
            return this.spec;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setTags(String tags) {
            this.tags = tags;
            return this;
        }
        public String getTags() {
            return this.tags;
        }

        public QueryEdgeInstanceResponseBodyDataInstanceList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class QueryEdgeInstanceResponseBodyData extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("InstanceList")
        public java.util.List<QueryEdgeInstanceResponseBodyDataInstanceList> instanceList;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Total")
        public Integer total;

        public static QueryEdgeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryEdgeInstanceResponseBodyData self = new QueryEdgeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryEdgeInstanceResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryEdgeInstanceResponseBodyData setInstanceList(java.util.List<QueryEdgeInstanceResponseBodyDataInstanceList> instanceList) {
            this.instanceList = instanceList;
            return this;
        }
        public java.util.List<QueryEdgeInstanceResponseBodyDataInstanceList> getInstanceList() {
            return this.instanceList;
        }

        public QueryEdgeInstanceResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryEdgeInstanceResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
