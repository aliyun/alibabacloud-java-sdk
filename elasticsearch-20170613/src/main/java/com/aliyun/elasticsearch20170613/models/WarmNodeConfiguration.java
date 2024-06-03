// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class WarmNodeConfiguration extends TeaModel {
    @NameInMap("amount")
    public Long amount;

    @NameInMap("disk")
    public Long disk;

    @NameInMap("diskEncryption")
    public Boolean diskEncryption;

    @NameInMap("diskType")
    public String diskType;

    @NameInMap("performanceLevel")
    public String performanceLevel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("spec")
    public String spec;

    public static WarmNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        WarmNodeConfiguration self = new WarmNodeConfiguration();
        return TeaModel.build(map, self);
    }

    public WarmNodeConfiguration setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public WarmNodeConfiguration setDisk(Long disk) {
        this.disk = disk;
        return this;
    }
    public Long getDisk() {
        return this.disk;
    }

    public WarmNodeConfiguration setDiskEncryption(Boolean diskEncryption) {
        this.diskEncryption = diskEncryption;
        return this;
    }
    public Boolean getDiskEncryption() {
        return this.diskEncryption;
    }

    public WarmNodeConfiguration setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public WarmNodeConfiguration setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public WarmNodeConfiguration setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
