// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapCameraResultsShrinkRequest extends TeaModel {
    @NameInMap("DataSourceIdList")
    @Validation(required = true)
    public String dataSourceIdListShrink;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListCityMapCameraResultsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapCameraResultsShrinkRequest self = new ListCityMapCameraResultsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListCityMapCameraResultsShrinkRequest setDataSourceIdListShrink(String dataSourceIdListShrink) {
        this.dataSourceIdListShrink = dataSourceIdListShrink;
        return this;
    }
    public String getDataSourceIdListShrink() {
        return this.dataSourceIdListShrink;
    }

    public ListCityMapCameraResultsShrinkRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListCityMapCameraResultsShrinkRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
