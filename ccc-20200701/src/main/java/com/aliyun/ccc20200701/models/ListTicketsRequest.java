// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListTicketsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>assignee@cccV2-kmz</p>
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
     * <p>43c2671b-****-4223-86d0-6bd187905cc8</p>
     */
    @NameInMap("CategoryId")
    public String categoryId;

    /**
     * <strong>example:</strong>
     * <p>creator@cccV2-kmz</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>51e155ce-3747-*****-b402-13c69597b920</p>
     */
    @NameInMap("CustomerId")
    public String customerId;

    /**
     * <strong>example:</strong>
     * <p>1646928000000</p>
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
     * <p>[&quot;job-12******&quot;,&quot;job-23****&quot;]</p>
     */
    @NameInMap("JobIdList")
    public String jobIdList;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>participant@cccV2-kmz</p>
     */
    @NameInMap("Participant")
    public String participant;

    /**
     * <strong>example:</strong>
     * <p>1646841600000</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>Processing</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <strong>example:</strong>
     * <p>5491d3b4-14ee-4341-b5f1-db2c78beddeb</p>
     */
    @NameInMap("TicketId")
    public String ticketId;

    @NameInMap("Title")
    public String title;

    public static ListTicketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsRequest self = new ListTicketsRequest();
        return TeaModel.build(map, self);
    }

    public ListTicketsRequest setAssignee(String assignee) {
        this.assignee = assignee;
        return this;
    }
    public String getAssignee() {
        return this.assignee;
    }

    public ListTicketsRequest setAssigneeType(String assigneeType) {
        this.assigneeType = assigneeType;
        return this;
    }
    public String getAssigneeType() {
        return this.assigneeType;
    }

    public ListTicketsRequest setCategoryId(String categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public String getCategoryId() {
        return this.categoryId;
    }

    public ListTicketsRequest setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ListTicketsRequest setCustomerId(String customerId) {
        this.customerId = customerId;
        return this;
    }
    public String getCustomerId() {
        return this.customerId;
    }

    public ListTicketsRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListTicketsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListTicketsRequest setJobIdList(String jobIdList) {
        this.jobIdList = jobIdList;
        return this;
    }
    public String getJobIdList() {
        return this.jobIdList;
    }

    public ListTicketsRequest setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public ListTicketsRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListTicketsRequest setParticipant(String participant) {
        this.participant = participant;
        return this;
    }
    public String getParticipant() {
        return this.participant;
    }

    public ListTicketsRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListTicketsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public ListTicketsRequest setTicketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }
    public String getTicketId() {
        return this.ticketId;
    }

    public ListTicketsRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
