// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateHttpTriggerConfigResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DefaultEndpoint")
    public String defaultEndpoint;

    @NameInMap("EnableService")
    public Boolean enableService;

    public static UpdateHttpTriggerConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHttpTriggerConfigResponseBody self = new UpdateHttpTriggerConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHttpTriggerConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHttpTriggerConfigResponseBody setDefaultEndpoint(String defaultEndpoint) {
        this.defaultEndpoint = defaultEndpoint;
        return this;
    }
    public String getDefaultEndpoint() {
        return this.defaultEndpoint;
    }

    public UpdateHttpTriggerConfigResponseBody setEnableService(Boolean enableService) {
        this.enableService = enableService;
        return this;
    }
    public Boolean getEnableService() {
        return this.enableService;
    }

}
