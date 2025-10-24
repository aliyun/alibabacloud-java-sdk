// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReportNodesStatusRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dwd_mysql_lingwan_faxing_login_di</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>2024-07-10T10:17:06</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>hardware-disk-error</p>
     */
    @NameInMap("IssueCategory")
    public String issueCategory;

    @NameInMap("Nodes")
    public java.util.List<String> nodes;

    /**
     * <strong>example:</strong>
     * <p>SoftwareError</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>2024-09-22T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ReportNodesStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportNodesStatusRequest self = new ReportNodesStatusRequest();
        return TeaModel.build(map, self);
    }

    public ReportNodesStatusRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ReportNodesStatusRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ReportNodesStatusRequest setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }
    public String getIssueCategory() {
        return this.issueCategory;
    }

    public ReportNodesStatusRequest setNodes(java.util.List<String> nodes) {
        this.nodes = nodes;
        return this;
    }
    public java.util.List<String> getNodes() {
        return this.nodes;
    }

    public ReportNodesStatusRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ReportNodesStatusRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
