// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringConfigResponse extends TeaModel {
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

    public static DescribeMonitoringConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringConfigResponse self = new DescribeMonitoringConfigResponse();
        return TeaModel.build(map, self);
    }

}
