// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteBackendModelRequest extends TeaModel {
    /**
     * <p>The ID of the backend service.</p>
     * 
     * <strong>example:</strong>
     * <p>20bcdc9453524b78a8beb1f6de21edb7</p>
     */
    @NameInMap("BackendId")
    public String backendId;

    /**
     * <p>The ID of the backend model.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4be6b110b7aa40b0bf0c83cc00b3bd86</p>
     */
    @NameInMap("BackendModelId")
    public String backendModelId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The environment to which the API is published. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong></li>
     * <li><strong>PRE</strong></li>
     * <li><strong>TEST</strong></li>
     * </ul>
     * <p>If you do not specify this parameter, APIs in the draft state are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
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
