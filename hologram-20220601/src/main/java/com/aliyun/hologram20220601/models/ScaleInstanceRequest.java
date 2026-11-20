// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleInstanceRequest extends TeaModel {
    /**
     * <p>The infrequent access storage space of the instance. Unit: GB.</p>
     * <blockquote>
     * <p>This parameter is ignored for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("coldStorageSize")
    public Long coldStorageSize;

    /**
     * <p>The instance specifications. Valid values:</p>
     * <ul>
     * <li>16 cores, 64 GB (Number of compute nodes: 1)</li>
     * <li>32 cores, 128 GB (Number of compute nodes: 2)</li>
     * <li>64 cores, 256 GB (Number of compute nodes: 4)</li>
     * <li>96 cores, 384 GB (Number of compute nodes: 6)</li>
     * <li>128 cores, 512 GB (Number of compute nodes: 8)</li>
     * <li>More</li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li>Specify only the number of cores.</li>
     * <li>To purchase specifications with more than 1,024 cores, submit a ticket.</li>
     * <li>You do not need to specify the specifications for shared instances.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>Specifies whether to enable serverless computing.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableServerlessComputing")
    public Boolean enableServerlessComputing;

    /**
     * <p>The number of gateways. Valid values: 2 to 50.</p>
     * <blockquote>
     * <p>This parameter is required only for the Warehouse type.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("gatewayCount")
    public Long gatewayCount;

    /**
     * <p>The type of the specification change. Valid values:</p>
     * <ul>
     * <li>UPGRADE: upgrades the specifications.</li>
     * <li>DOWNGRADE: downgrades the specifications.<blockquote>
     * <ul>
     * <li>When you upgrade the specifications, the new specifications cannot be lower than the original specifications. An empty field indicates that the original specifications remain unchanged. At least one specification must be higher than the original specification.</li>
     * <li>When you downgrade the specifications, the new specifications cannot be higher than the original specifications. An empty field indicates that the original specifications remain unchanged. At least one specification must be lower than the original specification.</li>
     * </ul>
     * </blockquote>
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
     * <p>This parameter is ignored for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
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
