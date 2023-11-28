// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ListShardRecoveriesRequest extends TeaModel {
    /**
     * <p>Specifies whether to return information about data restoration of shards. Valid values:</p>
     * <br>
     * <p>*   true: returns information about data restoration of shards that are being restored.</p>
     * <p>*   false: returns information about data restoration of all shards.</p>
     */
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
