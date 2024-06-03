// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class MasterNodeConfiguration extends TeaModel {
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

    public static MasterNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        MasterNodeConfiguration self = new MasterNodeConfiguration();
        return TeaModel.build(map, self);
    }

    public MasterNodeConfiguration setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public MasterNodeConfiguration setDisk(Long disk) {
        this.disk = disk;
        return this;
    }
    public Long getDisk() {
        return this.disk;
    }

    public MasterNodeConfiguration setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public MasterNodeConfiguration setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
