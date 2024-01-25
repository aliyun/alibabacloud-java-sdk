// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetEventAbNormalDetailTrendDataRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("Id")
    public String id;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetEventAbNormalDetailTrendDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetEventAbNormalDetailTrendDataRequest self = new GetEventAbNormalDetailTrendDataRequest();
        return TeaModel.build(map, self);
    }

    public GetEventAbNormalDetailTrendDataRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetEventAbNormalDetailTrendDataRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetEventAbNormalDetailTrendDataRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public GetEventAbNormalDetailTrendDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
