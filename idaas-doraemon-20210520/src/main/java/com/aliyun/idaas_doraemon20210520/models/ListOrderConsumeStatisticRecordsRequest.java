// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idaas_doraemon20210520.models;

import com.aliyun.tea.*;

public class ListOrderConsumeStatisticRecordsRequest extends TeaModel {
    @NameInMap("AliOrderCode")
    public String aliOrderCode;

    @NameInMap("ApplicationExternalId")
    public String applicationExternalId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ServiceCode")
    public String serviceCode;

    @NameInMap("StatisticTimeMax")
    public String statisticTimeMax;

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

    public ListOrderConsumeStatisticRecordsRequest setApplicationExternalId(String applicationExternalId) {
        this.applicationExternalId = applicationExternalId;
        return this;
    }
    public String getApplicationExternalId() {
        return this.applicationExternalId;
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

    public ListOrderConsumeStatisticRecordsRequest setServiceCode(String serviceCode) {
        this.serviceCode = serviceCode;
        return this;
    }
    public String getServiceCode() {
        return this.serviceCode;
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
