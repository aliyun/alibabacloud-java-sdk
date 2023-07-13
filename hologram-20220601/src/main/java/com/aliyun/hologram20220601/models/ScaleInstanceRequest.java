// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleInstanceRequest extends TeaModel {
    @NameInMap("coldStorageSize")
    public Long coldStorageSize;

    @NameInMap("cpu")
    public Long cpu;

    @NameInMap("scaleType")
    public String scaleType;

    @NameInMap("storageSize")
    public Long storageSize;

    public static ScaleInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ScaleInstanceRequest self = new ScaleInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ScaleInstanceRequest setColdStorageSize(Long coldStorageSize) {
        this.coldStorageSize = coldStorageSize;
        return this;
    }
    public Long getColdStorageSize() {
        return this.coldStorageSize;
    }

    public ScaleInstanceRequest setCpu(Long cpu) {
        this.cpu = cpu;
        return this;
    }
    public Long getCpu() {
        return this.cpu;
    }

    public ScaleInstanceRequest setScaleType(String scaleType) {
        this.scaleType = scaleType;
        return this;
    }
    public String getScaleType() {
        return this.scaleType;
    }

    public ScaleInstanceRequest setStorageSize(Long storageSize) {
        this.storageSize = storageSize;
        return this;
    }
    public Long getStorageSize() {
        return this.storageSize;
    }

}
