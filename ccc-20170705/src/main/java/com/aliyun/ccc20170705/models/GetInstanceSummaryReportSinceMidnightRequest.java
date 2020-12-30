// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class GetInstanceSummaryReportSinceMidnightRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static GetInstanceSummaryReportSinceMidnightRequest build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceSummaryReportSinceMidnightRequest self = new GetInstanceSummaryReportSinceMidnightRequest();
        return TeaModel.build(map, self);
    }

    public GetInstanceSummaryReportSinceMidnightRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetInstanceSummaryReportSinceMidnightRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetInstanceSummaryReportSinceMidnightRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
