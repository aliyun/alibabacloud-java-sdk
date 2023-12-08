// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoIncrementUsageStatisticRequest extends TeaModel {
    @NameInMap("DbNames")
    public String dbNames;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("RatioFilter")
    public Double ratioFilter;

    @NameInMap("RealTime")
    public Boolean realTime;

    public static GetAutoIncrementUsageStatisticRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAutoIncrementUsageStatisticRequest self = new GetAutoIncrementUsageStatisticRequest();
        return TeaModel.build(map, self);
    }

    public GetAutoIncrementUsageStatisticRequest setDbNames(String dbNames) {
        this.dbNames = dbNames;
        return this;
    }
    public String getDbNames() {
        return this.dbNames;
    }

    public GetAutoIncrementUsageStatisticRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetAutoIncrementUsageStatisticRequest setRatioFilter(Double ratioFilter) {
        this.ratioFilter = ratioFilter;
        return this;
    }
    public Double getRatioFilter() {
        return this.ratioFilter;
    }

    public GetAutoIncrementUsageStatisticRequest setRealTime(Boolean realTime) {
        this.realTime = realTime;
        return this;
    }
    public Boolean getRealTime() {
        return this.realTime;
    }

}
