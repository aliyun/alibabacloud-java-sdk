// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class AuthorizeConsumerModelCardGrantsRequest extends TeaModel {
    /**
     * <p>The collection of selected model card IDs for this API. This parameter can be empty or omitted, but at least one of modelCardIds and modelGroupIds must be non-empty.</p>
     */
    @NameInMap("modelCardIds")
    public java.util.List<String> modelCardIds;

    /**
     * <p>The actual model group IDs of the current instance. modelCardIds can be empty only when group licenses are granted. Group licenses allow zero intersection with the current API, but principal relationships with both target types empty cannot be saved.</p>
     */
    @NameInMap("modelGroupIds")
    public java.util.List<String> modelGroupIds;

    /**
     * <p>The immutable ID of the authorization principal, not the name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cs-d00000000000000000000</p>
     */
    @NameInMap("principalId")
    public String principalId;

    /**
     * <p>The type of the authorization principal. Valid values: Consumer and ConsumerGroup.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Consumer</p>
     */
    @NameInMap("principalType")
    public String principalType;

    public static AuthorizeConsumerModelCardGrantsRequest build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeConsumerModelCardGrantsRequest self = new AuthorizeConsumerModelCardGrantsRequest();
        return TeaModel.build(map, self);
    }

    public AuthorizeConsumerModelCardGrantsRequest setModelCardIds(java.util.List<String> modelCardIds) {
        this.modelCardIds = modelCardIds;
        return this;
    }
    public java.util.List<String> getModelCardIds() {
        return this.modelCardIds;
    }

    public AuthorizeConsumerModelCardGrantsRequest setModelGroupIds(java.util.List<String> modelGroupIds) {
        this.modelGroupIds = modelGroupIds;
        return this;
    }
    public java.util.List<String> getModelGroupIds() {
        return this.modelGroupIds;
    }

    public AuthorizeConsumerModelCardGrantsRequest setPrincipalId(String principalId) {
        this.principalId = principalId;
        return this;
    }
    public String getPrincipalId() {
        return this.principalId;
    }

    public AuthorizeConsumerModelCardGrantsRequest setPrincipalType(String principalType) {
        this.principalType = principalType;
        return this;
    }
    public String getPrincipalType() {
        return this.principalType;
    }

}
