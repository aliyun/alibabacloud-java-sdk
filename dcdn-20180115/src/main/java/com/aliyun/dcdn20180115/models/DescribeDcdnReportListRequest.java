// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnReportListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReportId")
    public Long reportId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Permission")
    public String permission;

    public static DescribeDcdnReportListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnReportListRequest self = new DescribeDcdnReportListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnReportListRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDcdnReportListRequest setReportId(Long reportId) {
        this.reportId = reportId;
        return this;
    }
    public Long getReportId() {
        return this.reportId;
    }

    public DescribeDcdnReportListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeDcdnReportListRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

}
