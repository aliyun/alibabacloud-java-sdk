// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageModerationRequest extends TeaModel {
    @NameInMap("Service")
    public String service;

    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ImageModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageModerationRequest self = new ImageModerationRequest();
        return TeaModel.build(map, self);
    }

    public ImageModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ImageModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
