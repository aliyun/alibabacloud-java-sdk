// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class QueryTagByParamResponseBody extends TeaModel {
    /**
     * <p>Current page number</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>10A1AD70-E48E-476D-98D9-39BD92193837</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Total count</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>Data records</p>
     */
    @NameInMap("data")
    public QueryTagByParamResponseBodyData data;

    public static QueryTagByParamResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagByParamResponseBody self = new QueryTagByParamResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagByParamResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public QueryTagByParamResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public QueryTagByParamResponseBody setData(QueryTagByParamResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryTagByParamResponseBodyData getData() {
        return this.data;
    }

    public static class QueryTagByParamResponseBodyDataTag extends TeaModel {
        /**
         * <p>Tag description</p>
         * 
         * <strong>example:</strong>
         * <p>test description</p>
         */
        @NameInMap("TagDescription")
        public String tagDescription;

        /**
         * <p>Tag ID</p>
         * 
         * <strong>example:</strong>
         * <p>52366</p>
         */
        @NameInMap("TagId")
        public String tagId;

        /**
         * <p>Tag name</p>
         * 
         * <strong>example:</strong>
         * <p>hellopal</p>
         */
        @NameInMap("TagName")
        public String tagName;

        public static QueryTagByParamResponseBodyDataTag build(java.util.Map<String, ?> map) throws Exception {
            QueryTagByParamResponseBodyDataTag self = new QueryTagByParamResponseBodyDataTag();
            return TeaModel.build(map, self);
        }

        public QueryTagByParamResponseBodyDataTag setTagDescription(String tagDescription) {
            this.tagDescription = tagDescription;
            return this;
        }
        public String getTagDescription() {
            return this.tagDescription;
        }

        public QueryTagByParamResponseBodyDataTag setTagId(String tagId) {
            this.tagId = tagId;
            return this;
        }
        public String getTagId() {
            return this.tagId;
        }

        public QueryTagByParamResponseBodyDataTag setTagName(String tagName) {
            this.tagName = tagName;
            return this;
        }
        public String getTagName() {
            return this.tagName;
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
