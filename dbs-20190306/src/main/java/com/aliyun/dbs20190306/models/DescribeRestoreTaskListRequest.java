// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreTaskListRequest extends TeaModel {
    /**
     * <p>The ID of the backup schedule.</p>
     * 
     * <strong>example:</strong>
     * <p>dbs1hvb0wwwXXXXX</p>
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
     * <p>1570701361528</p>
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
     * <p>The number of entries to return on each page. Valid values:</p>
     * <ul>
     * <li>30</li>
     * <li>50</li>
     * <li>100</li>
     * </ul>
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
     * <p>The restoration task ID. Separate multiple IDs with commas (,). You can call the <a href="https://help.aliyun.com/document_detail/2869836.html">CreateRestoreTask</a> operation to obtain the ID.</p>
     * <blockquote>
     * <p> Configure the BackupPlanId or RestoreTaskId parameter. If you configure the two parameters, an error is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s102h7rf5anq</p>
     */
    @NameInMap("RestoreTaskId")
    public String restoreTaskId;

    /**
     * <p>The beginning of the time range to query.</p>
     * 
     * <strong>example:</strong>
     * <p>1570701361528</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    public static DescribeRestoreTaskListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreTaskListRequest self = new DescribeRestoreTaskListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreTaskListRequest setBackupPlanId(String backupPlanId) {
        this.backupPlanId = backupPlanId;
        return this;
    }
    public String getBackupPlanId() {
        return this.backupPlanId;
    }

    public DescribeRestoreTaskListRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeRestoreTaskListRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeRestoreTaskListRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

    public DescribeRestoreTaskListRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public DescribeRestoreTaskListRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRestoreTaskListRequest setRestoreTaskId(String restoreTaskId) {
        this.restoreTaskId = restoreTaskId;
        return this;
    }
    public String getRestoreTaskId() {
        return this.restoreTaskId;
    }

    public DescribeRestoreTaskListRequest setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

}
