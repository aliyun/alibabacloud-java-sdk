// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultimodalAsyncModerationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>post_text_image_detection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <strong>example:</strong>
     * <p>{&quot;mainData&quot;:{&quot;mainContent&quot;:&quot;testMainContent&quot;,&quot;mainTitle&quot;:&quot;testMainTitle&quot;,&quot;mainImages&quot;:[{&quot;imageUrl&quot;:&quot;<a href="https://xxxx.com/001.jpg%22%7D%5D%7D%7D">https://xxxx.com/001.jpg&quot;}]}}</a></p>
     */
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
