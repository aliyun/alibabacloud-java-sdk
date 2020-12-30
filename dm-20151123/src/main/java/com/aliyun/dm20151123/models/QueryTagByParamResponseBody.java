// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTagByParamResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("data")
    public QueryTagByParamResponseBodyData data;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    public static QueryTagByParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagByParamResponseBody self = new QueryTagByParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagByParamResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryTagByParamResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTagByParamResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagByParamResponseBody setData(QueryTagByParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTagByParamResponseBodyData getData() {
        return this.data;
    }

    public QueryTagByParamResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public static class QueryTagByParamResponseBodyDataTag extends TeaModel {
        @NameInMap("TagName")
        public String tagName;

        @NameInMap("TagId")
        public String tagId;

        public static QueryTagByParamResponseBodyDataTag build(java.util.Map<String, ?> map) throws Exception {
            QueryTagByParamResponseBodyDataTag self = new QueryTagByParamResponseBodyDataTag();
            return TeaModel.build(map, self);
        }

        public QueryTagByParamResponseBodyDataTag setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
        }

        public QueryTagByParamResponseBodyDataTag setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

    }

    public static class QueryTagByParamResponseBodyData extends TeaModel {
        @NameInMap("tag")
        public java.util.List<QueryTagByParamResponseBodyDataTag> tag;

        public static QueryTagByParamResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTagByParamResponseBodyData self = new QueryTagByParamResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTagByParamResponseBodyData setTag(java.util.List<QueryTagByParamResponseBodyDataTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryTagByParamResponseBodyDataTag> getTag() {
            return this.tag;
        }

    }

}
