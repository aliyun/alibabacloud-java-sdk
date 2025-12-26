// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datahub20240620.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("List")
    public ListProjectsResponseBodyList list;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>9892074a2a89600ae4b0d5a34fb99a3f</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>20250401102332e68e3d0b04ab4904</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

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

    public ListProjectsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProjectsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
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

    public ListProjectsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListProjectsResponseBodyListProject extends TeaModel {
        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>1708171905000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>1048133943212399</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>poc_test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        /**
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
