// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class UpdateMemoryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>365</p>
     */
    @NameInMap("longTtl")
    public Integer longTtl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("shortTtl")
    public Integer shortTtl;

    public static UpdateMemoryRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMemoryRequest self = new UpdateMemoryRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMemoryRequest setLongTtl(Integer longTtl) {
        this.longTtl = longTtl;
        return this;
    }
    public Integer getLongTtl() {
        return this.longTtl;
    }

    public UpdateMemoryRequest setShortTtl(Integer shortTtl) {
        this.shortTtl = shortTtl;
        return this;
    }
    public Integer getShortTtl() {
        return this.shortTtl;
    }

}
