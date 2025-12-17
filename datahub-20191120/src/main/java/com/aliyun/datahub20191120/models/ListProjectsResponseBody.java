// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20191120.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    /**
     * <p>Project name</p>
     */
    @NameInMap("List")
    public ListProjectsResponseBodyList list;

    /**
     * <p>Total number of pages</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageCount")
    public String pageCount;

    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>84</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>20250401102332e68e3d0b04ab4904</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Whether the operation was successful</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>Total number of query results</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setList(ListProjectsResponseBodyList list) {
        this.list = list;
        return this;
    }
    public ListProjectsResponseBodyList getList() {
        return this.list;
    }

    public ListProjectsResponseBody setPageCount(String pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public String getPageCount() {
        return this.pageCount;
    }

    public ListProjectsResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListProjectsResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListProjectsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListProjectsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectsResponseBodyListProject extends TeaModel {
        /**
         * <p>Text comment for the field</p>
         * 
         * <strong>example:</strong>
         * <p>测试专用</p>
         */
        @NameInMap("Comment")
        public String comment;

        /**
         * <p>Creation time</p>
         * 
         * <strong>example:</strong>
         * <p>1708171905000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Creator ID</p>
         * 
         * <strong>example:</strong>
         * <p>1048133943212399</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <p>Creator\&quot;s name</p>
         * 
         * <strong>example:</strong>
         * <p>user_name</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <p>Project name</p>
         * 
         * <strong>example:</strong>
         * <p>poc_test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
         * <p>Update time</p>
         * 
         * <strong>example:</strong>
         * <p>1708171905000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListProjectsResponseBodyListProject build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyListProject self = new ListProjectsResponseBodyListProject();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyListProject setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListProjectsResponseBodyListProject setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListProjectsResponseBodyListProject setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListProjectsResponseBodyListProject setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListProjectsResponseBodyListProject setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListProjectsResponseBodyListProject setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class ListProjectsResponseBodyList extends TeaModel {
        @NameInMap("Project")
        public java.util.List<ListProjectsResponseBodyListProject> project;

        public static ListProjectsResponseBodyList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyList self = new ListProjectsResponseBodyList();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyList setProject(java.util.List<ListProjectsResponseBodyListProject> project) {
            this.project = project;
            return this;
        }
        public java.util.List<ListProjectsResponseBodyListProject> getProject() {
            return this.project;
        }

    }

}
