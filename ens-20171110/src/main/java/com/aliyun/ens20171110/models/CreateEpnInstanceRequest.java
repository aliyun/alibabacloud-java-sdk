// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEpnInstanceRequest extends TeaModel {
    /**
     * <p>The name of the Edge-to-Edge network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>test EPNInstanceName</p>
     */
    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    /**
     * <p>The type of the Edge-to-Edge communication instance. Valid value: <strong>EdgeToEdge</strong>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EdgeToEdge</p>
     */
    @NameInMap("EPNInstanceType")
    public String EPNInstanceType;

    /**
     * <p>The network billing type. Valid values:</p>
     * <ul>
     * <li><strong>BandwidthByDay</strong>: Daily peak bandwidth.</li>
     * <li><strong>95BandwidthByMonth</strong>: Monthly 95th percentile peak bandwidth.</li>
     * <li><strong>PayByBandwidth4thMonth</strong>: Monthly fourth peak bandwidth.</li>
     * <li><strong>PayByBandwidth</strong>: Bandwidth with defined specifications.</li>
     * </ul>
     * <p>Only one of the Billable methods is supported. If a billing method already exists, the new value is invalid by default, and the existing one prevails.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>BandwidthByDay</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum outbound bandwidth to the Internet. Unit: Mbit/s. Valid values: 1 to 100.</p>
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
     * <li><strong>SpeedUp</strong>: Intelligent acceleration (Internet).</li>
     * <li><strong>Connection</strong>: Internal network connectivity (internal network mode).</li>
     * <li><strong>SpeedUpAndConnection</strong>: Intelligent acceleration and internal network connectivity (internal network mode).</li>
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
