// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class ListOperationAuditLogsRequest extends TeaModel {
    /**
     * <p>The page number of the current page in paging. The value starts from 1.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The end time of the query. This value is a UNIX timestamp in seconds. The value must be later than StartTime.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1787550343</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The event source type. Valid values:</p>
     * <ul>
     * <li><strong>console</strong>: console call.</li>
     * <li><strong>sdk</strong>: SDK call.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>console</p>
     */
    @NameInMap("EventType")
    public String eventType;

    /**
     * <p>The operation function module. The value is the English code of the function module. If other values are specified, no records are returned. Valid values:</p>
     * <ul>
     * <li><strong>PrivateAccess</strong>: private access.</li>
     * <li><strong>OfficeNetworkAccess</strong>: office network access.</li>
     * <li><strong>AppAcceleration</strong>: application acceleration.</li>
     * <li><strong>InternetAccess</strong>: Internet access.</li>
     * <li><strong>OfficeDataProtection</strong>: office data protection.</li>
     * <li><strong>IdentityAccessManagement</strong>: identity and access management.</li>
     * <li><strong>DeviceManagement</strong>: device management.</li>
     * <li><strong>ApprovalCenter</strong>: approval center.</li>
     * <li><strong>SoftwareManagement</strong>: software management.</li>
     * <li><strong>LogAnalysis</strong>: log analysis.</li>
     * <li><strong>Setting</strong>: settings.</li>
     * <li><strong>DigitalWatermark</strong>: digital watermarking.</li>
     * <li><strong>DynamicDecision</strong>: dynamic decision.</li>
     * <li><strong>InternetBehaviorManagement</strong>: Internet behavior management.</li>
     * <li><strong>AgentOfficeSecurity</strong>: Agent office security.</li>
     * <li><strong>NetworkAccess</strong>: network access.</li>
     * <li><strong>RiskManagement</strong>: risk management.</li>
     * <li><strong>EndpointProtection</strong>: endpoint protection.</li>
     * <li><strong>Overview</strong>: overview page.</li>
     * <li><strong>ITManagement</strong>: IT management.</li>
     * <li><strong>InstanceManagement</strong>: instance management.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OfficeDataProtection</p>
     */
    @NameInMap("OperationFunc")
    public String operationFunc;

    /**
     * <p>The operation status. Valid values:</p>
     * <ul>
     * <li><strong>success</strong>: The operation succeeded. Equivalent values: true, 成功.</li>
     * <li><strong>failure</strong>: The operation failed. Equivalent values: fail, failed, false, 失败.</li>
     * </ul>
     * <p>If this parameter is not specified, only successful operation records are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("OperationStatus")
    public String operationStatus;

    /**
     * <p>The operation type. The value must exactly match the original operation type recorded in the log. The OperationType value in the response is localized based on the request language and may differ from this filter value.</p>
     * 
     * <strong>example:</strong>
     * <p>Sync classification rules</p>
     */
    @NameInMap("OperationType")
    public String operationType;

    /**
     * <p>The Alibaba Cloud account ID (AliUid) of the operator.</p>
     * 
     * <strong>example:</strong>
     * <p>1234****</p>
     */
    @NameInMap("OperatorId")
    public String operatorId;

    /**
     * <p>The number of entries per page. Settings: 1 to 100. Used in paging.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The start time of the query. This value is a UNIX timestamp in seconds. The value must be earlier than EndTime. The interval between StartTime and EndTime cannot exceed 30 days, and StartTime cannot be more than 31 days before the current time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1786945543</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static ListOperationAuditLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListOperationAuditLogsRequest self = new ListOperationAuditLogsRequest();
        return TeaModel.build(map, self);
    }

    public ListOperationAuditLogsRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListOperationAuditLogsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public ListOperationAuditLogsRequest setEventType(String eventType) {
        this.eventType = eventType;
        return this;
    }
    public String getEventType() {
        return this.eventType;
    }

    public ListOperationAuditLogsRequest setOperationFunc(String operationFunc) {
        this.operationFunc = operationFunc;
        return this;
    }
    public String getOperationFunc() {
        return this.operationFunc;
    }

    public ListOperationAuditLogsRequest setOperationStatus(String operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }
    public String getOperationStatus() {
        return this.operationStatus;
    }

    public ListOperationAuditLogsRequest setOperationType(String operationType) {
        this.operationType = operationType;
        return this;
    }
    public String getOperationType() {
        return this.operationType;
    }

    public ListOperationAuditLogsRequest setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public ListOperationAuditLogsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListOperationAuditLogsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
