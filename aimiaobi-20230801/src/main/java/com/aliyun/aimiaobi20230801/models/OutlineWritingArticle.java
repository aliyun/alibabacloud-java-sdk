// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class OutlineWritingArticle extends TeaModel {
    /**
     * <p>Content</p>
     * 
     * <strong>example:</strong>
     * <p>新闻内容</p>
     */
    @NameInMap("Content")
    public String content;

    /**
     * <p>The leaf outline this material belongs to</p>
     * 
     * <strong>example:</strong>
     * <p>大纲名称</p>
     */
    @NameInMap("Outline")
    public String outline;

    /**
     * <p>The primary outline this material belongs to</p>
     * 
     * <strong>example:</strong>
     * <p>一级大纲名称</p>
     */
    @NameInMap("PrimaryOutline")
    public String primaryOutline;

    /**
     * <p>Publish time</p>
     * 
     * <strong>example:</strong>
     * <p>2023-04-11 06:14:07</p>
     */
    @NameInMap("PubTime")
    public String pubTime;

    /**
     * <p>Retrieval source encoding</p>
     * 
     * <strong>example:</strong>
     * <p>检索源编码</p>
     */
    @NameInMap("SearchSource")
    public String searchSource;

    /**
     * <p>Retrieval name</p>
     * 
     * <strong>example:</strong>
     * <p>检索源名称</p>
     */
    @NameInMap("SearchSourceName")
    public String searchSourceName;

    /**
     * <p>News title</p>
     * 
     * <strong>example:</strong>
     * <p>新闻标题</p>
     */
    @NameInMap("Title")
    public String title;

    /**
     * <p>News URL</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com/xxxx.html">http://www.example.com/xxxx.html</a></p>
     */
    @NameInMap("Url")
    public String url;

    public static OutlineWritingArticle build(java.util.Map<String, ?> map) throws Exception {
        OutlineWritingArticle self = new OutlineWritingArticle();
        return TeaModel.build(map, self);
    }

    public OutlineWritingArticle setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public OutlineWritingArticle setOutline(String outline) {
        this.outline = outline;
        return this;
    }
    public String getOutline() {
        return this.outline;
    }

    public OutlineWritingArticle setPrimaryOutline(String primaryOutline) {
        this.primaryOutline = primaryOutline;
        return this;
    }
    public String getPrimaryOutline() {
        return this.primaryOutline;
    }

    public OutlineWritingArticle setPubTime(String pubTime) {
        this.pubTime = pubTime;
        return this;
    }
    public String getPubTime() {
        return this.pubTime;
    }

    public OutlineWritingArticle setSearchSource(String searchSource) {
        this.searchSource = searchSource;
        return this;
    }
    public String getSearchSource() {
        return this.searchSource;
    }

    public OutlineWritingArticle setSearchSourceName(String searchSourceName) {
        this.searchSourceName = searchSourceName;
        return this;
    }
    public String getSearchSourceName() {
        return this.searchSourceName;
    }

    public OutlineWritingArticle setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public OutlineWritingArticle setUrl(String url) {
        this.url = url;
        return this;
    }
    public String getUrl() {
        return this.url;
    }

}
