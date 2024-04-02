// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeKeywordResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("KeywordList")
    public java.util.List<DescribeKeywordResponseBodyKeywordList> keywordList;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeKeywordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeywordResponseBody self = new DescribeKeywordResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeKeywordResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeKeywordResponseBody setKeywordList(java.util.List<DescribeKeywordResponseBodyKeywordList> keywordList) {
        this.keywordList = keywordList;
        return this;
    }
    public java.util.List<DescribeKeywordResponseBodyKeywordList> getKeywordList() {
        return this.keywordList;
    }

    public DescribeKeywordResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKeywordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeKeywordResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeKeywordResponseBodyKeywordList extends TeaModel {
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("HitCount")
        public Integer hitCount;

        @NameInMap("Id")
        public Integer id;

        @NameInMap("Keyword")
        public String keyword;

        public static DescribeKeywordResponseBodyKeywordList build(java.util.Map<String, ?> map) throws Exception {
            DescribeKeywordResponseBodyKeywordList self = new DescribeKeywordResponseBodyKeywordList();
            return TeaModel.build(map, self);
        }

        public DescribeKeywordResponseBodyKeywordList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeKeywordResponseBodyKeywordList setHitCount(Integer hitCount) {
            this.hitCount = hitCount;
            return this;
        }
        public Integer getHitCount() {
            return this.hitCount;
        }

        public DescribeKeywordResponseBodyKeywordList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public DescribeKeywordResponseBodyKeywordList setKeyword(String keyword) {
            this.keyword = keyword;
            return this;
        }
        public String getKeyword() {
            return this.keyword;
        }

    }

}
