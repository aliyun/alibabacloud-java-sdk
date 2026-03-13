// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class Trigger extends TeaModel {
    /**
     * <p>The time when the trigger was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-08-20T02:28:21Z</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The description of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>test_description</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The information about the HTTP trigger.</p>
     */
    @NameInMap("httpTrigger")
    public HTTPTrigger httpTrigger;

    /**
     * <p>The role that is used by the event source such as OSS to invoke the function.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::151641468453****:role/my-role</p>
     */
    @NameInMap("invocationRole")
    public String invocationRole;

    /**
     * <p>The time when the trigger was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-04-23T06:32:43Z</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The version or alias of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the event source for the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-hangzhou:151641468453****:my-bucket</p>
     */
    @NameInMap("sourceArn")
    public String sourceArn;

    /**
     * <p>The status of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The ARN of the function.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-hangzhou:151641468453****:my-bucket</p>
     */
    @NameInMap("targetArn")
    public String targetArn;

    /**
     * <p>The configurations of the trigger. The configurations vary based on trigger types.</p>
     * 
     * <strong>example:</strong>
     * <p>{
     *       &quot;events&quot;: [
     *             &quot;oss:ObjectCreated:*&quot;
     *       ],
     *       &quot;filter&quot;: {
     *             &quot;key&quot;: {
     *                   &quot;prefix&quot;: &quot;/prefix&quot;,
     *                   &quot;suffix&quot;: &quot;.zip&quot;
     *             }
     *       }
     * }</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfig;

    /**
     * <p>The unique ID of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>546959b5-ce1a-4991-8891-df7a02b25086</p>
     */
    @NameInMap("triggerId")
    public String triggerId;

    /**
     * <p>The name of the trigger. The name contains only letters, digits, hyphens (-), and underscores (_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).</p>
     * 
     * <strong>example:</strong>
     * <p>defaultTrigger</p>
     */
    @NameInMap("triggerName")
    public String triggerName;

    /**
     * <p>The type of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>http</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    public static Trigger build(java.util.Map<String, ?> map) throws Exception {
        Trigger self = new Trigger();
        return TeaModel.build(map, self);
    }

    public Trigger setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public Trigger setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public Trigger setHttpTrigger(HTTPTrigger httpTrigger) {
        this.httpTrigger = httpTrigger;
        return this;
    }
    public HTTPTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    public Trigger setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public Trigger setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public Trigger setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public Trigger setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public Trigger setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public Trigger setTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }
    public String getTargetArn() {
        return this.targetArn;
    }

    public Trigger setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public Trigger setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

    public Trigger setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public Trigger setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

}
