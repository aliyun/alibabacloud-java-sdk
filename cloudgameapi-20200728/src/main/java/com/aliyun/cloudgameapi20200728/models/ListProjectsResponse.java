// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListProjectsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("Count")
    @Validation(required = true)
    public Long count;

    @NameInMap("DataList")
    @Validation(required = true)
    public java.util.List<ListProjectsResponseDataList> dataList;

    public static ListProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProjectsResponse self = new ListProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListProjectsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListProjectsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListProjectsResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListProjectsResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListProjectsResponse setDataList(java.util.List<ListProjectsResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListProjectsResponseDataList> getDataList() {
        return this.dataList;
    }

    public static class ListProjectsResponseDataList extends TeaModel {
        @NameInMap("ProjectId")
        @Validation(required = true)
        public String projectId;

        @NameInMap("ProjectName")
        @Validation(required = true)
        public String projectName;

        public static ListProjectsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListProjectsResponseDataList self = new ListProjectsResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListProjectsResponseDataList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListProjectsResponseDataList setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

}
