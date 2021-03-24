// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live_interaction20201214.models;

import com.aliyun.tea.*;

public class ListGroupSilenceMembersShrinkRequest extends TeaModel {
    // AppId
    @NameInMap("AppId")
    public String appId;

    // 群禁言添加白名单请求体
    @NameInMap("RequestParams")
    public String requestParamsShrink;

    public static ListGroupSilenceMembersShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListGroupSilenceMembersShrinkRequest self = new ListGroupSilenceMembersShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListGroupSilenceMembersShrinkRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ListGroupSilenceMembersShrinkRequest setRequestParamsShrink(String requestParamsShrink) {
        this.requestParamsShrink = requestParamsShrink;
        return this;
    }
    public String getRequestParamsShrink() {
        return this.requestParamsShrink;
    }

}
