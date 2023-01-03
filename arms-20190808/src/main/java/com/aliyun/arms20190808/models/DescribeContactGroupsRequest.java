// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactGroupsRequest extends TeaModel {
    // The name of the alert contact group.
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    @NameInMap("GroupIds")
    public String groupIds;

    // Indicates whether all contacts are included in the returned contact group information.
    // 
    // *   `fasle` (default): does not return all contacts.
    // *   `true`: All contacts are returned.
    @NameInMap("IsDetail")
    public Boolean isDetail;

    // The number of pages to query.
    @NameInMap("Page")
    public Long page;

    // The number of contact groups displayed on each page.
    @NameInMap("Size")
    public Long size;

    public static DescribeContactGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeContactGroupsRequest self = new DescribeContactGroupsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeContactGroupsRequest setContactGroupName(String contactGroupName) {
        this.contactGroupName = contactGroupName;
        return this;
    }
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    public DescribeContactGroupsRequest setGroupIds(String groupIds) {
        this.groupIds = groupIds;
        return this;
    }
    public String getGroupIds() {
        return this.groupIds;
    }

    public DescribeContactGroupsRequest setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
        return this;
    }
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    public DescribeContactGroupsRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public DescribeContactGroupsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
