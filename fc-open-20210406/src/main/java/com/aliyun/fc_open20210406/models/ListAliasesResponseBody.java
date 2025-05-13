// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListAliasesResponseBody extends TeaModel {
    /**
     * <p>The list of aliases.</p>
     */
    @NameInMap("aliases")
    public java.util.List<ListAliasesResponseBodyAliases> aliases;

    /**
     * <p>The token used to obtain more results.</p>
     * 
     * <strong>example:</strong>
     * <p>8bj81uI8n****</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    public static ListAliasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAliasesResponseBody self = new ListAliasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAliasesResponseBody setAliases(java.util.List<ListAliasesResponseBodyAliases> aliases) {
        this.aliases = aliases;
        return this;
    }
    public java.util.List<ListAliasesResponseBodyAliases> getAliases() {
        return this.aliases;
    }

    public ListAliasesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public static class ListAliasesResponseBodyAliases extends TeaModel {
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
         * <p>test</p>
         */
        @NameInMap("aliasName")
        public String aliasName;

        /**
         * <p>The time when the ConfigMaps were created.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-08-15T16:06:05.000+0000</p>
         */
        @NameInMap("createdTime")
        public String createdTime;

        /**
         * <p>The description of the alias.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample alias.</p>
         */
        @NameInMap("description")
        public String description;

        /**
         * <p>The time at which the system parameter was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-08-15T16:06:05.000+0000</p>
         */
        @NameInMap("lastModifiedTime")
        public String lastModifiedTime;

        /**
         * <p>The canary release mode. Default value: Random. Valid values:</p>
         * <ul>
         * <li><strong>Random</strong>: random canary release.</li>
         * <li><strong>Content</strong>: rule-based canary release.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Random</p>
         */
        @NameInMap("resolvePolicy")
        public String resolvePolicy;

        /**
         * <p>The canary release rule. Traffic that meets the canary release rule is routed to the canary release instances.</p>
         */
        @NameInMap("routePolicy")
        public RoutePolicy routePolicy;

        /**
         * <p>The ID of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("versionId")
        public String versionId;

        public static ListAliasesResponseBodyAliases build(java.util.Map<String, ?> map) throws Exception {
            ListAliasesResponseBodyAliases self = new ListAliasesResponseBodyAliases();
            return TeaModel.build(map, self);
        }

        public ListAliasesResponseBodyAliases setAdditionalVersionWeight(java.util.Map<String, Float> additionalVersionWeight) {
            this.additionalVersionWeight = additionalVersionWeight;
            return this;
        }
        public java.util.Map<String, Float> getAdditionalVersionWeight() {
            return this.additionalVersionWeight;
        }

        public ListAliasesResponseBodyAliases setAliasName(String aliasName) {
            this.aliasName = aliasName;
            return this;
        }
        public String getAliasName() {
            return this.aliasName;
        }

        public ListAliasesResponseBodyAliases setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListAliasesResponseBodyAliases setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListAliasesResponseBodyAliases setLastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }
        public String getLastModifiedTime() {
            return this.lastModifiedTime;
        }

        public ListAliasesResponseBodyAliases setResolvePolicy(String resolvePolicy) {
            this.resolvePolicy = resolvePolicy;
            return this;
        }
        public String getResolvePolicy() {
            return this.resolvePolicy;
        }

        public ListAliasesResponseBodyAliases setRoutePolicy(RoutePolicy routePolicy) {
            this.routePolicy = routePolicy;
            return this;
        }
        public RoutePolicy getRoutePolicy() {
            return this.routePolicy;
        }

        public ListAliasesResponseBodyAliases setVersionId(String versionId) {
            this.versionId = versionId;
            return this;
        }
        public String getVersionId() {
            return this.versionId;
        }

    }

}
