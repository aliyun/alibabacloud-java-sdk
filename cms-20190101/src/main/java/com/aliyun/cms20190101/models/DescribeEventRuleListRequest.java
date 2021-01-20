// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20190101.models;

import com.aliyun.tea.*;

public class DescribeEventRuleListRequest extends TeaModel {
    @NameInMap("NamePrefix")
    public String namePrefix;

    @NameInMap("PageNumber")
    public String pageNumber;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("GroupId")
    public String groupId;

    public static DescribeEventRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventRuleListRequest self = new DescribeEventRuleListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventRuleListRequest setNamePrefix(String namePrefix) {
        this.namePrefix = namePrefix;
        return this;
    }
    public String getNamePrefix() {
        return this.namePrefix;
    }

    public DescribeEventRuleListRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeEventRuleListRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeEventRuleListRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
