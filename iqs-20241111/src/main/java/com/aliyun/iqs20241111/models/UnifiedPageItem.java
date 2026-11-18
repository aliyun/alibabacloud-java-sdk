// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedPageItem extends TeaModel {
    /**
     * <p>The relevance tag. A value of 0 indicates low relevance, and 1 indicates non-low relevance.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("correlationTag")
    public Integer correlationTag;

    /**
     * <p>The dynamic authority score, which ranges from 0 to 2 and is calculated based on the relevance to the query content.</p>
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
     * <p><a href="https://www.china.com/zh_cn/img1905/2023/logo.png">https://www.china.com/zh_cn/img1905/2023/logo.png</a></p>
     */
    @NameInMap("hostLogo")
    public String hostLogo;

    /**
     * <p>The site name.</p>
     * 
     * <strong>example:</strong>
     * <p>China.com</p>
     */
    @NameInMap("hostname")
    public String hostname;

    /**
     * <p>The images from the search result web page, up to three.</p>
     */
    @NameInMap("images")
    public java.util.List<String> images;

    /**
     * <p>The full URL pointed to by the search result.</p>
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
     * <p>During the 2025 Shanghai Auto Show, the AITO brand was undoubtedly the most popular, becoming the center of attention for many industry leaders. Zhang Xinghai, Chairman and Founder of SERES Group, Yu Chengdong, Managing Director of Huawei and Chairman of Terminal BG, Chen Daoming, a famous actor, and Zeng Yuqun, Chairman of CATL, all shared their experiences using AITO.\n&quot;AITO M9 and M8 are reshaping the landscape of China\&quot;s luxury car market,&quot; Zhang Xinghai said, (omitted here....).\nEditor: kj005\n Article complaint hotline: 157 3889 8464 Complaint email: 7983347 <a href="mailto:16@qq.com">16@qq.com</a>\nKeywords:</p>
     */
    @NameInMap("mainText")
    public String mainText;

    /**
     * <p>The Markdown content.</p>
     * 
     * <strong>example:</strong>
     * <h1>Industry leaders gather at the Shanghai Auto Show as AITO becomes the center of attention<strong>Source</strong>: Caixun.com</h1>
     * <p><strong>Time</strong>: 2025-04-27 20:36:04<br>During the 2025 Shanghai Auto Show, the AITO brand was undoubtedly the most popular, becoming the center of attention for many industry leaders. Zhang Xinghai, Chairman and Founder of SERES Group, Yu Chengdong, Managing Director of Huawei and Chairman of Terminal BG, Chen Daoming, a famous actor, and Zeng Yuqun, Chairman of CATL, all shared their experiences using AITO.
     * <img src="http://objectnsg.oss-cn-beijing.aliyuncs.com/yhdoc/202504/27/202504272025531927023138.png" alt="Image">Yu Chengdong stated that AITO M9, M8, M7, and M5 are all deeply loved by consumers! AITO M9 has ranked first in the residual value rate of pure electric models in China for three consecutive months! Pure electric and extended-range models took the top two spots in the residual value rate of new energy large SUVs!
     * <img src="http://objectnsg.oss-cn-beijing.aliyuncs.com/yhdoc/202504/27/202504272025531312025791.jpeg" alt="Image">&quot;I am an AITO M9 user
     * <em>Editor: kj005</em>Article complaint hotline: 157 3889 8464<br>Complaint email: <a href="mailto:798334716@qq.com">798334716@qq.com</a></p>
     */
    @NameInMap("markdownText")
    public String markdownText;

    /**
     * <p>The publish time of the web page in ISO format.</p>
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

    /**
     * <p>The full rich text body, which preserves the order of text, images, audio, video, tables, and code on the web page.</p>
     * 
     * <strong>example:</strong>
     * <p>Salute	to	the	workers	!	\n	[	Building	dreams	for	modernization	 	and	drawing	a	new	picture	together	·	Song	of	the	workers	]	Make	new	contributions	to	promoting	Chinese	modernization	\n	<quark-image available_status="3" caption="CCTV news studio" fetch_status="0" is_broken="0" is_high_quality_chart="0" is_high_quality_text="0" is_watermark="0" ori_height="1080" ori_width="1920" phash="13061254655082448525" relevant_score="0.5" render_height="137.046875" render_width="243.65625" tag="CCTV logo, studio, architecture, scenery" url="http://s2.zimgs.cn/ims?kt=url&amp;key=aHR0cHM6Ly92Mi5jcmkuY24vTTAwLzg2LzAyL3JCQUJDbVkzRzhDQVhFR0pBQUFBQUFBQUFBQTQ0LjE5MjB4MTA4MC5qcGVn&amp;sign=yx:G3TGlZZMQhnxU2bJSDcb_g8xPQ0=&amp;tv=0_0&amp;p=" value_score="0.5"><quark-ocr>	CCTV	 	13	 	News	 	CTVR	 	Morning	World	</quark-ocr></quark-image>	\n	More	&gt;	&gt;	&gt;	 	Most	beautiful	workers	\n</p>
     */
    @NameInMap("richMainBody")
    public String richMainBody;

    /**
     * <p>The summary.</p>
     * 
     * <strong>example:</strong>
     * <p>During the 2025 Shanghai Auto Show, the AITO brand was undoubtedly the most popular, becoming the center of attention for many industry leaders. Zhang Xinghai, Chairman and Founder of SERES Group, Yu Chengdong, Managing Director of Huawei and Chairman of Terminal BG, Chen Daoming, a famous actor, and Zeng Yuqun, Chairman of CATL, all shared their experiences using AITO. ..</p>
     */
    @NameInMap("snippet")
    public String snippet;

    /**
     * <p>The enhanced summary, 400 words or more.</p>
     * 
     * <strong>example:</strong>
     * <p>During the 2025 Shanghai Auto Show, the AITO brand was undoubtedly the most popular, becoming the center of attention for many industry leaders. Zhang Xinghai, Chairman and Founder of SERES Group, Yu Chengdong, Managing Director of Huawei and Chairman of Terminal BG, Chen Daoming, a famous actor, and Zeng Yuqun, Chairman of CATL, all shared their experiences using AITO. &quot;I am an AITO M9 user, and the driving experience is excellent,&quot; Chen Daoming said, adding that he only dared to recommend it on the spot after experiencing it himself. In the future, he hopes to achieve special customization of the AITO M9, making the exterior, interior, and seat layout more in line with his own needs. It is reported that the 2025 AITO M9 delivered over 10,000 units within 25 days of its launch, and has been the sales champion of 500,000 RMB luxury cars for 11 consecutive months; the AITO M8 received over 50,000 firm orders within 4 days of its launch, and is deeply loved by the market and users... &quot;AITO M9 and M8 are reshaping the landscape of China\&quot;s luxury car market,&quot; Zhang Xinghai said. He recently test-drove the AITO M8 to the limit, departing from Chongqing and arriving at Mount Kailash after 55 hours and over 3,500 kilometers. Throughout the journey, the safety and experience of the vehicle performed excellently</p>
     */
    @NameInMap("summary")
    public String summary;

    /**
     * <p>The web page tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;genre&quot;:&quot;NewsPortal&quot;}</p>
     */
    @NameInMap("tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The full URL pointed to by the search result.</p>
     * 
     * <strong>example:</strong>
     * <p>Industry leaders gather at the Shanghai Auto Show as AITO becomes the center of attention</p>
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
