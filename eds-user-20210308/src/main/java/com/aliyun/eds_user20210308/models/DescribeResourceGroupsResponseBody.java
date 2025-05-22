// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_user20210308.models;

import com.aliyun.tea.*;

public class DescribeResourceGroupsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>68BA1DF7-8814-5AED-B844-F8F7F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroup")
    public java.util.List<DescribeResourceGroupsResponseBodyResourceGroup> resourceGroup;

    /**
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
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

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
         * <strong>example:</strong>
         * <p>pl-a8jnatl8kjasb***</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>False</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

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
        @NameInMap("BindStatus")
        public String bindStatus;

        /**
         * <strong>example:</strong>
         * <p>t-asdzx0mbjhg***</p>
         */
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        @NameInMap("TimerStatus")
        public String timerStatus;

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

    }

    public static class DescribeResourceGroupsResponseBodyResourceGroup extends TeaModel {
        @NameInMap("AppRules")
        public java.util.List<DescribeResourceGroupsResponseBodyResourceGroupAppRules> appRules;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("AuthCount")
        public String authCount;

        /**
         * <strong>example:</strong>
         * <p>2022-11-29T17:25:40.000000000Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Policies")
        public java.util.List<DescribeResourceGroupsResponseBodyResourceGroupPolicies> policies;

        /**
         * <strong>example:</strong>
         * <p>119</p>
         */
        @NameInMap("ResourceCount")
        public String resourceCount;

        /**
         * <strong>example:</strong>
         * <p>rg-cyo0il2pzge1***</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("ResourceGroupName")
        public String resourceGroupName;

        @NameInMap("Timers")
        public java.util.List<DescribeResourceGroupsResponseBodyResourceGroupTimers> timers;

        public static DescribeResourceGroupsResponseBodyResourceGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeResourceGroupsResponseBodyResourceGroup self = new DescribeResourceGroupsResponseBodyResourceGroup();
            return TeaModel.build(map, self);
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
