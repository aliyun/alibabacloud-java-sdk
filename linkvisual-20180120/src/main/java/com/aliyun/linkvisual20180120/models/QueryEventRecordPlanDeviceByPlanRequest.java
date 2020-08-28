// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryEventRecordPlanDeviceByPlanRequest extends TeaModel {
    @NameInMap("PlanId")
    @Validation(required = true)
    public String planId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static QueryEventRecordPlanDeviceByPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryEventRecordPlanDeviceByPlanRequest self = new QueryEventRecordPlanDeviceByPlanRequest();
        return TeaModel.build(map, self);
    }

    public QueryEventRecordPlanDeviceByPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

    public QueryEventRecordPlanDeviceByPlanRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryEventRecordPlanDeviceByPlanRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
