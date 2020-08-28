// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class UninstallMonitoringAgentRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    public static UninstallMonitoringAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        UninstallMonitoringAgentRequest self = new UninstallMonitoringAgentRequest();
        return TeaModel.build(map, self);
    }

}
