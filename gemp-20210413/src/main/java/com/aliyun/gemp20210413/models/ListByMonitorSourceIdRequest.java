// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class ListByMonitorSourceIdRequest extends TeaModel {
    @NameInMap("monitorSourceId")
    public String monitorSourceId;

    public static ListByMonitorSourceIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListByMonitorSourceIdRequest self = new ListByMonitorSourceIdRequest();
        return TeaModel.build(map, self);
    }

    public ListByMonitorSourceIdRequest setMonitorSourceId(String monitorSourceId) {
        this.monitorSourceId = monitorSourceId;
        return this;
    }
    public String getMonitorSourceId() {
        return this.monitorSourceId;
    }

}
