// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelGroupClientDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("apiKeys")
    public java.util.List<ModelGroupClientKeyItemDTO> apiKeys;

    /**
     * <strong>example:</strong>
     * <p>1001</p>
     */
    @NameInMap("clientId")
    public Long clientId;

    /**
     * <strong>example:</strong>
     * <p>UserA-Professional</p>
     */
    @NameInMap("clientName")
    public String clientName;

    public static ModelGroupClientDTO build(java.util.Map<String, ?> map) throws Exception {
        ModelGroupClientDTO self = new ModelGroupClientDTO();
        return TeaModel.build(map, self);
    }

    public ModelGroupClientDTO setApiKeys(java.util.List<ModelGroupClientKeyItemDTO> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<ModelGroupClientKeyItemDTO> getApiKeys() {
        return this.apiKeys;
    }

    public ModelGroupClientDTO setClientId(Long clientId) {
        this.clientId = clientId;
        return this;
    }
    public Long getClientId() {
        return this.clientId;
    }

    public ModelGroupClientDTO setClientName(String clientName) {
        this.clientName = clientName;
        return this;
    }
    public String getClientName() {
        return this.clientName;
    }

}
