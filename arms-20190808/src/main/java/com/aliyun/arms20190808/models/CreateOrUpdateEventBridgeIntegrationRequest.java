// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateEventBridgeIntegrationRequest extends TeaModel {
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
    // 
    // *   If you do not specify this parameter, an EventBridge integration is created.
    // *   If you specify this parameter, the specified EventBridge integration is modified.
    @NameInMap("Id")
    public Long id;

    // The name of the EventBridge integration.
    @NameInMap("Name")
    public String name;

    // The event source.
    @NameInMap("Source")
    public String source;

    public static CreateOrUpdateEventBridgeIntegrationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateEventBridgeIntegrationRequest self = new CreateOrUpdateEventBridgeIntegrationRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateEventBridgeIntegrationRequest setAccessKey(String accessKey) {
        this.accessKey = accessKey;
        return this;
    }
    public String getAccessKey() {
        return this.accessKey;
    }

    public CreateOrUpdateEventBridgeIntegrationRequest setAccessSecret(String accessSecret) {
        this.accessSecret = accessSecret;
        return this;
    }
    public String getAccessSecret() {
        return this.accessSecret;
    }

    public CreateOrUpdateEventBridgeIntegrationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateOrUpdateEventBridgeIntegrationRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public CreateOrUpdateEventBridgeIntegrationRequest setEventBusName(String eventBusName) {
        this.eventBusName = eventBusName;
        return this;
    }
    public String getEventBusName() {
        return this.eventBusName;
    }

    public CreateOrUpdateEventBridgeIntegrationRequest setEventBusRegionId(String eventBusRegionId) {
        this.eventBusRegionId = eventBusRegionId;
        return this;
    }
    public String getEventBusRegionId() {
        return this.eventBusRegionId;
    }

    public CreateOrUpdateEventBridgeIntegrationRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public CreateOrUpdateEventBridgeIntegrationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateOrUpdateEventBridgeIntegrationRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
