// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerRequest extends TeaModel {
    /**
     * <p>The description of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The role that is used by the event source such as Object Storage Service (OSS) to invoke the function. For more information, see <a href="https://help.aliyun.com/document_detail/53102.html">Overview</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456xxxx:role/fc-test</p>
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
     * <p>The configurations of the trigger. The configurations vary based on the trigger type. For more information about the format, see the following topics:</p>
     * <ul>
     * <li>Object Storage Service (OSS) trigger: <a href="https://help.aliyun.com/document_detail/415697.html">OSSTriggerConfig</a>.</li>
     * <li>Simple Log Service trigger: <a href="https://help.aliyun.com/document_detail/415694.html">LogTriggerConfig</a>.</li>
     * <li>Time trigger: <a href="https://help.aliyun.com/document_detail/415712.html">TimeTriggerConfig</a>.</li>
     * <li>HTTP trigger: <a href="https://help.aliyun.com/document_detail/415685.html">HTTPTriggerConfig</a>.</li>
     * <li>Tablestore trigger: Specify the <strong>SourceArn</strong> parameter and leave this parameter empty.</li>
     * <li>Alibaba Cloud CDN event trigger: <a href="https://help.aliyun.com/document_detail/415674.html">CDNEventsTriggerConfig</a>.</li>
     * <li>MNS topic trigger: <a href="https://help.aliyun.com/document_detail/415695.html">MnsTopicTriggerConfig</a>.</li>
     * <li>EventBridge triggers: <a href="https://help.aliyun.com/document_detail/2508622.html">EventBridgeTriggerConfig</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;events&quot;: [&quot;oss:ObjectCreated:*&quot;], &quot;filter&quot;: {&quot;key&quot;: {&quot;prefix&quot;: &quot;/prefix&quot;, &quot;suffix&quot;: &quot;.zip&quot;}}}</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfig;

    public static UpdateTriggerRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerRequest self = new UpdateTriggerRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTriggerRequest setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public UpdateTriggerRequest setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public UpdateTriggerRequest setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

}
