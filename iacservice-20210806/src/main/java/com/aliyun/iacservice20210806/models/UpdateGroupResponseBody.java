// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateGroupResponseBody extends TeaModel {
    @NameInMap("group")
    public UpdateGroupResponseBodyGroup group;

    @NameInMap("requestId")
    public String requestId;

    public static UpdateGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateGroupResponseBody self = new UpdateGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateGroupResponseBody setGroup(UpdateGroupResponseBodyGroup group) {
        this.group = group;
        return this;
    }
    public UpdateGroupResponseBodyGroup getGroup() {
        return this.group;
    }

    public UpdateGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateGroupResponseBodyGroup extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("taskCnt")
        public Long taskCnt;

        public static UpdateGroupResponseBodyGroup build(java.util.Map<String, ?> map) throws Exception {
            UpdateGroupResponseBodyGroup self = new UpdateGroupResponseBodyGroup();
            return TeaModel.build(map, self);
        }

        public UpdateGroupResponseBodyGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateGroupResponseBodyGroup setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateGroupResponseBodyGroup setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateGroupResponseBodyGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateGroupResponseBodyGroup setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public UpdateGroupResponseBodyGroup setTaskCnt(Long taskCnt) {
            this.taskCnt = taskCnt;
            return this;
        }
        public Long getTaskCnt() {
            return this.taskCnt;
        }

    }

}
