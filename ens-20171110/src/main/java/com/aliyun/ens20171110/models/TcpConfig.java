// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class TcpConfig extends TeaModel {
    // 连接超时时间。取值：10~900（秒）。
    @NameInMap("EstablishedTimeout")
    public Integer establishedTimeout;

    // 会话保持的超时时间。取值：0~3600（秒）。默认值：0，表示关闭会话保持。
    @NameInMap("PersistenceTimeout")
    public Integer persistenceTimeout;

    // 调度算法。取值：wrr（默认值）：权重值越高的后端服务器，被轮询到的次数（概率）也越高。wlc：除了根据每台后端服务器设定的权重值来进行轮询，同时还考虑后端服务器的实际负载（即连接数）。当权重值相同时，当前连接数越小的后端服务器被轮询到的次数（概率）也越高。rr：按照访问顺序依次将外部请求依序分发到后端服务器。sch：基于源IP地址的一致性hash，相同的源地址会调度到相同的后端服务器。
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
