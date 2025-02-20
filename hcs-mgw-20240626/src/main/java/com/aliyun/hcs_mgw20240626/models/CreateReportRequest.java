// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class CreateReportRequest extends TeaModel {
    /**
     * <p>The details for creating the migration report.</p>
     */
    @NameInMap("CreateReport")
    public CreateReportInfo createReport;

    public static CreateReportRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateReportRequest self = new CreateReportRequest();
        return TeaModel.build(map, self);
    }

    public CreateReportRequest setCreateReport(CreateReportInfo createReport) {
        this.createReport = createReport;
        return this;
    }
    public CreateReportInfo getCreateReport() {
        return this.createReport;
    }

}
