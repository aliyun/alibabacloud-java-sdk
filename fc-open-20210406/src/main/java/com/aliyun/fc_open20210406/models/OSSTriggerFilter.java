// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class OSSTriggerFilter extends TeaModel {
    @NameInMap("key")
    public OSSTriggerKey key;

    public static OSSTriggerFilter build(java.util.Map<String, ?> map) throws Exception {
        OSSTriggerFilter self = new OSSTriggerFilter();
        return TeaModel.build(map, self);
    }

    public OSSTriggerFilter setKey(OSSTriggerKey key) {
        this.key = key;
        return this;
    }
    public OSSTriggerKey getKey() {
        return this.key;
    }

}
