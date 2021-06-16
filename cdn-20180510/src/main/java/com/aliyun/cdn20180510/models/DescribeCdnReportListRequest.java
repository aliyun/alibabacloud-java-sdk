// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnReportListRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ReportId")
    public Long reportId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Permission")
    public String permission;

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

    public DescribeCdnReportListRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeCdnReportListRequest setPermission(String permission) {
        this.permission = permission;
        return this;
    }
    public String getPermission() {
        return this.permission;
    }

}
