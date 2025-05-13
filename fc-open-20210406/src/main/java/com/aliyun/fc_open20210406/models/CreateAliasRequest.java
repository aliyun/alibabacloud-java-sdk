// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateAliasRequest extends TeaModel {
    /**
     * <p>The canary release version to which the alias points and the weight of the canary release version.</p>
     * <ul>
     * <li>The canary release version takes effect only when the function is invoked.</li>
     * <li>The value consists of a version number and the corresponding weight. For example, 2:0.05 indicates that Version 2 is the canary release version and 5% of traffic is directed to the canary release version when the function is invoked. 95% of traffic is directed to the main version.</li>
     * </ul>
     */
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    /**
     * <p>The name of the alias. The value can contain only letters, digits, underscores (_) and hyphens (-). It cannot start with a digit or hyphen (-). It must be 1 to 128 characters in length and cannot be <strong>LATEST</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alias_test</p>
     */
    @NameInMap("aliasName")
    public String aliasName;

    /**
     * <p>The description of the alias.</p>
     * 
     * <strong>example:</strong>
     * <p>test_description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The canary release mode. Valid values:</p>
     * <ul>
     * <li><strong>Random</strong>: random canary release.</li>
     * <li><strong>Content</strong>: rule-based canary release. Default value: null.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Random</p>
     */
    @NameInMap("resolvePolicy")
    public String resolvePolicy;

    /**
     * <p>The canary release rule. Traffic that meets the canary release rule is routed to the canary release instance.</p>
     */
    @NameInMap("routePolicy")
    public RoutePolicy routePolicy;

    /**
     * <p>The ID of the version to which the alias points.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("versionId")
    public String versionId;

    public static CreateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAliasRequest self = new CreateAliasRequest();
        return TeaModel.build(map, self);
    }

    public CreateAliasRequest setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public CreateAliasRequest setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public CreateAliasRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAliasRequest setResolvePolicy(String resolvePolicy) {
        this.resolvePolicy = resolvePolicy;
        return this;
    }
    public String getResolvePolicy() {
        return this.resolvePolicy;
    }

    public CreateAliasRequest setRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }
    public RoutePolicy getRoutePolicy() {
        return this.routePolicy;
    }

    public CreateAliasRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
