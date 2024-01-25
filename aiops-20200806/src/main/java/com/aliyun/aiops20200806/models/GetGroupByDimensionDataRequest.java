// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetGroupByDimensionDataRequest extends TeaModel {
    @NameInMap("End")
    public Long end;

    @NameInMap("Flag")
    public String flag;

    @NameInMap("GroupBy")
    public String groupBy;

    @NameInMap("MetricId")
    public String metricId;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("Start")
    public Long start;

    public static GetGroupByDimensionDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetGroupByDimensionDataRequest self = new GetGroupByDimensionDataRequest();
        return TeaModel.build(map, self);
    }

    public GetGroupByDimensionDataRequest setEnd(Long end) {
        this.end = end;
        return this;
    }
    public Long getEnd() {
        return this.end;
    }

    public GetGroupByDimensionDataRequest setFlag(String flag) {
        this.flag = flag;
        return this;
    }
    public String getFlag() {
        return this.flag;
    }

    public GetGroupByDimensionDataRequest setGroupBy(String groupBy) {
        this.groupBy = groupBy;
        return this;
    }
    public String getGroupBy() {
        return this.groupBy;
    }

    public GetGroupByDimensionDataRequest setMetricId(String metricId) {
        this.metricId = metricId;
        return this;
    }
    public String getMetricId() {
        return this.metricId;
    }

    public GetGroupByDimensionDataRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetGroupByDimensionDataRequest setStart(Long start) {
        this.start = start;
        return this;
    }
    public Long getStart() {
        return this.start;
    }

}
