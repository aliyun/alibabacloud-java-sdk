// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudgameapi20200728.models;

import com.aliyun.tea.*;

public class ListGameVersionsResponseBody extends TeaModel {
    // 总记录数
    @NameInMap("Count")
    public Long count;

    // 数据列表
    @NameInMap("DataList")
    public java.util.List<ListGameVersionsResponseBodyDataList> dataList;

    // 本次请求所返回的最大记录条数
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 表示当前调用返回读取到的位置，空代表数据已经读取完毕
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static ListGameVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListGameVersionsResponseBody self = new ListGameVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListGameVersionsResponseBody setCount(Long count) {
        this.count = count;
        return this;
    }
    public Long getCount() {
        return this.count;
    }

    public ListGameVersionsResponseBody setDataList(java.util.List<ListGameVersionsResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<ListGameVersionsResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public ListGameVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListGameVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListGameVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListGameVersionsResponseBodyDataList extends TeaModel {
        // 版本ID
        @NameInMap("VersionId")
        public String versionId;

        // 版本名称
        @NameInMap("VersionName")
        public String versionName;

        // 版本号
        @NameInMap("VersionNumber")
        public String versionNumber;

        public static ListGameVersionsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListGameVersionsResponseBodyDataList self = new ListGameVersionsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListGameVersionsResponseBodyDataList setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

        public ListGameVersionsResponseBodyDataList setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public ListGameVersionsResponseBodyDataList setVersionNumber(String versionNumber) {
            this.versionNumber = versionNumber;
            return this;
        }
        public String getVersionNumber() {
            return this.versionNumber;
        }

    }

}
