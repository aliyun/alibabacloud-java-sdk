// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    @NameInMap("project")
    public GetProjectResponseBodyProject project;

    @NameInMap("requestId")
    public String requestId;

    public static GetProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetProjectResponseBody self = new GetProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetProjectResponseBody setProject(GetProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public GetProjectResponseBodyProject getProject() {
        return this.project;
    }

    public GetProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetProjectResponseBodyProject extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("name")
        public String name;

        @NameInMap("taskCnt")
        public Long taskCnt;

        public static GetProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            GetProjectResponseBodyProject self = new GetProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public GetProjectResponseBodyProject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetProjectResponseBodyProject setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetProjectResponseBodyProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectResponseBodyProject setTaskCnt(Long taskCnt) {
            this.taskCnt = taskCnt;
            return this;
        }
        public Long getTaskCnt() {
            return this.taskCnt;
        }

    }

}
