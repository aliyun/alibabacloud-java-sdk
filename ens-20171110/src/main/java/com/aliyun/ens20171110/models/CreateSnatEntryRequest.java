// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateSnatEntryRequest extends TeaModel {
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    @NameInMap("SnatEntryName")
    public String snatEntryName;

    @NameInMap("SnatIp")
    public String snatIp;

    @NameInMap("SourceCIDR")
    public String sourceCIDR;

    @NameInMap("SourceNetworkId")
    public String sourceNetworkId;

    @NameInMap("SourceVSwitchId")
    public String sourceVSwitchId;

    @NameInMap("StandbySnatIp")
    public String standbySnatIp;

    public static CreateSnatEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSnatEntryRequest self = new CreateSnatEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateSnatEntryRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public CreateSnatEntryRequest setSnatEntryName(String snatEntryName) {
        this.snatEntryName = snatEntryName;
        return this;
    }
    public String getSnatEntryName() {
        return this.snatEntryName;
    }

    public CreateSnatEntryRequest setSnatIp(String snatIp) {
        this.snatIp = snatIp;
        return this;
    }
    public String getSnatIp() {
        return this.snatIp;
    }

    public CreateSnatEntryRequest setSourceCIDR(String sourceCIDR) {
        this.sourceCIDR = sourceCIDR;
        return this;
    }
    public String getSourceCIDR() {
        return this.sourceCIDR;
    }

    public CreateSnatEntryRequest setSourceNetworkId(String sourceNetworkId) {
        this.sourceNetworkId = sourceNetworkId;
        return this;
    }
    public String getSourceNetworkId() {
        return this.sourceNetworkId;
    }

    public CreateSnatEntryRequest setSourceVSwitchId(String sourceVSwitchId) {
        this.sourceVSwitchId = sourceVSwitchId;
        return this;
    }
    public String getSourceVSwitchId() {
        return this.sourceVSwitchId;
    }

    public CreateSnatEntryRequest setStandbySnatIp(String standbySnatIp) {
        this.standbySnatIp = standbySnatIp;
        return this;
    }
    public String getStandbySnatIp() {
        return this.standbySnatIp;
    }

}
