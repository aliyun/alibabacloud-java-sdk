// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetTargetDimensionDataRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("Flag")
    public String flag;

    @NameInMap("Label")
    public String label;

    @NameInMap("LabelValue")
    public String labelValue;

    @NameInMap("MetricId")
    public String metricId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("Start")
    public Long start;

    public static GetTargetDimensionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTargetDimensionDataRequest self = new GetTargetDimensionDataRequest();
        return TeaModel.build(map, self);
    }

    public GetTargetDimensionDataRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetTargetDimensionDataRequest setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public GetTargetDimensionDataRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public GetTargetDimensionDataRequest setLabelValue(String labelValue) {
        this.labelValue = labelValue;
        return this;
    }
    public String getLabelValue() {
        return this.labelValue;
    }

    public GetTargetDimensionDataRequest setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }
    public String getMetricId() {
        return this.metricId;
    }

    public GetTargetDimensionDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetTargetDimensionDataRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
