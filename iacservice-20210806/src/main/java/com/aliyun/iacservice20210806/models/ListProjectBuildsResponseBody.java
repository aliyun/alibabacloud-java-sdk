// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProjectBuildsResponseBody extends TeaModel {
    @NameInMap("ProjectBuilds")
    public java.util.List<ListProjectBuildsResponseBodyProjectBuilds> projectBuilds;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("totalCount")
    public Integer totalCount;

    public static ListProjectBuildsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectBuildsResponseBody self = new ListProjectBuildsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectBuildsResponseBody setProjectBuilds(java.util.List<ListProjectBuildsResponseBodyProjectBuilds> projectBuilds) {
        this.projectBuilds = projectBuilds;
        return this;
    }
    public java.util.List<ListProjectBuildsResponseBodyProjectBuilds> getProjectBuilds() {
        return this.projectBuilds;
    }

    public ListProjectBuildsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectBuildsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectBuildsResponseBodyProjectBuilds extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("projectBuildAction")
        public String projectBuildAction;

        @NameInMap("projectBuildId")
        public String projectBuildId;

        @NameInMap("projectBuildIndex")
        public Long projectBuildIndex;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("status")
        public String status;

        @NameInMap("timestamp")
        public Long timestamp;

        public static ListProjectBuildsResponseBodyProjectBuilds build(java.util.Map<String, ?> map) throws Exception {
            ListProjectBuildsResponseBodyProjectBuilds self = new ListProjectBuildsResponseBodyProjectBuilds();
            return TeaModel.build(map, self);
        }

        public ListProjectBuildsResponseBodyProjectBuilds setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setProjectBuildAction(String projectBuildAction) {
            this.projectBuildAction = projectBuildAction;
            return this;
        }
        public String getProjectBuildAction() {
            return this.projectBuildAction;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setProjectBuildId(String projectBuildId) {
            this.projectBuildId = projectBuildId;
            return this;
        }
        public String getProjectBuildId() {
            return this.projectBuildId;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setProjectBuildIndex(Long projectBuildIndex) {
            this.projectBuildIndex = projectBuildIndex;
            return this;
        }
        public Long getProjectBuildIndex() {
            return this.projectBuildIndex;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListProjectBuildsResponseBodyProjectBuilds setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
