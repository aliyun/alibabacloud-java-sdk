// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeOSSStorageResponseBody extends TeaModel {
    /**
     * <p>Indicates whether tiered storage of hot data and cold data is supported. Valid values:</p>
     * <br>
     * <p>*   **true**: Tiered storage of hot data and cold data is supported.</p>
     * <p>*   **false**: Tiered storage of hot data and cold data is not supported.</p>
     */
    @NameInMap("ColdStorage")
    public Boolean coldStorage;

    /**
     * <p>The parameters for tiered storage of hot data and cold data.</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of tiered storage of hot data and cold data. Valid values:</p>
     * <br>
     * <p>*   **CREATING**: Tiered storage of hot data and cold data is being enabled.</p>
     * <p>*   **DISABLE**: Tiered storage of hot data and cold data is not enabled.</p>
     * <p>*   **ENABLE**: Tiered storage of hot data and cold data is enabled.</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The space used for tiered storage of hot data and cold data. Unit: GB.</p>
     */
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
