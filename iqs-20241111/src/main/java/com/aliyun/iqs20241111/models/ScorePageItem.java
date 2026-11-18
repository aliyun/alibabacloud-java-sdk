// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class ScorePageItem extends TeaModel {
    /**
     * <p>The search result template. Different templates return different fields.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>structure_web_info</p>
     */
    @NameInMap("cardType")
    public String cardType;

    /**
     * <p>The relevance tag. A value of 0 indicates low relevance, and 1 indicates non-low relevance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("correlationTag")
    public Integer correlationTag;

    /**
     * <p>The abbreviated URL of this search result.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>baijiahao.baidu.com</p>
     */
    @NameInMap("displayLink")
    public String displayLink;

    /**
     * <p>The dynamic authority score, which ranges from 0 to 2 and is calculated based on the relevance of the query content.</p>
     * 
     * <strong>example:</strong>
     * <p>1.923339</p>
     */
    @NameInMap("hostAuthorityScore")
    public Double hostAuthorityScore;

    /**
     * <p>The site logo.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://s2.zimgs.cn/ims?kt=url&at=smstruct&key=aHR0cHM6Ly9ndy5hbGljZG4uY29tL0wxLzcyMy8xNTY1MjU2NjAwLzJhL2YwL2I0LzJhZjBiNDQxMGI5YmVlMDVjOGVlNGJmODk3MTNkNTFjLnBuZw==&sign=yx:CUlNNQVJQjFrk3Kxt2F3KWhTOFU=&tv=400_400">https://s2.zimgs.cn/ims?kt=url&amp;at=smstruct&amp;key=aHR0cHM6Ly9ndy5hbGljZG4uY29tL0wxLzcyMy8xNTY1MjU2NjAwLzJhL2YwL2I0LzJhZjBiNDQxMGI5YmVlMDVjOGVlNGJmODk3MTNkNTFjLnBuZw==&amp;sign=yx:CUlNNQVJQjFrk3Kxt2F3KWhTOFU=&amp;tv=400_400</a></p>
     */
    @NameInMap("hostLogo")
    public String hostLogo;

    /**
     * <p>The site name.</p>
     * 
     * <strong>example:</strong>
     * <p>Xinhua News</p>
     */
    @NameInMap("hostname")
    public String hostname;

    /**
     * <p>The description snippet of the search result in HTML format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>In terms of 100 km/h-0 braking capability, it is only 33.3m. Without bias, just looking at this, the <em>Xiaomi SU7</em> indeed performs well. As for range, with a 101 kWh battery capacity, it achieves a CLTC range of 800 km, and features an 800V high-voltage platform that can add 220 km of range in 5 minutes and 510 km in 15 minutes. And..</p>
     */
    @NameInMap("htmlSnippet")
    public String htmlSnippet;

    /**
     * <p>The search result title in HTML format.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><em>Xiaomi</em> SU7 priced from 229,900 yuan, executive personally dispels rumors: no <em>price</em> before launch - Baijiahao</p>
     */
    @NameInMap("htmlTitle")
    public String htmlTitle;

    /**
     * <p>The image information.</p>
     */
    @NameInMap("images")
    public java.util.List<IncludeImage> images;

    /**
     * <p>The full URL that the search result points to.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://baijiahao.baidu.com/s?id=1787881554557805096">https://baijiahao.baidu.com/s?id=1787881554557805096</a></p>
     */
    @NameInMap("link")
    public String link;

    /**
     * <p>The full text of the search result, which is available in some scenarios.</p>
     * 
     * <strong>example:</strong>
     * <p>Yesterday, Xiaomi Auto was not launched, but related information has been mostly revealed. At the launch event, Lei Jun directly stated that Xiaomi SU7 benchmarks Tesla and Porsche, with 100 industry-leading features. It seems that &quot;far ahead&quot; is no longer a Huawei patent? When introducing the technology, Lei Jun also expanded on five major aspects: motor, battery, mega casting, autonomous driving, and smart cockpit, fully demonstrating Xiaomi Auto\&quot;s technology and technical reserves. All the materials that can be stacked are stacked... Regarding the performance that everyone is interested in, 0-100 km/h acceleration in 2.78s, and a top speed of 265 km/h</p>
     */
    @NameInMap("mainText")
    public String mainText;

    /**
     * <p>The web page body in Markdown format.</p>
     * 
     * <strong>example:</strong>
     * <h1>2022 Apsara Conference Homepage</h1>
     */
    @NameInMap("markdownText")
    public String markdownText;

    /**
     * <p>The MIME type of the search result.</p>
     * 
     * <strong>example:</strong>
     * <p>text/html</p>
     */
    @NameInMap("mime")
    public String mime;

    /**
     * <p>The supplementary page information.</p>
     * 
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("pageMap")
    public java.util.Map<String, String> pageMap;

    /**
     * <p>The publish time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1704426524000</p>
     */
    @NameInMap("publishTime")
    public Long publishTime;

    /**
     * <p>The full rich text body, which preserves the order of text, images, audio, video, tables, and code in the web page.</p>
     * 
     * <strong>example:</strong>
     * <p><quark-ocr> 24 hx 3 </quark-ocr></p>
     */
    @NameInMap("richMainBody")
    public String richMainBody;

    /**
     * <p>The score.</p>
     * 
     * <strong>example:</strong>
     * <p>0.234325235</p>
     */
    @NameInMap("score")
    public Double score;

    /**
     * <p>The site label. Two types are currently supported:</p>
     * <ul>
     * <li>Authoritative media</li>
     * <li>Party and government organs</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Authoritative media</p>
     */
    @NameInMap("siteLabel")
    public String siteLabel;

    /**
     * <p>The description snippet of the search result in text format.</p>
     * 
     * <strong>example:</strong>
     * <p>In terms of 100 km/h-0 braking capability, it is only 33.3m. Without bias, just looking at this, the Xiaomi SU7 indeed performs well. As for range, with a 101 kWh battery capacity, it achieves a CLTC range of 800 km, and features an 800V high-voltage platform that can add 220 km of range in 5 minutes and 510 km in 15 minutes. And..</p>
     */
    @NameInMap("snippet")
    public String snippet;

    /**
     * <p>The enhanced summary.</p>
     * 
     * <strong>example:</strong>
     * <p>Tomorrow</p>
     */
    @NameInMap("summary")
    public String summary;

    /**
     * <p>The search result title in plain text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Xiaomi SU7 priced from 229,900 yuan, executive personally dispels rumors: no price before launch</p>
     */
    @NameInMap("title")
    public String title;

    /**
     * <p>The static authority score, which is determined solely by the authority of the website itself and is independent of the query content.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("websiteAuthorityScore")
    public Integer websiteAuthorityScore;

    public static ScorePageItem build(java.util.Map<String, ?> map) throws Exception {
        ScorePageItem self = new ScorePageItem();
        return TeaModel.build(map, self);
    }

    public ScorePageItem setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public ScorePageItem setCorrelationTag(Integer correlationTag) {
        this.correlationTag = correlationTag;
        return this;
    }
    public Integer getCorrelationTag() {
        return this.correlationTag;
    }

    public ScorePageItem setDisplayLink(String displayLink) {
        this.displayLink = displayLink;
        return this;
    }
    public String getDisplayLink() {
        return this.displayLink;
    }

    public ScorePageItem setHostAuthorityScore(Double hostAuthorityScore) {
        this.hostAuthorityScore = hostAuthorityScore;
        return this;
    }
    public Double getHostAuthorityScore() {
        return this.hostAuthorityScore;
    }

    public ScorePageItem setHostLogo(String hostLogo) {
        this.hostLogo = hostLogo;
        return this;
    }
    public String getHostLogo() {
        return this.hostLogo;
    }

    public ScorePageItem setHostname(String hostname) {
        this.hostname = hostname;
        return this;
    }
    public String getHostname() {
        return this.hostname;
    }

    public ScorePageItem setHtmlSnippet(String htmlSnippet) {
        this.htmlSnippet = htmlSnippet;
        return this;
    }
    public String getHtmlSnippet() {
        return this.htmlSnippet;
    }

    public ScorePageItem setHtmlTitle(String htmlTitle) {
        this.htmlTitle = htmlTitle;
        return this;
    }
    public String getHtmlTitle() {
        return this.htmlTitle;
    }

    public ScorePageItem setImages(java.util.List<IncludeImage> images) {
        this.images = images;
        return this;
    }
    public java.util.List<IncludeImage> getImages() {
        return this.images;
    }

    public ScorePageItem setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public ScorePageItem setMainText(String mainText) {
        this.mainText = mainText;
        return this;
    }
    public String getMainText() {
        return this.mainText;
    }

    public ScorePageItem setMarkdownText(String markdownText) {
        this.markdownText = markdownText;
        return this;
    }
    public String getMarkdownText() {
        return this.markdownText;
    }

    public ScorePageItem setMime(String mime) {
        this.mime = mime;
        return this;
    }
    public String getMime() {
        return this.mime;
    }

    public ScorePageItem setPageMap(java.util.Map<String, String> pageMap) {
        this.pageMap = pageMap;
        return this;
    }
    public java.util.Map<String, String> getPageMap() {
        return this.pageMap;
    }

    public ScorePageItem setPublishTime(Long publishTime) {
        this.publishTime = publishTime;
        return this;
    }
    public Long getPublishTime() {
        return this.publishTime;
    }

    public ScorePageItem setRichMainBody(String richMainBody) {
        this.richMainBody = richMainBody;
        return this;
    }
    public String getRichMainBody() {
        return this.richMainBody;
    }

    public ScorePageItem setScore(Double score) {
        this.score = score;
        return this;
    }
    public Double getScore() {
        return this.score;
    }

    public ScorePageItem setSiteLabel(String siteLabel) {
        this.siteLabel = siteLabel;
        return this;
    }
    public String getSiteLabel() {
        return this.siteLabel;
    }

    public ScorePageItem setSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }
    public String getSnippet() {
        return this.snippet;
    }

    public ScorePageItem setSummary(String summary) {
        this.summary = summary;
        return this;
    }
    public String getSummary() {
        return this.summary;
    }

    public ScorePageItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public ScorePageItem setWebsiteAuthorityScore(Integer websiteAuthorityScore) {
        this.websiteAuthorityScore = websiteAuthorityScore;
        return this;
    }
    public Integer getWebsiteAuthorityScore() {
        return this.websiteAuthorityScore;
    }

}
