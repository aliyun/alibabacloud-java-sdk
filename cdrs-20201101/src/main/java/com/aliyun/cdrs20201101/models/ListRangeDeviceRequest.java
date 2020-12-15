// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdrs20201101.models;

import com.aliyun.tea.*;

public class ListRangeDeviceRequest extends TeaModel {
    @NameInMap("Radius")
    @Validation(required = true)
    public Integer radius;

    @NameInMap("DataSourceId")
    @Validation(required = true)
    public String dataSourceId;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("CorpId")
    @Validation(required = true)
    public String corpId;

    public static ListRangeDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRangeDeviceRequest self = new ListRangeDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ListRangeDeviceRequest setRadius(Integer radius) {
        this.radius = radius;
        return this;
    }
    public Integer getRadius() {
        return this.radius;
    }

    public ListRangeDeviceRequest setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
        return this;
    }
    public String getDataSourceId() {
        return this.dataSourceId;
    }

    public ListRangeDeviceRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListRangeDeviceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListRangeDeviceRequest setCorpId(String corpId) {
        this.corpId = corpId;
        return this;
    }
    public String getCorpId() {
        return this.corpId;
    }

}
