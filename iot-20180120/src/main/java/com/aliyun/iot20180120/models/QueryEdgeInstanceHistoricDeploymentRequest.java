// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class QueryEdgeInstanceHistoricDeploymentRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("StartTime")
    public Long startTime;

    public static QueryEdgeInstanceHistoricDeploymentRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEdgeInstanceHistoricDeploymentRequest self = new QueryEdgeInstanceHistoricDeploymentRequest();
        return TeaModel.build(map, self);
    }

    public QueryEdgeInstanceHistoricDeploymentRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryEdgeInstanceHistoricDeploymentRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public QueryEdgeInstanceHistoricDeploymentRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryEdgeInstanceHistoricDeploymentRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public QueryEdgeInstanceHistoricDeploymentRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryEdgeInstanceHistoricDeploymentRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
