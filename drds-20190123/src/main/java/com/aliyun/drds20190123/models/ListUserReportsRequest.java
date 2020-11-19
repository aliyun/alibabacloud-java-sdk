// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123.models;

import com.aliyun.tea.*;

public class ListUserReportsRequest extends TeaModel {
    @NameInMap("DrdsInstanceId")
    @Validation(required = true)
    public String drdsInstanceId;

    @NameInMap("ReportId")
    @Validation(required = true)
    public Long reportId;

    public static ListUserReportsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListUserReportsRequest self = new ListUserReportsRequest();
        return TeaModel.build(map, self);
    }

    public ListUserReportsRequest setDrdsInstanceId(String drdsInstanceId) {
        this.drdsInstanceId = drdsInstanceId;
        return this;
    }
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    public ListUserReportsRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
