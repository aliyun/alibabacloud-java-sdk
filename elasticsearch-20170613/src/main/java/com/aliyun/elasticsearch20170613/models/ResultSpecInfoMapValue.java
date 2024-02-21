// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class ResultSpecInfoMapValue extends TeaModel {
    @NameInMap("cpuCount")
    public String cpuCount;

    @NameInMap("memorySize")
    public String memorySize;

    @NameInMap("enable")
    public String enable;

    @NameInMap("spec")
    public String spec;

    @NameInMap("specGroupType")
    public String specGroupType;

    @NameInMap("disk")
    public String disk;

    @NameInMap("diskType")
    public String diskType;

    public static ResultSpecInfoMapValue build(java.util.Map<String, ?> map) throws Exception {
        ResultSpecInfoMapValue self = new ResultSpecInfoMapValue();
        return TeaModel.build(map, self);
    }

    public ResultSpecInfoMapValue setCpuCount(String cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public String getCpuCount() {
        return this.cpuCount;
    }

    public ResultSpecInfoMapValue setMemorySize(String memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public String getMemorySize() {
        return this.memorySize;
    }

    public ResultSpecInfoMapValue setEnable(String enable) {
        this.enable = enable;
        return this;
    }
    public String getEnable() {
        return this.enable;
    }

    public ResultSpecInfoMapValue setSpec(String spec) {
        this.spec = spec;
        return this;
    }
    public String getSpec() {
        return this.spec;
    }

    public ResultSpecInfoMapValue setSpecGroupType(String specGroupType) {
        this.specGroupType = specGroupType;
        return this;
    }
    public String getSpecGroupType() {
        return this.specGroupType;
    }

    public ResultSpecInfoMapValue setDisk(String disk) {
        this.disk = disk;
        return this;
    }
    public String getDisk() {
        return this.disk;
    }

    public ResultSpecInfoMapValue setDiskType(String diskType) {
        this.diskType = diskType;
        return this;
    }
    public String getDiskType() {
        return this.diskType;
    }

}
