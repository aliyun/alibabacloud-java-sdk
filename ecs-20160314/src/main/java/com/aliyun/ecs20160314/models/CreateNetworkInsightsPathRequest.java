// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20160314.models;

import com.aliyun.tea.*;

public class CreateNetworkInsightsPathRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Destination")
    public String destination;

    @NameInMap("DestinationPort")
    public String destinationPort;

    @NameInMap("DestinationType")
    public String destinationType;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("NeedDiagnoseGuest")
    public Boolean needDiagnoseGuest;

    @NameInMap("NetworkInsightsPathName")
    public String networkInsightsPathName;

    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Source")
    public String source;

    @NameInMap("SourceType")
    public String sourceType;

    public static CreateNetworkInsightsPathRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInsightsPathRequest self = new CreateNetworkInsightsPathRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInsightsPathRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateNetworkInsightsPathRequest setDestination(String destination) {
        this.destination = destination;
        return this;
    }
    public String getDestination() {
        return this.destination;
    }

    public CreateNetworkInsightsPathRequest setDestinationPort(String destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }
    public String getDestinationPort() {
        return this.destinationPort;
    }

    public CreateNetworkInsightsPathRequest setDestinationType(String destinationType) {
        this.destinationType = destinationType;
        return this;
    }
    public String getDestinationType() {
        return this.destinationType;
    }

    public CreateNetworkInsightsPathRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateNetworkInsightsPathRequest setNeedDiagnoseGuest(Boolean needDiagnoseGuest) {
        this.needDiagnoseGuest = needDiagnoseGuest;
        return this;
    }
    public Boolean getNeedDiagnoseGuest() {
        return this.needDiagnoseGuest;
    }

    public CreateNetworkInsightsPathRequest setNetworkInsightsPathName(String networkInsightsPathName) {
        this.networkInsightsPathName = networkInsightsPathName;
        return this;
    }
    public String getNetworkInsightsPathName() {
        return this.networkInsightsPathName;
    }

    public CreateNetworkInsightsPathRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateNetworkInsightsPathRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateNetworkInsightsPathRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateNetworkInsightsPathRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public CreateNetworkInsightsPathRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

}
