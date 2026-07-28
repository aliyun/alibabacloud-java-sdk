// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListTasksRequest extends TeaModel {
    /**
     * <p>The group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>g-59d8d22e78792ffe3d3eb6154d727</p>
     */
    @NameInMap("groupId")
    public String groupId;

    /**
     * <p>The keyword for fuzzy search by task ID or task name.</p>
     * 
     * <strong>example:</strong>
     * <p>key</p>
     */
    @NameInMap("keyword")
    public String keyword;

    /**
     * <strong>example:</strong>
     * <p>21a90f5d-a469-4ac4-a8ea-f6e1e7470e6f</p>
     */
    @NameInMap("kmsKeyId")
    public String kmsKeyId;

    /**
     * <p>The module ID.</p>
     * 
     * <strong>example:</strong>
     * <p>mod-1525e992f1b62139d1c437d64ae</p>
     */
    @NameInMap("moduleId")
    public String moduleId;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The project ID.</p>
     * 
     * <strong>example:</strong>
     * <p>p-433aead7560572f8d95b25775c</p>
     */
    @NameInMap("projectId")
    public String projectId;

    /**
     * <p>The job status. Valid values:</p>
     * <ul>
     * <li>Planning: The job is in the Plan execution phase.</li>
     * <li>Planned: The job has completed the Plan execution.</li>
     * <li>PlannedAndFinished: After the Plan execution is completed, no diff is found, and the job enters the final state.</li>
     * <li>Applying: The job is in the Apply execution phase.</li>
     * <li>Applied: The job has completed the Apply execution.</li>
     * <li>Errored: The job execution encountered errors and entered the final state.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Errored</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The list of task tags.</p>
     */
    @NameInMap("tag")
    public java.util.List<ListTasksRequestTag> tag;

    /**
     * <p>The task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>task-433aead756057fffeaba4828f5195</p>
     */
    @NameInMap("taskId")
    public String taskId;

    public static ListTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTasksRequest self = new ListTasksRequest();
        return TeaModel.build(map, self);
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

    public ListTasksRequest setKmsKeyId(String kmsKeyId) {
        this.kmsKeyId = kmsKeyId;
        return this;
    }
    public String getKmsKeyId() {
        return this.kmsKeyId;
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
        /**
         * <p>The tag key of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("tagKey")
        public String tagKey;

        /**
         * <p>The tag value of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("tagValue")
        public String tagValue;

        public static ListTasksRequestTag build(java.util.Map<String, ?> map) throws Exception {
            ListTasksRequestTag self = new ListTasksRequestTag();
            return TeaModel.build(map, self);
        }

        public ListTasksRequestTag setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public ListTasksRequestTag setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
