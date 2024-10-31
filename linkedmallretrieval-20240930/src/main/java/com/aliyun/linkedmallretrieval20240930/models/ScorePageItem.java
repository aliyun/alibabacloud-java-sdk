// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmallretrieval20240930.models;

import com.aliyun.tea.*;

public class ScorePageItem extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>structure_web_info</p>
     */
    @NameInMap("cardType")
    public String cardType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>baijiahao.baidu.com</p>
     */
    @NameInMap("displayLink")
    public String displayLink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100km/h-0制动能力上，仅有33.3m，不黑不吹，单看这个，<em>小米SU7</em>确实表现不错。而续航方面，101kWh电池容量，实现CLTC续航800km，还有现5分钟补能220km，15分钟补能510km的800V高压平台。而在...</p>
     */
    @NameInMap("htmlSnippet")
    public String htmlSnippet;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><em>小米</em>SU7售价22.99万元起 高管亲自辟谣：发布前不会有<em>价格</em>-百家号</p>
     */
    @NameInMap("htmlTitle")
    public String htmlTitle;

    @NameInMap("images")
    public java.util.List<IncludeImage> images;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://baijiahao.baidu.com/s?id=1787881554557805096">https://baijiahao.baidu.com/s?id=1787881554557805096</a></p>
     */
    @NameInMap("link")
    public String link;

    /**
     * <strong>example:</strong>
     * <p>昨天	，	小米	汽车	没有	发布	，	但	相关	的	信息	透露	的	差	不	多	了	。		
     *         在	发布	会	现场	，	雷军	直接	称	小米	S	U	7	对	标	特斯拉	保时捷	，	有	100	项	行业	领先	，	可见	“	遥遥	领先	”	已经	不再	是	华为	专利	了	？		</p>
     * <pre><code>    而	在	介绍	技术	时	，	雷军	也	从	电机	、	电池	、	大	压铸	、	自动	驾驶	、	智能	座舱	等	五	大	方面	展开	，	充分	展示	了	小米	汽车	的	技术	以及	技术	储备	，		 		能	堆	的	料	，	全都	堆	上去	了	…	…		
     *     大家	比较	感	兴趣	的	性能	方面	，	2	.	78	s	的	0	-	100	km	/	h	加速	，	265	km	/	h	的	最高	时速
     * </code></pre>
     */
    @NameInMap("mainText")
    public String mainText;

    /**
     * <strong>example:</strong>
     * <p>text/html</p>
     */
    @NameInMap("mime")
    public String mime;

    @NameInMap("pageMap")
    public java.util.Map<String, String> pageMap;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1704426524000</p>
     */
    @NameInMap("publishTime")
    public Long publishTime;

    /**
     * <strong>example:</strong>
     * <p>0.234325235</p>
     */
    @NameInMap("score")
    public Double score;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>小米SU7售价22.99万元起 高管亲自辟谣：发布前不会有价格</p>
     */
    @NameInMap("title")
    public String title;

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

    public ScorePageItem setDisplayLink(String displayLink) {
        this.displayLink = displayLink;
        return this;
    }
    public String getDisplayLink() {
        return this.displayLink;
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

    public ScorePageItem setScore(Double score) {
        this.score = score;
        return this;
    }
    public Double getScore() {
        return this.score;
    }

    public ScorePageItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
