// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class GetInstanceConsoleOutputResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("ConsoleOutput")
    @Validation(required = true)
    public String consoleOutput;

    @NameInMap("LastUpdateTime")
    @Validation(required = true)
    public String lastUpdateTime;

    public static GetInstanceConsoleOutputResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceConsoleOutputResponse self = new GetInstanceConsoleOutputResponse();
        return TeaModel.build(map, self);
    }

}
