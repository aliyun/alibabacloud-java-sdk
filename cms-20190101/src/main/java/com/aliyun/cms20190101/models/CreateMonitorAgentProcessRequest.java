// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class CreateMonitorAgentProcessRequest extends TeaModel {
    @NameInMap("ProcessName")
    @Validation(required = true)
    public String processName;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ProcessUser")
    public String processUser;

    public static CreateMonitorAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMonitorAgentProcessRequest self = new CreateMonitorAgentProcessRequest();
        return TeaModel.build(map, self);
    }

}
