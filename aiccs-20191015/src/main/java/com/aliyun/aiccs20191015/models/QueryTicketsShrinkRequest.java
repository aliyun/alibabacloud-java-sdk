// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class QueryTicketsShrinkRequest extends TeaModel {
    /**
     * <p>Ticket ID.</p>
     * 
     * <strong>example:</strong>
     * <p>223468****</p>
     */
    @NameInMap("CaseId")
    public Long caseId;

    /**
     * <p>Ticket status code.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CaseStatus")
    public Integer caseStatus;

    /**
     * <p>Ticket type code (assigned by the system).</p>
     * 
     * <strong>example:</strong>
     * <p>1223</p>
     */
    @NameInMap("CaseType")
    public Integer caseType;

    /**
     * <p>Channel ID.</p>
     * 
     * <strong>example:</strong>
     * <p>02acfefd3fa14049826ac1a89e1xxxxx</p>
     */
    @NameInMap("ChannelId")
    public String channelId;

    /**
     * <p>Channel Type. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: Not filled in</li>
     * <li><strong>1</strong>: Hotline</li>
     * <li><strong>2</strong>: Online</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChannelType")
    public Integer channelType;

    /**
     * <p>Current page. Default Value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>Assignee ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DealId")
    public Long dealId;

    /**
     * <p>Additional information.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Extra")
    public String extraShrink;

    /**
     * <p>Instance ID.</p>
     * <p>Log on to the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a> and view the instance ID in <strong>Instance Management</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc_xp_pre-cn-***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Page size. Default Value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Template ID.</p>
     * 
     * <strong>example:</strong>
     * <p>29506</p>
     */
    @NameInMap("SrType")
    public Long srType;

    /**
     * <p>Job status.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("TaskStatus")
    public Integer taskStatus;

    /**
     * <p>Touch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>15030609</p>
     */
    @NameInMap("TouchId")
    public Long touchId;

    public static QueryTicketsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTicketsShrinkRequest self = new QueryTicketsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public QueryTicketsShrinkRequest setCaseId(Long caseId) {
        this.caseId = caseId;
        return this;
    }
    public Long getCaseId() {
        return this.caseId;
    }

    public QueryTicketsShrinkRequest setCaseStatus(Integer caseStatus) {
        this.caseStatus = caseStatus;
        return this;
    }
    public Integer getCaseStatus() {
        return this.caseStatus;
    }

    public QueryTicketsShrinkRequest setCaseType(Integer caseType) {
        this.caseType = caseType;
        return this;
    }
    public Integer getCaseType() {
        return this.caseType;
    }

    public QueryTicketsShrinkRequest setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public QueryTicketsShrinkRequest setChannelType(Integer channelType) {
        this.channelType = channelType;
        return this;
    }
    public Integer getChannelType() {
        return this.channelType;
    }

    public QueryTicketsShrinkRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryTicketsShrinkRequest setDealId(Long dealId) {
        this.dealId = dealId;
        return this;
    }
    public Long getDealId() {
        return this.dealId;
    }

    public QueryTicketsShrinkRequest setExtraShrink(String extraShrink) {
        this.extraShrink = extraShrink;
        return this;
    }
    public String getExtraShrink() {
        return this.extraShrink;
    }

    public QueryTicketsShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTicketsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTicketsShrinkRequest setSrType(Long srType) {
        this.srType = srType;
        return this;
    }
    public Long getSrType() {
        return this.srType;
    }

    public QueryTicketsShrinkRequest setTaskStatus(Integer taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }
    public Integer getTaskStatus() {
        return this.taskStatus;
    }

    public QueryTicketsShrinkRequest setTouchId(Long touchId) {
        this.touchId = touchId;
        return this;
    }
    public Long getTouchId() {
        return this.touchId;
    }

}
