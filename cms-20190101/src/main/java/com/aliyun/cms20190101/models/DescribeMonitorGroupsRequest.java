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

    @NameInMap("Tag")
    public java.util.List<DescribeMonitorGroupsRequestTag> tag;

    @NameInMap("Type")
    public String type;

    @NameInMap("DynamicTagRuleId")
    public String dynamicTagRuleId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("ServiceId")
    public String serviceId;

    public static DescribeMonitorGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorGroupsRequest self = new DescribeMonitorGroupsRequest();
        return TeaModel.build(map, self);
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

    }

}
