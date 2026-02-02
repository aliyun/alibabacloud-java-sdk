// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkMQTTParameters extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Mqtt5UserProperty")
    public SinkMQTTParametersMqtt5UserProperty mqtt5UserProperty;

    @NameInMap("ParentTopic")
    public String parentTopic;

    @NameInMap("Payload")
    public SinkMQTTParametersPayload payload;

    @NameInMap("SubTopic")
    public SinkMQTTParametersSubTopic subTopic;

    public static SinkMQTTParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkMQTTParameters self = new SinkMQTTParameters();
        return TeaModel.build(map, self);
    }

    public SinkMQTTParameters setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public SinkMQTTParameters setMqtt5UserProperty(SinkMQTTParametersMqtt5UserProperty mqtt5UserProperty) {
        this.mqtt5UserProperty = mqtt5UserProperty;
        return this;
    }
    public SinkMQTTParametersMqtt5UserProperty getMqtt5UserProperty() {
        return this.mqtt5UserProperty;
    }

    public SinkMQTTParameters setParentTopic(String parentTopic) {
        this.parentTopic = parentTopic;
        return this;
    }
    public String getParentTopic() {
        return this.parentTopic;
    }

    public SinkMQTTParameters setPayload(SinkMQTTParametersPayload payload) {
        this.payload = payload;
        return this;
    }
    public SinkMQTTParametersPayload getPayload() {
        return this.payload;
    }

    public SinkMQTTParameters setSubTopic(SinkMQTTParametersSubTopic subTopic) {
        this.subTopic = subTopic;
        return this;
    }
    public SinkMQTTParametersSubTopic getSubTopic() {
        return this.subTopic;
    }

    public static class SinkMQTTParametersMqtt5UserProperty extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static SinkMQTTParametersMqtt5UserProperty build(java.util.Map<String, ?> map) throws Exception {
            SinkMQTTParametersMqtt5UserProperty self = new SinkMQTTParametersMqtt5UserProperty();
            return TeaModel.build(map, self);
        }

        public SinkMQTTParametersMqtt5UserProperty setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkMQTTParametersMqtt5UserProperty setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkMQTTParametersMqtt5UserProperty setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkMQTTParametersPayload extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static SinkMQTTParametersPayload build(java.util.Map<String, ?> map) throws Exception {
            SinkMQTTParametersPayload self = new SinkMQTTParametersPayload();
            return TeaModel.build(map, self);
        }

        public SinkMQTTParametersPayload setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkMQTTParametersPayload setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkMQTTParametersPayload setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkMQTTParametersSubTopic extends TeaModel {
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

        @NameInMap("Value")
        public String value;

        public static SinkMQTTParametersSubTopic build(java.util.Map<String, ?> map) throws Exception {
            SinkMQTTParametersSubTopic self = new SinkMQTTParametersSubTopic();
            return TeaModel.build(map, self);
        }

        public SinkMQTTParametersSubTopic setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkMQTTParametersSubTopic setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkMQTTParametersSubTopic setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
