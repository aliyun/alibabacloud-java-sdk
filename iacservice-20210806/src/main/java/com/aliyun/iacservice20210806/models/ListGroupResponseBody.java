// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListGroupResponseBody extends TeaModel {
    @NameInMap("count")
    public Long count;

    @NameInMap("groups")
    public java.util.List<ListGroupResponseBodyGroups> groups;

    @NameInMap("pageNumber")
    public Long pageNumber;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("requestId")
    public String requestId;

    public static ListGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGroupResponseBody self = new ListGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGroupResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListGroupResponseBody setGroups(java.util.List<ListGroupResponseBodyGroups> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<ListGroupResponseBodyGroups> getGroups() {
        return this.groups;
    }

    public ListGroupResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListGroupResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGroupResponseBodyGroups extends TeaModel {
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        @NameInMap("id")
        public String id;

        @NameInMap("isDefault")
        public Boolean isDefault;

        @NameInMap("name")
        public String name;

        @NameInMap("projectId")
        public String projectId;

        @NameInMap("taskCnt")
        public Long taskCnt;

        public static ListGroupResponseBodyGroups build(java.util.Map<String, ?> map) throws Exception {
            ListGroupResponseBodyGroups self = new ListGroupResponseBodyGroups();
            return TeaModel.build(map, self);
        }

        public ListGroupResponseBodyGroups setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListGroupResponseBodyGroups setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListGroupResponseBodyGroups setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListGroupResponseBodyGroups setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListGroupResponseBodyGroups setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListGroupResponseBodyGroups setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListGroupResponseBodyGroups setTaskCnt(Long taskCnt) {
            this.taskCnt = taskCnt;
            return this;
        }
        public Long getTaskCnt() {
            return this.taskCnt;
        }

    }

}
