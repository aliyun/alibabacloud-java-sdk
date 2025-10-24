// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReportNodesStatusShrinkRequest extends TeaModel {
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
    public String nodesShrink;

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

    public static ReportNodesStatusShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ReportNodesStatusShrinkRequest self = new ReportNodesStatusShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ReportNodesStatusShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ReportNodesStatusShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ReportNodesStatusShrinkRequest setIssueCategory(String issueCategory) {
        this.issueCategory = issueCategory;
        return this;
    }
    public String getIssueCategory() {
        return this.issueCategory;
    }

    public ReportNodesStatusShrinkRequest setNodesShrink(String nodesShrink) {
        this.nodesShrink = nodesShrink;
        return this;
    }
    public String getNodesShrink() {
        return this.nodesShrink;
    }

    public ReportNodesStatusShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ReportNodesStatusShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
