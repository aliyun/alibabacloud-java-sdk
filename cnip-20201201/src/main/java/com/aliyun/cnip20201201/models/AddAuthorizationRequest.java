// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddAuthorizationRequest extends TeaModel {
    @NameInMap("grantee")
    public String grantee;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("resourceIdentifier")
    public String resourceIdentifier;

    // 可选值：["ReadOnly","ReadWrite"]
    @NameInMap("type")
    public String type;

    // 可选值：["Allow","Deny"]
    @NameInMap("effect")
    public String effect;

    @NameInMap("description")
    public String description;

    public static AddAuthorizationRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAuthorizationRequest self = new AddAuthorizationRequest();
        return TeaModel.build(map, self);
    }

    public AddAuthorizationRequest setGrantee(String grantee) {
        this.grantee = grantee;
        return this;
    }
    public String getGrantee() {
        return this.grantee;
    }

    public AddAuthorizationRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public AddAuthorizationRequest setResourceIdentifier(String resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }
    public String getResourceIdentifier() {
        return this.resourceIdentifier;
    }

    public AddAuthorizationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public AddAuthorizationRequest setEffect(String effect) {
        this.effect = effect;
        return this;
    }
    public String getEffect() {
        return this.effect;
    }

    public AddAuthorizationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

}
