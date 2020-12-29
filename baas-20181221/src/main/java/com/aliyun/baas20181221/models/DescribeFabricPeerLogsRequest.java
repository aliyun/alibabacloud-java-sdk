// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricPeerLogsRequest extends TeaModel {
    @NameInMap("OrganizationId")
    public String organizationId;

    @NameInMap("PeerName")
    public String peerName;

    @NameInMap("Lines")
    public String lines;

    public static DescribeFabricPeerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricPeerLogsRequest self = new DescribeFabricPeerLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricPeerLogsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DescribeFabricPeerLogsRequest setPeerName(String peerName) {
        this.peerName = peerName;
        return this;
    }
    public String getPeerName() {
        return this.peerName;
    }

    public DescribeFabricPeerLogsRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

}
