// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableOperationEventRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1980869072412614657</p>
     */
    @NameInMap("id")
    public String id;

    public static DisableOperationEventRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableOperationEventRequest self = new DisableOperationEventRequest();
        return TeaModel.build(map, self);
    }

    public DisableOperationEventRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
