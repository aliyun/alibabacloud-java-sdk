// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ListProjectResponseBody extends TeaModel {
    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("count")
    public Long count;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Long pageNumber;

    /**
     * <p>The number of results per page. Default value: 20. Minimum value: 1. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <p>The list of projects.</p>
     */
    @NameInMap("projects")
    public java.util.List<ListProjectResponseBodyProjects> projects;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>136B3926-DD90-5DB2-96EC-8BAD6407D1C9</p>
     */
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

    public static class ListProjectResponseBodyProjectsTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("key")
        public String key;

        /**
         * <p>The tag value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("value")
        public String value;

        public static ListProjectResponseBodyProjectsTags build(java.util.Map<String, ?> map) throws Exception {
            ListProjectResponseBodyProjectsTags self = new ListProjectResponseBodyProjectsTags();
            return TeaModel.build(map, self);
        }

        public ListProjectResponseBodyProjectsTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProjectResponseBodyProjectsTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListProjectResponseBodyProjects extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-05-10T10:08:34Z</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <p>The project description.</p>
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
         * <p>1234</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p>p-148e7853433574fffe9fec72ed9b72</p>
         */
        @NameInMap("projectId")
        public String projectId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("tags")
        public java.util.List<ListProjectResponseBodyProjectsTags> tags;

        /**
         * <p>The number of tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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

        public ListProjectResponseBodyProjects setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectResponseBodyProjects setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListProjectResponseBodyProjects setTags(java.util.List<ListProjectResponseBodyProjectsTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListProjectResponseBodyProjectsTags> getTags() {
            return this.tags;
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
