// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteBackendRequest extends TeaModel {
    /**
     * <p>The ID of the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>27be0dd9ebbc467b9e86c0d250d0b92e</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteBackendRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackendRequest self = new DeleteBackendRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackendRequest setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public DeleteBackendRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
