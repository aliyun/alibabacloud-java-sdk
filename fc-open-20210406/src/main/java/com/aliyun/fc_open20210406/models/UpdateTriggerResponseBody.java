// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class UpdateTriggerResponseBody extends TeaModel {
    /**
     * <p>The time when the audio or video file was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2016-08-15T15:00:00.000+0000</p>
     */
    @NameInMap("createdTime")
    public String createdTime;

    /**
     * <p>The description of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>trigger for test</p>
     */
    @NameInMap("description")
    public String description;

    /**
     * <p>The domain name used to invoke the function by using HTTP. You can add this domain name as the prefix to the endpoint of Function Compute. This way, you can invoke the function that corresponds to the trigger by using HTTP. For example, <code>{domainName}.cn-shanghai.fc.aliyuncs.com</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-service-demo-function-jkhksh</p>
     */
    @NameInMap("domainName")
    public String domainName;

    /**
     * <p>The ARN of the RAM role that is used by the event source to invoke the function.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:ram::123456xxxx:role/fc-test</p>
     */
    @NameInMap("invocationRole")
    public String invocationRole;

    /**
     * <p>The last modification time.</p>
     * 
     * <strong>example:</strong>
     * <p>016-08-15T17:00:00.000+0000</p>
     */
    @NameInMap("lastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The version or alias of the service.</p>
     * 
     * <strong>example:</strong>
     * <p>LATEST</p>
     */
    @NameInMap("qualifier")
    public String qualifier;

    /**
     * <p>The ARN of the event source.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:oss:cn-shanghai:12345xxxx:mybucket</p>
     */
    @NameInMap("sourceArn")
    public String sourceArn;

    /**
     * <p>The current state of the trigger. This parameter is valid only for EventBridge-based triggers.</p>
     * 
     * <strong>example:</strong>
     * <p>RUNNING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>The Alibaba Cloud Resource Name (ARN) of the function associated with the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:fc::123456xxxx:services/my-test-service.LATEST/functions/my-test-function</p>
     */
    @NameInMap("targetArn")
    public String targetArn;

    /**
     * <p>The configurations of the trigger. The configurations vary based on the trigger type.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;events&quot;: [&quot;oss:ObjectCreated:*&quot;], &quot;filter&quot;: {&quot;key&quot;: {&quot;prefix&quot;: &quot;/prefix&quot;, &quot;suffix&quot;: &quot;.zip&quot;}}}</p>
     */
    @NameInMap("triggerConfig")
    public String triggerConfig;

    /**
     * <p>The unique ID of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>3e270f2f-cef2-421a-bc86-ff4e8088****</p>
     */
    @NameInMap("triggerId")
    public String triggerId;

    /**
     * <p>The name of the trigger.</p>
     * 
     * <strong>example:</strong>
     * <p>demoTrigger</p>
     */
    @NameInMap("triggerName")
    public String triggerName;

    /**
     * <p>The trigger type. Example values: <strong>oss</strong>, <strong>log</strong>, <strong>tablestore</strong>, <strong>timer</strong>, <strong>http</strong>, <strong>cdn_events</strong>, <strong>mns_topic</strong>, and <strong>eventbridge</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>oss</p>
     */
    @NameInMap("triggerType")
    public String triggerType;

    /**
     * <p>The public domain address. You can access HTTP triggers over the Internet by using HTTP or HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://svc-func-xxxxxxxx.cn-hangzhou.fcapp.run">https://svc-func-xxxxxxxx.cn-hangzhou.fcapp.run</a></p>
     */
    @NameInMap("urlInternet")
    public String urlInternet;

    /**
     * <p>The private endpoint. In a VPC, you can access HTTP triggers by using HTTP or HTTPS.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://svc-func-xxxxxxxx.cn-hangzhou-vpc.fcapp.run">https://svc-func-xxxxxxxx.cn-hangzhou-vpc.fcapp.run</a></p>
     */
    @NameInMap("urlIntranet")
    public String urlIntranet;

    public static UpdateTriggerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateTriggerResponseBody self = new UpdateTriggerResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateTriggerResponseBody setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public UpdateTriggerResponseBody setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateTriggerResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public UpdateTriggerResponseBody setInvocationRole(String invocationRole) {
        this.invocationRole = invocationRole;
        return this;
    }
    public String getInvocationRole() {
        return this.invocationRole;
    }

    public UpdateTriggerResponseBody setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public UpdateTriggerResponseBody setQualifier(String qualifier) {
        this.qualifier = qualifier;
        return this;
    }
    public String getQualifier() {
        return this.qualifier;
    }

    public UpdateTriggerResponseBody setSourceArn(String sourceArn) {
        this.sourceArn = sourceArn;
        return this;
    }
    public String getSourceArn() {
        return this.sourceArn;
    }

    public UpdateTriggerResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public UpdateTriggerResponseBody setTargetArn(String targetArn) {
        this.targetArn = targetArn;
        return this;
    }
    public String getTargetArn() {
        return this.targetArn;
    }

    public UpdateTriggerResponseBody setTriggerConfig(String triggerConfig) {
        this.triggerConfig = triggerConfig;
        return this;
    }
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    public UpdateTriggerResponseBody setTriggerId(String triggerId) {
        this.triggerId = triggerId;
        return this;
    }
    public String getTriggerId() {
        return this.triggerId;
    }

    public UpdateTriggerResponseBody setTriggerName(String triggerName) {
        this.triggerName = triggerName;
        return this;
    }
    public String getTriggerName() {
        return this.triggerName;
    }

    public UpdateTriggerResponseBody setTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }
    public String getTriggerType() {
        return this.triggerType;
    }

    public UpdateTriggerResponseBody setUrlInternet(String urlInternet) {
        this.urlInternet = urlInternet;
        return this;
    }
    public String getUrlInternet() {
        return this.urlInternet;
    }

    public UpdateTriggerResponseBody setUrlIntranet(String urlIntranet) {
        this.urlIntranet = urlIntranet;
        return this;
    }
    public String getUrlIntranet() {
        return this.urlIntranet;
    }

}
