// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutLayerACLRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("acl")
    public String acl;

    /**
     * <p>Specifies whether the layer is a public layer. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("public")
    @Deprecated
    public String _public;

    public static PutLayerACLRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLayerACLRequest self = new PutLayerACLRequest();
        return TeaModel.build(map, self);
    }

    public PutLayerACLRequest setAcl(String acl) {
        this.acl = acl;
        return this;
    }
    public String getAcl() {
        return this.acl;
    }

    public PutLayerACLRequest set_public(String _public) {
        this._public = _public;
        return this;
    }
    public String get_public() {
        return this._public;
    }

}
