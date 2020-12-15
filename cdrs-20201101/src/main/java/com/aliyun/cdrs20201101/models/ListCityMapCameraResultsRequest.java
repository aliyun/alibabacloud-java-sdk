// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListCityMapCameraResultsRequest extends TeaModel {
    @NameInMap("DataSourceIdList")
    @Validation(required = true)
    public java.util.Map<String, ?> dataSourceIdList;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static ListCityMapCameraResultsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCityMapCameraResultsRequest self = new ListCityMapCameraResultsRequest();
        return TeaModel.build(map, self);
    }

    public ListCityMapCameraResultsRequest setDataSourceIdList(java.util.Map<String, ?> dataSourceIdList) {
        this.dataSourceIdList = dataSourceIdList;
        return this;
    }
    public java.util.Map<String, ?> getDataSourceIdList() {
        return this.dataSourceIdList;
    }

    public ListCityMapCameraResultsRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public ListCityMapCameraResultsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
