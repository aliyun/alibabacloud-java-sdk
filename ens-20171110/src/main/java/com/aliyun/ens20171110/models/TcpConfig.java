// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class TcpConfig extends TeaModel {
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    @NameInMap("Scheduler")
    public String scheduler;

    public static TcpConfig build(java.util.Map<String, ?> map) throws Exception {
        TcpConfig self = new TcpConfig();
        return TeaModel.build(map, self);
    }

    public TcpConfig setEstablishedTimeout(Integer establishedTimeout) {
        this.establishedTimeout = establishedTimeout;
        return this;
    }
    public Integer getEstablishedTimeout() {
        return this.establishedTimeout;
    }

    public TcpConfig setPersistenceTimeout(Integer persistenceTimeout) {
        this.persistenceTimeout = persistenceTimeout;
        return this;
    }
    public Integer getPersistenceTimeout() {
        return this.persistenceTimeout;
    }

    public TcpConfig setScheduler(String scheduler) {
        this.scheduler = scheduler;
        return this;
    }
    public String getScheduler() {
        return this.scheduler;
    }

}
