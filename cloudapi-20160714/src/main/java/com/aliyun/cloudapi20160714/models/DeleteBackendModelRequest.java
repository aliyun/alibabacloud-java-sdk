// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteBackendModelRequest extends TeaModel {
    /**
     * <p>The ID of the backend service.</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    /**
     * <p>The ID of the backend model.</p>
     */
    @NameInMap("BackendModelId")
    public String backendModelId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **PRE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static DeleteBackendModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBackendModelRequest self = new DeleteBackendModelRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBackendModelRequest setBackendId(String backendId) {
        this.backendId = backendId;
        return this;
    }
    public String getBackendId() {
        return this.backendId;
    }

    public DeleteBackendModelRequest setBackendModelId(String backendModelId) {
        this.backendModelId = backendModelId;
        return this;
    }
    public String getBackendModelId() {
        return this.backendModelId;
    }

    public DeleteBackendModelRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DeleteBackendModelRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
