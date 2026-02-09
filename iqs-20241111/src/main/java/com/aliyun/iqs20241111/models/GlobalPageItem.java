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

    @NameInMap("snippet")
    public String snippet;

    /**
     * <p>This parameter is required.</p>
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
