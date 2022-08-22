// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryDeviceStatusShrinkRequest extends TeaModel {
    @NameInMap("Payload")
    public String payloadShrink;

    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static QueryDeviceStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDeviceStatusShrinkRequest self = new QueryDeviceStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryDeviceStatusShrinkRequest setPayloadShrink(String payloadShrink) {
        this.payloadShrink = payloadShrink;
        return this;
    }
    public String getPayloadShrink() {
        return this.payloadShrink;
    }

    public QueryDeviceStatusShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
