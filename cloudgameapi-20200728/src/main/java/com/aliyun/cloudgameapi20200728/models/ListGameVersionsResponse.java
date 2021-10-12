// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListGameVersionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Count")
    @Validation(required = true)
    public Long count;

    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("MaxResults")
    @Validation(required = true)
    public Integer maxResults;

    @NameInMap("DataList")
    @Validation(required = true)
    public java.util.List<ListGameVersionsResponseDataList> dataList;

    public static ListGameVersionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListGameVersionsResponse self = new ListGameVersionsResponse();
        return TeaModel.build(map, self);
    }

    public ListGameVersionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListGameVersionsResponse setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListGameVersionsResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGameVersionsResponse setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGameVersionsResponse setDataList(java.util.List<ListGameVersionsResponseDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListGameVersionsResponseDataList> getDataList() {
        return this.dataList;
    }

    public static class ListGameVersionsResponseDataList extends TeaModel {
        @NameInMap("VersionId")
        @Validation(required = true)
        public String versionId;

        @NameInMap("VersionName")
        @Validation(required = true)
        public String versionName;

        @NameInMap("VersionNumber")
        @Validation(required = true)
        public String versionNumber;

        public static ListGameVersionsResponseDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGameVersionsResponseDataList self = new ListGameVersionsResponseDataList();
            return TeaModel.build(map, self);
        }

        public ListGameVersionsResponseDataList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGameVersionsResponseDataList setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListGameVersionsResponseDataList setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

    }

}
