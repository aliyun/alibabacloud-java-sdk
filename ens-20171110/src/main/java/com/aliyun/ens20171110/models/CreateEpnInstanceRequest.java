// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEpnInstanceRequest extends TeaModel {
    /**
     * <p>The name of the EPN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test EPNInstanceName</p>
     */
    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    /**
     * <p>The type of the EPN instance. Set the value to <strong>EdgeToEdge</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EdgeToEdge</p>
     */
    @NameInMap("EPNInstanceType")
    public String EPNInstanceType;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <ul>
     * <li><strong>BandwidthByDay</strong>: Pay by daily peak bandwidth.</li>
     * <li><strong>95BandwidthByMonth</strong>: Pay by monthly 95th percentile bandwidth.</li>
     * <li><strong>PayByBandwidth4thMonth</strong>: Pay by monthly fourth peak bandwidth.</li>
     * <li><strong>PayByBandwidth</strong>: Pay by fixed bandwidth.</li>
     * </ul>
     * <p>You can specify only one metering method for network usage and cannot overwrite the existing metering method.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BandwidthByDay</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The networking mode. Valid values:</p>
     * <ul>
     * <li><strong>SpeedUp</strong>: intelligent acceleration network (Internet)</li>
     * <li><strong>Connection</strong>: internal network</li>
     * <li><strong>SpeedUpAndConnection</strong>: intelligent acceleration network and internal network</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SpeedUp</p>
     */
    @NameInMap("NetworkingModel")
    public String networkingModel;

    public static CreateEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateEpnInstanceRequest self = new CreateEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateEpnInstanceRequest setEPNInstanceName(String EPNInstanceName) {
        this.EPNInstanceName = EPNInstanceName;
        return this;
    }
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    public CreateEpnInstanceRequest setEPNInstanceType(String EPNInstanceType) {
        this.EPNInstanceType = EPNInstanceType;
        return this;
    }
    public String getEPNInstanceType() {
        return this.EPNInstanceType;
    }

    public CreateEpnInstanceRequest setInternetChargeType(String internetChargeType) {
        this.internetChargeType = internetChargeType;
        return this;
    }
    public String getInternetChargeType() {
        return this.internetChargeType;
    }

    public CreateEpnInstanceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public CreateEpnInstanceRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

}
