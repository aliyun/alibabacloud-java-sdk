// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class ConnectKmsInstanceRequest extends TeaModel {
    @NameInMap("KMProvider")
    public String KMProvider;

    @NameInMap("KmsInstanceId")
    public String kmsInstanceId;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    @NameInMap("VpcId")
    public String vpcId;

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
