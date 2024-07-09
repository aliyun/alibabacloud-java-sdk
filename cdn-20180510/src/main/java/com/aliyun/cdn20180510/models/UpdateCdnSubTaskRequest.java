// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class UpdateCdnSubTaskRequest extends TeaModel {
    /**
     * <p>The domain name that you want to track. You can specify up to 500 domain names in each request. If you specify multiple domain names, separate them with commas (,). If you do not specify a domain name, operations reports are updated for all domain names in your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The end time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-11-17T00:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The IDs of operations reports that you want to update. Separate IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>1,2,3</p>
     */
    @NameInMap("ReportIds")
    public String reportIds;

    /**
     * <p>The start time of the operations report. Specify the time in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-17T00:00:00Z</p>
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
