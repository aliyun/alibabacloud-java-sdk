// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class GetEventRequest extends TeaModel {
    // 监控源ID不能为空
    @NameInMap("monitorSourceId")
    public Long monitorSourceId;

    public static GetEventRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventRequest self = new GetEventRequest();
        return TeaModel.build(map, self);
    }

    public GetEventRequest setMonitorSourceId(Long monitorSourceId) {
        this.monitorSourceId = monitorSourceId;
        return this;
    }
    public Long getMonitorSourceId() {
        return this.monitorSourceId;
    }

}
