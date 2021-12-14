// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class ListAppTemplatesRequest extends TeaModel {
    // 查询页码，参数为空默认查询第1页。
    @NameInMap("PageNumber")
    public String pageNumber;

    // 每页显示个数，参数为空默认显示个数为10。
    @NameInMap("PageSize")
    public String pageSize;

    // 地域
    @NameInMap("RegionId")
    public String regionId;

    public static ListAppTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppTemplatesRequest self = new ListAppTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public ListAppTemplatesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public ListAppTemplatesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAppTemplatesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
