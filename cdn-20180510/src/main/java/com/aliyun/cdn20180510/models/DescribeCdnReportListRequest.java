// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportListRequest extends TeaModel {
    /**
     * <p>The ID of the operations report that you want to query. If you do not specify an ID, all operations reports are queried.</p>
     */
    @NameInMap("ReportId")
    public Long reportId;

    public static DescribeCdnReportListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportListRequest self = new DescribeCdnReportListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportListRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
