// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DisableProcessDefinitionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>11792</p>
     */
    @NameInMap("Id")
    public String id;

    public static DisableProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableProcessDefinitionRequest self = new DisableProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public DisableProcessDefinitionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DisableProcessDefinitionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
