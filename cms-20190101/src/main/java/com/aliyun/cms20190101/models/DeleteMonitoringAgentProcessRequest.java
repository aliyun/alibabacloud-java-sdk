// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DeleteMonitoringAgentProcessRequest extends TeaModel {
    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ProcessName")
    public String processName;

    @NameInMap("ProcessId")
    public String processId;

    public static DeleteMonitoringAgentProcessRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitoringAgentProcessRequest self = new DeleteMonitoringAgentProcessRequest();
        return TeaModel.build(map, self);
    }

}
