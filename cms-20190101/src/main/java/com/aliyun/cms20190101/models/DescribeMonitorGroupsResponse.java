// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeMonitorGroupsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("Code")
    @Validation(required = true)
    public Integer code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Resources")
    @Validation(required = true)
    public DescribeMonitorGroupsResponseResources resources;

    public static DescribeMonitorGroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupsResponse self = new DescribeMonitorGroupsResponse();
        return TeaModel.build(map, self);
    }

    public static class DescribeMonitorGroupsResponseResourcesResourceContactGroupsContactGroup extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        public static DescribeMonitorGroupsResponseResourcesResourceContactGroupsContactGroup build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseResourcesResourceContactGroupsContactGroup self = new DescribeMonitorGroupsResponseResourcesResourceContactGroupsContactGroup();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupsResponseResourcesResourceContactGroups extends TeaModel {
        @NameInMap("ContactGroup")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupsResponseResourcesResourceContactGroupsContactGroup> contactGroup;

        public static DescribeMonitorGroupsResponseResourcesResourceContactGroups build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseResourcesResourceContactGroups self = new DescribeMonitorGroupsResponseResourcesResourceContactGroups();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupsResponseResourcesResourceTagsTag extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        public String key;

        @NameInMap("Value")
        @Validation(required = true)
        public String value;

        public static DescribeMonitorGroupsResponseResourcesResourceTagsTag build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseResourcesResourceTagsTag self = new DescribeMonitorGroupsResponseResourcesResourceTagsTag();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupsResponseResourcesResourceTags extends TeaModel {
        @NameInMap("Tag")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupsResponseResourcesResourceTagsTag> tag;

        public static DescribeMonitorGroupsResponseResourcesResourceTags build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseResourcesResourceTags self = new DescribeMonitorGroupsResponseResourcesResourceTags();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupsResponseResourcesResourceTemplateIds extends TeaModel {
        @NameInMap("TemplateId")
        @Validation(required = true)
        public java.util.List<String> templateId;

        public static DescribeMonitorGroupsResponseResourcesResourceTemplateIds build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseResourcesResourceTemplateIds self = new DescribeMonitorGroupsResponseResourcesResourceTemplateIds();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupsResponseResourcesResource extends TeaModel {
        @NameInMap("GroupId")
        @Validation(required = true)
        public Long groupId;

        @NameInMap("GroupName")
        @Validation(required = true)
        public String groupName;

        @NameInMap("ServiceId")
        @Validation(required = true)
        public String serviceId;

        @NameInMap("Type")
        @Validation(required = true)
        public String type;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("BindUrl")
        @Validation(required = true)
        public String bindUrl;

        @NameInMap("DynamicTagRuleId")
        @Validation(required = true)
        public String dynamicTagRuleId;

        @NameInMap("GroupFounderTagKey")
        @Validation(required = true)
        public String groupFounderTagKey;

        @NameInMap("GroupFounderTagValue")
        @Validation(required = true)
        public String groupFounderTagValue;

        @NameInMap("ContactGroups")
        @Validation(required = true)
        public DescribeMonitorGroupsResponseResourcesResourceContactGroups contactGroups;

        @NameInMap("Tags")
        @Validation(required = true)
        public DescribeMonitorGroupsResponseResourcesResourceTags tags;

        @NameInMap("TemplateIds")
        @Validation(required = true)
        public DescribeMonitorGroupsResponseResourcesResourceTemplateIds templateIds;

        public static DescribeMonitorGroupsResponseResourcesResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseResourcesResource self = new DescribeMonitorGroupsResponseResourcesResource();
            return TeaModel.build(map, self);
        }

    }

    public static class DescribeMonitorGroupsResponseResources extends TeaModel {
        @NameInMap("Resource")
        @Validation(required = true)
        public java.util.List<DescribeMonitorGroupsResponseResourcesResource> resource;

        public static DescribeMonitorGroupsResponseResources build(java.util.Map<String, ?> map) throws Exception {
            DescribeMonitorGroupsResponseResources self = new DescribeMonitorGroupsResponseResources();
            return TeaModel.build(map, self);
        }

    }

}
