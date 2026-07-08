// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class WritingOutline extends TeaModel {
    /**
     * <p>List of articles referenced in the outline</p>
     */
    @NameInMap("Articles")
    public java.util.List<OutlineWritingArticle> articles;

    /**
     * <p>List of sub-outlines</p>
     */
    @NameInMap("Children")
    public java.util.List<WritingOutline> children;

    /**
     * <p>Outline</p>
     * 
     * <strong>example:</strong>
     * <p>大纲名称</p>
     */
    @NameInMap("Outline")
    public String outline;

    /**
     * <p>Unique outline identifier</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("OutlineId")
    public String outlineId;

    /**
     * <p>Outline writing search keyword list</p>
     */
    @NameInMap("SearchKeyWordList")
    public java.util.List<String> searchKeyWordList;

    /**
     * <p>Description of word count requirements, such as 1K words, 2K words, or no less than 500 words.</p>
     * 
     * <strong>example:</strong>
     * <p>写作字数要求的描述</p>
     */
    @NameInMap("WordCount")
    public String wordCount;

    /**
     * <p>Outline writing requirements, writing tips</p>
     * 
     * <strong>example:</strong>
     * <p>大纲写作要求、写作提示</p>
     */
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
