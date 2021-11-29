// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReportId")
    public Long reportId;

    public static DescribeCdnReportListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnReportListRequest self = new DescribeCdnReportListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCdnReportListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeCdnReportListRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

}
