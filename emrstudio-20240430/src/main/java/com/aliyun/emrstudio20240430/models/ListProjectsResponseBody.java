// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListProjectsResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>123abc***</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("totalSize")
    public Integer totalSize;

    public static ListProjectsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponseBody self = new ListProjectsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponseBody setData(java.util.List<ListProjectsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListProjectsResponseBodyData> getData() {
        return this.data;
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

    public ListProjectsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public static class ListProjectsResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>project_name</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>p-3q9jo749ne5****</p>
         */
        @NameInMap("projectId")
        public String projectId;

        public static ListProjectsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseBodyData self = new ListProjectsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListProjectsResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListProjectsResponseBodyData setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

    }

}
