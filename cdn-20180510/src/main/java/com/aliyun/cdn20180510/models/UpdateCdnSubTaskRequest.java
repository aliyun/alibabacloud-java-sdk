// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnSubTaskRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("Status")
    public String status;

    @NameInMap("ReportIds")
    public String reportIds;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    public static UpdateCdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnSubTaskRequest self = new UpdateCdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCdnSubTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCdnSubTaskRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateCdnSubTaskRequest setReportIds(String reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public String getReportIds() {
        return this.reportIds;
    }

    public UpdateCdnSubTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateCdnSubTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public UpdateCdnSubTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

}
