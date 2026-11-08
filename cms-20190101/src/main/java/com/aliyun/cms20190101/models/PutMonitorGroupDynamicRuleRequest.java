// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class PutMonitorGroupDynamicRuleRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to only precheck this request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: sends a check request. No security group is associated with the instance. The check items include whether required parameters are specified, the request format, and service limits. If the check fails, the corresponding error is returned. If the check succeeds, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): sends a normal request. If the check succeeds, an HTTP 2xx status code is returned and the operation is directly performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the application group.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>None.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupRules")
    public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRules> groupRules;

    /**
     * <p>The mode for creating the dynamic matching rule. Valid values:</p>
     * <ul>
     * <li>true: Asynchronous creation.</li>
     * <li>false (default): Synchronous creation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsAsync")
    public Boolean isAsync;

    @NameInMap("RegionId")
    public String regionId;

    public static PutMonitorGroupDynamicRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        PutMonitorGroupDynamicRuleRequest self = new PutMonitorGroupDynamicRuleRequest();
        return TeaModel.build(map, self);
    }

    public PutMonitorGroupDynamicRuleRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public PutMonitorGroupDynamicRuleRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public PutMonitorGroupDynamicRuleRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public PutMonitorGroupDynamicRuleRequest setGroupRules(java.util.List<PutMonitorGroupDynamicRuleRequestGroupRules> groupRules) {
        this.groupRules = groupRules;
        return this;
    }
    public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRules> getGroupRules() {
        return this.groupRules;
    }

    public PutMonitorGroupDynamicRuleRequest setIsAsync(Boolean isAsync) {
        this.isAsync = isAsync;
        return this;
    }
    public Boolean getIsAsync() {
        return this.isAsync;
    }

    public PutMonitorGroupDynamicRuleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class PutMonitorGroupDynamicRuleRequestGroupRulesFilters extends TeaModel {
        /**
         * <p>The filter condition for instances. Valid values of N: 1 to 3. Valid values:</p>
         * <ul>
         * <li>contains: Contains.</li>
         * <li>notContains: Does not contain.</li>
         * <li>startWith: Prefix.</li>
         * <li>endWith: Suffix.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>contains</p>
         */
        @NameInMap("Function")
        public String function;

        /**
         * <p>The field name for instance matching. Valid values of N: 1 to 3.</p>
         * <p>Currently, only the hostname is supported, such as hostName.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hostName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The value that meets the matching condition. Valid values of N: 1 to 3.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("Value")
        public String value;

        public static PutMonitorGroupDynamicRuleRequestGroupRulesFilters build(java.util.Map<String, ?> map) throws Exception {
            PutMonitorGroupDynamicRuleRequestGroupRulesFilters self = new PutMonitorGroupDynamicRuleRequestGroupRulesFilters();
            return TeaModel.build(map, self);
        }

        public PutMonitorGroupDynamicRuleRequestGroupRulesFilters setFunction(String function) {
            this.function = function;
            return this;
        }
        public String getFunction() {
            return this.function;
        }

        public PutMonitorGroupDynamicRuleRequestGroupRulesFilters setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public PutMonitorGroupDynamicRuleRequestGroupRulesFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class PutMonitorGroupDynamicRuleRequestGroupRules extends TeaModel {
        /**
         * <p>The type of Alibaba Cloud service for the dynamic alert rule. Valid values of N: 1 to 3. Valid values:</p>
         * <ul>
         * <li><p>ecs: Elastic Compute Service (ECS) server.</p>
         * </li>
         * <li><p>rds: relational database.</p>
         * </li>
         * <li><p>slb: load balancing.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        @NameInMap("Category")
        public String category;

        /**
         * <p>The combination condition for dynamic matching rules. Valid values of N: 1 to 3. Valid values:</p>
         * <ul>
         * <li><p>and: Only instances that meet all matching rules are automatically added to the application group.</p>
         * </li>
         * <li><p>or: Instances that meet any matching rule are automatically added to the application group.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>and</p>
         */
        @NameInMap("FilterRelation")
        public String filterRelation;

        /**
         * <p>None.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Filters")
        public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRulesFilters> filters;

        public static PutMonitorGroupDynamicRuleRequestGroupRules build(java.util.Map<String, ?> map) throws Exception {
            PutMonitorGroupDynamicRuleRequestGroupRules self = new PutMonitorGroupDynamicRuleRequestGroupRules();
            return TeaModel.build(map, self);
        }

        public PutMonitorGroupDynamicRuleRequestGroupRules setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public PutMonitorGroupDynamicRuleRequestGroupRules setFilterRelation(String filterRelation) {
            this.filterRelation = filterRelation;
            return this;
        }
        public String getFilterRelation() {
            return this.filterRelation;
        }

        public PutMonitorGroupDynamicRuleRequestGroupRules setFilters(java.util.List<PutMonitorGroupDynamicRuleRequestGroupRulesFilters> filters) {
            this.filters = filters;
            return this;
        }
        public java.util.List<PutMonitorGroupDynamicRuleRequestGroupRulesFilters> getFilters() {
            return this.filters;
        }

    }

}
