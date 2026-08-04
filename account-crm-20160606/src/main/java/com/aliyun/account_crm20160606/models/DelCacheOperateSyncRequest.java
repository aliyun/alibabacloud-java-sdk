// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class DelCacheOperateSyncRequest extends TeaModel {
    @NameInMap("Key")
    public String key;

    public static DelCacheOperateSyncRequest build(java.util.Map<String, ?> map) throws Exception {
        DelCacheOperateSyncRequest self = new DelCacheOperateSyncRequest();
        return TeaModel.build(map, self);
    }

    public DelCacheOperateSyncRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

}
