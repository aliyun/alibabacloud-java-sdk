// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dlfnext20250310.models;

import com.aliyun.tea.*;

public class TableConsumer extends TeaModel {
    /**
     * <p>Consumer ID</p>
     * 
     * <strong>example:</strong>
     * <p>paimon-table1-id</p>
     */
    @NameInMap("consumerId")
    public String consumerId;

    /**
     * <p>The last modified time of the consumer file in Unix milliseconds.</p>
     * 
     * <strong>example:</strong>
     * <p>1791792221185</p>
     */
    @NameInMap("lastModifiedTime")
    public Long lastModifiedTime;

    /**
     * <p>The ID of the next snapshot to be consumed.</p>
     * 
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("nextSnapshot")
    public Long nextSnapshot;

    public static TableConsumer build(java.util.Map<String, ?> map) throws Exception {
        TableConsumer self = new TableConsumer();
        return TeaModel.build(map, self);
    }

    public TableConsumer setConsumerId(String consumerId) {
        this.consumerId = consumerId;
        return this;
    }
    public String getConsumerId() {
        return this.consumerId;
    }

    public TableConsumer setLastModifiedTime(Long lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public Long getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public TableConsumer setNextSnapshot(Long nextSnapshot) {
        this.nextSnapshot = nextSnapshot;
        return this;
    }
    public Long getNextSnapshot() {
        return this.nextSnapshot;
    }

}
