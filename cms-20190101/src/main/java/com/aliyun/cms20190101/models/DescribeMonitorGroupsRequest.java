// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupsRequest extends TeaModel {
    @NameInMap("SelectContactGroups")
    public Boolean selectContactGroups;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IncludeTemplateHistory")
    public Boolean includeTemplateHistory;

    @NameInMap("Type")
    public String type;

    @NameInMap("DynamicTagRuleId")
    public String dynamicTagRuleId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ServiceId")
    public String serviceId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<DescribeMonitorGroupsRequestTag> tag;

    public static DescribeMonitorGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupsRequest self = new DescribeMonitorGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupsRequest setSelectContactGroups(Boolean selectContactGroups) {
        this.selectContactGroups = selectContactGroups;
        return this;
    }
    public Boolean getSelectContactGroups() {
        return this.selectContactGroups;
    }

    public DescribeMonitorGroupsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitorGroupsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitorGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public DescribeMonitorGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMonitorGroupsRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DescribeMonitorGroupsRequest setIncludeTemplateHistory(Boolean includeTemplateHistory) {
        this.includeTemplateHistory = includeTemplateHistory;
        return this;
    }
    public Boolean getIncludeTemplateHistory() {
        return this.includeTemplateHistory;
    }

    public DescribeMonitorGroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public DescribeMonitorGroupsRequest setDynamicTagRuleId(String dynamicTagRuleId) {
        this.dynamicTagRuleId = dynamicTagRuleId;
        return this;
    }
    public String getDynamicTagRuleId() {
        return this.dynamicTagRuleId;
    }

    public DescribeMonitorGroupsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeMonitorGroupsRequest setServiceId(String serviceId) {
        this.serviceId = serviceId;
        return this;
    }
    public String getServiceId() {
        return this.serviceId;
    }

    public DescribeMonitorGroupsRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public DescribeMonitorGroupsRequest setTag(java.util.List<DescribeMonitorGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeMonitorGroupsRequestTag> getTag() {
        return this.tag;
    }

    public static class DescribeMonitorGroupsRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeMonitorGroupsRequestTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsRequestTag self = new DescribeMonitorGroupsRequestTag();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupsRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMonitorGroupsRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
