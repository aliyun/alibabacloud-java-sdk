// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleInstanceRequest extends TeaModel {
    /**
     * <p>The infrequent access (IA) storage space of the instance. Unit: GB.</p>
     * <br>
     * <p>> Ignore this parameter for pay-as-you-go instances.</p>
     */
    @NameInMap("coldStorageSize")
    public Long coldStorageSize;

    /**
     * <p>The specifications of the instance. Valid values:</p>
     * <br>
     * <p>*   8-core 32GB (number of compute nodes: 1)</p>
     * <p>*   16-core 64GB (number of compute nodes: 1)</p>
     * <p>*   32-core 128GB (number of compute nodes: 2)</p>
     * <p>*   64-core 256GB (number of compute nodes: 4)</p>
     * <p>*   96-core 384GB (number of compute nodes: 6)</p>
     * <p>*   128-core 512GB (number of compute nodes: 8)</p>
     * <p>*   Others</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   Set this parameter to the number of cores.</p>
     * <br>
     * <p>*   If you want to set this parameter to specifications with more than 1,024 compute units (CUs), you must submit a ticket.</p>
     * <br>
     * <p>*   This parameter is invalid for Hologres Shared Cluster instances.</p>
     * <br>
     * <p>*   The specifications of 8-core 32GB (number of compute nodes: 1) are for trial use only and cannot be used for production.</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>The number of gateways. Valid values: 2 to 50.</p>
     * <br>
     * <p>> This parameter is required only for virtual warehouse instances.</p>
     */
    @NameInMap("gatewayCount")
    public Long gatewayCount;

    /**
     * <p>The specification change type. Valid values:</p>
     * <br>
     * <p>*   UPGRADE</p>
     * <p>*   DOWNGRADE</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>*   If you set this parameter to UPGRADE, the new specifications must be higher than the original specifications. You must configure at least one of the cpu, storageSize, and coldStorageSize parameters. If you leave a parameter empty, the related configuration remains unchanged.</p>
     * <br>
     * <p>*   If you set this parameter to DOWNGRADE, the new specifications must be lower than the original specifications. You must configure at least one of the cpu, storageSize, and coldStorageSize parameters. If you leave a parameter empty, the related configuration remains unchanged.</p>
     */
    @NameInMap("scaleType")
    public String scaleType;

    /**
     * <p>The standard storage space of the instance. Unit: GB.</p>
     * <br>
     * <p>> Ignore this parameter for pay-as-you-go instances.</p>
     */
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

    public ScaleInstanceRequest setGatewayCount(Long gatewayCount) {
        this.gatewayCount = gatewayCount;
        return this;
    }
    public Long getGatewayCount() {
        return this.gatewayCount;
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
