// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class WeiboItem extends TeaModel {
    /**
     * <p>The search result template. Fixed as weibo_strong for Weibo scenarios.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>weibo_strong</p>
     */
    @NameInMap("cardType")
    public String cardType;

    /**
     * <p>The Weibo homepage of the user.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://m.weibo.cn/u/7761793874?luicode=20000061&lfid=5024099350350075">https://m.weibo.cn/u/7761793874?luicode=20000061&amp;lfid=5024099350350075</a></p>
     */
    @NameInMap("homepageLink")
    public String homepageLink;

    /**
     * <p>The content of the Weibo post.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[Quick poll: Would you buy the Xiaomi SU7?]
     * #Xiaomi SU7 road tests now cover more than 300 cities#
     * On April 17, @Xiaomi Auto posted that SU7 road testing now covers over 300 cities nationwide, including tests in extremely cold and extremely hot weather. The total test mileage has reached 5.4 million kilometers and is still ongoing. Web link</p>
     */
    @NameInMap("htmlSnippet")
    public String htmlSnippet;

    /**
     * <p>The image information.</p>
     */
    @NameInMap("images")
    public java.util.List<String> images;

    /**
     * <p>The Weibo URL of the search result.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://m.weibo.cn/detail/5024099350350075?wm=90194_90009">https://m.weibo.cn/detail/5024099350350075?wm=90194_90009</a></p>
     */
    @NameInMap("link")
    public String link;

    /**
     * <p>The publish time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>An hour ago</p>
     */
    @NameInMap("publishDisplayTime")
    public String publishDisplayTime;

    /**
     * <p>The Weibo username.</p>
     * 
     * <strong>example:</strong>
     * <p>Bailu Tech</p>
     */
    @NameInMap("username")
    public String username;

    public static WeiboItem build(java.util.Map<String, ?> map) throws Exception {
        WeiboItem self = new WeiboItem();
        return TeaModel.build(map, self);
    }

    public WeiboItem setCardType(String cardType) {
        this.cardType = cardType;
        return this;
    }
    public String getCardType() {
        return this.cardType;
    }

    public WeiboItem setHomepageLink(String homepageLink) {
        this.homepageLink = homepageLink;
        return this;
    }
    public String getHomepageLink() {
        return this.homepageLink;
    }

    public WeiboItem setHtmlSnippet(String htmlSnippet) {
        this.htmlSnippet = htmlSnippet;
        return this;
    }
    public String getHtmlSnippet() {
        return this.htmlSnippet;
    }

    public WeiboItem setImages(java.util.List<String> images) {
        this.images = images;
        return this;
    }
    public java.util.List<String> getImages() {
        return this.images;
    }

    public WeiboItem setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public WeiboItem setPublishDisplayTime(String publishDisplayTime) {
        this.publishDisplayTime = publishDisplayTime;
        return this;
    }
    public String getPublishDisplayTime() {
        return this.publishDisplayTime;
    }

    public WeiboItem setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
