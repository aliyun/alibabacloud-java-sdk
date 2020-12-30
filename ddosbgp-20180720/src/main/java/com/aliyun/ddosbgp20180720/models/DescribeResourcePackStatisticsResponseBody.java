// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddosbgp20180720.models;

import com.aliyun.tea.*;

public class DescribeResourcePackStatisticsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalInitCapacity")
    public Long totalInitCapacity;

    @NameInMap("TotalCurrCapacity")
    public Long totalCurrCapacity;

    @NameInMap("AvailablePackNum")
    public Integer availablePackNum;

    @NameInMap("TotalUsedCapacity")
    public Long totalUsedCapacity;

    public static DescribeResourcePackStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeResourcePackStatisticsResponseBody self = new DescribeResourcePackStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeResourcePackStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeResourcePackStatisticsResponseBody setTotalInitCapacity(Long totalInitCapacity) {
        this.totalInitCapacity = totalInitCapacity;
        return this;
    }
    public Long getTotalInitCapacity() {
        return this.totalInitCapacity;
    }

    public DescribeResourcePackStatisticsResponseBody setTotalCurrCapacity(Long totalCurrCapacity) {
        this.totalCurrCapacity = totalCurrCapacity;
        return this;
    }
    public Long getTotalCurrCapacity() {
        return this.totalCurrCapacity;
    }

    public DescribeResourcePackStatisticsResponseBody setAvailablePackNum(Integer availablePackNum) {
        this.availablePackNum = availablePackNum;
        return this;
    }
    public Integer getAvailablePackNum() {
        return this.availablePackNum;
    }

    public DescribeResourcePackStatisticsResponseBody setTotalUsedCapacity(Long totalUsedCapacity) {
        this.totalUsedCapacity = totalUsedCapacity;
        return this;
    }
    public Long getTotalUsedCapacity() {
        return this.totalUsedCapacity;
    }

}
