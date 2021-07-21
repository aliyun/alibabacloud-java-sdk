// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class Disk extends TeaModel {
    // name
    @NameInMap("name")
    public String name;

    // capacity
    @NameInMap("capacity")
    public Integer capacity;

    // remain
    @NameInMap("remain")
    public Integer remain;

    // fsType
    @NameInMap("fsType")
    public String fsType;

    // mountPoint
    @NameInMap("mountPoint")
    public String mountPoint;

    // type
    @NameInMap("type")
    public String type;

    public static Disk build(java.util.Map<String, ?> map) throws Exception {
        Disk self = new Disk();
        return TeaModel.build(map, self);
    }

    public Disk setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Disk setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }
    public Integer getCapacity() {
        return this.capacity;
    }

    public Disk setRemain(Integer remain) {
        this.remain = remain;
        return this;
    }
    public Integer getRemain() {
        return this.remain;
    }

    public Disk setFsType(String fsType) {
        this.fsType = fsType;
        return this;
    }
    public String getFsType() {
        return this.fsType;
    }

    public Disk setMountPoint(String mountPoint) {
        this.mountPoint = mountPoint;
        return this;
    }
    public String getMountPoint() {
        return this.mountPoint;
    }

    public Disk setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
