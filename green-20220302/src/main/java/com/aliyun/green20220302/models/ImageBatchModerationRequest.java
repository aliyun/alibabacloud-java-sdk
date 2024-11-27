// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageBatchModerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *         &quot;imageUrl&quot;: &quot;<a href="https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png">https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png</a>&quot;,
     *         &quot;dataId&quot;: &quot;img123****&quot;
     *     }</p>
     */
    @NameInMap("ServiceParameters")
    public String serviceParameters;

    /**
     * <strong>example:</strong>
     * <p>baselineCheck,tonalityImprove</p>
     */
    @NameInMap("Services")
    public String services;

    public static ImageBatchModerationRequest build(java.util.Map<String, ?> map) throws Exception {
        ImageBatchModerationRequest self = new ImageBatchModerationRequest();
        return TeaModel.build(map, self);
    }

    public ImageBatchModerationRequest setServiceParameters(String serviceParameters) {
        this.serviceParameters = serviceParameters;
        return this;
    }
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public ImageBatchModerationRequest setServices(String services) {
        this.services = services;
        return this;
    }
    public String getServices() {
        return this.services;
    }

}
