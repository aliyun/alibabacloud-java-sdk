// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class GetProjectResponseBody extends TeaModel {
    /**
     * <p>The project details.</p>
     */
    @NameInMap("project")
    public GetProjectResponseBodyProject project;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7FA0FF4A-ABD4-54F6-BEAC-B4273EBA10A2</p>
     */
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
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-06T06:11:27Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The project description. Length: 0 to 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-433aead7560572f8d95b25775c</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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

        public GetProjectResponseBodyProject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetProjectResponseBodyProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
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
