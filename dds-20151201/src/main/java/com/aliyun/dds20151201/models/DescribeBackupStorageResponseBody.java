// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DescribeBackupStorageResponseBody extends TeaModel {
    @NameInMap("FreeSize")
    public Long freeSize;

    @NameInMap("FullStorageSize")
    public Long fullStorageSize;

    @NameInMap("LogStorageSize")
    public Long logStorageSize;

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
