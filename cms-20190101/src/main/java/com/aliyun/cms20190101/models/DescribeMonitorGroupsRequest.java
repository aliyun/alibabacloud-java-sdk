// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupsRequest extends TeaModel {
    @NameInMap("DynamicTagRuleId")
    public String dynamicTagRuleId;

    @NameInMap("GroupFounderTagKey")
    public String groupFounderTagKey;

    @NameInMap("GroupFounderTagValue")
    public String groupFounderTagValue;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IncludeTemplateHistory")
    public Boolean includeTemplateHistory;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SelectContactGroups")
    public Boolean selectContactGroups;

    @NameInMap("Tag")
    public java.util.List<DescribeMonitorGroupsRequestTag> tag;

    @NameInMap("Type")
    public String type;

    public static DescribeMonitorGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupsRequest self = new DescribeMonitorGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupsRequest setDynamicTagRuleId(String dynamicTagRuleId) {
        this.dynamicTagRuleId = dynamicTagRuleId;
        return this;
    }
    public String getDynamicTagRuleId() {
        return this.dynamicTagRuleId;
    }

    public DescribeMonitorGroupsRequest setGroupFounderTagKey(String groupFounderTagKey) {
        this.groupFounderTagKey = groupFounderTagKey;
        return this;
    }
    public String getGroupFounderTagKey() {
        return this.groupFounderTagKey;
    }

    public DescribeMonitorGroupsRequest setGroupFounderTagValue(String groupFounderTagValue) {
        this.groupFounderTagValue = groupFounderTagValue;
        return this;
    }
    public String getGroupFounderTagValue() {
        return this.groupFounderTagValue;
    }

    public DescribeMonitorGroupsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
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

    public DescribeMonitorGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMonitorGroupsRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
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

    public DescribeMonitorGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMonitorGroupsRequest setSelectContactGroups(Boolean selectContactGroups) {
        this.selectContactGroups = selectContactGroups;
        return this;
    }
    public Boolean getSelectContactGroups() {
        return this.selectContactGroups;
    }

    public DescribeMonitorGroupsRequest setTag(java.util.List<DescribeMonitorGroupsRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<DescribeMonitorGroupsRequestTag> getTag() {
        return this.tag;
    }

    public DescribeMonitorGroupsRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
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
