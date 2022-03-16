// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20190101.models;

import com.aliyun.tea.*;

public class EnableHBaseueBackupRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("ColdStorageSize")
    public Integer coldStorageSize;

    @NameInMap("HbaseueClusterId")
    public String hbaseueClusterId;

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
