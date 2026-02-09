// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class OutlineSearchResult extends TeaModel {
    @NameInMap("Articles")
    public java.util.List<OutlineWritingArticle> articles;

    @NameInMap("Outline")
    public String outline;

    /**
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("OutlineId")
    public String outlineId;

    @NameInMap("PrimaryOutline")
    public String primaryOutline;

    @NameInMap("Query")
    public String query;

    public static OutlineSearchResult build(java.util.Map<String, ?> map) throws Exception {
        OutlineSearchResult self = new OutlineSearchResult();
        return TeaModel.build(map, self);
    }

    public OutlineSearchResult setArticles(java.util.List<OutlineWritingArticle> articles) {
        this.articles = articles;
        return this;
    }
    public java.util.List<OutlineWritingArticle> getArticles() {
        return this.articles;
    }

    public OutlineSearchResult setOutline(String outline) {
        this.outline = outline;
        return this;
    }
    public String getOutline() {
        return this.outline;
    }

    public OutlineSearchResult setOutlineId(String outlineId) {
        this.outlineId = outlineId;
        return this;
    }
    public String getOutlineId() {
        return this.outlineId;
    }

    public OutlineSearchResult setPrimaryOutline(String primaryOutline) {
        this.primaryOutline = primaryOutline;
        return this;
    }
    public String getPrimaryOutline() {
        return this.primaryOutline;
    }

    public OutlineSearchResult setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

}
