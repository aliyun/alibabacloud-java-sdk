// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListGroupResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("count")
    public Long count;

    @NameInMap("groups")
    public java.util.List<ListGroupResponseBodyGroups> groups;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>B6ED9F71-7FA8-598E-B64D-4606FB3FCCC9</p>
     */
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

    public static class ListGroupResponseBodyGroupsTags extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListGroupResponseBodyGroupsTags build(java.util.Map<String, ?> map) throws Exception {
            ListGroupResponseBodyGroupsTags self = new ListGroupResponseBodyGroupsTags();
            return TeaModel.build(map, self);
        }

        public ListGroupResponseBodyGroupsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListGroupResponseBodyGroupsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListGroupResponseBodyGroups extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2022-09-14T07:19:13Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>g-148e7853433574fffe9fec72ed9b73</p>
         */
        @NameInMap("groupId")
        public String groupId;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isDefault")
        public Boolean isDefault;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("moduleCnt")
        public Long moduleCnt;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>p-4267dcfbf1b6d126edcadf0e949</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("sceneTestingTaskCnt")
        public Long sceneTestingTaskCnt;

        @NameInMap("tags")
        public java.util.List<ListGroupResponseBodyGroupsTags> tags;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
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

        public ListGroupResponseBodyGroups setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public ListGroupResponseBodyGroups setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public ListGroupResponseBodyGroups setModuleCnt(Long moduleCnt) {
            this.moduleCnt = moduleCnt;
            return this;
        }
        public Long getModuleCnt() {
            return this.moduleCnt;
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

        public ListGroupResponseBodyGroups setSceneTestingTaskCnt(Long sceneTestingTaskCnt) {
            this.sceneTestingTaskCnt = sceneTestingTaskCnt;
            return this;
        }
        public Long getSceneTestingTaskCnt() {
            return this.sceneTestingTaskCnt;
        }

        public ListGroupResponseBodyGroups setTags(java.util.List<ListGroupResponseBodyGroupsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListGroupResponseBodyGroupsTags> getTags() {
            return this.tags;
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
