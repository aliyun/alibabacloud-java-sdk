// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20220616.models;

import com.aliyun.tea.*;

public class DescribeAlertsWithEntityRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("EntityId")
    public Long entityId;

    @NameInMap("IncidentUuid")
    public String incidentUuid;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SophonTaskId")
    public String sophonTaskId;

    public static DescribeAlertsWithEntityRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlertsWithEntityRequest self = new DescribeAlertsWithEntityRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAlertsWithEntityRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeAlertsWithEntityRequest setEntityId(Long entityId) {
        this.entityId = entityId;
        return this;
    }
    public Long getEntityId() {
        return this.entityId;
    }

    public DescribeAlertsWithEntityRequest setIncidentUuid(String incidentUuid) {
        this.incidentUuid = incidentUuid;
        return this;
    }
    public String getIncidentUuid() {
        return this.incidentUuid;
    }

    public DescribeAlertsWithEntityRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeAlertsWithEntityRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeAlertsWithEntityRequest setSophonTaskId(String sophonTaskId) {
        this.sophonTaskId = sophonTaskId;
        return this;
    }
    public String getSophonTaskId() {
        return this.sophonTaskId;
    }

}
