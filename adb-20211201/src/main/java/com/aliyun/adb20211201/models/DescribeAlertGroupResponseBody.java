// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeAlertGroupResponseBody extends TeaModel {
    @NameInMap("AlertGroups")
    public java.util.List<DescribeAlertGroupResponseBodyAlertGroups> alertGroups;

    @NameInMap("Code")
    public Long code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeAlertGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertGroupResponseBody self = new DescribeAlertGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlertGroupResponseBody setAlertGroups(java.util.List<DescribeAlertGroupResponseBodyAlertGroups> alertGroups) {
        this.alertGroups = alertGroups;
        return this;
    }
    public java.util.List<DescribeAlertGroupResponseBodyAlertGroups> getAlertGroups() {
        return this.alertGroups;
    }

    public DescribeAlertGroupResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public DescribeAlertGroupResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAlertGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlertGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeAlertGroupResponseBodyAlertGroupsAlertInstances extends TeaModel {
        @NameInMap("InstanceId")
        public Integer instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        public static DescribeAlertGroupResponseBodyAlertGroupsAlertInstances build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertGroupResponseBodyAlertGroupsAlertInstances self = new DescribeAlertGroupResponseBodyAlertGroupsAlertInstances();
            return TeaModel.build(map, self);
        }

        public DescribeAlertGroupResponseBodyAlertGroupsAlertInstances setInstanceId(Integer instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public Integer getInstanceId() {
            return this.instanceId;
        }

        public DescribeAlertGroupResponseBodyAlertGroupsAlertInstances setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

    }

    public static class DescribeAlertGroupResponseBodyAlertGroups extends TeaModel {
        @NameInMap("AlertInstances")
        public java.util.List<DescribeAlertGroupResponseBodyAlertGroupsAlertInstances> alertInstances;

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

        public static DescribeAlertGroupResponseBodyAlertGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlertGroupResponseBodyAlertGroups self = new DescribeAlertGroupResponseBodyAlertGroups();
            return TeaModel.build(map, self);
        }

        public DescribeAlertGroupResponseBodyAlertGroups setAlertInstances(java.util.List<DescribeAlertGroupResponseBodyAlertGroupsAlertInstances> alertInstances) {
            this.alertInstances = alertInstances;
            return this;
        }
        public java.util.List<DescribeAlertGroupResponseBodyAlertGroupsAlertInstances> getAlertInstances() {
            return this.alertInstances;
        }

        public DescribeAlertGroupResponseBodyAlertGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeAlertGroupResponseBodyAlertGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAlertGroupResponseBodyAlertGroups setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeAlertGroupResponseBodyAlertGroups setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeAlertGroupResponseBodyAlertGroups setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
