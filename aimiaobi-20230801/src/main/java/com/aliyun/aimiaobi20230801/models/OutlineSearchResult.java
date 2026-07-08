// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class OutlineSearchResult extends TeaModel {
    /**
     * <p>A list of retrieved materials.</p>
     */
    @NameInMap("Articles")
    public java.util.List<OutlineWritingArticle> articles;

    /**
     * <p>The retrieved outline.</p>
     * 
     * <strong>example:</strong>
     * <p>晨光中的自律：清晨6:30的校园</p>
     */
    @NameInMap("Outline")
    public String outline;

    /**
     * <p>The unique identifier of the outline.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxxx</p>
     */
    @NameInMap("OutlineId")
    public String outlineId;

    /**
     * <p>The primary outline.</p>
     * 
     * <strong>example:</strong>
     * <p>大学生正能量的一天</p>
     */
    @NameInMap("PrimaryOutline")
    public String primaryOutline;

    /**
     * <p>The retrieval query.</p>
     * 
     * <strong>example:</strong>
     * <p>高校环保义卖案例 大学生旧物循环利用率的文章</p>
     */
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
