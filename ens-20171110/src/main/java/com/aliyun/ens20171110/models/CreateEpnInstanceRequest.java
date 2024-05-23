// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateEpnInstanceRequest extends TeaModel {
    /**
     * <p>The name of the EPN instance.</p>
     */
    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    /**
     * <p>The type of the EPN instance. Set the value to **EdgeToEdge**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EPNInstanceType")
    public String EPNInstanceType;

    /**
     * <p>The billing method for network usage. Valid values:</p>
     * <br>
     * <p>*   **BandwidthByDay**: Pay by daily peak bandwidth.</p>
     * <p>*   **95BandwidthByMonth**: Pay by monthly 95th percentile bandwidth.</p>
     * <p>*   **PayByBandwidth4thMonth**: Pay by monthly fourth peak bandwidth.</p>
     * <p>*   **PayByBandwidth**: Pay by fixed bandwidth.</p>
     * <br>
     * <p>You can specify only one metering method for network usage and cannot overwrite the existing metering method.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternetChargeType")
    public String internetChargeType;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 1 to 100.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The networking mode. Valid values:</p>
     * <br>
     * <p>*   **SpeedUp**: intelligent acceleration network (Internet)</p>
     * <p>*   **Connection**: internal network</p>
     * <p>*   **SpeedUpAndConnection**: intelligent acceleration network and internal network</p>
     * <br>
     * <p>This parameter is required.</p>
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
