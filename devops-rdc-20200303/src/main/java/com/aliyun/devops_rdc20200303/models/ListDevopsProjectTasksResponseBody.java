// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTasksResponseBody extends TeaModel {
    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Successful")
    public Boolean successful;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Object")
    public java.util.List<ListDevopsProjectTasksResponseBodyObject> object;

    public static ListDevopsProjectTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTasksResponseBody self = new ListDevopsProjectTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTasksResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDevopsProjectTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevopsProjectTasksResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public ListDevopsProjectTasksResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDevopsProjectTasksResponseBody setObject(java.util.List<ListDevopsProjectTasksResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<ListDevopsProjectTasksResponseBodyObject> getObject() {
        return this.object;
    }

    public static class ListDevopsProjectTasksResponseBodyObject extends TeaModel {
        @NameInMap("TaskgroupId")
        public String taskgroupId;

        @NameInMap("TasklistId")
        public String tasklistId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ModifierId")
        public String modifierId;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Created")
        public String created;

        @NameInMap("Name")
        public String name;

        @NameInMap("Id")
        public String id;

        public static ListDevopsProjectTasksResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsProjectTasksResponseBodyObject self = new ListDevopsProjectTasksResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListDevopsProjectTasksResponseBodyObject setTaskgroupId(String taskgroupId) {
            this.taskgroupId = taskgroupId;
            return this;
        }
        public String getTaskgroupId() {
            return this.taskgroupId;
        }

        public ListDevopsProjectTasksResponseBodyObject setTasklistId(String tasklistId) {
            this.tasklistId = tasklistId;
            return this;
        }
        public String getTasklistId() {
            return this.tasklistId;
        }

        public ListDevopsProjectTasksResponseBodyObject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListDevopsProjectTasksResponseBodyObject setModifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }
        public String getModifierId() {
            return this.modifierId;
        }

        public ListDevopsProjectTasksResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public ListDevopsProjectTasksResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDevopsProjectTasksResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListDevopsProjectTasksResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDevopsProjectTasksResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
