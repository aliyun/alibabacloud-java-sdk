// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateForwardEntryRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExternalIp")
    public String externalIp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ExternalPort")
    public String externalPort;

    @NameInMap("ForwardEntryName")
    public String forwardEntryName;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ForwardTableId")
    public String forwardTableId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternalIp")
    public String internalIp;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InternalPort")
    public String internalPort;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateForwardEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateForwardEntryRequest self = new CreateForwardEntryRequest();
        return TeaModel.build(map, self);
    }

    public CreateForwardEntryRequest setExternalIp(String externalIp) {
        this.externalIp = externalIp;
        return this;
    }
    public String getExternalIp() {
        return this.externalIp;
    }

    public CreateForwardEntryRequest setExternalPort(String externalPort) {
        this.externalPort = externalPort;
        return this;
    }
    public String getExternalPort() {
        return this.externalPort;
    }

    public CreateForwardEntryRequest setForwardEntryName(String forwardEntryName) {
        this.forwardEntryName = forwardEntryName;
        return this;
    }
    public String getForwardEntryName() {
        return this.forwardEntryName;
    }

    public CreateForwardEntryRequest setForwardTableId(String forwardTableId) {
        this.forwardTableId = forwardTableId;
        return this;
    }
    public String getForwardTableId() {
        return this.forwardTableId;
    }

    public CreateForwardEntryRequest setInternalIp(String internalIp) {
        this.internalIp = internalIp;
        return this;
    }
    public String getInternalIp() {
        return this.internalIp;
    }

    public CreateForwardEntryRequest setInternalPort(String internalPort) {
        this.internalPort = internalPort;
        return this;
    }
    public String getInternalPort() {
        return this.internalPort;
    }

    public CreateForwardEntryRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public CreateForwardEntryRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
