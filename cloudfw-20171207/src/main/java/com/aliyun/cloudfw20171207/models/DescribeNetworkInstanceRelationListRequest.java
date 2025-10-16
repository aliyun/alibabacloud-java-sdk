// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkInstanceRelationListRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cen</p>
     */
    @NameInMap("ConnectType")
    public String connectType;

    /**
     * <strong>example:</strong>
     * <p>notconfigured</p>
     */
    @NameInMap("FirewallConfigureStatus")
    public String firewallConfigureStatus;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    public static DescribeNetworkInstanceRelationListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNetworkInstanceRelationListRequest self = new DescribeNetworkInstanceRelationListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNetworkInstanceRelationListRequest setConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }
    public String getConnectType() {
        return this.connectType;
    }

    public DescribeNetworkInstanceRelationListRequest setFirewallConfigureStatus(String firewallConfigureStatus) {
        this.firewallConfigureStatus = firewallConfigureStatus;
        return this;
    }
    public String getFirewallConfigureStatus() {
        return this.firewallConfigureStatus;
    }

    public DescribeNetworkInstanceRelationListRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

}
