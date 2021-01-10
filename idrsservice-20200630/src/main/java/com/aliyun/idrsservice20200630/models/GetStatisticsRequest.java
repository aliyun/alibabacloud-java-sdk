// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class GetStatisticsRequest extends TeaModel {
    @NameInMap("DateFrom")
    public String dateFrom;

    @NameInMap("DateTo")
    public String dateTo;

    @NameInMap("DepartmentId")
    public java.util.List<String> departmentId;

    public static GetStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStatisticsRequest self = new GetStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetStatisticsRequest setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }
    public String getDateFrom() {
        return this.dateFrom;
    }

    public GetStatisticsRequest setDateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }
    public String getDateTo() {
        return this.dateTo;
    }

    public GetStatisticsRequest setDepartmentId(java.util.List<String> departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public java.util.List<String> getDepartmentId() {
        return this.departmentId;
    }

}
