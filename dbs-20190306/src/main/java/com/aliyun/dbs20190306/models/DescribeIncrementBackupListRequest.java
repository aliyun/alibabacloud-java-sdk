// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeIncrementBackupListRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule. You can call the <a href="https://help.aliyun.com/document_detail/2869825.html">DescribeBackupPlanList</a> operation to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dbsqdss5tmh****</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The end of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1570701361600</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The number of the page to return. The value must be a positive integer. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: 30, 50, and 100.</p>
     * <blockquote>
     * <p>Default value: 30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Specifies whether to return the storage class. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * <blockquote>
     * <p>Default value: true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ShowStorageType")
    public Boolean showStorageType;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1570701361528</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static DescribeIncrementBackupListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIncrementBackupListRequest self = new DescribeIncrementBackupListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIncrementBackupListRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeIncrementBackupListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeIncrementBackupListRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeIncrementBackupListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeIncrementBackupListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeIncrementBackupListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeIncrementBackupListRequest setShowStorageType(Boolean showStorageType) {
        this.showStorageType = showStorageType;
        return this;
    }
    public Boolean getShowStorageType() {
        return this.showStorageType;
    }

    public DescribeIncrementBackupListRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
