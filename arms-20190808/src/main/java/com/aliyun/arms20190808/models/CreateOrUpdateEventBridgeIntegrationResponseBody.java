// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateEventBridgeIntegrationResponseBody extends TeaModel {
    // The information about the EventBridge integration.
    @NameInMap("EventBridgeIntegration")
    public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration eventBridgeIntegration;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static CreateOrUpdateEventBridgeIntegrationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateEventBridgeIntegrationResponseBody self = new CreateOrUpdateEventBridgeIntegrationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateEventBridgeIntegrationResponseBody setEventBridgeIntegration(CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration eventBridgeIntegration) {
        this.eventBridgeIntegration = eventBridgeIntegration;
        return this;
    }
    public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration getEventBridgeIntegration() {
        return this.eventBridgeIntegration;
    }

    public CreateOrUpdateEventBridgeIntegrationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration extends TeaModel {
        // The AccessKey ID that is used to connect to EventBridge.
        @NameInMap("AccessKey")
        public String accessKey;

        // The AccessKey secret that is used to connect to EventBridge.
        @NameInMap("AccessSecret")
        public String accessSecret;

        // The description of the EventBridge integration.
        @NameInMap("Description")
        public String description;

        // The public endpoint of EventBridge.
        @NameInMap("Endpoint")
        public String endpoint;

        // The name of the event bus.
        @NameInMap("EventBusName")
        public String eventBusName;

        // The region ID of the event bus.
        @NameInMap("EventBusRegionId")
        public String eventBusRegionId;

        // The ID of the EventBridge integration.
        @NameInMap("Id")
        public Long id;

        // The name of the EventBridge integration.
        @NameInMap("Name")
        public String name;

        // The event source.
        @NameInMap("Source")
        public String source;

        public static CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration build(java.util.Map<String, ?> map) throws Exception {
            CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration self = new CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration();
            return TeaModel.build(map, self);
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration setAccessKey(String accessKey) {
            this.accessKey = accessKey;
            return this;
        }
        public String getAccessKey() {
            return this.accessKey;
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration setAccessSecret(String accessSecret) {
            this.accessSecret = accessSecret;
            return this;
        }
        public String getAccessSecret() {
            return this.accessSecret;
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration setEndpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        public String getEndpoint() {
            return this.endpoint;
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration setEventBusName(String eventBusName) {
            this.eventBusName = eventBusName;
            return this;
        }
        public String getEventBusName() {
            return this.eventBusName;
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration setEventBusRegionId(String eventBusRegionId) {
            this.eventBusRegionId = eventBusRegionId;
            return this;
        }
        public String getEventBusRegionId() {
            return this.eventBusRegionId;
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

}
