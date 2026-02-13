// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchMessageItem extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>&quot;user：How to test my network speed?\naisearch：To check your network speed, you can use...&quot;</p>
     */
    @NameInMap("content")
    public String content;

    /**
     * <strong>example:</strong>
     * <p>{
     *  &quot;miniapp_id&quot;: &quot;test_miniapp&quot;,
     *       &quot;title&quot;: &quot;testApp&quot;,
     *       &quot;version&quot;: &quot;1.0.5&quot;,
     *       &quot;description&quot;: &quot;description-mock&quot;,
     *       &quot;slogan&quot;: &quot;slogan-mock&quot;,
     *       &quot;icon&quot;: &quot;<a href="https://img.alicdn.com/test_icon.png">https://img.alicdn.com/test_icon.png</a>&quot;,
     *       &quot;detail_desc&quot;: &quot;detail-mock&quot;
     * }</p>
     */
    @NameInMap("params")
    public Object params;

    /**
     * <strong>example:</strong>
     * <p>miniapp</p>
     */
    @NameInMap("type")
    public String type;

    public static AISearchMessageItem build(java.util.Map<String, ?> map) throws Exception {
        AISearchMessageItem self = new AISearchMessageItem();
        return TeaModel.build(map, self);
    }

    public AISearchMessageItem setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public AISearchMessageItem setParams(Object params) {
        this.params = params;
        return this;
    }
    public Object getParams() {
        return this.params;
    }

    public AISearchMessageItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
