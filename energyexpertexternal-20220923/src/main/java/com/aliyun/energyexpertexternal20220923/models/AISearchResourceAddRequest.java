// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceAddRequest extends TeaModel {
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
    @NameInMap("data")
    public Object data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>miniapp</p>
     */
    @NameInMap("type")
    public String type;

    public static AISearchResourceAddRequest build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceAddRequest self = new AISearchResourceAddRequest();
        return TeaModel.build(map, self);
    }

    public AISearchResourceAddRequest setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public AISearchResourceAddRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
