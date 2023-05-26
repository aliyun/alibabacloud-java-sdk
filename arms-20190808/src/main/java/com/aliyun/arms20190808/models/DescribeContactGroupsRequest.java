// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactGroupsRequest extends TeaModel {
    /**
     * <p>The ID of the alert contact.</p>
     */
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    @NameInMap("GroupIds")
    public String groupIds;

    @NameInMap("IsDetail")
    public Boolean isDetail;

    /**
     * <p>The ID of the alert contact group.</p>
     */
    @NameInMap("Page")
    public Long page;

    @NameInMap("RegionId")
    public String regionId;

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

    public DescribeContactGroupsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeContactGroupsRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
