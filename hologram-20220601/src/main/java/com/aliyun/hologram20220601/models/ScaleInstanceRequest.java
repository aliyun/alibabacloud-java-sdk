// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleInstanceRequest extends TeaModel {
    /**
     * <p>The infrequent access (IA) storage space of the instance. Unit: GB.</p>
     * <blockquote>
     * <p>Ignore this parameter for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000G</p>
     */
    @NameInMap("coldStorageSize")
    public Long coldStorageSize;

    /**
     * <p>The specifications of the instance. Valid values:</p>
     * <ul>
     * <li>8-core 32GB (number of compute nodes: 1)</li>
     * <li>16-core 64GB (number of compute nodes: 1)</li>
     * <li>32-core 128GB (number of compute nodes: 2)</li>
     * <li>64-core 256GB (number of compute nodes: 4)</li>
     * <li>96-core 384GB (number of compute nodes: 6)</li>
     * <li>128-core 512GB (number of compute nodes: 8)</li>
     * <li>Others</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>Set this parameter to the number of cores.</p>
     * </li>
     * <li><p>If you want to set this parameter to specifications with more than 1,024 compute units (CUs), you must submit a ticket.</p>
     * </li>
     * <li><p>This parameter is invalid for Hologres Shared Cluster instances.</p>
     * </li>
     * <li><p>The specifications of 8-core 32GB (number of compute nodes: 1) are for trial use only and cannot be used for production.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>是否开启ServerlessComputing</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableServerlessComputing")
    public Boolean enableServerlessComputing;

    /**
     * <p>The number of gateways. Valid values: 2 to 50.</p>
     * <blockquote>
     * <p>This parameter is required only for virtual warehouse instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("gatewayCount")
    public Long gatewayCount;

    /**
     * <p>The specification change type. Valid values:</p>
     * <ul>
     * <li>UPGRADE</li>
     * <li>DOWNGRADE</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If you set this parameter to UPGRADE, the new specifications must be higher than the original specifications. You must configure at least one of the cpu, storageSize, and coldStorageSize parameters. If you leave a parameter empty, the related configuration remains unchanged.</p>
     * </li>
     * <li><p>If you set this parameter to DOWNGRADE, the new specifications must be lower than the original specifications. You must configure at least one of the cpu, storageSize, and coldStorageSize parameters. If you leave a parameter empty, the related configuration remains unchanged.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>UPGRADE</p>
     */
    @NameInMap("scaleType")
    public String scaleType;

    /**
     * <p>The standard storage space of the instance. Unit: GB.</p>
     * <blockquote>
     * <p>Ignore this parameter for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000G</p>
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

    public ScaleInstanceRequest setEnableServerlessComputing(Boolean enableServerlessComputing) {
        this.enableServerlessComputing = enableServerlessComputing;
        return this;
    }
    public Boolean getEnableServerlessComputing() {
        return this.enableServerlessComputing;
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
