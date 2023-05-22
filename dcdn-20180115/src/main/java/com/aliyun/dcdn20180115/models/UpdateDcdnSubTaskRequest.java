// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class UpdateDcdnSubTaskRequest extends TeaModel {
    /**
     * <p>The domain names that you want to include in the operations report. If you do not specify a domain name, all domain names that belong to your Alibaba Cloud account are included.</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The operation that you want to perform. Set the value to **UpdateDcdnSubTask**.</p>
     */
    @NameInMap("ReportIds")
    public String reportIds;

    @NameInMap("StartTime")
    public String startTime;

    public static UpdateDcdnSubTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDcdnSubTaskRequest self = new UpdateDcdnSubTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDcdnSubTaskRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateDcdnSubTaskRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public UpdateDcdnSubTaskRequest setReportIds(String reportIds) {
        this.reportIds = reportIds;
        return this;
    }
    public String getReportIds() {
        return this.reportIds;
    }

    public UpdateDcdnSubTaskRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
