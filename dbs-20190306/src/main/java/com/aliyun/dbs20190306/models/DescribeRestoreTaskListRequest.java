// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class DescribeRestoreTaskListRequest extends TeaModel {
    /**
     * <p>The ID of the backup plan.</p>
     * <blockquote>
     * <p>You must specify either this parameter or <code>RestoreTaskId</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>dbs1hvb0wwwXXXXX</p>
     */
    @NameInMap("BackupPlanId")
    public String backupPlanId;

    /**
     * <p>A client-generated token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The end of the time range to query restore tasks. Specify the time in the UNIX timestamp format. The timestamp is a millisecond-level timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1570701361528</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("OwnerId")
    public String ownerId;

    /**
     * <p>The page number. The value must be an integer that is greater than or equal to 0. Default value: 0.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Valid values: 1 to 100.</p>
     * <blockquote>
     * <p>The default value is 30.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the restore task. You can specify multiple IDs, separated by commas. You can call the <a href="https://help.aliyun.com/document_detail/2869836.html">CreateRestoreTask</a> operation to obtain the restore task ID.</p>
     * <blockquote>
     * <p>You must specify either this parameter or <code>BackupPlanId</code>. Specifying both parameters returns an error.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>s102h7rf5anq</p>
     */
    @NameInMap("RestoreTaskId")
    public String restoreTaskId;

    /**
     * <p>The beginning of the time range to query restore tasks. Specify the time in the UNIX timestamp format. The timestamp is a millisecond-level timestamp.</p>
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
