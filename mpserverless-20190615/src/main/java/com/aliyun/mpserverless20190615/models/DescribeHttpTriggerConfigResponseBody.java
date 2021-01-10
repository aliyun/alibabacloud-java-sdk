// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class DescribeHttpTriggerConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DefaultEndpoint")
    public String defaultEndpoint;

    @NameInMap("EnableService")
    public Boolean enableService;

    public static DescribeHttpTriggerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHttpTriggerConfigResponseBody self = new DescribeHttpTriggerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHttpTriggerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHttpTriggerConfigResponseBody setDefaultEndpoint(String defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
        return this;
    }
    public String getDefaultEndpoint() {
        return this.defaultEndpoint;
    }

    public DescribeHttpTriggerConfigResponseBody setEnableService(Boolean enableService) {
        this.enableService = enableService;
        return this;
    }
    public Boolean getEnableService() {
        return this.enableService;
    }

}
