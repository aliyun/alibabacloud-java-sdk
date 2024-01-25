// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetIndexDialysisListLineRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Long beginTime;

    @NameInMap("CloudResourceId")
    public String cloudResourceId;

    @NameInMap("CloudTypeName")
    public String cloudTypeName;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("IndexCode")
    public String indexCode;

    @NameInMap("MetricExtend")
    public String metricExtend;

    @NameInMap("OperaUid")
    public String operaUid;

    public static GetIndexDialysisListLineRequest build(java.util.Map<String, ?> map) throws Exception {
        GetIndexDialysisListLineRequest self = new GetIndexDialysisListLineRequest();
        return TeaModel.build(map, self);
    }

    public GetIndexDialysisListLineRequest setBeginTime(Long beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Long getBeginTime() {
        return this.beginTime;
    }

    public GetIndexDialysisListLineRequest setCloudResourceId(String cloudResourceId) {
        this.cloudResourceId = cloudResourceId;
        return this;
    }
    public String getCloudResourceId() {
        return this.cloudResourceId;
    }

    public GetIndexDialysisListLineRequest setCloudTypeName(String cloudTypeName) {
        this.cloudTypeName = cloudTypeName;
        return this;
    }
    public String getCloudTypeName() {
        return this.cloudTypeName;
    }

    public GetIndexDialysisListLineRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetIndexDialysisListLineRequest setIndexCode(String indexCode) {
        this.indexCode = indexCode;
        return this;
    }
    public String getIndexCode() {
        return this.indexCode;
    }

    public GetIndexDialysisListLineRequest setMetricExtend(String metricExtend) {
        this.metricExtend = metricExtend;
        return this;
    }
    public String getMetricExtend() {
        return this.metricExtend;
    }

    public GetIndexDialysisListLineRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

}
