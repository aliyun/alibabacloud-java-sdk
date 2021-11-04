// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetRequestDiagnosisPageRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("PageNo")
    public String pageNo;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("StartTime")
    public String startTime;

    public static GetRequestDiagnosisPageRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRequestDiagnosisPageRequest self = new GetRequestDiagnosisPageRequest();
        return TeaModel.build(map, self);
    }

    public GetRequestDiagnosisPageRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetRequestDiagnosisPageRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetRequestDiagnosisPageRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public GetRequestDiagnosisPageRequest setPageNo(String pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public String getPageNo() {
        return this.pageNo;
    }

    public GetRequestDiagnosisPageRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public GetRequestDiagnosisPageRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
