// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForProductRequest extends TeaModel {
    /**
     * <p>The name of the cloud service or the name of the service-linked role with which the cloud service is associated. Valid values:</p>
     * <ul>
     * <li>AliyunServiceRoleForEventBridgeSendToFC: allows EventBridge to deliver events to Function Compute.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToSMS: allows EventBridge to deliver events to Short Message Service (SMS).</li>
     * <li>AliyunServiceRoleForEventBridgeSendToDirectMail: allows EventBridge to deliver events to Direct Mail.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceRocketMQ: allows EventBridge to integrate with ApsaraMQ for RocketMQ.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceMNS: allows EventBridge to integrate with Simple Message Queue (SMQ, formerly MNS).</li>
     * <li>AliyunServiceRoleForEventBridgeConnectVPC: allows EventBridge to access virtual private clouds (VPCs).</li>
     * <li>AliyunServiceRoleForEventBridgeSourceActionTrail: allows EventBridge to integrate with ActionTrail.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceRabbitMQ: allows EventBridge to integrate with ApsaraMQ for RabbitMQ.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToRabbitMQ: allows EventBridge to deliver events to ApsaraMQ for RabbitMQ.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToRocketMQ: allows EventBridge to deliver events to ApsaraMQ for RocketMQ.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceCMS: allow EventBridge to integrate with CloudMonitor.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToKafka: allows EventBridge to deliver events to ApsaraMQ for Kafka.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceKafka: allows EventBridge to integrate with ApsaraMQ for Kafka.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToRDS: allows EventBridge to deliver events to ApsaraDB RDS.</li>
     * <li>AliyunServiceRoleForEventBridgeSendToSAE: allows EventBridge to deliver events to Serverless App Engine (SAE).</li>
     * <li>AliyunServiceRoleForEventBridgeSourceMqtt: allows EventBridge to integrate with ApsaraMQ for MQTT.</li>
     * <li>AliyunServiceRoleForEventBridgeSourceSLS: allows EventBridge to integrate with Simple Log Service.</li>
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
