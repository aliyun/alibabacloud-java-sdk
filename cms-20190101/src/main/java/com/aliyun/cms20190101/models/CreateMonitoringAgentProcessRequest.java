// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ProcessUser")
    public String processUser;

    public static CreateMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitoringAgentProcessRequest self = new CreateMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

}
