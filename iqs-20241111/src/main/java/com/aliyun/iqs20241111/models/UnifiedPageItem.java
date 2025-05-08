// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedPageItem extends TeaModel {
    @NameInMap("hostLogo")
    public String hostLogo;

    @NameInMap("hostname")
    public String hostname;

    @NameInMap("images")
    public java.util.List<String> images;

    @NameInMap("link")
    public String link;

    @NameInMap("mainText")
    public String mainText;

    @NameInMap("markdownText")
    public String markdownText;

    /**
     * <strong>example:</strong>
     * <p>2025-04-07T10:15:30.123+08:00</p>
     */
    @NameInMap("publishedTime")
    public String publishedTime;

    @NameInMap("rerankScore")
    public Double rerankScore;

    @NameInMap("snippet")
    public String snippet;

    @NameInMap("summary")
    public String summary;

    @NameInMap("title")
    public String title;

    public static UnifiedPageItem build(java.util.Map<String, ?> map) throws Exception {
        UnifiedPageItem self = new UnifiedPageItem();
        return TeaModel.build(map, self);
    }

    public UnifiedPageItem setHostLogo(String hostLogo) {
        this.hostLogo = hostLogo;
        return this;
    }
    public String getHostLogo() {
        return this.hostLogo;
    }

    public UnifiedPageItem setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public UnifiedPageItem setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public UnifiedPageItem setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public UnifiedPageItem setMainText(String mainText) {
        this.mainText = mainText;
        return this;
    }
    public String getMainText() {
        return this.mainText;
    }

    public UnifiedPageItem setMarkdownText(String markdownText) {
        this.markdownText = markdownText;
        return this;
    }
    public String getMarkdownText() {
        return this.markdownText;
    }

    public UnifiedPageItem setPublishedTime(String publishedTime) {
        this.publishedTime = publishedTime;
        return this;
    }
    public String getPublishedTime() {
        return this.publishedTime;
    }

    public UnifiedPageItem setRerankScore(Double rerankScore) {
        this.rerankScore = rerankScore;
        return this;
    }
    public Double getRerankScore() {
        return this.rerankScore;
    }

    public UnifiedPageItem setSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }
    public String getSnippet() {
        return this.snippet;
    }

    public UnifiedPageItem setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public UnifiedPageItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
