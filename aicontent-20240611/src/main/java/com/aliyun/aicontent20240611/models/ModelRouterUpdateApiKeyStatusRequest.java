// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelRouterUpdateApiKeyStatusRequest extends TeaModel {
    /**
     * <p>The status of the API key. Valid values:</p>
     * <ul>
     * <li>active: The API key is valid.</li>
     * <li>disabled: The API key is invalid.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>active</p>
     */
    @NameInMap("status")
    public String status;

    public static ModelRouterUpdateApiKeyStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ModelRouterUpdateApiKeyStatusRequest self = new ModelRouterUpdateApiKeyStatusRequest();
        return TeaModel.build(map, self);
    }

    public ModelRouterUpdateApiKeyStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
