// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetIdpConfigRequest extends TeaModel {
    /**
     * <p>ID of the identity provider configuration.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>idp-cfg68956d86e********</p>
     */
    @NameInMap("Id")
    public String id;

    public static GetIdpConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIdpConfigRequest self = new GetIdpConfigRequest();
        return TeaModel.build(map, self);
    }

    public GetIdpConfigRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
