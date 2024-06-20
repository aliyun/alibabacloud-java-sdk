// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20181221.models;

import com.aliyun.tea.*;

public class DescribeFabricPeerLogsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("Lines")
    public String lines;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peers-test11-tzwny25vqicq</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>peer1</p>
     */
    @NameInMap("PeerName")
    public String peerName;

    public static DescribeFabricPeerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricPeerLogsRequest self = new DescribeFabricPeerLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricPeerLogsRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
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

}
