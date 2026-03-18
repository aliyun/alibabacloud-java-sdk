// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterChatCompletionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *     &quot;stream&quot;: true,
     *     &quot;messages&quot;: [
     *       {
     *         &quot;role&quot;: &quot;user&quot;,
     *         &quot;content&quot;: &quot;1+1&quot;
     *       }
     *     ],
     *     &quot;model_id&quot;: 15,
     *     &quot;stream_options&quot;: {
     *       &quot;include_usage&quot;: true
     *     }
     *   }</p>
     */
    @NameInMap("body")
    public Object body;

    public static ModelRouterChatCompletionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterChatCompletionsRequest self = new ModelRouterChatCompletionsRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterChatCompletionsRequest setBody(Object body) {
        this.body = body;
        return this;
    }
    public Object getBody() {
        return this.body;
    }

}
