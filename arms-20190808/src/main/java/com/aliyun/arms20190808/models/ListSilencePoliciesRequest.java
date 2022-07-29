// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSilencePoliciesRequest extends TeaModel {
    @NameInMap("IsDetail")
    public Boolean isDetail;

    @NameInMap("Name")
    public String name;

    @NameInMap("Page")
    public Long page;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Size")
    public Long size;

    public static ListSilencePoliciesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListSilencePoliciesRequest self = new ListSilencePoliciesRequest();
        return TeaModel.build(map, self);
    }

    public ListSilencePoliciesRequest setIsDetail(Boolean isDetail) {
        this.isDetail = isDetail;
        return this;
    }
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    public ListSilencePoliciesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListSilencePoliciesRequest setPage(Long page) {
        this.page = page;
        return this;
    }
    public Long getPage() {
        return this.page;
    }

    public ListSilencePoliciesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ListSilencePoliciesRequest setSize(Long size) {
        this.size = size;
        return this;
    }
    public Long getSize() {
        return this.size;
    }

}
