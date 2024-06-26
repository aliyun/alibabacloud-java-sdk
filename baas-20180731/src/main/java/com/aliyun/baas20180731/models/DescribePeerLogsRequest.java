// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribePeerLogsRequest extends TeaModel {
    @NameInMap("Lines")
    public String lines;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrganizationId")
    public String organizationId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PeerName")
    public String peerName;

    public static DescribePeerLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePeerLogsRequest self = new DescribePeerLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribePeerLogsRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

    public DescribePeerLogsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DescribePeerLogsRequest setPeerName(String peerName) {
        this.peerName = peerName;
        return this;
    }
    public String getPeerName() {
        return this.peerName;
    }

}
