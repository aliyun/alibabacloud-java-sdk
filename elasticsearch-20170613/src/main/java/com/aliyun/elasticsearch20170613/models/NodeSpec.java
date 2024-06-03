// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class NodeSpec extends TeaModel {
    @NameInMap("disk")
    public Integer disk;

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
