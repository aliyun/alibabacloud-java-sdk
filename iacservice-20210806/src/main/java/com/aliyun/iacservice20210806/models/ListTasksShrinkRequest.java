// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTasksShrinkRequest extends TeaModel {
    @NameInMap("excludeTaskIds")
    public String excludeTaskIdsShrink;

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
    public String tagShrink;

    /**
     * <strong>example:</strong>
     * <p>task-433aead756057fffeaba4828f5195</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static ListTasksShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksShrinkRequest self = new ListTasksShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListTasksShrinkRequest setExcludeTaskIdsShrink(String excludeTaskIdsShrink) {
        this.excludeTaskIdsShrink = excludeTaskIdsShrink;
        return this;
    }
    public String getExcludeTaskIdsShrink() {
        return this.excludeTaskIdsShrink;
    }

    public ListTasksShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ListTasksShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public ListTasksShrinkRequest setModuleId(String moduleId) {
        this.moduleId = moduleId;
        return this;
    }
    public String getModuleId() {
        return this.moduleId;
    }

    public ListTasksShrinkRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTasksShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTasksShrinkRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public ListTasksShrinkRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListTasksShrinkRequest setTagShrink(String tagShrink) {
        this.tagShrink = tagShrink;
        return this;
    }
    public String getTagShrink() {
        return this.tagShrink;
    }

    public ListTasksShrinkRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
