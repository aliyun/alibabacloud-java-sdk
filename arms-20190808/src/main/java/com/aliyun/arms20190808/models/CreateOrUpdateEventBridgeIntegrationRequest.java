// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateEventBridgeIntegrationRequest extends TeaModel {
    /**
     * <p>The AccessKey ID that is used to connect to EventBridge.</p>
     */
    @NameInMap("AccessKey")
    public String accessKey;

    /**
     * <p>The AccessKey secret that is used to connect to EventBridge.</p>
     */
    @NameInMap("AccessSecret")
    public String accessSecret;

    /**
     * <p>The description of the EventBridge integration.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The public endpoint of EventBridge.</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The name of the event bus.</p>
     */
    @NameInMap("EventBusName")
    public String eventBusName;

    /**
     * <p>The region ID of the event bus.</p>
     */
    @NameInMap("EventBusRegionId")
    public String eventBusRegionId;

    /**
     * <p>The ID of the EventBridge integration.</p>
     * <br>
     * <p>*   If you do not specify this parameter, an EventBridge integration is created.</p>
     * <p>*   If you specify this parameter, the specified EventBridge integration is modified.</p>
     */
    @NameInMap("Id")
    public Long id;

    /**
     * <p>The name of the EventBridge integration.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The event source.</p>
     */
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
