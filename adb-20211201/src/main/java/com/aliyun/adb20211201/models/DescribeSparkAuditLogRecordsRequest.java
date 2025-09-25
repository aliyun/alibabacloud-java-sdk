// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DescribeSparkAuditLogRecordsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("ClientIp")
    public String clientIp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>amv-bp1j7******78j8i</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>2025-09-25T01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>[{\&quot;Field\&quot;:\&quot;ExecuteTime\&quot;,\&quot;Type\&quot;:\&quot;Desc\&quot;}]</p>
     */
    @NameInMap("Order")
    public String order;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>999f2439-6b10-xxxx-a5d3-daf3b35c****</p>
     */
    @NameInMap("ProcessId")
    public String processId;

    /**
     * <strong>example:</strong>
     * <p>user</p>
     */
    @NameInMap("ProxyUser")
    public String proxyUser;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>test_job</p>
     */
    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>test_table_name</p>
     */
    @NameInMap("SQLText")
    public String SQLText;

    /**
     * <strong>example:</strong>
     * <p>2025-09-25T00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>Statement ID。</p>
     * 
     * <strong>example:</strong>
     * <p>fbd22066-1c03-xxxx-aa16-6ae28288****</p>
     */
    @NameInMap("StatementId")
    public String statementId;

    /**
     * <strong>example:</strong>
     * <p>SQL_EDITOR</p>
     */
    @NameInMap("StatementSource")
    public String statementSource;

    /**
     * <strong>example:</strong>
     * <p>finish</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>3000</p>
     */
    @NameInMap("TotalTime")
    public String totalTime;

    /**
     * <strong>example:</strong>
     * <p>test_user</p>
     */
    @NameInMap("User")
    public String user;

    public static DescribeSparkAuditLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSparkAuditLogRecordsRequest self = new DescribeSparkAuditLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSparkAuditLogRecordsRequest setClientIp(String clientIp) {
        this.clientIp = clientIp;
        return this;
    }
    public String getClientIp() {
        return this.clientIp;
    }

    public DescribeSparkAuditLogRecordsRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeSparkAuditLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSparkAuditLogRecordsRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeSparkAuditLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSparkAuditLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSparkAuditLogRecordsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeSparkAuditLogRecordsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSparkAuditLogRecordsRequest setProcessId(String processId) {
        this.processId = processId;
        return this;
    }
    public String getProcessId() {
        return this.processId;
    }

    public DescribeSparkAuditLogRecordsRequest setProxyUser(String proxyUser) {
        this.proxyUser = proxyUser;
        return this;
    }
    public String getProxyUser() {
        return this.proxyUser;
    }

    public DescribeSparkAuditLogRecordsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeSparkAuditLogRecordsRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DescribeSparkAuditLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSparkAuditLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSparkAuditLogRecordsRequest setSQLText(String SQLText) {
        this.SQLText = SQLText;
        return this;
    }
    public String getSQLText() {
        return this.SQLText;
    }

    public DescribeSparkAuditLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSparkAuditLogRecordsRequest setStatementId(String statementId) {
        this.statementId = statementId;
        return this;
    }
    public String getStatementId() {
        return this.statementId;
    }

    public DescribeSparkAuditLogRecordsRequest setStatementSource(String statementSource) {
        this.statementSource = statementSource;
        return this;
    }
    public String getStatementSource() {
        return this.statementSource;
    }

    public DescribeSparkAuditLogRecordsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeSparkAuditLogRecordsRequest setTotalTime(String totalTime) {
        this.totalTime = totalTime;
        return this;
    }
    public String getTotalTime() {
        return this.totalTime;
    }

    public DescribeSparkAuditLogRecordsRequest setUser(String user) {
        this.user = user;
        return this;
    }
    public String getUser() {
        return this.user;
    }

}
