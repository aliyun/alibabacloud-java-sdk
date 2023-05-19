// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnSubTaskRequest extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The domain names that you want to track. You can specify multiple domain names and separate them with commas (,). You can specify at most 500 domain names in each call.</p>
     * <br>
     * <p>If you do not specify a domain name, the task collects data from all domain names that belong to your Alibaba Cloud account.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The IDs of operations reports that you want to update. Separate IDs with commas (,).</p>
     */
    @NameInMap("ReportIds")
    public String reportIds;

    /**
     * <p>The operation that you want to perform. Set the value to **UpdateCdnSubTask**.</p>
     */
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
