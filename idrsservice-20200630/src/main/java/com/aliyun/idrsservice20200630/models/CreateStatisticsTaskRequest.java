// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class CreateStatisticsTaskRequest extends TeaModel {
    @NameInMap("DateFrom")
    public String dateFrom;

    @NameInMap("DateTo")
    public String dateTo;

    @NameInMap("DepartmentId")
    public java.util.List<String> departmentId;

    @NameInMap("ClientToken")
    public String clientToken;

    public static CreateStatisticsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateStatisticsTaskRequest self = new CreateStatisticsTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateStatisticsTaskRequest setDateFrom(String dateFrom) {
        this.dateFrom = dateFrom;
        return this;
    }
    public String getDateFrom() {
        return this.dateFrom;
    }

    public CreateStatisticsTaskRequest setDateTo(String dateTo) {
        this.dateTo = dateTo;
        return this;
    }
    public String getDateTo() {
        return this.dateTo;
    }

    public CreateStatisticsTaskRequest setDepartmentId(java.util.List<String> departmentId) {
        this.departmentId = departmentId;
        return this;
    }
    public java.util.List<String> getDepartmentId() {
        return this.departmentId;
    }

    public CreateStatisticsTaskRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

}
