// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the tag rule.</p>
     */
    @NameInMap("DynamicTagRuleId")
    public String dynamicTagRuleId;

    /**
     * <p>The tag key that is created for the application group by using the tag rule.</p>
     */
    @NameInMap("GroupFounderTagKey")
    public String groupFounderTagKey;

    /**
     * <p>The tag value that is created for the application group by using the tag rule.</p>
     */
    @NameInMap("GroupFounderTagValue")
    public String groupFounderTagValue;

    /**
     * <p>The ID of the application group. Separate multiple application group IDs with commas (,).</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The name of the application group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>Specifies whether to include the historical alert templates that are applied to the application group in the response. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("IncludeTemplateHistory")
    public Boolean includeTemplateHistory;

    /**
     * <p>The instance ID. This parameter is used to query the application group to which the specified instance belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The keyword that is used for the search.</p>
     */
    @NameInMap("Keyword")
    public String keyword;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 30.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Specifies whether to include the alert contact groups in the response. Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <p>*   false</p>
     */
    @NameInMap("SelectContactGroups")
    public Boolean selectContactGroups;

    /**
     * <p>The tags of the application group.</p>
     */
    @NameInMap("Tag")
    public java.util.List<DescribeMonitorGroupsRequestTag> tag;

    /**
     * <p>The type of the application group. Valid values:</p>
     * <br>
     * <p>*   custom: a self-managed application group</p>
     * <p>*   ehpc_cluster: an application group that is synchronized from an Elastic High Performance Computing (E-HPC) cluster</p>
     * <p>*   kubernetes: an application group that is synchronized from a Container Service for Kubernetes (ACK) cluster</p>
     */
    @NameInMap("Type")
    public String type;

    @NameInMap("Types")
    public String types;

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

    public DescribeMonitorGroupsRequest setTypes(String types) {
        this.types = types;
        return this;
    }
    public String getTypes() {
        return this.types;
    }

    public static class DescribeMonitorGroupsRequestTag extends TeaModel {
        /**
         * <p>The tag key of the application group. Valid values of N: 1 to 5.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value of the application group. Valid values of N: 1 to 5.</p>
         */
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
