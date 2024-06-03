// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ClientNodeConfiguration extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("amount")
    public Long amount;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("disk")
    public Long disk;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("diskType")
    public String diskType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spec")
    public String spec;

    public static ClientNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        ClientNodeConfiguration self = new ClientNodeConfiguration();
        return TeaModel.build(map, self);
    }

    public ClientNodeConfiguration setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public ClientNodeConfiguration setDisk(Long disk) {
        this.disk = disk;
        return this;
    }
    public Long getDisk() {
        return this.disk;
    }

    public ClientNodeConfiguration setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public ClientNodeConfiguration setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
