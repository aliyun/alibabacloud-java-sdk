// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ModelGroupUserDTO extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("apiKeys")
    public java.util.List<ModelGroupClientKeyItemDTO> apiKeys;

    /**
     * <strong>example:</strong>
     * <p>30001</p>
     */
    @NameInMap("userId")
    public Long userId;

    /**
     * <strong>example:</strong>
     * <p>Zhang San</p>
     */
    @NameInMap("userName")
    public String userName;

    public static ModelGroupUserDTO build(java.util.Map<String, ?> map) throws Exception {
        ModelGroupUserDTO self = new ModelGroupUserDTO();
        return TeaModel.build(map, self);
    }

    public ModelGroupUserDTO setApiKeys(java.util.List<ModelGroupClientKeyItemDTO> apiKeys) {
        this.apiKeys = apiKeys;
        return this;
    }
    public java.util.List<ModelGroupClientKeyItemDTO> getApiKeys() {
        return this.apiKeys;
    }

    public ModelGroupUserDTO setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public ModelGroupUserDTO setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
