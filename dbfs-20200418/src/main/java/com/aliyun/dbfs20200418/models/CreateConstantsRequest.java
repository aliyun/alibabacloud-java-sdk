// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateConstantsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ConstantsData")
    public String constantsData;

    public static CreateConstantsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateConstantsRequest self = new CreateConstantsRequest();
        return TeaModel.build(map, self);
    }

    public CreateConstantsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateConstantsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public CreateConstantsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public CreateConstantsRequest setConstantsData(String constantsData) {
        this.constantsData = constantsData;
        return this;
    }
    public String getConstantsData() {
        return this.constantsData;
    }

}
