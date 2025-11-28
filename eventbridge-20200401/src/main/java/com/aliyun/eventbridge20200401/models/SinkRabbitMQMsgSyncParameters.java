// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkRabbitMQMsgSyncParameters extends TeaModel {
    @NameInMap("Body")
    public SinkRabbitMQMsgSyncParametersBody body;

    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("Exchange")
    public SinkRabbitMQMsgSyncParametersExchange exchange;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("InstanceType")
    public String instanceType;

    @NameInMap("MaxHops")
    public String maxHops;

    @NameInMap("MessageId")
    public SinkRabbitMQMsgSyncParametersMessageId messageId;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("Password")
    public String password;

    @NameInMap("Properties")
    public SinkRabbitMQMsgSyncParametersProperties properties;

    @NameInMap("RoutingKey")
    public SinkRabbitMQMsgSyncParametersRoutingKey routingKey;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Username")
    public String username;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    @NameInMap("VirtualHostName")
    public String virtualHostName;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
