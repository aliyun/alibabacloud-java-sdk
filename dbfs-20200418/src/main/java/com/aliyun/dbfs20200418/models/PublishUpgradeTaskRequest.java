// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class PublishUpgradeTaskRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("BatchStrategyList")
    public String batchStrategyList;

    public static PublishUpgradeTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishUpgradeTaskRequest self = new PublishUpgradeTaskRequest();
        return TeaModel.build(map, self);
    }

    public PublishUpgradeTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PublishUpgradeTaskRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public PublishUpgradeTaskRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public PublishUpgradeTaskRequest setBatchStrategyList(String batchStrategyList) {
        this.batchStrategyList = batchStrategyList;
        return this;
    }
    public String getBatchStrategyList() {
        return this.batchStrategyList;
    }

}
