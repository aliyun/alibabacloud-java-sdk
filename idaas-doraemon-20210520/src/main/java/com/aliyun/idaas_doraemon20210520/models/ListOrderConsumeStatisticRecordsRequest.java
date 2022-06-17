// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListOrderConsumeStatisticRecordsRequest extends TeaModel {
    // 阿里订单编号
    @NameInMap("AliOrderCode")
    public String aliOrderCode;

    // 页码
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // 每页记录数
    @NameInMap("PageSize")
    public Integer pageSize;

    // 统计时间最大值
    @NameInMap("StatisticTimeMax")
    public String statisticTimeMax;

    // 统计时间最小值
    @NameInMap("StatisticTimeMin")
    public String statisticTimeMin;

    public static ListOrderConsumeStatisticRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrderConsumeStatisticRecordsRequest self = new ListOrderConsumeStatisticRecordsRequest();
        return TeaModel.build(map, self);
    }

    public ListOrderConsumeStatisticRecordsRequest setAliOrderCode(String aliOrderCode) {
        this.aliOrderCode = aliOrderCode;
        return this;
    }
    public String getAliOrderCode() {
        return this.aliOrderCode;
    }

    public ListOrderConsumeStatisticRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListOrderConsumeStatisticRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOrderConsumeStatisticRecordsRequest setStatisticTimeMax(String statisticTimeMax) {
        this.statisticTimeMax = statisticTimeMax;
        return this;
    }
    public String getStatisticTimeMax() {
        return this.statisticTimeMax;
    }

    public ListOrderConsumeStatisticRecordsRequest setStatisticTimeMin(String statisticTimeMin) {
        this.statisticTimeMin = statisticTimeMin;
        return this;
    }
    public String getStatisticTimeMin() {
        return this.statisticTimeMin;
    }

}
