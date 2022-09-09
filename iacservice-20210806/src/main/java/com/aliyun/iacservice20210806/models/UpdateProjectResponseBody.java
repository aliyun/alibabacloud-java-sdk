// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class UpdateProjectResponseBody extends TeaModel {
    @NameInMap("project")
    public UpdateProjectResponseBodyProject project;

    @NameInMap("requestId")
    public String requestId;

    public static UpdateProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateProjectResponseBody self = new UpdateProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateProjectResponseBody setProject(UpdateProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public UpdateProjectResponseBodyProject getProject() {
        return this.project;
    }

    public UpdateProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class UpdateProjectResponseBodyProject extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("groupCnt")
        public Long groupCnt;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("taskCnt")
        public Long taskCnt;

        public static UpdateProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            UpdateProjectResponseBodyProject self = new UpdateProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public UpdateProjectResponseBodyProject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public UpdateProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public UpdateProjectResponseBodyProject setGroupCnt(Long groupCnt) {
            this.groupCnt = groupCnt;
            return this;
        }
        public Long getGroupCnt() {
            return this.groupCnt;
        }

        public UpdateProjectResponseBodyProject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateProjectResponseBodyProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public UpdateProjectResponseBodyProject setTaskCnt(Long taskCnt) {
            this.taskCnt = taskCnt;
            return this;
        }
        public Long getTaskCnt() {
            return this.taskCnt;
        }

    }

}
