// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class GenerateUpgradeRecordRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("BatchStrategyList")
    public String batchStrategyList;

    public static GenerateUpgradeRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        GenerateUpgradeRecordRequest self = new GenerateUpgradeRecordRequest();
        return TeaModel.build(map, self);
    }

    public GenerateUpgradeRecordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GenerateUpgradeRecordRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GenerateUpgradeRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GenerateUpgradeRecordRequest setBatchStrategyList(String batchStrategyList) {
        this.batchStrategyList = batchStrategyList;
        return this;
    }
    public String getBatchStrategyList() {
        return this.batchStrategyList;
    }

}
