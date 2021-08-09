// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class GetUnitTypeAndUnitDefinesRequest extends TeaModel {
    // 业务类型唯一标识
    @NameInMap("UnitType")
    public String unitType;

    // 当前页面，从1开始，最大限制为100
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // 分页大小，最大限制为200
    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetUnitTypeAndUnitDefinesRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUnitTypeAndUnitDefinesRequest self = new GetUnitTypeAndUnitDefinesRequest();
        return TeaModel.build(map, self);
    }

    public GetUnitTypeAndUnitDefinesRequest setUnitType(String unitType) {
        this.unitType = unitType;
        return this;
    }
    public String getUnitType() {
        return this.unitType;
    }

    public GetUnitTypeAndUnitDefinesRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetUnitTypeAndUnitDefinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
