// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetSignatureApisRequest extends TeaModel {
    /**
     * <p>The API IDs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3b81fd160f5645e097cc8855d75a1cf6,46fbb52840d146f186e38e8e70fc8c12</p>
     */
    @NameInMap("ApiIds")
    public String apiIds;

    /**
     * <p>The API group ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0009db9c828549768a200320714b8930</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The signature ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dd05f1c54d6749eda95f9fa6d491449a</p>
     */
    @NameInMap("SignatureId")
    public String signatureId;

    /**
     * <p>The environment. Valid values:</p>
     * <ul>
     * <li><strong>RELEASE</strong>: the production environment</li>
     * <li><strong>PRE</strong>: the staging environment</li>
     * <li><strong>TEST</strong>: the testing environment</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TEST</p>
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
