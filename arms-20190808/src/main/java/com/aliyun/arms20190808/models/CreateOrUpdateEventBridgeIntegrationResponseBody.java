// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateOrUpdateEventBridgeIntegrationResponseBody extends TeaModel {
    /**
     * <p>The information about the EventBridge integration.</p>
     */
    @NameInMap("EventBridgeIntegration")
    public CreateOrUpdateEventBridgeIntegrationResponseBodyEventBridgeIntegration eventBridgeIntegration;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>2B289756-E791-5842-BCBD-AD414C******</p>
     */
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
        /**
         * <p>The AccessKey ID that is used to connect to EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p>abc******************</p>
         */
        @NameInMap("AccessKey")
        public String accessKey;

        /**
         * <p>The AccessKey secret that is used to connect to EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p>abc******************</p>
         */
        @NameInMap("AccessSecret")
        public String accessSecret;

        /**
         * <p>The description of the EventBridge integration.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The public endpoint of EventBridge.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://xxxxx">http://xxxxx</a></p>
         */
        @NameInMap("Endpoint")
        public String endpoint;

        /**
         * <p>The name of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBus_Test</p>
         */
        @NameInMap("EventBusName")
        public String eventBusName;

        /**
         * <p>The region ID of the event bus.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("EventBusRegionId")
        public String eventBusRegionId;

        /**
         * <p>The ID of the EventBridge integration.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The name of the EventBridge integration.</p>
         * 
         * <strong>example:</strong>
         * <p>EventBridge_Test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The event source.</p>
         * 
         * <strong>example:</strong>
         * <p>arms</p>
         */
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
