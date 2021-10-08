// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class ListAuthRequest extends TeaModel {
    @NameInMap("UserId")
    public String userId;

    public static ListAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAuthRequest self = new ListAuthRequest();
        return TeaModel.build(map, self);
    }

    public ListAuthRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
