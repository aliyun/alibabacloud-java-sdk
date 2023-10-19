// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveSignatureApisRequest extends TeaModel {
    /**
     * <p>The IDs of the APIs from which you want to unbind the signature key.</p>
     * <br>
     * <p>*   If this parameter is not specified, the signature key is unbound from all the APIs in the specified environment of the API group.</p>
     * <p>*   The IDs of the APIs that you want to manage. Separate multiple API IDs with commas (,). A maximum of 100 API IDs can be entered.</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The ID of the API group to which the API that you want to manage belongs.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the signature key.</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>The name of the runtime environment. Valid values:</p>
     * <br>
     * <p>*   **RELEASE**</p>
     * <p>*   **TEST**</p>
     */
    @NameInMap("StageName")
    public String stageName;

    public static RemoveSignatureApisRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSignatureApisRequest self = new RemoveSignatureApisRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSignatureApisRequest setApiIds(String apiIds) {
        this.apiIds = apiIds;
        return this;
    }
    public String getApiIds() {
        return this.apiIds;
    }

    public RemoveSignatureApisRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public RemoveSignatureApisRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RemoveSignatureApisRequest setSignatureId(String signatureId) {
        this.signatureId = signatureId;
        return this;
    }
    public String getSignatureId() {
        return this.signatureId;
    }

    public RemoveSignatureApisRequest setStageName(String stageName) {
        this.stageName = stageName;
        return this;
    }
    public String getStageName() {
        return this.stageName;
    }

}
