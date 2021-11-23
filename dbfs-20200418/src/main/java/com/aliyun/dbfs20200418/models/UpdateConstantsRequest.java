// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class UpdateConstantsRequest extends TeaModel {
    @NameInMap("ConstantsData")
    public String constantsData;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    public static UpdateConstantsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConstantsRequest self = new UpdateConstantsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConstantsRequest setConstantsData(String constantsData) {
        this.constantsData = constantsData;
        return this;
    }
    public String getConstantsData() {
        return this.constantsData;
    }

    public UpdateConstantsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public UpdateConstantsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public UpdateConstantsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
