// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.baas20180731.models;

import com.aliyun.tea.*;

public class DescribeFabricChaincodeLogsRequest extends TeaModel {
    @NameInMap("ChaincodeId")
    public String chaincodeId;

    @NameInMap("Lines")
    public String lines;

    @NameInMap("Offset")
    public Integer offset;

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

    public static DescribeFabricChaincodeLogsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeFabricChaincodeLogsRequest self = new DescribeFabricChaincodeLogsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeFabricChaincodeLogsRequest setChaincodeId(String chaincodeId) {
        this.chaincodeId = chaincodeId;
        return this;
    }
    public String getChaincodeId() {
        return this.chaincodeId;
    }

    public DescribeFabricChaincodeLogsRequest setLines(String lines) {
        this.lines = lines;
        return this;
    }
    public String getLines() {
        return this.lines;
    }

    public DescribeFabricChaincodeLogsRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public DescribeFabricChaincodeLogsRequest setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }
    public String getOrganizationId() {
        return this.organizationId;
    }

    public DescribeFabricChaincodeLogsRequest setPeerName(String peerName) {
        this.peerName = peerName;
        return this;
    }
    public String getPeerName() {
        return this.peerName;
    }

}
