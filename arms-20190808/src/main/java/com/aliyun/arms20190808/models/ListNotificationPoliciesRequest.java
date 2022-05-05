// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListNotificationPoliciesRequest extends TeaModel {
    // 是否查询详情信息
    @NameInMap("IsDetail")
    public Boolean isDetail;

    // 通知策略名称
    @NameInMap("Name")
    public String name;

    // 页数
    @NameInMap("Page")
    public Long page;

    // 每页展示数目
    @NameInMap("Size")
    public Long size;

    public static ListNotificationPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationPoliciesRequest self = new ListNotificationPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListNotificationPoliciesRequest setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
        return this;
    }
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    public ListNotificationPoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListNotificationPoliciesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListNotificationPoliciesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
