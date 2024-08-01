// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupStorageResponseBody extends TeaModel {
    /**
     * <p>The free quota for the storage capacity used for backup. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>42949672960</p>
     */
    @NameInMap("FreeSize")
    public Long freeSize;

    /**
     * <p>The storage capacity used for the full backup. Unit: bytes.</p>
     * <blockquote>
     * <p> Instances that use cloud disks support snapshot backup. The size of the storage used for the current full backup is the size of the snapshot chain.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>789221621</p>
     */
    @NameInMap("FullStorageSize")
    public Long fullStorageSize;

    /**
     * <p>The storage capacity used for the log backup. Unit: bytes.</p>
     * 
     * <strong>example:</strong>
     * <p>7892216</p>
     */
    @NameInMap("LogStorageSize")
    public Long logStorageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D648B367-15B6-1B42-BD4B-4XXXXXXXXX</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBackupStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBackupStorageResponseBody self = new DescribeBackupStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBackupStorageResponseBody setFreeSize(Long freeSize) {
        this.freeSize = freeSize;
        return this;
    }
    public Long getFreeSize() {
        return this.freeSize;
    }

    public DescribeBackupStorageResponseBody setFullStorageSize(Long fullStorageSize) {
        this.fullStorageSize = fullStorageSize;
        return this;
    }
    public Long getFullStorageSize() {
        return this.fullStorageSize;
    }

    public DescribeBackupStorageResponseBody setLogStorageSize(Long logStorageSize) {
        this.logStorageSize = logStorageSize;
        return this;
    }
    public Long getLogStorageSize() {
        return this.logStorageSize;
    }

    public DescribeBackupStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
