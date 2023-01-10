// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateAliasRequest extends TeaModel {
    // The canary release version to which the alias points and the weight of the canary release version.
    // 
    // *   The canary release version takes effect only when the function is invoked.
    // *   The value consists of a version number and a specific weight. For example, 2:0.05 indicates that when a function is invoked, Version 2 is the canary release version, 5% of the traffic is distributed to the canary release version, and 95% of the traffic is distributed to the major version.
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    // The description of the alias.
    @NameInMap("description")
    public String description;

    // The canary release mode. Valid values:
    // 
    // *   **Random**: random canary release. This is the default value.
    // *   **Content**: rule-based canary release.
    @NameInMap("resolvePolicy")
    public String resolvePolicy;

    // The canary release rule. Traffic that meets the canary release rule is routed to the canary release instance.
    @NameInMap("routePolicy")
    public RoutePolicy routePolicy;

    // The ID of the version to which the alias points.
    @NameInMap("versionId")
    public String versionId;

    public static UpdateAliasRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAliasRequest self = new UpdateAliasRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAliasRequest setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public UpdateAliasRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAliasRequest setResolvePolicy(String resolvePolicy) {
        this.resolvePolicy = resolvePolicy;
        return this;
    }
    public String getResolvePolicy() {
        return this.resolvePolicy;
    }

    public UpdateAliasRequest setRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }
    public RoutePolicy getRoutePolicy() {
        return this.routePolicy;
    }

    public UpdateAliasRequest setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
