// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetGtmMonitorStatusRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    public static SetGtmMonitorStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        SetGtmMonitorStatusRequest self = new SetGtmMonitorStatusRequest();
        return TeaModel.build(map, self);
    }

}
