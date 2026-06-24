// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class NodeSpec extends TeaModel {
    /**
     * <p>Storage space size of data nodes, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("disk")
    public Integer disk;

    /**
     * <p>Whether to enable cloud disk encryption for data nodes:</p>
     * <ul>
     * <li>true: Enabled</li>
     * <li>false: Disabled</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("diskEncryption")
    public Boolean diskEncryption;

    /**
     * <p>Storage preference.</p>
     */
    @NameInMap("diskPreference")
    public String diskPreference;

    /**
     * <p>Storage type of data nodes. Supported values:</p>
     * <ul>
     * <li>cloud_ssd: SSD cloud disk</li>
     * <li>cloud_essd: ESSD cloud disk</li>
     * <li>cloud_efficiency: Ultra cloud disk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("diskType")
    public String diskType;

    /**
     * <p>Performance level of ESSD cloud disks. Required when the disk type of data nodes is ESSD cloud disk. Supported values: PL1, PL2, PL3.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("performanceLevel")
    public String performanceLevel;

    /**
     * <p>Data node specification. Specification details can be viewed in <a href="https://help.aliyun.com/document_detail/271718.html">Product Specifications</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>elasticsearch.sn2ne.large</p>
     */
    @NameInMap("spec")
    public String spec;

    public static NodeSpec build(java.util.Map<String, ?> map) throws Exception {
        NodeSpec self = new NodeSpec();
        return TeaModel.build(map, self);
    }

    public NodeSpec setDisk(Integer disk) {
        this.disk = disk;
        return this;
    }
    public Integer getDisk() {
        return this.disk;
    }

    public NodeSpec setDiskEncryption(Boolean diskEncryption) {
        this.diskEncryption = diskEncryption;
        return this;
    }
    public Boolean getDiskEncryption() {
        return this.diskEncryption;
    }

    public NodeSpec setDiskPreference(String diskPreference) {
        this.diskPreference = diskPreference;
        return this;
    }
    public String getDiskPreference() {
        return this.diskPreference;
    }

    public NodeSpec setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

    public NodeSpec setPerformanceLevel(String performanceLevel) {
        this.performanceLevel = performanceLevel;
        return this;
    }
    public String getPerformanceLevel() {
        return this.performanceLevel;
    }

    public NodeSpec setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

}
