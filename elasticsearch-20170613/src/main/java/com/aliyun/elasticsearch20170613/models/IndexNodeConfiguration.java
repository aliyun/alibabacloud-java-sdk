// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class IndexNodeConfiguration extends TeaModel {
    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("amount")
    public Integer amount;

    /**
     * <p>The disk size.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("disk")
    public Integer disk;

    /**
     * <p>The disk type.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("diskType")
    public String diskType;

    /**
     * <p>The disk performance level (PL) PL0.</p>
     * 
     * <strong>example:</strong>
     * <p>PL0</p>
     */
    @NameInMap("performanceLevel")
    public String performanceLevel;

    /**
     * <p>The node specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>elasticsearch.turbo1.ci.xlarge</p>
     */
    @NameInMap("spec")
    public String spec;

    public static IndexNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        IndexNodeConfiguration self = new IndexNodeConfiguration();
        return TeaModel.build(map, self);
    }

    public IndexNodeConfiguration setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public IndexNodeConfiguration setDisk(Integer disk) {
        this.disk = disk;
        return this;
    }
    public Integer getDisk() {
        return this.disk;
    }

    public IndexNodeConfiguration setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public IndexNodeConfiguration setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public IndexNodeConfiguration setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
