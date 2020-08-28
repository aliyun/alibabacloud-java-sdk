// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class UninstallMonitoringAgentResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    public static UninstallMonitoringAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallMonitoringAgentResponse self = new UninstallMonitoringAgentResponse();
        return TeaModel.build(map, self);
    }

}
