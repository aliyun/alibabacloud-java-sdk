// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alimt20190102.models;

import com.aliyun.tea.*;

public class ListMtConnectorRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    public static ListMtConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMtConnectorRequest self = new ListMtConnectorRequest();
        return TeaModel.build(map, self);
    }

    public ListMtConnectorRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

}
