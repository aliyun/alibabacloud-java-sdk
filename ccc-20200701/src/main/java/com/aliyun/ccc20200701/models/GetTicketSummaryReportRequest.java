// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTicketSummaryReportRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>assignee@ccc-test</p>
     */
    @NameInMap("Assignee")
    public String assignee;

    /**
     * <strong>example:</strong>
     * <p>Agent</p>
     */
    @NameInMap("AssigneeType")
    public String assigneeType;

    /**
     * <strong>example:</strong>
     * <p>43c2671b-<em><strong>-</strong></em>-86d0-6bd187905cc8</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <strong>example:</strong>
     * <p>creator@ccc-test</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>1719590399999</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>participant@ccc-test</p>
     */
    @NameInMap("Participant")
    public String participant;

    /**
     * <strong>example:</strong>
     * <p>1716998400000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("State")
    public String state;

    public static GetTicketSummaryReportRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTicketSummaryReportRequest self = new GetTicketSummaryReportRequest();
        return TeaModel.build(map, self);
    }

    public GetTicketSummaryReportRequest setAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }
    public String getAssignee() {
        return this.assignee;
    }

    public GetTicketSummaryReportRequest setAssigneeType(String assigneeType) {
        this.assigneeType = assigneeType;
        return this;
    }
    public String getAssigneeType() {
        return this.assigneeType;
    }

    public GetTicketSummaryReportRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public GetTicketSummaryReportRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public GetTicketSummaryReportRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public GetTicketSummaryReportRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetTicketSummaryReportRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetTicketSummaryReportRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetTicketSummaryReportRequest setParticipant(String participant) {
        this.participant = participant;
        return this;
    }
    public String getParticipant() {
        return this.participant;
    }

    public GetTicketSummaryReportRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public GetTicketSummaryReportRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
