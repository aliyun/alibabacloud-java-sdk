// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetAlgorithmDataRequest extends TeaModel {
    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("StartTime")
    public Long startTime;

    public static GetAlgorithmDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAlgorithmDataRequest self = new GetAlgorithmDataRequest();
        return TeaModel.build(map, self);
    }

    public GetAlgorithmDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetAlgorithmDataRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public GetAlgorithmDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetAlgorithmDataRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
