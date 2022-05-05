// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateEventBridgeIntegrationRequest extends TeaModel {
    @NameInMap("AccessKey")
    public String accessKey;

    @NameInMap("AccessSecret")
    public String accessSecret;

    @NameInMap("Description")
    public String description;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("EventBusName")
    public String eventBusName;

    @NameInMap("EventBusRegionId")
    public String eventBusRegionId;

    @NameInMap("Id")
    public Long id;

    @NameInMap("Name")
    public String name;

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
