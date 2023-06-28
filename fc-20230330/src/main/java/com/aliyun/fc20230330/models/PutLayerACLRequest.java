// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutLayerACLRequest extends TeaModel {
    @NameInMap("public")
    public String _public;

    public static PutLayerACLRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLayerACLRequest self = new PutLayerACLRequest();
        return TeaModel.build(map, self);
    }

    public PutLayerACLRequest set_public(String _public) {
        this._public = _public;
        return this;
    }
    public String get_public() {
        return this._public;
    }

}
