// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iotcc20210513.models;

import com.aliyun.tea.*;

public class CreateAuthorizationRulesRequest extends TeaModel {
    @NameInMap("AuthorizationRules")
    public java.util.List<CreateAuthorizationRulesRequestAuthorizationRules> authorizationRules;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("IoTCloudConnectorId")
    public String ioTCloudConnectorId;

    @NameInMap("RegionId")
    public String regionId;

    public static CreateAuthorizationRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAuthorizationRulesRequest self = new CreateAuthorizationRulesRequest();
        return TeaModel.build(map, self);
    }

    public CreateAuthorizationRulesRequest setAuthorizationRules(java.util.List<CreateAuthorizationRulesRequestAuthorizationRules> authorizationRules) {
        this.authorizationRules = authorizationRules;
        return this;
    }
    public java.util.List<CreateAuthorizationRulesRequestAuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
    }

    public CreateAuthorizationRulesRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAuthorizationRulesRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAuthorizationRulesRequest setIoTCloudConnectorId(String ioTCloudConnectorId) {
        this.ioTCloudConnectorId = ioTCloudConnectorId;
        return this;
    }
    public String getIoTCloudConnectorId() {
        return this.ioTCloudConnectorId;
    }

    public CreateAuthorizationRulesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public static class CreateAuthorizationRulesRequestAuthorizationRules extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("Destination")
        public String destination;

        @NameInMap("DestinationPort")
        public String destinationPort;

        @NameInMap("DestinationType")
        public String destinationType;

        @NameInMap("Name")
        public String name;

        @NameInMap("Policy")
        public String policy;

        @NameInMap("Protocol")
        public String protocol;

        @NameInMap("SourceCidr")
        public String sourceCidr;

        public static CreateAuthorizationRulesRequestAuthorizationRules build(java.util.Map<String, ?> map) throws Exception {
            CreateAuthorizationRulesRequestAuthorizationRules self = new CreateAuthorizationRulesRequestAuthorizationRules();
            return TeaModel.build(map, self);
        }

        public CreateAuthorizationRulesRequestAuthorizationRules setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateAuthorizationRulesRequestAuthorizationRules setDestination(String destination) {
            this.destination = destination;
            return this;
        }
        public String getDestination() {
            return this.destination;
        }

        public CreateAuthorizationRulesRequestAuthorizationRules setDestinationPort(String destinationPort) {
            this.destinationPort = destinationPort;
            return this;
        }
        public String getDestinationPort() {
            return this.destinationPort;
        }

        public CreateAuthorizationRulesRequestAuthorizationRules setDestinationType(String destinationType) {
            this.destinationType = destinationType;
            return this;
        }
        public String getDestinationType() {
            return this.destinationType;
        }

        public CreateAuthorizationRulesRequestAuthorizationRules setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateAuthorizationRulesRequestAuthorizationRules setPolicy(String policy) {
            this.policy = policy;
            return this;
        }
        public String getPolicy() {
            return this.policy;
        }

        public CreateAuthorizationRulesRequestAuthorizationRules setProtocol(String protocol) {
            this.protocol = protocol;
            return this;
        }
        public String getProtocol() {
            return this.protocol;
        }

        public CreateAuthorizationRulesRequestAuthorizationRules setSourceCidr(String sourceCidr) {
            this.sourceCidr = sourceCidr;
            return this;
        }
        public String getSourceCidr() {
            return this.sourceCidr;
        }

    }

}
