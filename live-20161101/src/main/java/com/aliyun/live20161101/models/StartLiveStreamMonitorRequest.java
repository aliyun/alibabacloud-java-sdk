// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartLiveStreamMonitorRequest extends TeaModel {
    @NameInMap("MonitorId")
    public String monitorId;

    @NameInMap("OwnerId")
    public Long ownerId;

    public static StartLiveStreamMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        StartLiveStreamMonitorRequest self = new StartLiveStreamMonitorRequest();
        return TeaModel.build(map, self);
    }

    public StartLiveStreamMonitorRequest setMonitorId(String monitorId) {
        this.monitorId = monitorId;
        return this;
    }
    public String getMonitorId() {
        return this.monitorId;
    }

    public StartLiveStreamMonitorRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

}
