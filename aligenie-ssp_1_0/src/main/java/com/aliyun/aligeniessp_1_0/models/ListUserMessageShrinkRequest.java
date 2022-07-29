// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListUserMessageShrinkRequest extends TeaModel {
    @NameInMap("BeforeTime")
    public String beforeTime;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    @NameInMap("limit")
    public Integer limit;

    public static ListUserMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserMessageShrinkRequest self = new ListUserMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListUserMessageShrinkRequest setBeforeTime(String beforeTime) {
        this.beforeTime = beforeTime;
        return this;
    }
    public String getBeforeTime() {
        return this.beforeTime;
    }

    public ListUserMessageShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

    public ListUserMessageShrinkRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

}
