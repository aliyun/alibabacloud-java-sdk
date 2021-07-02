// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneSceenCutServiceSendScreenCutToGroupShrinkRequest extends TeaModel {
    // param0
    @NameInMap("GroupUrls")
    public String groupUrls;

    // param1
    @NameInMap("PicUrl")
    public String picUrlShrink;

    // param2
    @NameInMap("Keyword")
    public String keyword;

    public static RemoteWneSceenCutServiceSendScreenCutToGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneSceenCutServiceSendScreenCutToGroupShrinkRequest self = new RemoteWneSceenCutServiceSendScreenCutToGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupShrinkRequest setGroupUrls(String groupUrls) {
        this.groupUrls = groupUrls;
        return this;
    }
    public String getGroupUrls() {
        return this.groupUrls;
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupShrinkRequest setPicUrlShrink(String picUrlShrink) {
        this.picUrlShrink = picUrlShrink;
        return this;
    }
    public String getPicUrlShrink() {
        return this.picUrlShrink;
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupShrinkRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
