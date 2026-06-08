// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class EnableProcessDefinitionRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1AFAE64E-D1BE-432B-A9****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <strong>example:</strong>
     * <p>f0d6d578-a305-40ac-ba1e-0a09f64cbc69</p>
     */
    @NameInMap("Id")
    public String id;

    public static EnableProcessDefinitionRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableProcessDefinitionRequest self = new EnableProcessDefinitionRequest();
        return TeaModel.build(map, self);
    }

    public EnableProcessDefinitionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableProcessDefinitionRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

}
