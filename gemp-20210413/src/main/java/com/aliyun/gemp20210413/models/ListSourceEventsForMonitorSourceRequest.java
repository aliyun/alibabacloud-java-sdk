// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListSourceEventsForMonitorSourceRequest extends TeaModel {
    // 监控源ID
    @NameInMap("monitorSourceId")
    public Long monitorSourceId;

    public static ListSourceEventsForMonitorSourceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSourceEventsForMonitorSourceRequest self = new ListSourceEventsForMonitorSourceRequest();
        return TeaModel.build(map, self);
    }

    public ListSourceEventsForMonitorSourceRequest setMonitorSourceId(Long monitorSourceId) {
        this.monitorSourceId = monitorSourceId;
        return this;
    }
    public Long getMonitorSourceId() {
        return this.monitorSourceId;
    }

}
