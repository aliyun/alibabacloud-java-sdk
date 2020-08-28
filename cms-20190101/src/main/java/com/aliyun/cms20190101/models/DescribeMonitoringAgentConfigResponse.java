// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentConfigResponse extends TeaModel {
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

    @NameInMap("AutoInstall")
    @Validation(required = true)
    public Boolean autoInstall;

    @NameInMap("EnableInstallAgentNewECS")
    @Validation(required = true)
    public Boolean enableInstallAgentNewECS;

    @NameInMap("EnableActiveAlert")
    @Validation(required = true)
    public String enableActiveAlert;

    public static DescribeMonitoringAgentConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentConfigResponse self = new DescribeMonitoringAgentConfigResponse();
        return TeaModel.build(map, self);
    }

}
