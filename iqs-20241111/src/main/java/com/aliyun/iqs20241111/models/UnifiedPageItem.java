// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedPageItem extends TeaModel {
    @NameInMap("correlationTag")
    public Integer correlationTag;

    @NameInMap("hostAuthorityScore")
    public Double hostAuthorityScore;

    /**
     * <p>The site logo.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://www.china.com/zh_cn/img1905/2023/logo.png">https://www.china.com/zh_cn/img1905/2023/logo.png</a></p>
     */
    @NameInMap("hostLogo")
    public String hostLogo;

    /**
     * <p>The site name.</p>
     * 
     * <strong>example:</strong>
     * <p>中华网</p>
     */
    @NameInMap("hostname")
    public String hostname;

    /**
     * <p>The images in the search result URL. A maximum of three images are returned.</p>
     */
    @NameInMap("images")
    public java.util.List<String> images;

    /**
     * <p>The full URL that the search result points to.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://hea.china.com/articles/20250427/202504271666343.html">https://hea.china.com/articles/20250427/202504271666343.html</a></p>
     */
    @NameInMap("link")
    public String link;

    /**
     * <p>The full text of the searched web page.</p>
     * 
     * <strong>example:</strong>
     * <p>2025上海车展期间，最火爆的无疑是问界品牌，成为众多大佬的话题中心。赛力斯集团董事长（创始人）张兴海、华为常务董事、终端BG董事长余承东、著名演员陈道明、宁德时代董事长曾毓群都分享了对问界的使用体验。\n“问界M9、M8正重构 中国 豪华汽车市场格局。”张兴海说， (此处省略....)。\n责任编辑：kj005\n 文章投诉热线:157 3889 8464 投诉邮箱:7983347 <a href="mailto:16@qq.com">16@qq.com</a>\n关键词：</p>
     */
    @NameInMap("mainText")
    public String mainText;

    /**
     * <p>The Markdown content.</p>
     * 
     * <strong>example:</strong>
     * <h1>上海车展大佬齐聚 问界成为话题中心<strong>来源</strong>：财讯网</h1>
     * <p><strong>时间</strong>：2025-04-27 20:36:04<br>2025上海车展期间，最火爆的无疑是问界品牌，成为众多大佬的话题中心。赛力斯集团董事长（创始人）张兴海、华为常务董事、终端BG董事长余承东、著名演员陈道明、宁德时代董事长曾毓群都分享了对问界的使用体验。
     * <img src="http://objectnsg.oss-cn-beijing.aliyuncs.com/yhdoc/202504/27/202504272025531927023138.png" alt="图片">余承东表示，问界M9、M8、M7和M5，都深受消费者喜爱！问界M9连续3个月中国纯电车型保值率第一！纯电、增程车型包揽新能源大型SUV保值率前两名！
     * <img src="http://objectnsg.oss-cn-beijing.aliyuncs.com/yhdoc/202504/27/202504272025531312025791.jpeg" alt="图片">“自己是问界M9的用户
     * <em>责任编辑：kj005</em>文章投诉热线: 157 3889 8464<br>投诉邮箱: <a href="mailto:798334716@qq.com">798334716@qq.com</a></p>
     */
    @NameInMap("markdownText")
    public String markdownText;

    /**
     * <p>The time when the web page was published, in ISO time format.</p>
     * 
     * <strong>example:</strong>
     * <p>2025-04-27T20:36:04+08:00</p>
     */
    @NameInMap("publishedTime")
    public String publishedTime;

    /**
     * <p>The rerank score.</p>
     * 
     * <strong>example:</strong>
     * <p>0.7786493301391602</p>
     */
    @NameInMap("rerankScore")
    public Double rerankScore;

    @NameInMap("richMainBody")
    public String richMainBody;

    /**
     * <p>The text summary.</p>
     * 
     * <strong>example:</strong>
     * <p>2025上海车展期间，最火爆的无疑是问界品牌，成为众多大佬的话题中心。赛力斯集团董事长（创始人）张兴海、华为常务董事、终端BG董事长余承东、著名演员陈道明、宁德时代董事长曾毓群都分享了对问界的使用体验。 ...</p>
     */
    @NameInMap("snippet")
    public String snippet;

    /**
     * <p>The enhanced summary, which contains 400 or more characters.</p>
     * 
     * <strong>example:</strong>
     * <p>2025上海车展期间，最火爆的无疑是问界品牌，成为众多大佬的话题中心。赛力斯集团董事长（创始人）张兴海、华为常务董事、终端BG董事长余承东、著名演员陈道明、宁德时代董事长曾毓群都分享了对问界的使用体验。“自己是问界M9的用户，用车感受非常好。”陈道明表示，体验后才敢现场给大家推荐。未来，希望能实现问界M9的特别定制，让外观、内饰、座椅布局等，更符合自己的使用需求。据悉，2025款问界M9上市25天就交付超1万，已连续11个月蝉联50万元级豪车车销冠；问界M8上市4天，大定就突破了五万 台 ，深受市场任何和用户喜爱...“问界M9、M8正重构 中国 豪华汽车市场格局。”张兴海说， 近 期曾极限试驾问界M8，从重庆出发，历时55小时、行驶超3500公里抵达冈仁波齐。整个行程中，车辆的安全 性 和体验感都表现出色。</p>
     */
    @NameInMap("summary")
    public String summary;

    @NameInMap("tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The full URL that the search result points to.</p>
     * 
     * <strong>example:</strong>
     * <p>上海车展大佬齐聚 问界成为话题中心</p>
     */
    @NameInMap("title")
    public String title;

    @NameInMap("websiteAuthorityScore")
    public Integer websiteAuthorityScore;

    public static UnifiedPageItem build(java.util.Map<String, ?> map) throws Exception {
        UnifiedPageItem self = new UnifiedPageItem();
        return TeaModel.build(map, self);
    }

    public UnifiedPageItem setCorrelationTag(Integer correlationTag) {
        this.correlationTag = correlationTag;
        return this;
    }
    public Integer getCorrelationTag() {
        return this.correlationTag;
    }

    public UnifiedPageItem setHostAuthorityScore(Double hostAuthorityScore) {
        this.hostAuthorityScore = hostAuthorityScore;
        return this;
    }
    public Double getHostAuthorityScore() {
        return this.hostAuthorityScore;
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

    public UnifiedPageItem setRichMainBody(String richMainBody) {
        this.richMainBody = richMainBody;
        return this;
    }
    public String getRichMainBody() {
        return this.richMainBody;
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

    public UnifiedPageItem setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public UnifiedPageItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public UnifiedPageItem setWebsiteAuthorityScore(Integer websiteAuthorityScore) {
        this.websiteAuthorityScore = websiteAuthorityScore;
        return this;
    }
    public Integer getWebsiteAuthorityScore() {
        return this.websiteAuthorityScore;
    }

}
