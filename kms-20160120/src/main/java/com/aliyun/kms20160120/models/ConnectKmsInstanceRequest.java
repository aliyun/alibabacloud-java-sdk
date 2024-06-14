// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ConnectKmsInstanceRequest extends TeaModel {
    /**
     * <p>The provider of the KMS instance. Set the value to Aliyun.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KMProvider")
    public String KMProvider;

    /**
     * <p>The ID of the KMS instance that you want to enable.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    /**
     * <p>The vSwitch in the two zones. The vSwitch must have at least one available IP address.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The ID of the virtual private cloud (VPC) that is associated with the KMS instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The two zones for the KMS instance. Dual-zone deployment improves service availability and disaster recovery capabilities.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ZoneIds")
    public String zoneIds;

    public static ConnectKmsInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        ConnectKmsInstanceRequest self = new ConnectKmsInstanceRequest();
        return TeaModel.build(map, self);
    }

    public ConnectKmsInstanceRequest setKMProvider(String KMProvider) {
        this.KMProvider = KMProvider;
        return this;
    }
    public String getKMProvider() {
        return this.KMProvider;
    }

    public ConnectKmsInstanceRequest setKmsInstanceId(String kmsInstanceId) {
        this.kmsInstanceId = kmsInstanceId;
        return this;
    }
    public String getKmsInstanceId() {
        return this.kmsInstanceId;
    }

    public ConnectKmsInstanceRequest setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public ConnectKmsInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public ConnectKmsInstanceRequest setZoneIds(String zoneIds) {
        this.zoneIds = zoneIds;
        return this;
    }
    public String getZoneIds() {
        return this.zoneIds;
    }

}
