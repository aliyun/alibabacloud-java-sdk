// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class QueryRecordPlanDeviceByPlanRequest extends TeaModel {
    /**
     * <p>The page number to return. Pages start from page 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries per page. Minimum value: 1. Maximum value: 50. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the recording plan. You can call <a href="https://help.aliyun.com/document_detail/107896.html">QueryRecordPlans</a> to query the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5b60bf0dd55944c19d7817442bc9****</p>
     */
    @NameInMap("PlanId")
    public String planId;

    public static QueryRecordPlanDeviceByPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRecordPlanDeviceByPlanRequest self = new QueryRecordPlanDeviceByPlanRequest();
        return TeaModel.build(map, self);
    }

    public QueryRecordPlanDeviceByPlanRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryRecordPlanDeviceByPlanRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRecordPlanDeviceByPlanRequest setPlanId(String planId) {
        this.planId = planId;
        return this;
    }
    public String getPlanId() {
        return this.planId;
    }

}
