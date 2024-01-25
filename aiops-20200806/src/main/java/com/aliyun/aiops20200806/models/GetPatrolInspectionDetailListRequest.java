// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class GetPatrolInspectionDetailListRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceName")
    public String instanceName;

    @NameInMap("OperaUid")
    public String operaUid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PatrolId")
    public Long patrolId;

    @NameInMap("Status")
    public Integer status;

    public static GetPatrolInspectionDetailListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPatrolInspectionDetailListRequest self = new GetPatrolInspectionDetailListRequest();
        return TeaModel.build(map, self);
    }

    public GetPatrolInspectionDetailListRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetPatrolInspectionDetailListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetPatrolInspectionDetailListRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public GetPatrolInspectionDetailListRequest setOperaUid(String operaUid) {
        this.operaUid = operaUid;
        return this;
    }
    public String getOperaUid() {
        return this.operaUid;
    }

    public GetPatrolInspectionDetailListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetPatrolInspectionDetailListRequest setPatrolId(Long patrolId) {
        this.patrolId = patrolId;
        return this;
    }
    public Long getPatrolId() {
        return this.patrolId;
    }

    public GetPatrolInspectionDetailListRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

}
