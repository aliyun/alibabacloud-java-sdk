// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class ListDevopsProjectTaskFlowStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("Object")
    public java.util.List<ListDevopsProjectTaskFlowStatusResponseBodyObject> object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Successful")
    public Boolean successful;

    public static ListDevopsProjectTaskFlowStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDevopsProjectTaskFlowStatusResponseBody self = new ListDevopsProjectTaskFlowStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDevopsProjectTaskFlowStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDevopsProjectTaskFlowStatusResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ListDevopsProjectTaskFlowStatusResponseBody setObject(java.util.List<ListDevopsProjectTaskFlowStatusResponseBodyObject> object) {
        this.object = object;
        return this;
    }
    public java.util.List<ListDevopsProjectTaskFlowStatusResponseBodyObject> getObject() {
        return this.object;
    }

    public ListDevopsProjectTaskFlowStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDevopsProjectTaskFlowStatusResponseBody setSuccessful(Boolean successful) {
        this.successful = successful;
        return this;
    }
    public Boolean getSuccessful() {
        return this.successful;
    }

    public static class ListDevopsProjectTaskFlowStatusResponseBodyObject extends TeaModel {
        @NameInMap("TaskflowId")
        public String taskflowId;

        @NameInMap("Kind")
        public String kind;

        @NameInMap("Pos")
        public Integer pos;

        @NameInMap("IsDeleted")
        public Boolean isDeleted;

        @NameInMap("Updated")
        public String updated;

        @NameInMap("CreatorId")
        public String creatorId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Created")
        public String created;

        @NameInMap("RejectStatusIds")
        public String rejectStatusIds;

        @NameInMap("Id")
        public String id;

        public static ListDevopsProjectTaskFlowStatusResponseBodyObject build(java.util.Map<String, ?> map) throws Exception {
            ListDevopsProjectTaskFlowStatusResponseBodyObject self = new ListDevopsProjectTaskFlowStatusResponseBodyObject();
            return TeaModel.build(map, self);
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setTaskflowId(String taskflowId) {
            this.taskflowId = taskflowId;
            return this;
        }
        public String getTaskflowId() {
            return this.taskflowId;
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setKind(String kind) {
            this.kind = kind;
            return this;
        }
        public String getKind() {
            return this.kind;
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setPos(Integer pos) {
            this.pos = pos;
            return this;
        }
        public Integer getPos() {
            return this.pos;
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setIsDeleted(Boolean isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setCreatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }
        public String getCreatorId() {
            return this.creatorId;
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setCreated(String created) {
            this.created = created;
            return this;
        }
        public String getCreated() {
            return this.created;
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setRejectStatusIds(String rejectStatusIds) {
            this.rejectStatusIds = rejectStatusIds;
            return this;
        }
        public String getRejectStatusIds() {
            return this.rejectStatusIds;
        }

        public ListDevopsProjectTaskFlowStatusResponseBodyObject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

}
