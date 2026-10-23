// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class NodeSpec extends TeaModel {
    /**
     * <p>The disk size of the data node, in GB.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("disk")
    public Integer disk;

    /**
     * <p>Specifies whether to enable cloud disk encryption for the data node. Valid values:</p>
     * <ul>
     * <li>true: Enabled.</li>
     * <li>false: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("diskEncryption")
    public Boolean diskEncryption;

    /**
     * <p>The storage preference.</p>
     * 
     * <strong>example:</strong>
     * <p>high_availability</p>
     */
    @NameInMap("diskPreference")
    public String diskPreference;

    /**
     * <p>The storage type of the data node. Valid values:</p>
     * <ul>
     * <li>cloud_ssd: standard SSD</li>
     * <li>cloud_essd: ESSD</li>
     * <li>cloud_efficiency: ultra disk</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cloud_ssd</p>
     */
    @NameInMap("diskType")
    public String diskType;

    /**
     * <p>The performance level (PL) of the ESSD. This parameter is required when the disk type of the data node is ESSD. Valid values: PL1, PL2, and PL3.</p>
     * 
     * <strong>example:</strong>
     * <p>PL1</p>
     */
    @NameInMap("performanceLevel")
    public String performanceLevel;

    /**
     * <p>The specifications of the data node. For more information, see <a href="https://help.aliyun.com/document_detail/271718.html">Product specifications</a>.</p>
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
