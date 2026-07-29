// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class ScaleInstanceRequest extends TeaModel {
    /**
     * <p>The cold storage space of the instance. Unit: GB.</p>
     * <blockquote>
     * <p>This parameter is ignored for pay-as-you-go instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1000G</p>
     */
    @NameInMap("coldStorageSize")
    public Long coldStorageSize;

    /**
     * <p>The instance specifications. Valid values:</p>
     * <ul>
     * <li><p><code>16</code>: 16 vCPUs and 64 GB of memory (1 compute node)</p>
     * </li>
     * <li><p><code>32</code>: 32 vCPUs and 128 GB of memory (2 compute nodes)</p>
     * </li>
     * <li><p><code>64</code>: 64 vCPUs and 256 GB of memory (4 compute nodes)</p>
     * </li>
     * <li><p><code>96</code>: 96 vCPUs and 384 GB memory (6 compute nodes)</p>
     * </li>
     * <li><p><code>128</code>: 128 vCPUs and 512 GB memory (8 compute nodes)</p>
     * </li>
     * <li><p>and so on.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Specify the number of vCPUs.</p>
     * </li>
     * <li><p>To purchase an instance type with more than 1024 vCPUs, submit a ticket.</p>
     * </li>
     * <li><p>Skip this parameter for shared instances.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("cpu")
    public Long cpu;

    /**
     * <p>Specifies whether to enable Serverless Computing.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("enableServerlessComputing")
    public Boolean enableServerlessComputing;

    /**
     * <p>The number of gateways. Valid values: [2, 50].</p>
     * <blockquote>
     * <p>This parameter applies only to virtual warehouse instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("gatewayCount")
    public Long gatewayCount;

    /**
     * <p>The scaling type.</p>
     * <ul>
     * <li><p>UPGRADE: Upgrades the instance.</p>
     * </li>
     * <li><p>DOWNGRADE: Downgrades the instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p><strong>Upgrade an instance:</strong> New specifications must be equal to or greater than original specifications. Leaving a parameter empty retains its original specification. At least one specification must be increased.</p>
     * </li>
     * <li><p><strong>Downgrade an instance:</strong> New specifications must be equal to or less than original specifications. Leaving a parameter empty retains its original specification. At least one specification must be decreased.</p>
     * </li>
     * </ul>
     * </blockquote>
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
