// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeOSSStorageResponseBody extends TeaModel {
    /**
     * <p>Indicates whether tiered storage of hot data and cold data is supported. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Tiered storage of hot data and cold data is supported.</li>
     * <li><strong>false</strong>: Tiered storage of hot data and cold data is not supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ColdStorage")
    public Boolean coldStorage;

    /**
     * <p>The parameters for tiered storage of hot data and cold data.</p>
     * 
     * <strong>example:</strong>
     * <p>[{ &quot;currentValue&quot;:&quot;0.1&quot;, &quot;defaultValue&quot;:&quot;0.1&quot;, &quot;desc&quot;:&quot;Ratio of free disk space. When the ratio exceeds the value of configuration parameter, ClickHouse start to move data to the cold storage&quot;, &quot;name&quot;:&quot;move_factor&quot;, &quot;restart&quot;:true, &quot;valueRange&quot;:&quot;(0, 1]&quot; },{ &quot;currentValue&quot;:&quot;true&quot;, &quot;defaultValue&quot;:&quot;true&quot;, &quot;desc&quot;:&quot;Disables merging of data parts on cold storage&quot;, &quot;name&quot;:&quot;prefer_not_to_merge&quot;, &quot;restart&quot;:true, &quot;valueRange&quot;:&quot;true|false&quot; }]</p>
     */
    @NameInMap("Policy")
    public String policy;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>aadbb456-ebf7-4ed8-9671-fad9f3846ca4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The state of tiered storage of hot data and cold data. Valid values:</p>
     * <ul>
     * <li><strong>CREATING</strong>: Tiered storage of hot data and cold data is being enabled.</li>
     * <li><strong>DISABLE</strong>: Tiered storage of hot data and cold data is not enabled.</li>
     * <li><strong>ENABLE</strong>: Tiered storage of hot data and cold data is enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("State")
    public String state;

    /**
     * <p>The space used for tiered storage of hot data and cold data. Unit: GB.</p>
     * 
     * <strong>example:</strong>
     * <p>0.00</p>
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
