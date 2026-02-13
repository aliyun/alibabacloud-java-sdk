// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.energyexpertexternal20220923.models;

import com.aliyun.tea.*;

public class AISearchResourceUpdateRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{
     *       &quot;title&quot;: &quot;update title&quot;
     *     }</p>
     */
    @NameInMap("data")
    public Object data;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WzMGQZwB7nQEs3Qk3ajH</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>miniapp</p>
     */
    @NameInMap("type")
    public String type;

    public static AISearchResourceUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        AISearchResourceUpdateRequest self = new AISearchResourceUpdateRequest();
        return TeaModel.build(map, self);
    }

    public AISearchResourceUpdateRequest setData(Object data) {
        this.data = data;
        return this;
    }
    public Object getData() {
        return this.data;
    }

    public AISearchResourceUpdateRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AISearchResourceUpdateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
