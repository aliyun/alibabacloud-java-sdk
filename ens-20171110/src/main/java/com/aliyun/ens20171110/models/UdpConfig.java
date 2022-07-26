// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class UdpConfig extends TeaModel {
    @NameInMap("HashKey")
    public String hashKey;

    @NameInMap("Scheduler")
    public String scheduler;

    public static UdpConfig build(java.util.Map<String, ?> map) throws Exception {
        UdpConfig self = new UdpConfig();
        return TeaModel.build(map, self);
    }

    public UdpConfig setHashKey(String hashKey) {
        this.hashKey = hashKey;
        return this;
    }
    public String getHashKey() {
        return this.hashKey;
    }

    public UdpConfig setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

}
