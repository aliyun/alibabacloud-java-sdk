// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ascp_sndop_compute_callback_service2021618.models;

import com.aliyun.tea.*;

public class RemoteWneSceenCutServiceSendScreenCutToGroupRequest extends TeaModel {
    // param0
    @NameInMap("GroupUrls")
    public String groupUrls;

    // param1
    @NameInMap("PicUrl")
    public java.util.List<String> picUrl;

    // param2
    @NameInMap("Keyword")
    public String keyword;

    public static RemoteWneSceenCutServiceSendScreenCutToGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoteWneSceenCutServiceSendScreenCutToGroupRequest self = new RemoteWneSceenCutServiceSendScreenCutToGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupRequest setGroupUrls(String groupUrls) {
        this.groupUrls = groupUrls;
        return this;
    }
    public String getGroupUrls() {
        return this.groupUrls;
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupRequest setPicUrl(java.util.List<String> picUrl) {
        this.picUrl = picUrl;
        return this;
    }
    public java.util.List<String> getPicUrl() {
        return this.picUrl;
    }

    public RemoteWneSceenCutServiceSendScreenCutToGroupRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

}
