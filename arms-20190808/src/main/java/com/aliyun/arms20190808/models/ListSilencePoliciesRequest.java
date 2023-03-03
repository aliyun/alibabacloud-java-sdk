// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class ListSilencePoliciesRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the details of a silence policy. Valid values:</p>
     * <br>
     * <p>*   `true`: Details of the silence policy are queried.</p>
     * <p>*   `false`: Details of the silence policy are not queried.</p>
     */
    @NameInMap("IsDetail")
    public Boolean isDetail;

    /**
     * <p>The name of the silence policy.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The number of pages to return.</p>
     */
    @NameInMap("Page")
    public Long page;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The number of entries to return on each page.</p>
     */
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
