// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class UpdateAllowedIpRequest extends TeaModel {
    /**
     * <p>The IP list. It can be a CIDR block, for example: <strong>192.168.0.0/16</strong>.</p>
     * <ul>
     * <li>When <strong>UpdateType</strong> is set to <strong>add</strong>, you can specify multiple items separated by commas (,).</li>
     * <li>When <strong>UpdateType</strong> is set to <strong>delete</strong>, you can specify only one item at a time.</li>
     * <li>Exercise caution when deleting.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0.0.0.0/0</p>
     */
    @NameInMap("AllowedListIp")
    public String allowedListIp;

    /**
     * <p>The type of the whitelist. Valid values:</p>
     * <ul>
     * <li><strong>vpc</strong>: virtual private cloud (VPC).</li>
     * <li><strong>internet</strong>: Internet.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("AllowedListType")
    public String allowedListType;

    /**
     * <p>The description of the whitelist.</p>
     * 
     * <strong>example:</strong>
     * <p>tf-testAccEcsImageConfigBasic3549descriptionChange</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alikafka_pre-cn-0pp1cng20***</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The port range. Valid values:</p>
     * <ul>
     * <li><strong>9092/9092</strong>: virtual private cloud (VPC) - PLAINTEXT protocol.</li>
     * <li><strong>9093/9093</strong>: Internet - SASL_SSL protocol.</li>
     * <li><strong>9094/9094</strong>: virtual private cloud (VPC) - SASL_PLAINTEXT protocol.</li>
     * <li><strong>9095/9095</strong>: virtual private cloud (VPC) - SASL_SSL protocol.</li>
     * </ul>
     * <p>This parameter must correspond to <strong>AllowdedListType</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9092/9092</p>
     */
    @NameInMap("PortRange")
    public String portRange;

    /**
     * <p>The region ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The update type. Valid values:</p>
     * <ul>
     * <li><strong>add</strong>: add.</li>
     * <li><strong>delete</strong>: delete.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>add</p>
     */
    @NameInMap("UpdateType")
    public String updateType;

    public static UpdateAllowedIpRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAllowedIpRequest self = new UpdateAllowedIpRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAllowedIpRequest setAllowedListIp(String allowedListIp) {
        this.allowedListIp = allowedListIp;
        return this;
    }
    public String getAllowedListIp() {
        return this.allowedListIp;
    }

    public UpdateAllowedIpRequest setAllowedListType(String allowedListType) {
        this.allowedListType = allowedListType;
        return this;
    }
    public String getAllowedListType() {
        return this.allowedListType;
    }

    public UpdateAllowedIpRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateAllowedIpRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateAllowedIpRequest setPortRange(String portRange) {
        this.portRange = portRange;
        return this;
    }
    public String getPortRange() {
        return this.portRange;
    }

    public UpdateAllowedIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAllowedIpRequest setUpdateType(String updateType) {
        this.updateType = updateType;
        return this;
    }
    public String getUpdateType() {
        return this.updateType;
    }

}
