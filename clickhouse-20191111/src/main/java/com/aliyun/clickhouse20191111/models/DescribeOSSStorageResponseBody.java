// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeOSSStorageResponseBody extends TeaModel {
    @NameInMap("ColdStorage")
    public Boolean coldStorage;

    @NameInMap("Policy")
    public String policy;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("State")
    public String state;

    @NameInMap("StorageUsage")
    public String storageUsage;

    public static DescribeOSSStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOSSStorageResponseBody self = new DescribeOSSStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOSSStorageResponseBody setColdStorage(Boolean coldStorage) {
        this.coldStorage = coldStorage;
        return this;
    }
    public Boolean getColdStorage() {
        return this.coldStorage;
    }

    public DescribeOSSStorageResponseBody setPolicy(String policy) {
        this.policy = policy;
        return this;
    }
    public String getPolicy() {
        return this.policy;
    }

    public DescribeOSSStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOSSStorageResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeOSSStorageResponseBody setStorageUsage(String storageUsage) {
        this.storageUsage = storageUsage;
        return this;
    }
    public String getStorageUsage() {
        return this.storageUsage;
    }

}
