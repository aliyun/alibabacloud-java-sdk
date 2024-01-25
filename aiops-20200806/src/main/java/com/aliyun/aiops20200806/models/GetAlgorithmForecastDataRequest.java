// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmForecastDataRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public Integer id;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetAlgorithmForecastDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmForecastDataRequest self = new GetAlgorithmForecastDataRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmForecastDataRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public GetAlgorithmForecastDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAlgorithmForecastDataRequest setId(Integer id) {
        this.id = id;
        return this;
    }
    public Integer getId() {
        return this.id;
    }

    public GetAlgorithmForecastDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetAlgorithmForecastDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
