// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyEpnInstanceRequest extends TeaModel {
    /**
     * <p>The ID of the EPN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>epn-****</p>
     */
    @NameInMap("EPNInstanceId")
    public String EPNInstanceId;

    /**
     * <p>The name of the EPN instance.</p>
     * 
     * <strong>example:</strong>
     * <p>ens_test_epn</p>
     */
    @NameInMap("EPNInstanceName")
    public String EPNInstanceName;

    /**
     * <p>The maximum outbound public bandwidth. Unit: Mbit/s. Valid values: 1 Mbit/s to 100 Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("InternetMaxBandwidthOut")
    public Integer internetMaxBandwidthOut;

    /**
     * <p>The networking mode. Valid values:</p>
     * <ul>
     * <li><strong>SpeedUp</strong>: Intelligent acceleration network (Internet).</li>
     * <li><strong>Connection</strong>: Internal network.</li>
     * <li><strong>SpeedUpAndConnection</strong>: Intelligent acceleration network and internal network.</li>
     * </ul>
     * <blockquote>
     * <p> The internal network supports only <strong>Connection</strong> and <strong>SpeedUpAndConnection</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>SpeedUp</p>
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
