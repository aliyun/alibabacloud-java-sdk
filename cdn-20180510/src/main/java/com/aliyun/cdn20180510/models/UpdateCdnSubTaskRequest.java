// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnSubTaskRequest extends TeaModel {
    // The domain names that you want to track. You can specify multiple domain names and separate them with commas (,). You can specify at most 500 domain names in each call.
    // 
    // If you do not specify a domain name, the task collects data from all domain names that belong to your Alibaba Cloud account.
    @NameInMap("DomainName")
    public String domainName;

    // The end time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("OwnerId")
    public Long ownerId;

    // The IDs of operations reports that you want to update. Separate IDs with commas (,).
    @NameInMap("ReportIds")
    public String reportIds;

    // The start time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC+0.
    @NameInMap("StartTime")
    public String startTime;

    public static UpdateCdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCdnSubTaskRequest self = new UpdateCdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCdnSubTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateCdnSubTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateCdnSubTaskRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCdnSubTaskRequest setReportIds(String reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public String getReportIds() {
        return this.reportIds;
    }

    public UpdateCdnSubTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
