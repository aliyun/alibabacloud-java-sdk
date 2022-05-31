// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20220531.models;

import com.aliyun.tea.*;

public class ListDistributionMallRequest extends TeaModel {
    // 渠道供应商id
    @NameInMap("ChannelSupplierId")
    public String channelSupplierId;

    // 商城名称
    @NameInMap("DistributionMallName")
    public String distributionMallName;

    // 结束时间
    @NameInMap("EndDate")
    public String endDate;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 开始时间
    @NameInMap("StartDate")
    public String startDate;

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

    public ListDistributionMallRequest setDistributionMallName(String distributionMallName) {
        this.distributionMallName = distributionMallName;
        return this;
    }
    public String getDistributionMallName() {
        return this.distributionMallName;
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

}
