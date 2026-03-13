// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class CreateTriggerInput extends TeaModel {
    /**
     * <p>The description of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The RAM role that is used by the event source such as Object Storage Service (OSS) to invoke the function.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::1234567890:role/fc-test</p>
     */
    @NameInMap("invocationRole")
    public String invocationRole;

    /**
     * <p>The version or alias of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the trigger event source.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:12345:mybucket</p>
     */
    @NameInMap("sourceArn")
    public String sourceArn;

    /**
     * <p>The configurations of the trigger. The configurations vary based on the trigger type. The following items list the data structures for different types of triggers:</p>
     * <ul>
     * <li>OSS triggers: <a href="https://help.aliyun.com/document_detail/2766465.html">OSSTriggerConfig</a>.</li>
     * <li>Simple Log Service trigger: <a href="https://help.aliyun.com/document_detail/2618711.html">LogTriggerConfig</a>.</li>
     * <li>Time triggers: <a href="https://help.aliyun.com/document_detail/2754638.html">TimerTriggerConfig</a>.</li>
     * <li>HTTP triggers: <a href="https://help.aliyun.com/document_detail/2766461.html">HTTPTriggerConfig</a>.</li>
     * <li>Tablestore triggers: Specify the <strong>SourceArnm</strong> parameter and leave this parameter empty.</li>
     * <li>Alibaba Cloud CDN event triggers: <a href="https://help.aliyun.com/document_detail/2766462.html">CDNEventsTriggerConfig</a>.</li>
     * <li>MNS topic triggers: <a href="https://help.aliyun.com/document_detail/2766464.html">MnsTopicTriggerConfig</a>.</li>
     * <li>EventBridge-based triggers: <a href="https://help.aliyun.com/document_detail/2766447.html">EventBridgeTriggerConfig</a>.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;events&quot;:[&quot;oss:ObjectCreated:*&quot;],&quot;filter&quot;:{&quot;key&quot;:{&quot;prefix&quot;:&quot;/prefix&quot;,&quot;suffix&quot;:&quot;.zip&quot;}}}</p>
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
     * <li><strong>oss</strong>: OSS event triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513613.html">Overview</a>.</li>
     * <li><strong>log</strong>: Simple Log Service triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513638.html">Simple Log Service triggers</a>.</li>
     * <li><strong>timer</strong>: time triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513611.html">Time triggers</a>.</li>
     * <li><strong>http</strong>: HTTP triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513634.html">Overview</a>.</li>
     * <li><strong>tablestore</strong>: Tablestore triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513640.html">Tablestore triggers</a>.</li>
     * <li><strong>cdn_events</strong>: CDN event triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513636.html">Overview</a>.</li>
     * <li><strong>mns_topic</strong>: Message Service (MNS) topic triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513641.html">MNS topic triggers</a>.</li>
     * <li><strong>eventbridge</strong>: EventBridge-based triggers.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    public static CreateTriggerInput build(java.util.Map<String, ?> map) throws Exception {
        CreateTriggerInput self = new CreateTriggerInput();
        return TeaModel.build(map, self);
    }

    public CreateTriggerInput setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateTriggerInput setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public CreateTriggerInput setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public CreateTriggerInput setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public CreateTriggerInput setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public CreateTriggerInput setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public CreateTriggerInput setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
