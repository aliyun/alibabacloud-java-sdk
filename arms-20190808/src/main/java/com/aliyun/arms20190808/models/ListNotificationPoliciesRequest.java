// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListNotificationPoliciesRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    // Specifies whether to query the details about notification policies. Valid values:
    // 
    // *   `true`: Details about notification policies are queried.
    // *   `false`: Details about notification policies are not queried.
    @NameInMap("IsDetail")
    public Boolean isDetail;

    // The name of the notification policy.
    @NameInMap("Name")
    public String name;

    // The number of the page to return.
    @NameInMap("Page")
    public Long page;

    @NameInMap("RegionId")
    public String regionId;

    // The number of entries to return on each page.
    @NameInMap("Size")
    public Long size;

    public static ListNotificationPoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListNotificationPoliciesRequest self = new ListNotificationPoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListNotificationPoliciesRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
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

    public ListNotificationPoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListNotificationPoliciesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
