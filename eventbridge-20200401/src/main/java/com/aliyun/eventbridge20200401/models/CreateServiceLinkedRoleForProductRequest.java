// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForProductRequest extends TeaModel {
    /**
     * <p>The name of the Alibaba Cloud service or the name of the service-linked role associated with the service. Valid values:</p>
     * <ul>
     * <li>AliyunServiceRoleForEventBridgeSendToFC: Performs event delivery to Function Compute.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToSMS: Performs event delivery as text messages to Short Message Service.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToDirectMail: Performs event delivery as emails to Direct Mail.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceRocketMQ: Integrates consumed messages from MSMQ RocketMQ instances into EventBridge.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceMNS: Integrates Simple Message Queue (formerly MNS) into EventBridge.</li>
     * <li>AliyunServiceRoleForEventBridgeConnectVPC: Allows EventBridge to access your VPC.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceActionTrail: Retrieves operation records from ActionTrail as event sources.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceRabbitMQ: Integrates MSMQ RabbitMQ instances into EventBridge.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToRabbitMQ: Performs event delivery of EventBridge events to MSMQ RabbitMQ instances.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToRocketMQ: Performs event delivery of EventBridge events to MSMQ RocketMQ instances.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceCMS: Integrates Alibaba Cloud monitoring (CMS) into EventBridge.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToKafka: Performs event delivery of EventBridge events to Message Queue for Apache Kafka clusters.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceKafka: Integrates Message Queue for Apache Kafka into EventBridge.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToRDS: Performs event delivery of EventBridge events to Relational Database Service (RDS) instances.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToSAE: Performs event delivery of EventBridge events to Serverless App DPI engine (SAE) applications.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceMqtt: Integrates MSMQ MQTT into EventBridge.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceSLS: Integrates Simple Log Service into EventBridge.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AliyunServiceRoleForEventBridgeSendToMNS</p>
     */
    @NameInMap("ProductName")
    public String productName;

    public static CreateServiceLinkedRoleForProductRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceLinkedRoleForProductRequest self = new CreateServiceLinkedRoleForProductRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceLinkedRoleForProductRequest setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
