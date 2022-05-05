// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class DescribeContactGroupsRequest extends TeaModel {
    // 告警联系人组名称
    @NameInMap("ContactGroupName")
    public String contactGroupName;

    // 是否返回联系人分组中包含的所有联系人。默认不返回所有联系人。
    @NameInMap("IsDetail")
    public Boolean isDetail;

    @NameInMap("Page")
    public Long page;

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
