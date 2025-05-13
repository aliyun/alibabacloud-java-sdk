// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class CreateTriggerRequest extends TeaModel {
    /**
     * <p>The description of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The RAM role that is used by the event source such as Object Storage Service (OSS) to invoke the function. For more information, see <a href="https://help.aliyun.com/document_detail/53102.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/fc-test</p>
     */
    @NameInMap("invocationRole")
    public String invocationRole;

    /**
     * <p>The version or alias of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the trigger event source. This parameter is optional for time triggers, HTTP triggers, and EventBridge-based triggers. This parameter is required for other types of triggers. For an EventBridge-based trigger, if you specify this parameter, the existing resources on the EventBridge side are associated with the trigger. <strong>Do not specify the same sourceArn value for two different EventBridge triggers</strong>. Otherwise, the update and delete operations of one trigger affect another.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:12345:mybucket</p>
     */
    @NameInMap("sourceArn")
    public String sourceArn;

    /**
     * <p>The trigger configurations. The configurations vary based on the trigger type. The following items list the configuration format for different triggers:</p>
     * <ul>
     * <li>OSS triggers: <a href="https://help.aliyun.com/document_detail/415697.html">OSSTriggerConfig</a>.</li>
     * <li>Simple Log Service triggers: <a href="https://help.aliyun.com/document_detail/415694.html">LogTriggerConfig</a>.</li>
     * <li>Time triggers: <a href="https://help.aliyun.com/document_detail/415712.html">TimeTriggerConfig</a>.</li>
     * <li>HTTP triggers: <a href="https://help.aliyun.com/document_detail/415685.html">HTTPTriggerConfig</a></li>
     * <li>Tablestore triggers: Specify the <strong>SourceArnm</strong> parameter and leave this parameter empty.</li>
     * <li>Alibaba Cloud CDN event triggers: <a href="https://help.aliyun.com/document_detail/415674.html">CDNEventsTriggerConfig</a>.</li>
     * <li>Simple Message Queue (formerly MNS) (SMQ) topic triggers: <a href="https://help.aliyun.com/document_detail/415695.html">MnsTopicTriggerConfig</a>.</li>
     * <li>EventBridge-based triggers: <a href="https://help.aliyun.com/document_detail/2508622.html">EventBridgeTriggerConfig</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;events&quot;: [&quot;oss:ObjectCreated:*&quot;], &quot;filter&quot;: {&quot;key&quot;: {&quot;prefix&quot;: &quot;/prefix&quot;, &quot;suffix&quot;: &quot;.zip&quot;}}}</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfig;

    /**
     * <p>The name of the trigger. The name can contain only letters, digits, hyphens (-), and underscores (_). The name must be 1 to 128 characters in length and cannot start with a digit or a hyphen (-).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss_create_object_demo</p>
     */
    @NameInMap("triggerName")
    public String triggerName;

    /**
     * <p>The type of the trigger. Valid values:</p>
     * <ul>
     * <li><strong>oss</strong>: OSS event trigger. For more information, see <a href="https://help.aliyun.com/document_detail/62922.html">Overview of OSS event triggers</a>.</li>
     * <li><strong>log</strong>: Simple Log Service trigger. For more information, see <a href="https://help.aliyun.com/document_detail/84386.html">Simple Log Service triggers</a>.</li>
     * <li><strong>timer</strong>: time trigger. For more information, see <a href="https://help.aliyun.com/document_detail/68172.html">Configure a time trigger</a>.</li>
     * <li><strong>http</strong>: HTTP trigger. For more information, see <a href="https://help.aliyun.com/document_detail/71229.html">Overview</a>.</li>
     * <li><strong>tablestore</strong>: Tablestore trigger. For more information, see <a href="https://help.aliyun.com/document_detail/100092.html">Tablestore triggers</a>.</li>
     * <li><strong>cdn_events</strong>: Alibaba Cloud CDN event triggers. For more information, see <a href="https://help.aliyun.com/document_detail/73333.html">Overview</a>.</li>
     * <li><strong>mns_topic</strong>: SMQ topic triggers. For more information, see <a href="https://help.aliyun.com/document_detail/97032.html">Simple Message Queue (formerly MNS) topic triggers</a>.</li>
     * <li><strong>eventbridge</strong>: EventBridge-based triggers.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    public static CreateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerRequest self = new CreateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public CreateTriggerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTriggerRequest setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public CreateTriggerRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public CreateTriggerRequest setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public CreateTriggerRequest setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public CreateTriggerRequest setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public CreateTriggerRequest setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
