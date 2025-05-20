// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class ChatRefDocInfo extends TeaModel {
    @NameInMap("pageListInfo")
    public java.util.List<ChatRefDocPageInfo> pageListInfo;

    @NameInMap("pages")
    public Long pages;

    public static ChatRefDocInfo build(java.util.Map<String, ?> map) throws Exception {
        ChatRefDocInfo self = new ChatRefDocInfo();
        return TeaModel.build(map, self);
    }

    public ChatRefDocInfo setPageListInfo(java.util.List<ChatRefDocPageInfo> pageListInfo) {
        this.pageListInfo = pageListInfo;
        return this;
    }
    public java.util.List<ChatRefDocPageInfo> getPageListInfo() {
        return this.pageListInfo;
    }

    public ChatRefDocInfo setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

}
