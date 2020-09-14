// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mhub20170825.models;

import com.aliyun.tea.*;

public class ListAppsRequest extends TeaModel {
    @NameInMap("ProductId")
    @Validation(required = true)
    public String productId;

    @NameInMap("Page")
    public String page;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("OsType")
    public Integer osType;

    public static ListAppsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAppsRequest self = new ListAppsRequest();
        return TeaModel.build(map, self);
    }

    public ListAppsRequest setProductId(String productId) {
        this.productId = productId;
        return this;
    }
    public String getProductId() {
        return this.productId;
    }

    public ListAppsRequest setPage(String page) {
        this.page = page;
        return this;
    }
    public String getPage() {
        return this.page;
    }

    public ListAppsRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public ListAppsRequest setOsType(Integer osType) {
        this.osType = osType;
        return this;
    }
    public Integer getOsType() {
        return this.osType;
    }

}
