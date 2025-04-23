// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    @NameInMap("excludeTaskIds")
    public java.util.List<String> excludeTaskIds;

    /**
     * <strong>example:</strong>
     * <p>g-59d8d22e78792ffe3d3eb6154d727</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>mod-1525e992f1b62139d1c437d64ae</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>p-433aead7560572f8d95b25775c</p>
     */
    @NameInMap("projectId")
    public String projectId;

    @NameInMap("status")
    public String status;

    @NameInMap("tag")
    public java.util.List<ListTasksRequestTag> tag;

    /**
     * <strong>example:</strong>
     * <p>task-433aead756057fffeaba4828f5195</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksRequest setExcludeTaskIds(java.util.List<String> excludeTaskIds) {
        this.excludeTaskIds = excludeTaskIds;
        return this;
    }
    public java.util.List<String> getExcludeTaskIds() {
        return this.excludeTaskIds;
    }

    public ListTasksRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListTasksRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTasksRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListTasksRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTasksRequest setTag(java.util.List<ListTasksRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<ListTasksRequestTag> getTag() {
        return this.tag;
    }

    public ListTasksRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class ListTasksRequestTag extends TeaModel {
        @NameInMap("key")
        public String key;

        @NameInMap("value")
        public String value;

        public static ListTasksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTasksRequestTag self = new ListTasksRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTasksRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListTasksRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
