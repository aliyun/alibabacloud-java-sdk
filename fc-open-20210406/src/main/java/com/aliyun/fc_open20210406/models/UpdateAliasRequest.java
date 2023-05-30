// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateAliasRequest extends TeaModel {
    /**
     * <p>The additional version to which the alias points and the weight of the additional version.</p>
     * <br>
     * <p>*   The additional version takes effect only when the function is invoked.</p>
     * <p>*   The value consists of a version number and a specific weight. For example, 2:0.05 indicates that when a function is invoked, Version 2 is the canary release version, 5% of the traffic is distributed to the canary release version, and 95% of the traffic is distributed to the major version.</p>
     */
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    /**
     * <p>The description of the alias.</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The canary release mode. Valid values:</p>
     * <br>
     * <p>*   **Random**: random canary release. This is the default value.</p>
     * <p>*   **Content**: rule-based canary release.</p>
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
     */
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
