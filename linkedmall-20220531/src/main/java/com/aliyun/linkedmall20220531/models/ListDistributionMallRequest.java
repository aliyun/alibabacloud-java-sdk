// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionMallRequest extends TeaModel {
    @NameInMap("ChannelSupplierId")
    public String channelSupplierId;

    @NameInMap("DistributionMallId")
    public String distributionMallId;

    @NameInMap("DistributionMallName")
    public String distributionMallName;

    @NameInMap("DistributorId")
    public String distributorId;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListDistributionMallRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDistributionMallRequest self = new ListDistributionMallRequest();
        return TeaModel.build(map, self);
    }

    public ListDistributionMallRequest setChannelSupplierId(String channelSupplierId) {
        this.channelSupplierId = channelSupplierId;
        return this;
    }
    public String getChannelSupplierId() {
        return this.channelSupplierId;
    }

    public ListDistributionMallRequest setDistributionMallId(String distributionMallId) {
        this.distributionMallId = distributionMallId;
        return this;
    }
    public String getDistributionMallId() {
        return this.distributionMallId;
    }

    public ListDistributionMallRequest setDistributionMallName(String distributionMallName) {
        this.distributionMallName = distributionMallName;
        return this;
    }
    public String getDistributionMallName() {
        return this.distributionMallName;
    }

    public ListDistributionMallRequest setDistributorId(String distributorId) {
        this.distributorId = distributorId;
        return this;
    }
    public String getDistributorId() {
        return this.distributorId;
    }

    public ListDistributionMallRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public ListDistributionMallRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListDistributionMallRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListDistributionMallRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public ListDistributionMallRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
