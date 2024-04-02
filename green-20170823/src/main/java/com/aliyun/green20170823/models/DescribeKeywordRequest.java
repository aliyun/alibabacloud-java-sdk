// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeKeywordRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("KeywordLibId")
    public Integer keywordLibId;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeKeywordRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeKeywordRequest self = new DescribeKeywordRequest();
        return TeaModel.build(map, self);
    }

    public DescribeKeywordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeKeywordRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeKeywordRequest setKeywordLibId(Integer keywordLibId) {
        this.keywordLibId = keywordLibId;
        return this;
    }
    public Integer getKeywordLibId() {
        return this.keywordLibId;
    }

    public DescribeKeywordRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeKeywordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeKeywordRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeKeywordRequest setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
