// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProjectResponseBody extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("projects")
    public java.util.List<ListProjectResponseBodyProjects> projects;

    @NameInMap("requestId")
    public String requestId;

    public static ListProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectResponseBody self = new ListProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListProjectResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListProjectResponseBody setProjects(java.util.List<ListProjectResponseBodyProjects> projects) {
        this.projects = projects;
        return this;
    }
    public java.util.List<ListProjectResponseBodyProjects> getProjects() {
        return this.projects;
    }

    public ListProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListProjectResponseBodyProjects extends TeaModel {
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

        public static ListProjectResponseBodyProjects build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyProjects self = new ListProjectResponseBodyProjects();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyProjects setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListProjectResponseBodyProjects setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectResponseBodyProjects setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListProjectResponseBodyProjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectResponseBodyProjects setTaskCnt(Long taskCnt) {
            this.taskCnt = taskCnt;
            return this;
        }
        public Long getTaskCnt() {
            return this.taskCnt;
        }

    }

}
