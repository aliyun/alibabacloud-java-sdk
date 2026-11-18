// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iqs20241111.models;

import com.aliyun.tea.*;

public class SceneItem extends TeaModel {
    /**
     * <p>The result details for vertical scenarios. Different scenarios return different JSON string structures.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;title&quot;:&quot;London time&quot;,&quot;targetTimeZone&quot;:&quot;Europe/London&quot;}</p>
     */
    @NameInMap("detail")
    public String detail;

    /**
     * <p>The result type for vertical scenarios, such as weather or time.</p>
     * 
     * <strong>example:</strong>
     * <p>time</p>
     */
    @NameInMap("type")
    public String type;

    public static SceneItem build(java.util.Map<String, ?> map) throws Exception {
        SceneItem self = new SceneItem();
        return TeaModel.build(map, self);
    }

    public SceneItem setDetail(String detail) {
        this.detail = detail;
        return this;
    }
    public String getDetail() {
        return this.detail;
    }

    public SceneItem setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
