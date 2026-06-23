// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class UnifiedSceneItem extends TeaModel {
    /**
     * <p>The result in JSON structure.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;title\&quot;: \&quot;伦敦时间\&quot;, \&quot;targetTimeZone\&quot;: \&quot;Europe/London\&quot;, \&quot;targetTimeMillisecond\&quot;: \&quot;1745820817178\&quot;, \&quot;targetTime\&quot;: \&quot;2025-04-28 14:13:37\&quot;, \&quot;beijingTimeZone\&quot;: \&quot;PRC\&quot;, \&quot;beijingTimeMillisecond\&quot;: \&quot;1745846017178\&quot;}</p>
     */
    @NameInMap("detail")
    public String detail;

    /**
     * <p>The type.</p>
     * 
     * <strong>example:</strong>
     * <p>time</p>
     */
    @NameInMap("type")
    public String type;

    public static UnifiedSceneItem build(java.util.Map<String, ?> map) throws Exception {
        UnifiedSceneItem self = new UnifiedSceneItem();
        return TeaModel.build(map, self);
    }

    public UnifiedSceneItem setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public UnifiedSceneItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
