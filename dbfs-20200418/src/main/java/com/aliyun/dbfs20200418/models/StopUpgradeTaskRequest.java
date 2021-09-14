// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class StopUpgradeTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("BatchStrategyList")
    public String batchStrategyList;

    public static StopUpgradeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        StopUpgradeTaskRequest self = new StopUpgradeTaskRequest();
        return TeaModel.build(map, self);
    }

    public StopUpgradeTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopUpgradeTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public StopUpgradeTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public StopUpgradeTaskRequest setBatchStrategyList(String batchStrategyList) {
        this.batchStrategyList = batchStrategyList;
        return this;
    }
    public String getBatchStrategyList() {
        return this.batchStrategyList;
    }

}
