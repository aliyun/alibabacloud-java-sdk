// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultimodalAsyncModerationRequest extends TeaModel {
    @NameInMap("Service")
    public String service;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static MultimodalAsyncModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        MultimodalAsyncModerationRequest self = new MultimodalAsyncModerationRequest();
        return TeaModel.build(map, self);
    }

    public MultimodalAsyncModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public MultimodalAsyncModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
