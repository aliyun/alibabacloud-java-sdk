// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListOrderConsumeStatisticRecordsRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StatisticTimeMax")
    public String statisticTimeMax;

    // 结束创建时间
    @NameInMap("StatisticTimeMin")
    public String statisticTimeMin;

    public static ListOrderConsumeStatisticRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOrderConsumeStatisticRecordsRequest self = new ListOrderConsumeStatisticRecordsRequest();
        return TeaModel.build(map, self);
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
