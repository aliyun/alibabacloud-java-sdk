// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class WarmNodeConfiguration extends TeaModel {
    /**
     * <p>The number of cold data nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("amount")
    public Long amount;

    /**
     * <p>The storage space size of cold data nodes, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("disk")
    public Long disk;

    /**
     * <p>Specifies whether to enable cloud disk encryption for cold data nodes. Valid values:</p>
     * <ul>
     * <li>true: enabled.</li>
     * <li>false: not enabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("diskEncryption")
    public Boolean diskEncryption;

    /**
     * <p>The storage type of cold data nodes. Only cloud_efficiency (ultra cloud disk) is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>cloud_efficiency</p>
     */
    @NameInMap("diskType")
    public String diskType;

    /**
     * <p>The performance level (PL) of the ESSD cloud disk. This parameter is required when the disk type of cold data nodes is a standard SSD. Valid values: PL1, PL2, and PL3.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("performanceLevel")
    public String performanceLevel;

    /**
     * <p>The node specifications of cold data nodes. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>elasticsearch.sn2ne.large</p>
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
