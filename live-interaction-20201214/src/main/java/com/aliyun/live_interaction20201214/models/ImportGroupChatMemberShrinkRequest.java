// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ImportGroupChatMemberShrinkRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static ImportGroupChatMemberShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportGroupChatMemberShrinkRequest self = new ImportGroupChatMemberShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ImportGroupChatMemberShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ImportGroupChatMemberShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
