// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class ImageAsyncModerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>baselineCheck</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>{&quot;imageUrl&quot;:&quot;<a href="https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png%22,%22dataId%22:%22img123****%22%7D">https://img.alicdn.com/tfs/TB1U4r9AeH2gK0jSZJnXXaT1FXa-2880-480.png&quot;,&quot;dataId&quot;:&quot;img123****&quot;}</a></p>
     */
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
