// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class TurnOnSecondSwitchRequest extends TeaModel {
    @NameInMap("Pid")
    public String pid;

    @NameInMap("ProxyUserId")
    public String proxyUserId;

    @NameInMap("ReleaseStartTime")
    public Long releaseStartTime;

    public static TurnOnSecondSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        TurnOnSecondSwitchRequest self = new TurnOnSecondSwitchRequest();
        return TeaModel.build(map, self);
    }

    public TurnOnSecondSwitchRequest setPid(String pid) {
        this.pid = pid;
        return this;
    }
    public String getPid() {
        return this.pid;
    }

    public TurnOnSecondSwitchRequest setProxyUserId(String proxyUserId) {
        this.proxyUserId = proxyUserId;
        return this;
    }
    public String getProxyUserId() {
        return this.proxyUserId;
    }

    public TurnOnSecondSwitchRequest setReleaseStartTime(Long releaseStartTime) {
        this.releaseStartTime = releaseStartTime;
        return this;
    }
    public Long getReleaseStartTime() {
        return this.releaseStartTime;
    }

}
