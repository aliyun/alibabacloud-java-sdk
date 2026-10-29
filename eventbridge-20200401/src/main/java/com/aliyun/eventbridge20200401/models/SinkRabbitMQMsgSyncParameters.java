// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkRabbitMQMsgSyncParameters extends TeaModel {
    /**
     * <p>The message body.</p>
     */
    @NameInMap("Body")
    public SinkRabbitMQMsgSyncParametersBody body;

    /**
     * <p>The endpoint of the ApsaraMQ for RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-hangzhou-2x***.com</p>
     */
    @NameInMap("Endpoint")
    public String endpoint;

    /**
     * <p>The exchange. This parameter is required only when the TargetType parameter is set to Exchange.</p>
     */
    @NameInMap("Exchange")
    public SinkRabbitMQMsgSyncParametersExchange exchange;

    /**
     * <p>The ID of the ApsaraMQ for RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>rabbitmq-cn-a1b2c3d4e5f</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the ApsaraMQ for RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>Cloud</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The maximum number of hops allowed for message forwarding in a federation task. Messages that exceed this limit are dropped.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MaxHops")
    public String maxHops;

    /**
     * <p>The message ID.</p>
     */
    @NameInMap("MessageId")
    public SinkRabbitMQMsgSyncParametersMessageId messageId;

    /**
     * <p>The network type used to connect to the ApsaraMQ for RabbitMQ instance.</p>
     * 
     * <strong>example:</strong>
     * <p>PrivateNetwork</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The password used to connect to the ApsaraMQ for RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>yourPassword</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The message properties.</p>
     */
    @NameInMap("Properties")
    public SinkRabbitMQMsgSyncParametersProperties properties;

    /**
     * <p>The routing key of the message. This parameter is required only when the TargetType parameter is set to Exchange.</p>
     */
    @NameInMap("RoutingKey")
    public SinkRabbitMQMsgSyncParametersRoutingKey routingKey;

    /**
     * <p>The ID of the security group to which the nodes of the ApsaraMQ for RabbitMQ cluster belong.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The username used to connect to the ApsaraMQ for RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("Username")
    public String username;

    /**
     * <p>The IDs of the vSwitches in the VPC where the ApsaraMQ for RabbitMQ cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>The name of the virtual host (vhost) in the ApsaraMQ for RabbitMQ cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>test-001</p>
     */
    @NameInMap("VirtualHostName")
    public String virtualHostName;

    /**
     * <p>The ID of the VPC where the ApsaraMQ for RabbitMQ cluster resides.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SinkRabbitMQMsgSyncParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkRabbitMQMsgSyncParameters self = new SinkRabbitMQMsgSyncParameters();
        return TeaModel.build(map, self);
    }

    public SinkRabbitMQMsgSyncParameters setBody(SinkRabbitMQMsgSyncParametersBody body) {
        this.body = body;
        return this;
    }
    public SinkRabbitMQMsgSyncParametersBody getBody() {
        return this.body;
    }

    public SinkRabbitMQMsgSyncParameters setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public SinkRabbitMQMsgSyncParameters setExchange(SinkRabbitMQMsgSyncParametersExchange exchange) {
        this.exchange = exchange;
        return this;
    }
    public SinkRabbitMQMsgSyncParametersExchange getExchange() {
        return this.exchange;
    }

    public SinkRabbitMQMsgSyncParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SinkRabbitMQMsgSyncParameters setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public SinkRabbitMQMsgSyncParameters setMaxHops(String maxHops) {
        this.maxHops = maxHops;
        return this;
    }
    public String getMaxHops() {
        return this.maxHops;
    }

    public SinkRabbitMQMsgSyncParameters setMessageId(SinkRabbitMQMsgSyncParametersMessageId messageId) {
        this.messageId = messageId;
        return this;
    }
    public SinkRabbitMQMsgSyncParametersMessageId getMessageId() {
        return this.messageId;
    }

    public SinkRabbitMQMsgSyncParameters setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SinkRabbitMQMsgSyncParameters setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public SinkRabbitMQMsgSyncParameters setProperties(SinkRabbitMQMsgSyncParametersProperties properties) {
        this.properties = properties;
        return this;
    }
    public SinkRabbitMQMsgSyncParametersProperties getProperties() {
        return this.properties;
    }

    public SinkRabbitMQMsgSyncParameters setRoutingKey(SinkRabbitMQMsgSyncParametersRoutingKey routingKey) {
        this.routingKey = routingKey;
        return this;
    }
    public SinkRabbitMQMsgSyncParametersRoutingKey getRoutingKey() {
        return this.routingKey;
    }

    public SinkRabbitMQMsgSyncParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SinkRabbitMQMsgSyncParameters setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

    public SinkRabbitMQMsgSyncParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SinkRabbitMQMsgSyncParameters setVirtualHostName(String virtualHostName) {
        this.virtualHostName = virtualHostName;
        return this;
    }
    public String getVirtualHostName() {
        return this.virtualHostName;
    }

    public SinkRabbitMQMsgSyncParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class SinkRabbitMQMsgSyncParametersBody extends TeaModel {
        /**
         * <p>The method used to generate the message body.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value expression of the message body.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.body</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkRabbitMQMsgSyncParametersBody build(java.util.Map<String, ?> map) throws Exception {
            SinkRabbitMQMsgSyncParametersBody self = new SinkRabbitMQMsgSyncParametersBody();
            return TeaModel.build(map, self);
        }

        public SinkRabbitMQMsgSyncParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkRabbitMQMsgSyncParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkRabbitMQMsgSyncParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkRabbitMQMsgSyncParametersExchange extends TeaModel {
        /**
         * <p>The method used to generate the target exchange.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value expression of the target exchange.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.exchange</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkRabbitMQMsgSyncParametersExchange build(java.util.Map<String, ?> map) throws Exception {
            SinkRabbitMQMsgSyncParametersExchange self = new SinkRabbitMQMsgSyncParametersExchange();
            return TeaModel.build(map, self);
        }

        public SinkRabbitMQMsgSyncParametersExchange setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkRabbitMQMsgSyncParametersExchange setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkRabbitMQMsgSyncParametersExchange setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkRabbitMQMsgSyncParametersMessageId extends TeaModel {
        /**
         * <p>The method used to generate the message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value expression of the message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.messageId</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkRabbitMQMsgSyncParametersMessageId build(java.util.Map<String, ?> map) throws Exception {
            SinkRabbitMQMsgSyncParametersMessageId self = new SinkRabbitMQMsgSyncParametersMessageId();
            return TeaModel.build(map, self);
        }

        public SinkRabbitMQMsgSyncParametersMessageId setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkRabbitMQMsgSyncParametersMessageId setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkRabbitMQMsgSyncParametersMessageId setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkRabbitMQMsgSyncParametersProperties extends TeaModel {
        /**
         * <p>The method used to generate the message properties.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value expression of the message properties.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.properties</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkRabbitMQMsgSyncParametersProperties build(java.util.Map<String, ?> map) throws Exception {
            SinkRabbitMQMsgSyncParametersProperties self = new SinkRabbitMQMsgSyncParametersProperties();
            return TeaModel.build(map, self);
        }

        public SinkRabbitMQMsgSyncParametersProperties setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkRabbitMQMsgSyncParametersProperties setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkRabbitMQMsgSyncParametersProperties setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkRabbitMQMsgSyncParametersRoutingKey extends TeaModel {
        /**
         * <p>The method used to generate the routing key.</p>
         * 
         * <strong>example:</strong>
         * <p>JSONPATH</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>The template string used to format parameter values. This parameter is used only when Form is set to TEMPLATE.</p>
         * 
         * <strong>example:</strong>
         * <p>The value of ${key} is ${value}!</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>The value expression of the routing key.</p>
         * 
         * <strong>example:</strong>
         * <p>$.data.routingKey</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkRabbitMQMsgSyncParametersRoutingKey build(java.util.Map<String, ?> map) throws Exception {
            SinkRabbitMQMsgSyncParametersRoutingKey self = new SinkRabbitMQMsgSyncParametersRoutingKey();
            return TeaModel.build(map, self);
        }

        public SinkRabbitMQMsgSyncParametersRoutingKey setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkRabbitMQMsgSyncParametersRoutingKey setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkRabbitMQMsgSyncParametersRoutingKey setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
