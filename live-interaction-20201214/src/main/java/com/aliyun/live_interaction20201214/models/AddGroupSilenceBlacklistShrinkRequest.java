// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class AddGroupSilenceBlacklistShrinkRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static AddGroupSilenceBlacklistShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        AddGroupSilenceBlacklistShrinkRequest self = new AddGroupSilenceBlacklistShrinkRequest();
        return TeaModel.build(map, self);
    }

    public AddGroupSilenceBlacklistShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddGroupSilenceBlacklistShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
