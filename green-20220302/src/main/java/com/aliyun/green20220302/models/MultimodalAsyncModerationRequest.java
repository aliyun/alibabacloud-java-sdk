// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220302.models;

import com.aliyun.tea.*;

public class MultimodalAsyncModerationRequest extends TeaModel {
    /**
     * <p>The type of moderation service. Valid values:</p>
     * <ul>
     * <li><p>post_text_image_detection: multimodal moderation for post text and images</p>
     * </li>
     * <li><p>profile_text_image_detection: multimodal moderation for profile picture and nickname</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>post_text_image_detection</p>
     */
    @NameInMap("Service")
    public String service;

    /**
     * <p>The parameter set required by the moderation service. This value must be a JSON string.</p>
     * 
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
