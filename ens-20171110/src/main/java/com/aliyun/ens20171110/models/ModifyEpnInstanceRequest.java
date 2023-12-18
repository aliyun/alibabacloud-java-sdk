// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEpnInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the EPN instance.</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    /**
     * <p>The name of the EPN instance.</p>
     */
    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 1 Mbit/s to 100 Mbit/s.</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The networking mode. Valid values:</p>
     * <br>
     * <p>*   **SpeedUp**: Intelligent acceleration network (Internet).</p>
     * <p>*   **Connection**: Internal network.</p>
     * <p>*   **SpeedUpAndConnection**: Intelligent acceleration network and internal network.</p>
     * <br>
     * <p>>  The internal network supports only **Connection** and **SpeedUpAndConnection**.</p>
     */
    @NameInMap("NetworkingModel")
    public String networkingModel;

    public static ModifyEpnInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyEpnInstanceRequest self = new ModifyEpnInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ModifyEpnInstanceRequest setEPNInstanceId(String EPNInstanceId) {
        this.EPNInstanceId = EPNInstanceId;
        return this;
    }
    public String getEPNInstanceId() {
        return this.EPNInstanceId;
    }

    public ModifyEpnInstanceRequest setEPNInstanceName(String EPNInstanceName) {
        this.EPNInstanceName = EPNInstanceName;
        return this;
    }
    public String getEPNInstanceName() {
        return this.EPNInstanceName;
    }

    public ModifyEpnInstanceRequest setInternetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
        this.internetMaxBandwidthOut = internetMaxBandwidthOut;
        return this;
    }
    public Integer getInternetMaxBandwidthOut() {
        return this.internetMaxBandwidthOut;
    }

    public ModifyEpnInstanceRequest setNetworkingModel(String networkingModel) {
        this.networkingModel = networkingModel;
        return this;
    }
    public String getNetworkingModel() {
        return this.networkingModel;
    }

}
