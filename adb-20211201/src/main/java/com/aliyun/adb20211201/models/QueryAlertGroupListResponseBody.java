// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryAlertGroupListResponseBody extends TeaModel {
    @NameInMap("AlertGroups")
    public java.util.List<QueryAlertGroupListResponseBodyAlertGroups> alertGroups;

    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static QueryAlertGroupListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlertGroupListResponseBody self = new QueryAlertGroupListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlertGroupListResponseBody setAlertGroups(java.util.List<QueryAlertGroupListResponseBodyAlertGroups> alertGroups) {
        this.alertGroups = alertGroups;
        return this;
    }
    public java.util.List<QueryAlertGroupListResponseBodyAlertGroups> getAlertGroups() {
        return this.alertGroups;
    }

    public QueryAlertGroupListResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public QueryAlertGroupListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAlertGroupListResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryAlertGroupListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAlertGroupListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlertGroupListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAlertGroupListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class QueryAlertGroupListResponseBodyAlertGroupsAlertInstances extends TeaModel {
        @NameInMap("InstanceId")
        public Integer instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        public static QueryAlertGroupListResponseBodyAlertGroupsAlertInstances build(java.util.Map<String, ?> map) throws Exception {
            QueryAlertGroupListResponseBodyAlertGroupsAlertInstances self = new QueryAlertGroupListResponseBodyAlertGroupsAlertInstances();
            return TeaModel.build(map, self);
        }

        public QueryAlertGroupListResponseBodyAlertGroupsAlertInstances setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public QueryAlertGroupListResponseBodyAlertGroupsAlertInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

    public static class QueryAlertGroupListResponseBodyAlertGroups extends TeaModel {
        @NameInMap("AlertInstances")
        public java.util.List<QueryAlertGroupListResponseBodyAlertGroupsAlertInstances> alertInstances;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("UpdateTime")
        public String updateTime;

        public static QueryAlertGroupListResponseBodyAlertGroups build(java.util.Map<String, ?> map) throws Exception {
            QueryAlertGroupListResponseBodyAlertGroups self = new QueryAlertGroupListResponseBodyAlertGroups();
            return TeaModel.build(map, self);
        }

        public QueryAlertGroupListResponseBodyAlertGroups setAlertInstances(java.util.List<QueryAlertGroupListResponseBodyAlertGroupsAlertInstances> alertInstances) {
            this.alertInstances = alertInstances;
            return this;
        }
        public java.util.List<QueryAlertGroupListResponseBodyAlertGroupsAlertInstances> getAlertInstances() {
            return this.alertInstances;
        }

        public QueryAlertGroupListResponseBodyAlertGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAlertGroupListResponseBodyAlertGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryAlertGroupListResponseBodyAlertGroups setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public QueryAlertGroupListResponseBodyAlertGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public QueryAlertGroupListResponseBodyAlertGroups setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
