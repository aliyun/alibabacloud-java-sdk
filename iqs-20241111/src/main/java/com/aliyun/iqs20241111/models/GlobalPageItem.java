// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalPageItem extends TeaModel {
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
     * <p>The truncated description of the search result in text format.</p>
     * 
     * <strong>example:</strong>
     * <p>In terms of 100 km/h to 0 braking performance, the distance is only 33.3 m. Objectively speaking, the Xiaomi SU7 performs really well in this regard. As for range, it features a 101 kWh battery capacity, achieving a CLTC range of 800 km, and an 800 V high-voltage platform that supports 220 km of range in 5 minutes and 510 km in 15 minutes. And in..</p>
     */
    @NameInMap("snippet")
    public String snippet;

    /**
     * <p>The title of the search result in plain text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Xiaomi SU7 priced from 229,900 CNY, executive personally dispels rumors: no price will be announced before launch</p>
     */
    @NameInMap("title")
    public String title;

    public static GlobalPageItem build(java.util.Map<String, ?> map) throws Exception {
        GlobalPageItem self = new GlobalPageItem();
        return TeaModel.build(map, self);
    }

    public GlobalPageItem setLink(String link) {
        this.link = link;
        return this;
    }
    public String getLink() {
        return this.link;
    }

    public GlobalPageItem setSnippet(String snippet) {
        this.snippet = snippet;
        return this;
    }
    public String getSnippet() {
        return this.snippet;
    }

    public GlobalPageItem setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
