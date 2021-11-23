// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class ListConstantsRequest extends TeaModel {
    @NameInMap("ConstantsData")
    public String constantsData;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static ListConstantsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListConstantsRequest self = new ListConstantsRequest();
        return TeaModel.build(map, self);
    }

    public ListConstantsRequest setConstantsData(String constantsData) {
        this.constantsData = constantsData;
        return this;
    }
    public String getConstantsData() {
        return this.constantsData;
    }

    public ListConstantsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListConstantsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListConstantsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
