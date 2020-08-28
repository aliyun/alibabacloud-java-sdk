// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitoringAgentAccessKeyResponse extends TeaModel {
    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AccessKey")
    @Validation(required = true)
    public String accessKey;

    @NameInMap("SecretKey")
    @Validation(required = true)
    public String secretKey;

    public static DescribeMonitoringAgentAccessKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitoringAgentAccessKeyResponse self = new DescribeMonitoringAgentAccessKeyResponse();
        return TeaModel.build(map, self);
    }

}
