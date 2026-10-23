// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class SearchNodeConfiguration extends TeaModel {
    /**
     * <p>The number of nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("amount")
    public Integer amount;

    /**
     * <p>The cloud disk size.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("disk")
    public Integer disk;

    /**
     * <p>The cloud disk type.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_essd</p>
     */
    @NameInMap("diskType")
    public String diskType;

    /**
     * <p>The cloud disk performance level (PL).</p>
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

    public static SearchNodeConfiguration build(java.util.Map<String, ?> map) throws Exception {
        SearchNodeConfiguration self = new SearchNodeConfiguration();
        return TeaModel.build(map, self);
    }

    public SearchNodeConfiguration setAmount(Integer amount) {
        this.amount = amount;
        return this;
    }
    public Integer getAmount() {
        return this.amount;
    }

    public SearchNodeConfiguration setDisk(Integer disk) {
        this.disk = disk;
        return this;
    }
    public Integer getDisk() {
        return this.disk;
    }

    public SearchNodeConfiguration setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public SearchNodeConfiguration setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public SearchNodeConfiguration setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
