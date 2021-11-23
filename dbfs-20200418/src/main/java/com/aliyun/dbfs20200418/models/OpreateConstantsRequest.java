// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class OpreateConstantsRequest extends TeaModel {
    @NameInMap("ConstantsData")
    public String constantsData;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static OpreateConstantsRequest build(java.util.Map<String, ?> map) throws Exception {
        OpreateConstantsRequest self = new OpreateConstantsRequest();
        return TeaModel.build(map, self);
    }

    public OpreateConstantsRequest setConstantsData(String constantsData) {
        this.constantsData = constantsData;
        return this;
    }
    public String getConstantsData() {
        return this.constantsData;
    }

    public OpreateConstantsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public OpreateConstantsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public OpreateConstantsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
