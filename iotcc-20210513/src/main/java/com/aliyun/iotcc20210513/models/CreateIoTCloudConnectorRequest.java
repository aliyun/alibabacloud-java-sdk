// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateIoTCloudConnectorRequest extends TeaModel {
    @NameInMap("ISP")
    public String ISP;

    @NameInMap("APN")
    public String APN;

    @NameInMap("IoTCloudConnectorName")
    public String ioTCloudConnectorName;

    @NameInMap("IoTCloudConnectorDescription")
    public String ioTCloudConnectorDescription;

    @NameInMap("WildcardDomainEnabled")
    public Boolean wildcardDomainEnabled;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateIoTCloudConnectorRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIoTCloudConnectorRequest self = new CreateIoTCloudConnectorRequest();
        return TeaModel.build(map, self);
    }

    public CreateIoTCloudConnectorRequest setISP(String ISP) {
        this.ISP = ISP;
        return this;
    }
    public String getISP() {
        return this.ISP;
    }

    public CreateIoTCloudConnectorRequest setAPN(String APN) {
        this.APN = APN;
        return this;
    }
    public String getAPN() {
        return this.APN;
    }

    public CreateIoTCloudConnectorRequest setIoTCloudConnectorName(String ioTCloudConnectorName) {
        this.ioTCloudConnectorName = ioTCloudConnectorName;
        return this;
    }
    public String getIoTCloudConnectorName() {
        return this.ioTCloudConnectorName;
    }

    public CreateIoTCloudConnectorRequest setIoTCloudConnectorDescription(String ioTCloudConnectorDescription) {
        this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
        return this;
    }
    public String getIoTCloudConnectorDescription() {
        return this.ioTCloudConnectorDescription;
    }

    public CreateIoTCloudConnectorRequest setWildcardDomainEnabled(Boolean wildcardDomainEnabled) {
        this.wildcardDomainEnabled = wildcardDomainEnabled;
        return this;
    }
    public Boolean getWildcardDomainEnabled() {
        return this.wildcardDomainEnabled;
    }

    public CreateIoTCloudConnectorRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateIoTCloudConnectorRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateIoTCloudConnectorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
