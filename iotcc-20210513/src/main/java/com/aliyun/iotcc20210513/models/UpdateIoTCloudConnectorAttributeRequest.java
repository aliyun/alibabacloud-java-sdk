// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class UpdateIoTCloudConnectorAttributeRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorDescription")
    public String ioTCloudConnectorDescription;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("IoTCloudConnectorName")
    public String ioTCloudConnectorName;

    @NameInMap("Mode")
    public String mode;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("WildcardDomainEnabled")
    public Boolean wildcardDomainEnabled;

    public static UpdateIoTCloudConnectorAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIoTCloudConnectorAttributeRequest self = new UpdateIoTCloudConnectorAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIoTCloudConnectorAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateIoTCloudConnectorAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateIoTCloudConnectorAttributeRequest setIoTCloudConnectorDescription(String ioTCloudConnectorDescription) {
        this.ioTCloudConnectorDescription = ioTCloudConnectorDescription;
        return this;
    }
    public String getIoTCloudConnectorDescription() {
        return this.ioTCloudConnectorDescription;
    }

    public UpdateIoTCloudConnectorAttributeRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public UpdateIoTCloudConnectorAttributeRequest setIoTCloudConnectorName(String ioTCloudConnectorName) {
        this.ioTCloudConnectorName = ioTCloudConnectorName;
        return this;
    }
    public String getIoTCloudConnectorName() {
        return this.ioTCloudConnectorName;
    }

    public UpdateIoTCloudConnectorAttributeRequest setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public UpdateIoTCloudConnectorAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateIoTCloudConnectorAttributeRequest setWildcardDomainEnabled(Boolean wildcardDomainEnabled) {
        this.wildcardDomainEnabled = wildcardDomainEnabled;
        return this;
    }
    public Boolean getWildcardDomainEnabled() {
        return this.wildcardDomainEnabled;
    }

}
