// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageQueueModerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>{
     *         &quot;imageUrl&quot;: &quot;<a href="https://img.alicdn.com/xxx.jpg">https://img.alicdn.com/xxx.jpg</a>&quot;,
     *         &quot;dataId&quot;: &quot;img123****&quot;
     *     }</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    public static ImageQueueModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageQueueModerationRequest self = new ImageQueueModerationRequest();
        return TeaModel.build(map, self);
    }

    public ImageQueueModerationRequest setService(String service) {
        this.service = service;
        return this;
    }
    public String getService() {
        return this.service;
    }

    public ImageQueueModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

}
