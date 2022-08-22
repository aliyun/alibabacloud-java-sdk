// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class QueryHotelProductShrinkRequest extends TeaModel {
    @NameInMap("UserInfo")
    public String userInfoShrink;

    public static QueryHotelProductShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHotelProductShrinkRequest self = new QueryHotelProductShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryHotelProductShrinkRequest setUserInfoShrink(String userInfoShrink) {
        this.userInfoShrink = userInfoShrink;
        return this;
    }
    public String getUserInfoShrink() {
        return this.userInfoShrink;
    }

}
