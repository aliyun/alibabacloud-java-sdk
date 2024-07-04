// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AddDeviceInternetPortRequest extends TeaModel {
    /**
     * <p>The Internet service provider (ISP). If you leave this parameter empty, the system automatically allows a random ISP. Valid values:</p>
     * <ul>
     * <li>telecom: China Telecom</li>
     * <li>cmcc: China Mobile</li>
     * <li>unicom: China Unicom</li>
     * <li>cbn: China Broadcasting Network (CBN)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>telecom</p>
     */
    @NameInMap("ISP")
    public String ISP;

    /**
     * <p>The ID of the instance. You can specify the ID of the server or container.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>i-5saiou41t6ude2ia56ri902ke</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The internal IP address of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.50</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>The internal port number. Specify this parameter in the following format: first port/last port. Separate multiple port number groups with commas (,). Example: 1026/2001,2005/2005. This parameter is required if you set NatType to DNAT. If you set NatType to SNAT, the value of this parameter is invalid.</p>
     * 
     * <strong>example:</strong>
     * <p>12022/12022</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>The type of the NAT gateway. The value of this parameter is of the enumerated data type. Valid values:</p>
     * <ul>
     * <li>SNAT</li>
     * <li>DNAT</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DNAT</p>
     */
    @NameInMap("NatType")
    public String natType;

    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-wuxi-5</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static AddDeviceInternetPortRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDeviceInternetPortRequest self = new AddDeviceInternetPortRequest();
        return TeaModel.build(map, self);
    }

    public AddDeviceInternetPortRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public AddDeviceInternetPortRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddDeviceInternetPortRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public AddDeviceInternetPortRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public AddDeviceInternetPortRequest setNatType(String natType) {
        this.natType = natType;
        return this;
    }
    public String getNatType() {
        return this.natType;
    }

    public AddDeviceInternetPortRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
