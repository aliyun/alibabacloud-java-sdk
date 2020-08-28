// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class AddGtmMonitorResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    public String monitorConfigId;

    public static AddGtmMonitorResponse build(java.util.Map<String, ?> map) throws Exception {
        AddGtmMonitorResponse self = new AddGtmMonitorResponse();
        return TeaModel.build(map, self);
    }

}
