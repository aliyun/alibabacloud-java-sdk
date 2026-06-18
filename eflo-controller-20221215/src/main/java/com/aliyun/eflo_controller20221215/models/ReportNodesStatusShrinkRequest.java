// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class ReportNodesStatusShrinkRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * 
     * <strong>example:</strong>
     * <p>dwd_mysql_lingwan_faxing_login_di</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The end time of the node issue. The time is in the ISO 8601 format \<code>yyyy-MM-ddTHH:mm:ss+0800\\</code> and includes the time zone.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-07-10T10:17:06</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The category of the issue. This parameter is required when \<code>Reason\\</code> is set to \<code>HardwareError\\</code>. Valid values:<br>
     * ● hardware-cpu-error: CPU failure<br>
     * ● hardware-gpu-error: GPU failure<br>
     * ● hardware-motherboard-error: Motherboard failure<br>
     * ● hardware-mem-error: Memory failure<br>
     * ● hardware-power-error: Power supply failure<br>
     * ● hardware-disk-error: Disk failure
     * ● hardware-networkcard-error: Network interface card failure<br>
     * ● hardware-fan-error: Fan failure<br>
     * ● hardware-cable-error: Network cable failure<br>
     * ● others: Other<br><br><br><br><br><br><br><br><br></p>
     * 
     * <strong>example:</strong>
     * <p>hardware-disk-error</p>
     */
    @NameInMap("IssueCategory")
    public String issueCategory;

    /**
     * <p>The list of nodes.</p>
     */
    @NameInMap("Nodes")
    public String nodesShrink;

    /**
     * <p>The impact of the issue on the Lingjun node.
     * Valid values:
     * ● HardwareError: A hardware error occurred.
     * ● SoftwareError: A software error occurred.
     * ● NetworkError: A network error occurred.
     * ● Others: Other issues. If none of the preceding values apply, set this parameter to \<code>Others\\</code> and provide details in the \<code>Description\\</code> parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>SoftwareError</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The start time of the node issue. The time is in the ISO 8601 format \<code>yyyy-MM-ddTHH:mm:ss+0800\\</code> and includes the time zone.</p>
     * 
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
