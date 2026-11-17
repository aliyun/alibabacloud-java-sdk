// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class RevokeConsumerModelCardGrantsRequest extends TeaModel {
    /**
     * <p>The IDs of the model cards for which entitlements are revoked in this API. Revoking non-existent entitlements is a valid no-op.</p>
     */
    @NameInMap("modelCardIds")
    public java.util.List<String> modelCardIds;

    /**
     * <p>The IDs of the actual model groups for which entitlements are revoked in this API. If you revoke only group entitlements, modelCardIds can be empty, and the group or principal is not required to exist. At least one of the two target types must be specified. This operation does not delete consumers, keys, or quotas.</p>
     */
    @NameInMap("modelGroupIds")
    public java.util.List<String> modelGroupIds;

    /**
     * <p>The immutable ID of the principal for which entitlements are revoked. This is not the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-d00000000000000000000</p>
     */
    @NameInMap("principalId")
    public String principalId;

    /**
     * <p>The type of the principal for which entitlements are revoked. Valid values:</p>
     * <ul>
     * <li>Consumer</li>
     * <li>ConsumerGroup</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Consumer</p>
     */
    @NameInMap("principalType")
    public String principalType;

    public static RevokeConsumerModelCardGrantsRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeConsumerModelCardGrantsRequest self = new RevokeConsumerModelCardGrantsRequest();
        return TeaModel.build(map, self);
    }

    public RevokeConsumerModelCardGrantsRequest setModelCardIds(java.util.List<String> modelCardIds) {
        this.modelCardIds = modelCardIds;
        return this;
    }
    public java.util.List<String> getModelCardIds() {
        return this.modelCardIds;
    }

    public RevokeConsumerModelCardGrantsRequest setModelGroupIds(java.util.List<String> modelGroupIds) {
        this.modelGroupIds = modelGroupIds;
        return this;
    }
    public java.util.List<String> getModelGroupIds() {
        return this.modelGroupIds;
    }

    public RevokeConsumerModelCardGrantsRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public RevokeConsumerModelCardGrantsRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
