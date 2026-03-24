// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class IncidentResourceDetail extends TeaModel {
    /**
     * <p>额外的资源标识符</p>
     * 
     * <strong>example:</strong>
     * <p>app-prod-web-01</p>
     */
    @NameInMap("extraId")
    public String extraId;

    /**
     * <p>资源 ID 对象。</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;type&quot;: &quot;ecs&quot;, &quot;id&quot;: &quot;i-bp1234567890abcdef&quot; }</p>
     */
    @NameInMap("resourceId")
    public java.util.Map<String, ?> resourceId;

    /**
     * <p>资源类型，表示该资源属于哪种云产品。</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("type")
    public String type;

    public static IncidentResourceDetail build(java.util.Map<String, ?> map) throws Exception {
        IncidentResourceDetail self = new IncidentResourceDetail();
        return TeaModel.build(map, self);
    }

    public IncidentResourceDetail setExtraId(String extraId) {
        this.extraId = extraId;
        return this;
    }
    public String getExtraId() {
        return this.extraId;
    }

    public IncidentResourceDetail setResourceId(java.util.Map<String, ?> resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public java.util.Map<String, ?> getResourceId() {
        return this.resourceId;
    }

    public IncidentResourceDetail setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
