// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageModerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>{&quot;imageUrl&quot;:&quot;<a href="https://www.aliyun.com/test.jpg%22,%22dataId%22:%22img1234567%22%7D">https://www.aliyun.com/test.jpg&quot;,&quot;dataId&quot;:&quot;img1234567&quot;}</a></p>
     */
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
