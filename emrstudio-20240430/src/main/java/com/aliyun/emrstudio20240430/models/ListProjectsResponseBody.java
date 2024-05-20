// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emrstudio20240430.models;

import com.aliyun.tea.*;

public class ListProjectsResponseBody extends TeaModel {
    @NameInMap("data")
    public java.util.List<ListProjectsResponseBodyData> data;

    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("requestId")
    public String requestId;

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
        @NameInMap("description")
        public String description;

        @NameInMap("name")
        public String name;

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
