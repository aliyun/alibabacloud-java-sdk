// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class CreateServiceLinkedRoleForProductRequest extends TeaModel {
    /**
     * <p>The name of the cloud service or the service-linked role (SLR) that is associated with the service.</p>
     * <ul>
     * <li><p>AliyunServiceRoleForEventBridgeSendToFC: Delivers events to Function Compute (FC).</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSendToSMS: Delivers events as text messages to Short Message Service (SMS).</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSendToDirectMail: Delivers events as emails to Alibaba Cloud DirectMail.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSourceRocketMQ: Integrates messages from ApsaraMQ for RocketMQ instances into EventBridge.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSourceMNS: Integrates Message Service (MNS) into EventBridge.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeConnectVPC: Lets EventBridge access your Virtual Private Cloud (VPC) network.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSourceActionTrail: Uses operation records from ActionTrail as event sources.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSourceRabbitMQ: Integrates ApsaraMQ for RabbitMQ instances into EventBridge.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSendToRabbitMQ: Delivers EventBridge events to ApsaraMQ for RabbitMQ instances.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSendToRocketMQ: Delivers EventBridge events to ApsaraMQ for RocketMQ instances.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSourceCMS: Integrates CloudMonitor (CMS) into EventBridge.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSendToKafka: Delivers EventBridge events to ApsaraMQ for Kafka clusters.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSourceKafka: Integrates ApsaraMQ for Kafka into EventBridge.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSendToRDS: Delivers EventBridge events to Relational Database Service (RDS) instances.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSendToSAE: Delivers EventBridge events to Serverless App Engine (SAE) applications.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSourceMqtt: Integrates ApsaraMQ for MQTT into EventBridge.</p>
     * </li>
     * <li><p>AliyunServiceRoleForEventBridgeSourceSLS: Integrates Simple Log Service (SLS) into EventBridge.</p>
     * </li>
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
