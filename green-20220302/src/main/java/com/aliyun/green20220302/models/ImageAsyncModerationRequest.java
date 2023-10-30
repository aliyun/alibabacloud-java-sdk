// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageAsyncModerationRequest extends TeaModel {
    @NameInMap("Service")
    public String service;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ImageAsyncModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageAsyncModerationRequest self = new ImageAsyncModerationRequest();
        return TeaModel.build(map, self);
    }

    public ImageAsyncModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ImageAsyncModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
