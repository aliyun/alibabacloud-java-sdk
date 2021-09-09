// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListShardRecoveriesRequest extends TeaModel {
    @NameInMap("activeOnly")
    public Boolean activeOnly;

    public static ListShardRecoveriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListShardRecoveriesRequest self = new ListShardRecoveriesRequest();
        return TeaModel.build(map, self);
    }

    public ListShardRecoveriesRequest setActiveOnly(Boolean activeOnly) {
        this.activeOnly = activeOnly;
        return this;
    }
    public Boolean getActiveOnly() {
        return this.activeOnly;
    }

}
