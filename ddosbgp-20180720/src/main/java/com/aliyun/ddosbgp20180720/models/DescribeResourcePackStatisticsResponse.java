// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeResourcePackStatisticsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("AvailablePackNum")
    @Validation(required = true)
    public Integer availablePackNum;

    @NameInMap("TotalCurrCapacity")
    @Validation(required = true)
    public Long totalCurrCapacity;

    @NameInMap("TotalUsedCapacity")
    @Validation(required = true)
    public Long totalUsedCapacity;

    @NameInMap("TotalInitCapacity")
    @Validation(required = true)
    public Long totalInitCapacity;

    public static DescribeResourcePackStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackStatisticsResponse self = new DescribeResourcePackStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackStatisticsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackStatisticsResponse setAvailablePackNum(Integer availablePackNum) {
        this.availablePackNum = availablePackNum;
        return this;
    }
    public Integer getAvailablePackNum() {
        return this.availablePackNum;
    }

    public DescribeResourcePackStatisticsResponse setTotalCurrCapacity(Long totalCurrCapacity) {
        this.totalCurrCapacity = totalCurrCapacity;
        return this;
    }
    public Long getTotalCurrCapacity() {
        return this.totalCurrCapacity;
    }

    public DescribeResourcePackStatisticsResponse setTotalUsedCapacity(Long totalUsedCapacity) {
        this.totalUsedCapacity = totalUsedCapacity;
        return this;
    }
    public Long getTotalUsedCapacity() {
        return this.totalUsedCapacity;
    }

    public DescribeResourcePackStatisticsResponse setTotalInitCapacity(Long totalInitCapacity) {
        this.totalInitCapacity = totalInitCapacity;
        return this;
    }
    public Long getTotalInitCapacity() {
        return this.totalInitCapacity;
    }

}
