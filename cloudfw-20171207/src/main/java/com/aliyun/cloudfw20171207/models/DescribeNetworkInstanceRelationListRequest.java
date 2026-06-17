// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeNetworkInstanceRelationListRequest extends TeaModel {
    /**
     * <p>The connection type.</p>
     * 
     * <strong>example:</strong>
     * <p>cen</p>
     */
    @NameInMap("ConnectType")
    public String connectType;

    /**
     * <p>The configuration status of Cloud Firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>notconfigured</p>
     */
    @NameInMap("FirewallConfigureStatus")
    public String firewallConfigureStatus;

    /**
     * <p>The language of the response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the local network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2vcwkr****</p>
     */
    @NameInMap("NetworkInstanceId")
    public String networkInstanceId;

    /**
     * <p>The ID of the peer network instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-dsf232d****</p>
     */
    @NameInMap("PeerNetworkInstanceId")
    public String peerNetworkInstanceId;

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

    public DescribeNetworkInstanceRelationListRequest setNetworkInstanceId(String networkInstanceId) {
        this.networkInstanceId = networkInstanceId;
        return this;
    }
    public String getNetworkInstanceId() {
        return this.networkInstanceId;
    }

    public DescribeNetworkInstanceRelationListRequest setPeerNetworkInstanceId(String peerNetworkInstanceId) {
        this.peerNetworkInstanceId = peerNetworkInstanceId;
        return this;
    }
    public String getPeerNetworkInstanceId() {
        return this.peerNetworkInstanceId;
    }

}
