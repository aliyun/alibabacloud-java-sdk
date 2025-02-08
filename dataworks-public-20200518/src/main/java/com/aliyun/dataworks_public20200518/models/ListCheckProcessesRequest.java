// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListCheckProcessesRequest extends TeaModel {
    /**
     * <p>Extension point event encoding.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>commit-file</p>
     */
    @NameInMap("EventCode")
    public String eventCode;

    /**
     * <p>The message ID in DataWorks OpenEvent. You can obtain the ID from a received message when an extension point event is triggered.</p>
     * 
     * <strong>example:</strong>
     * <p>03400b03-b721-4c34-8727-2****1</p>
     */
    @NameInMap("MessageId")
    public String messageId;

    /**
     * <p>The operator ID.</p>
     * 
     * <strong>example:</strong>
     * <p>123333232</p>
     */
    @NameInMap("Operator")
    public String operator;

    /**
     * <p>The page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the workspace.</p>
     * 
     * <strong>example:</strong>
     * <p>123465</p>
     */
    @NameInMap("ProjectId")
    public Long projectId;

    /**
     * <p>The check status of the extension. Valid values:</p>
     * <ul>
     * <li>CHECKING</li>
     * <li>PASSED</li>
     * <li>BLOCKED</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Status")
    public String status;

    public static ListCheckProcessesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCheckProcessesRequest self = new ListCheckProcessesRequest();
        return TeaModel.build(map, self);
    }

    public ListCheckProcessesRequest setEventCode(String eventCode) {
        this.eventCode = eventCode;
        return this;
    }
    public String getEventCode() {
        return this.eventCode;
    }

    public ListCheckProcessesRequest setMessageId(String messageId) {
        this.messageId = messageId;
        return this;
    }
    public String getMessageId() {
        return this.messageId;
    }

    public ListCheckProcessesRequest setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public ListCheckProcessesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCheckProcessesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCheckProcessesRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ListCheckProcessesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
