// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligeniessp_1_0.models;

import com.aliyun.tea.*;

public class ListUserMessageShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2022-07-27 14:06:55.984</p>
     */
    @NameInMap("BeforeTime")
    public String beforeTime;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserInfo")
    public String userInfoShrink;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
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
