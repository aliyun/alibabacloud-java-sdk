// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class GlobalPageItem extends TeaModel {
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
     * <p>100km/h-0制动能力上，仅有33.3m，不黑不吹，单看这个，小米SU7确实表现不错。而续航方面，101kWh电池容量，实现CLTC续航800km，还有现5分钟补能220km，15分钟补能510km的800V高压平台。而在...</p>
     */
    @NameInMap("snippet")
    public String snippet;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>小米SU7售价22.99万元起 高管亲自辟谣：发布前不会有价格</p>
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
