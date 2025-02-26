// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class PutLayerACLRequest extends TeaModel {
    /**
     * <p>Specify the access permission of the layer. A value of 1 indicates public and a value of 0 indicates private. The default value is 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("acl")
    public String acl;

    /**
     * <p>Specify whether the layer is a public layer. Valid values: true and false.</p>
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

    @Deprecated
    public PutLayerACLRequest set_public(String _public) {
        this._public = _public;
        return this;
    }
    public String get_public() {
        return this._public;
    }

}
