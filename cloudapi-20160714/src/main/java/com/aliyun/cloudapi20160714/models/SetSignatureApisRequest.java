// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetSignatureApisRequest extends TeaModel {
    /**
     * <p>The API ID for the specified operation. Separate multiple API IDs with commas (,). A maximum of 100 API IDs can be entered.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The ID of the API group to which the API that you want to manage belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the signature key.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **PRE**</p>
     * <p>*   **TEST**</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static SetSignatureApisRequest build(java.util.Map<String, ?> map) throws Exception {
        SetSignatureApisRequest self = new SetSignatureApisRequest();
        return TeaModel.build(map, self);
    }

    public SetSignatureApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public SetSignatureApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public SetSignatureApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public SetSignatureApisRequest setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public SetSignatureApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
