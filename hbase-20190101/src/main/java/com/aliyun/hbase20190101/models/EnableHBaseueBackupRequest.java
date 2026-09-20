// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EnableHBaseueBackupRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The cold storage size for the backup service. The minimum value is 800 GB.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("ColdStorageSize")
    public Integer coldStorageSize;

    /**
     * <p>The ID of the HBaseue cluster.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld-m5eznlga4k5bcxxxx</p>
     */
    @NameInMap("HbaseueClusterId")
    public String hbaseueClusterId;

    /**
     * <p>The number of backup nodes.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NodeCount")
    public Integer nodeCount;

    public static EnableHBaseueBackupRequest build(java.util.Map<String, ?> map) throws Exception {
        EnableHBaseueBackupRequest self = new EnableHBaseueBackupRequest();
        return TeaModel.build(map, self);
    }

    public EnableHBaseueBackupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public EnableHBaseueBackupRequest setColdStorageSize(Integer coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public Integer getColdStorageSize() {
        return this.coldStorageSize;
    }

    public EnableHBaseueBackupRequest setHbaseueClusterId(String hbaseueClusterId) {
        this.hbaseueClusterId = hbaseueClusterId;
        return this;
    }
    public String getHbaseueClusterId() {
        return this.hbaseueClusterId;
    }

    public EnableHBaseueBackupRequest setNodeCount(Integer nodeCount) {
        this.nodeCount = nodeCount;
        return this;
    }
    public Integer getNodeCount() {
        return this.nodeCount;
    }

}
