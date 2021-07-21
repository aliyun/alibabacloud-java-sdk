// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Code")
    public Integer code;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Total")
    public Integer total;

    @NameInMap("Resources")
    public DescribeMonitorGroupsResponseBodyResources resources;

    public static DescribeMonitorGroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupsResponseBody self = new DescribeMonitorGroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorGroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeMonitorGroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeMonitorGroupsResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public DescribeMonitorGroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeMonitorGroupsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeMonitorGroupsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeMonitorGroupsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeMonitorGroupsResponseBody setResources(DescribeMonitorGroupsResponseBodyResources resources) {
        this.resources = resources;
        return this;
    }
    public DescribeMonitorGroupsResponseBodyResources getResources() {
        return this.resources;
    }

    public static class DescribeMonitorGroupsResponseBodyResourcesResourceContactGroupsContactGroup extends TeaModel {
        @NameInMap("Name")
        public String name;

        public static DescribeMonitorGroupsResponseBodyResourcesResourceContactGroupsContactGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseBodyResourcesResourceContactGroupsContactGroup self = new DescribeMonitorGroupsResponseBodyResourcesResourceContactGroupsContactGroup();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupsResponseBodyResourcesResourceContactGroupsContactGroup setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeMonitorGroupsResponseBodyResourcesResourceContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        public java.util.List<DescribeMonitorGroupsResponseBodyResourcesResourceContactGroupsContactGroup> contactGroup;

        public static DescribeMonitorGroupsResponseBodyResourcesResourceContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseBodyResourcesResourceContactGroups self = new DescribeMonitorGroupsResponseBodyResourcesResourceContactGroups();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupsResponseBodyResourcesResourceContactGroups setContactGroup(java.util.List<DescribeMonitorGroupsResponseBodyResourcesResourceContactGroupsContactGroup> contactGroup) {
            this.contactGroup = contactGroup;
            return this;
        }
        public java.util.List<DescribeMonitorGroupsResponseBodyResourcesResourceContactGroupsContactGroup> getContactGroup() {
            return this.contactGroup;
        }

    }

    public static class DescribeMonitorGroupsResponseBodyResourcesResourceTagsTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static DescribeMonitorGroupsResponseBodyResourcesResourceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseBodyResourcesResourceTagsTag self = new DescribeMonitorGroupsResponseBodyResourcesResourceTagsTag();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupsResponseBodyResourcesResourceTagsTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResourceTagsTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeMonitorGroupsResponseBodyResourcesResourceTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<DescribeMonitorGroupsResponseBodyResourcesResourceTagsTag> tag;

        public static DescribeMonitorGroupsResponseBodyResourcesResourceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseBodyResourcesResourceTags self = new DescribeMonitorGroupsResponseBodyResourcesResourceTags();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupsResponseBodyResourcesResourceTags setTag(java.util.List<DescribeMonitorGroupsResponseBodyResourcesResourceTagsTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<DescribeMonitorGroupsResponseBodyResourcesResourceTagsTag> getTag() {
            return this.tag;
        }

    }

    public static class DescribeMonitorGroupsResponseBodyResourcesResourceTemplateIds extends TeaModel {
        @NameInMap("TemplateId")
        public java.util.List<String> templateId;

        public static DescribeMonitorGroupsResponseBodyResourcesResourceTemplateIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseBodyResourcesResourceTemplateIds self = new DescribeMonitorGroupsResponseBodyResourcesResourceTemplateIds();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupsResponseBodyResourcesResourceTemplateIds setTemplateId(java.util.List<String> templateId) {
            this.templateId = templateId;
            return this;
        }
        public java.util.List<String> getTemplateId() {
            return this.templateId;
        }

    }

    public static class DescribeMonitorGroupsResponseBodyResourcesResource extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("GroupFounderTagValue")
        public String groupFounderTagValue;

        @NameInMap("BindUrl")
        public String bindUrl;

        @NameInMap("GroupName")
        public String groupName;

        @NameInMap("GroupId")
        public Long groupId;

        @NameInMap("ServiceId")
        public String serviceId;

        @NameInMap("DynamicTagRuleId")
        public String dynamicTagRuleId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GroupFounderTagKey")
        public String groupFounderTagKey;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("ContactGroups")
        public DescribeMonitorGroupsResponseBodyResourcesResourceContactGroups contactGroups;

        @NameInMap("Tags")
        public DescribeMonitorGroupsResponseBodyResourcesResourceTags tags;

        @NameInMap("TemplateIds")
        public DescribeMonitorGroupsResponseBodyResourcesResourceTemplateIds templateIds;

        public static DescribeMonitorGroupsResponseBodyResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseBodyResourcesResource self = new DescribeMonitorGroupsResponseBodyResourcesResource();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setGroupFounderTagValue(String groupFounderTagValue) {
            this.groupFounderTagValue = groupFounderTagValue;
            return this;
        }
        public String getGroupFounderTagValue() {
            return this.groupFounderTagValue;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setBindUrl(String bindUrl) {
            this.bindUrl = bindUrl;
            return this;
        }
        public String getBindUrl() {
            return this.bindUrl;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setGroupName(String groupName) {
            this.groupName = groupName;
            return this;
        }
        public String getGroupName() {
            return this.groupName;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setGroupId(Long groupId) {
            this.groupId = groupId;
            return this;
        }
        public Long getGroupId() {
            return this.groupId;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setServiceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public String getServiceId() {
            return this.serviceId;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setDynamicTagRuleId(String dynamicTagRuleId) {
            this.dynamicTagRuleId = dynamicTagRuleId;
            return this;
        }
        public String getDynamicTagRuleId() {
            return this.dynamicTagRuleId;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setGroupFounderTagKey(String groupFounderTagKey) {
            this.groupFounderTagKey = groupFounderTagKey;
            return this;
        }
        public String getGroupFounderTagKey() {
            return this.groupFounderTagKey;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setContactGroups(DescribeMonitorGroupsResponseBodyResourcesResourceContactGroups contactGroups) {
            this.contactGroups = contactGroups;
            return this;
        }
        public DescribeMonitorGroupsResponseBodyResourcesResourceContactGroups getContactGroups() {
            return this.contactGroups;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setTags(DescribeMonitorGroupsResponseBodyResourcesResourceTags tags) {
            this.tags = tags;
            return this;
        }
        public DescribeMonitorGroupsResponseBodyResourcesResourceTags getTags() {
            return this.tags;
        }

        public DescribeMonitorGroupsResponseBodyResourcesResource setTemplateIds(DescribeMonitorGroupsResponseBodyResourcesResourceTemplateIds templateIds) {
            this.templateIds = templateIds;
            return this;
        }
        public DescribeMonitorGroupsResponseBodyResourcesResourceTemplateIds getTemplateIds() {
            return this.templateIds;
        }

    }

    public static class DescribeMonitorGroupsResponseBodyResources extends TeaModel {
        @NameInMap("Resource")
        public java.util.List<DescribeMonitorGroupsResponseBodyResourcesResource> resource;

        public static DescribeMonitorGroupsResponseBodyResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseBodyResources self = new DescribeMonitorGroupsResponseBodyResources();
            return TeaModel.build(map, self);
        }

        public DescribeMonitorGroupsResponseBodyResources setResource(java.util.List<DescribeMonitorGroupsResponseBodyResourcesResource> resource) {
            this.resource = resource;
            return this;
        }
        public java.util.List<DescribeMonitorGroupsResponseBodyResourcesResource> getResource() {
            return this.resource;
        }

    }

}
