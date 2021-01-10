// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivision20190308.models;

import com.aliyun.tea.*;

public class GetAlgorithmHistogramsRequest extends TeaModel {
    @NameInMap("AlgorithmCode")
    public String algorithmCode;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("AggregateType")
    public String aggregateType;

    public static GetAlgorithmHistogramsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmHistogramsRequest self = new GetAlgorithmHistogramsRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmHistogramsRequest setAlgorithmCode(String algorithmCode) {
        this.algorithmCode = algorithmCode;
        return this;
    }
    public String getAlgorithmCode() {
        return this.algorithmCode;
    }

    public GetAlgorithmHistogramsRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public GetAlgorithmHistogramsRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public GetAlgorithmHistogramsRequest setAggregateType(String aggregateType) {
        this.aggregateType = aggregateType;
        return this;
    }
    public String getAggregateType() {
        return this.aggregateType;
    }

}
