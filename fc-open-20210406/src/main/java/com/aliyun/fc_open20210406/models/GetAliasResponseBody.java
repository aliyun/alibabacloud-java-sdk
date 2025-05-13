// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetAliasResponseBody extends TeaModel {
    /**
     * <p>The additional version to which the alias points and the weight of the additional version.</p>
     * <ul>
     * <li>The additional version takes effect only when the function is invoked.</li>
     * <li>The value consists of a version number and a specific weight. For example, 2:0.05 indicates that when a function is invoked, Version 2 is the canary release version, 5% of the traffic is distributed to the canary release version, and 95% of the traffic is distributed to the major version.</li>
     * </ul>
     */
    @NameInMap("additionalVersionWeight")
    public java.util.Map<String, Float> additionalVersionWeight;

    /**
     * <p>The name of the alias.</p>
     * 
     * <strong>example:</strong>
     * <p>alias_test</p>
     */
    @NameInMap("aliasName")
    public String aliasName;

    /**
     * <p>The time when the alias was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-27T06:37:29Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The description of the alias.</p>
     * 
     * <strong>example:</strong>
     * <p>test_description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The time when the alias was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-07-27T06:37:29Z</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The canary release mode. Valid values:</p>
     * <ul>
     * <li><strong>Random</strong>: random canary release. This is the default value.</li>
     * <li><strong>Content</strong>: rule-based canary release.</li>
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
     * <p>The version to which the alias points.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("versionId")
    public String versionId;

    public static GetAliasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAliasResponseBody self = new GetAliasResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAliasResponseBody setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
        this.additionalVersionWeight = additionalVersionWeight;
        return this;
    }
    public java.util.Map<String, Float> getAdditionalVersionWeight() {
        return this.additionalVersionWeight;
    }

    public GetAliasResponseBody setAliasName(String aliasName) {
        this.aliasName = aliasName;
        return this;
    }
    public String getAliasName() {
        return this.aliasName;
    }

    public GetAliasResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public GetAliasResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public GetAliasResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public GetAliasResponseBody setResolvePolicy(String resolvePolicy) {
        this.resolvePolicy = resolvePolicy;
        return this;
    }
    public String getResolvePolicy() {
        return this.resolvePolicy;
    }

    public GetAliasResponseBody setRoutePolicy(RoutePolicy routePolicy) {
        this.routePolicy = routePolicy;
        return this;
    }
    public RoutePolicy getRoutePolicy() {
        return this.routePolicy;
    }

    public GetAliasResponseBody setVersionId(String versionId) {
        this.versionId = versionId;
        return this;
    }
    public String getVersionId() {
        return this.versionId;
    }

}
