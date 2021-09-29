// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class GetNamespaceStatisticsDataRequest extends TeaModel {
    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("Namespace")
    public String namespace;

    @NameInMap("DimensionType")
    public String dimensionType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static GetNamespaceStatisticsDataRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNamespaceStatisticsDataRequest self = new GetNamespaceStatisticsDataRequest();
        return TeaModel.build(map, self);
    }

    public GetNamespaceStatisticsDataRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetNamespaceStatisticsDataRequest setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public GetNamespaceStatisticsDataRequest setDimensionType(String dimensionType) {
        this.dimensionType = dimensionType;
        return this;
    }
    public String getDimensionType() {
        return this.dimensionType;
    }

    public GetNamespaceStatisticsDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetNamespaceStatisticsDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
