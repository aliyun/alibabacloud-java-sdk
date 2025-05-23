// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class PutLayerACLRequest extends TeaModel {
    /**
     * <p>Specifies whether the layer is public.</p>
     * <ul>
     * <li><strong>true</strong>: Public.</li>
     * <li><strong>false</strong>: Not public.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("public")
    public Boolean _public;

    public static PutLayerACLRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLayerACLRequest self = new PutLayerACLRequest();
        return TeaModel.build(map, self);
    }

    public PutLayerACLRequest set_public(Boolean _public) {
        this._public = _public;
        return this;
    }
    public Boolean get_public() {
        return this._public;
    }

}
