// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeResourceGroupsResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>68BA1DF7-8814-5AED-B844-F8F7F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of resource group information.</p>
     */
    @NameInMap("ResourceGroup")
    public java.util.List<DescribeResourceGroupsResponseBodyResourceGroup> resourceGroup;

    /**
     * <p>The total number of resource groups.</p>
     * 
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static DescribeResourceGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourceGroupsResponseBody self = new DescribeResourceGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourceGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourceGroupsResponseBody setResourceGroup(java.util.List<DescribeResourceGroupsResponseBodyResourceGroup> resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }
    public java.util.List<DescribeResourceGroupsResponseBodyResourceGroup> getResourceGroup() {
        return this.resourceGroup;
    }

    public DescribeResourceGroupsResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeResourceGroupsResponseBodyResourceGroupAppRules extends TeaModel {
        /**
         * <p>The ID of the application rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ruleId1</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the application rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ruleName1</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The type of the application rule.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Type")
        public Integer type;

        public static DescribeResourceGroupsResponseBodyResourceGroupAppRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceGroupsResponseBodyResourceGroupAppRules self = new DescribeResourceGroupsResponseBodyResourceGroupAppRules();
            return TeaModel.build(map, self);
        }

        public DescribeResourceGroupsResponseBodyResourceGroupAppRules setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeResourceGroupsResponseBodyResourceGroupAppRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourceGroupsResponseBodyResourceGroupAppRules setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class DescribeResourceGroupsResponseBodyResourceGroupPolicies extends TeaModel {
        /**
         * <p>The ID of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>pl-a8jnatl8kjasb***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Specifies whether the policy is the default policy.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The policy name.</p>
         * 
         * <strong>example:</strong>
         * <p>Test policy 123</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeResourceGroupsResponseBodyResourceGroupPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceGroupsResponseBodyResourceGroupPolicies self = new DescribeResourceGroupsResponseBodyResourceGroupPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeResourceGroupsResponseBodyResourceGroupPolicies setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeResourceGroupsResponseBodyResourceGroupPolicies setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public DescribeResourceGroupsResponseBodyResourceGroupPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeResourceGroupsResponseBodyResourceGroupTimers extends TeaModel {
        /**
         * <p>The association status between the scheduled task and the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>BIND</p>
         */
        @NameInMap("BindStatus")
        public String bindStatus;

        /**
         * <p>The ID of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>t-asdzx0mbjhg***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The name of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>Test task 123</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The running status of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("TimerStatus")
        public String timerStatus;

        /**
         * <p>The type of the scheduled task.</p>
         * 
         * <strong>example:</strong>
         * <p>TIMER</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeResourceGroupsResponseBodyResourceGroupTimers build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceGroupsResponseBodyResourceGroupTimers self = new DescribeResourceGroupsResponseBodyResourceGroupTimers();
            return TeaModel.build(map, self);
        }

        public DescribeResourceGroupsResponseBodyResourceGroupTimers setBindStatus(String bindStatus) {
            this.bindStatus = bindStatus;
            return this;
        }
        public String getBindStatus() {
            return this.bindStatus;
        }

        public DescribeResourceGroupsResponseBodyResourceGroupTimers setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeResourceGroupsResponseBodyResourceGroupTimers setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeResourceGroupsResponseBodyResourceGroupTimers setTimerStatus(String timerStatus) {
            this.timerStatus = timerStatus;
            return this;
        }
        public String getTimerStatus() {
            return this.timerStatus;
        }

        public DescribeResourceGroupsResponseBodyResourceGroupTimers setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeResourceGroupsResponseBodyResourceGroup extends TeaModel {
        /**
         * <p>The agent subtype of the DesktopAgent resource group. Valid values: JVSClaw and HermesAgent.</p>
         * 
         * <strong>example:</strong>
         * <p>JVSClaw</p>
         */
        @NameInMap("AgentType")
        public String agentType;

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-123456</p>
         */
        @NameInMap("AliyunResourceGroupId")
        public String aliyunResourceGroupId;

        /**
         * <p>The list of application rules associated with the resource group.</p>
         */
        @NameInMap("AppRules")
        public java.util.List<DescribeResourceGroupsResponseBodyResourceGroupAppRules> appRules;

        /**
         * <p>The number of administrators authorized for the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthCount")
        public String authCount;

        /**
         * <p>The creation time in ISO 8601 UTC format.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-11-29T17:25:40.000000000Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <blockquote>
         * <p>The policies associated with the resource group.</p>
         * <ul>
         * <li>The associated policies take effect on the cloud computers in the resource group. If multiple policies exist, they take effect based on their priorities.</li>
         * <li>If a cloud computer in the resource group is already assigned another policy, the policy associated with the resource group takes precedence.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("Policies")
        public java.util.List<DescribeResourceGroupsResponseBodyResourceGroupPolicies> policies;

        /**
         * <p>The resource count in the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>119</p>
         */
        @NameInMap("ResourceCount")
        public String resourceCount;

        /**
         * <p>The description of the resource group. If not set, an empty string is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Department A resource group</p>
         */
        @NameInMap("ResourceGroupDescription")
        public String resourceGroupDescription;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-cyo0il2pzge1***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>Test resource group</p>
         */
        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        /**
         * <blockquote>
         * <p>The scheduled tasks associated with the resource group.</p>
         * <ul>
         * <li>The associated scheduled tasks take effect on the cloud computers in the resource group. If a cloud computer in the resource group is already associated with another scheduled task, the task associated with the resource group takes precedence.</li>
         * </ul>
         * </blockquote>
         */
        @NameInMap("Timers")
        public java.util.List<DescribeResourceGroupsResponseBodyResourceGroupTimers> timers;

        public static DescribeResourceGroupsResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceGroupsResponseBodyResourceGroup self = new DescribeResourceGroupsResponseBodyResourceGroup();
            return TeaModel.build(map, self);
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setAgentType(String agentType) {
            this.agentType = agentType;
            return this;
        }
        public String getAgentType() {
            return this.agentType;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setAliyunResourceGroupId(String aliyunResourceGroupId) {
            this.aliyunResourceGroupId = aliyunResourceGroupId;
            return this;
        }
        public String getAliyunResourceGroupId() {
            return this.aliyunResourceGroupId;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setAppRules(java.util.List<DescribeResourceGroupsResponseBodyResourceGroupAppRules> appRules) {
            this.appRules = appRules;
            return this;
        }
        public java.util.List<DescribeResourceGroupsResponseBodyResourceGroupAppRules> getAppRules() {
            return this.appRules;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setAuthCount(String authCount) {
            this.authCount = authCount;
            return this;
        }
        public String getAuthCount() {
            return this.authCount;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setPolicies(java.util.List<DescribeResourceGroupsResponseBodyResourceGroupPolicies> policies) {
            this.policies = policies;
            return this;
        }
        public java.util.List<DescribeResourceGroupsResponseBodyResourceGroupPolicies> getPolicies() {
            return this.policies;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setResourceCount(String resourceCount) {
            this.resourceCount = resourceCount;
            return this;
        }
        public String getResourceCount() {
            return this.resourceCount;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setResourceGroupDescription(String resourceGroupDescription) {
            this.resourceGroupDescription = resourceGroupDescription;
            return this;
        }
        public String getResourceGroupDescription() {
            return this.resourceGroupDescription;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }
        public String getResourceGroupName() {
            return this.resourceGroupName;
        }

        public DescribeResourceGroupsResponseBodyResourceGroup setTimers(java.util.List<DescribeResourceGroupsResponseBodyResourceGroupTimers> timers) {
            this.timers = timers;
            return this;
        }
        public java.util.List<DescribeResourceGroupsResponseBodyResourceGroupTimers> getTimers() {
            return this.timers;
        }

    }

}
