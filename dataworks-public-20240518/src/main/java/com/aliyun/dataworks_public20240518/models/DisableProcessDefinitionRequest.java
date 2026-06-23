// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DisableProcessDefinitionRequest extends TeaModel {
    /**
     * <p>An idempotence token used to make the request idempotent. A universally unique identifier (UUID) is recommended.</p>
     * 
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9*****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The process definition ID.</p>
     * 
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
