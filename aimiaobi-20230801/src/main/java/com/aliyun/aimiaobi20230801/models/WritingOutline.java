// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class WritingOutline extends TeaModel {
    @NameInMap("Articles")
    public java.util.List<OutlineWritingArticle> articles;

    @NameInMap("Children")
    public java.util.List<WritingOutline> children;

    @NameInMap("Outline")
    public String outline;

    /**
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("OutlineId")
    public String outlineId;

    @NameInMap("SearchKeyWordList")
    public java.util.List<String> searchKeyWordList;

    @NameInMap("WordCount")
    public String wordCount;

    @NameInMap("WritingTips")
    public String writingTips;

    public static WritingOutline build(java.util.Map<String, ?> map) throws Exception {
        WritingOutline self = new WritingOutline();
        return TeaModel.build(map, self);
    }

    public WritingOutline setArticles(java.util.List<OutlineWritingArticle> articles) {
        this.articles = articles;
        return this;
    }
    public java.util.List<OutlineWritingArticle> getArticles() {
        return this.articles;
    }

    public WritingOutline setChildren(java.util.List<WritingOutline> children) {
        this.children = children;
        return this;
    }
    public java.util.List<WritingOutline> getChildren() {
        return this.children;
    }

    public WritingOutline setOutline(String outline) {
        this.outline = outline;
        return this;
    }
    public String getOutline() {
        return this.outline;
    }

    public WritingOutline setOutlineId(String outlineId) {
        this.outlineId = outlineId;
        return this;
    }
    public String getOutlineId() {
        return this.outlineId;
    }

    public WritingOutline setSearchKeyWordList(java.util.List<String> searchKeyWordList) {
        this.searchKeyWordList = searchKeyWordList;
        return this;
    }
    public java.util.List<String> getSearchKeyWordList() {
        return this.searchKeyWordList;
    }

    public WritingOutline setWordCount(String wordCount) {
        this.wordCount = wordCount;
        return this;
    }
    public String getWordCount() {
        return this.wordCount;
    }

    public WritingOutline setWritingTips(String writingTips) {
        this.writingTips = writingTips;
        return this;
    }
    public String getWritingTips() {
        return this.writingTips;
    }

}
