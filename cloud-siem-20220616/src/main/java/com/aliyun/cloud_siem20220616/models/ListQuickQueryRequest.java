// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class ListQuickQueryRequest extends TeaModel {
    @NameInMap("Offset")
    public Integer offset;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static ListQuickQueryRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQuickQueryRequest self = new ListQuickQueryRequest();
        return TeaModel.build(map, self);
    }

    public ListQuickQueryRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListQuickQueryRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListQuickQueryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
